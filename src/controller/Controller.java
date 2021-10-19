/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.libraryModel;

/**
 *
 * @author afkda
 */
public class Controller {

    //-1 loi ket noi database
    //-2 loi cau sql
    public int SearchWord(String word, List<libraryModel> List) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "SELECT * FROM `newword` WHERE word LIKE ?";
                PreparedStatement ps = cnn.prepareStatement(sql);

                // ps.setString(1, "%" + word + "%");
                ps.setString(1, word);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    libraryModel library_model = new libraryModel();
                    library_model.setId(rs.getInt("id"));
                    library_model.setWord(rs.getString("word"));
                    library_model.setMean(rs.getString("mean"));
                    library_model.setPronunciation(rs.getString("pronunciation"));
                    library_model.setAudiolink(rs.getString("audiolink"));
                    List.add(library_model);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }

    }

    public int SearchAllWord(String word, List<libraryModel> List) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "SELECT * FROM `newword` WHERE word LIKE ?";
                PreparedStatement ps = cnn.prepareStatement(sql);

                ps.setString(1, "%" + word + "%");
                // ps.setString(1,  word  );

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    libraryModel library_model = new libraryModel();
                    library_model.setId(rs.getInt("id"));
                    library_model.setWord(rs.getString("word"));
                    library_model.setMean(rs.getString("mean"));
                    library_model.setPronunciation(rs.getString("pronunciation"));
                    library_model.setAudiolink(rs.getString("audiolink"));
                    List.add(library_model);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }

    }

    public int ShowListWord(List<libraryModel> List) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "SELECT * FROM `newword`";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    libraryModel library_model = new libraryModel();
                    library_model.setId(rs.getInt("id"));
                    library_model.setWord(rs.getString("word"));
                    library_model.setMean(rs.getString("mean"));
                    library_model.setPronunciation(rs.getString("pronunciation"));
                    library_model.setAudiolink(rs.getString("audiolink"));
                    List.add(library_model);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }

    }

    public int AddWord(libraryModel lbModel) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "INSERT INTO `newword`(`word`, `mean`,`pronunciation`,`audiolink`) VALUES (?,?,?,?)";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(1, lbModel.getWord());
                ps.setString(2, lbModel.getMean());
                ps.setString(3, lbModel.getPronunciation());
                ps.setString(4, lbModel.getAudiolink());
                return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }

    }

    public int UpdateWord(libraryModel lbModel, String word) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "UPDATE `newword` SET `mean`=? WHERE `word`=?";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(2, word);
                ps.setString(1, lbModel.getMean());
                ps.executeUpdate();
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }

    }

    public int DeleteWord(String word) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "DELETE FROM `newword` WHERE `word` = ?";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(1, word);
                return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }

    public int PlayAudio(String word, List<libraryModel> List) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "SELECT `audiolink` FROM `newword` WHERE `word` = ?";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(1, word);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    libraryModel library_model = new libraryModel();
                    library_model.setAudiolink(rs.getString("audiolink"));
                    List.add(library_model);
                }
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }

    }

    public int UpdatePronunciation(libraryModel lbModel, String word) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "UPDATE `newword` SET `pronunciation`=? WHERE `word`=?";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(2, word);
                ps.setString(1, lbModel.getPronunciation());
                ps.executeUpdate();
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }

    }

    public int UpdateAudioLink(libraryModel lbModel, String word) {
        Connection cnn = ConnectionDatabase.cnnDB();
        if (cnn == null) {
            return -1;
        } else {
            try {
                String sql = "UPDATE `newword` SET `audiolink`=? WHERE `word`=?";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(2, word);
                ps.setString(1, lbModel.getAudiolink());
                ps.executeUpdate();
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }

        }

    }
}
