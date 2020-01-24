package com.aventure.util;

import java.util.List;

import com.aventure.entity.Experience;
import com.aventure.entity.Experience.DifficultyLevel;

public class ResponseUtil {

    private static final String TITLE = "<title>"
                                      + "Aventure - Capturing experience"
                                      + "</title>";
    private static final String EXP_HEAD = "<head>"
                                         + "Experience - #head#"
                                         + "</head>";
    private static final String EXP_HOME = "<html>"
                                         + TITLE
                                         + EXP_HEAD
                                         + "<body>"
                                         + "<ul>"
                                         + "<li><a href=\"/aventure/experience/list\">All</a></li>"
                                         + "<li><a href=\"/aventure/experience/solvable/true/list\">Solvable</a></li>"
                                         + "<li><a href=\"/aventure/experience/solvable/false/list\">Unsolvable</a></li>"
                                         + "<li><a href=\"/aventure/experience/understandable/true/list\">Understandable</a></li>"
                                         + "<li><a href=\"/aventure/experience/understandable/false/list\">Non-Understandable</a></li>"
                                         + "<li><a href=\"/aventure/experience/add\">Add Experience</a></li>"
                                         + "</ul>"
                                         + "</body>"
                                         + "</html>";

    private static final String EXP_LIST_TEMPLATE = "<html>"
                                              + TITLE
                                              + EXP_HEAD
                                              + "<body>"
                                              + "<table border=\"1\">"
                                              + "<tr>"
                                              + "<th>Id</th>"
                                              + "<th>Student Activity</th>"
                                              + "<th>Solvable</th>"
                                              + "<th>Understandable</th>"
                                              + "<th>Difficulty</th>"
                                              + "</tr>"
                                              + "#rows#"
                                              + "</table>"
                                              + "</body>"
                                              + "</html>";
    private static final String EXP_ADD_TEMPLATE = "<html>"
                                                 + TITLE
                                                 + EXP_HEAD
                                                 + "<body>"
                                                 + "<div width=\"500px\">"
                                                 + "<form action=\"aventure/experience/add\">"
                                                 + "<label>Difficulty</label>"
                                                 + "<select name=\"difficultyLevel\">"
                                                 + "<option value=\"ONE\">ONE</option>"
                                                 + "<option value=\"TWO\">TWO</option>"
                                                 + "<option value=\"THREE\">THREE</option>"
                                                 + "<option value=\"FOUR\">FOUR</option>"
                                                 + "<option value=\"FIVE\">FIVE</option>"
                                                 + "</select><br/>"
                                                 + "<label>Solvable</label>"
                                                 + "<input type=\"radio\" name=\"solvable\" value=\"true\" checked>Yes</input><br/>"
                                                 + "<input type=\"radio\" name=\"solvable\" value=\"false\">No</input><br/>"
                                                 + "<label>Understandable</label>"
                                                 + "<input type=\"radio\" name=\"understandable\" value=\"true\" checked>Yes</input><br/>"
                                                 + "<input type=\"radio\" name=\"understandable\" value=\"false\">No</input><br/>"
                                                 + "<input type=\"submit\" align=\"right\" width=\"48\" height=\"48\">"
                                                 + "</form>"
                                                 + "</div>"
                                                 + "</body>"
                                                 + "</html>";
    private static final String EXP_EDIT_TEMPLATE = "<html>"
                                                 + TITLE
                                                 + EXP_HEAD
                                                 + "<body>"
                                                 + "<div width=\"500px\">"
                                                 + "<form action=\"aventure/experience/add\">"
                                                 + "<label>Difficulty</label>"
                                                 + "<select name=\"difficultyLevel\">"
                                                 + "<option value=\"ONE\" #ONE#>ONE</option>"
                                                 + "<option value=\"TWO\" #TWO#>TWO</option>"
                                                 + "<option value=\"THREE\" #THREE#>THREE</option>"
                                                 + "<option value=\"FOUR\" #FOUR#>FOUR</option>"
                                                 + "<option value=\"FIVE\" #FIVE#>FIVE</option>"
                                                 + "</select><br/>"
                                                 + "<label>Solvable</label>"
                                                 + "<input type=\"radio\" name=\"solvable\" value=\"true\" #YS#>Yes</input><br/>"
                                                 + "<input type=\"radio\" name=\"solvable\" value=\"false\" #NS#>No</input><br/>"
                                                 + "<label>Understandable</label>"
                                                 + "<input type=\"radio\" name=\"understandable\" value=\"true\" #YU#>Yes</input><br/>"
                                                 + "<input type=\"radio\" name=\"understandable\" value=\"false\" #NU#>No</input><br/>"
                                                 + "<input type=\"submit\" align=\"right\" width=\"48\" height=\"48\">"
                                                 + "</form>"
                                                 + "</div>"
                                                 + "</body>"
                                                 + "</html>";

    public static String experienceHome() {
        return EXP_HOME.replace("#head#", "Home");
    }

    public static String listExperience(final List<Experience> list, final String head) {
        if (list == null || list.isEmpty()) {
            return "Empty list";
        }
        final StringBuilder rows = new StringBuilder();
        for (final Experience item : list) {
            rows.append("<tr>");
            rows.append("<td><a href=\"edit/").append(item.getExperienceId()).append("\">").append(item.getExperienceId()).append("</a></td>");
            rows.append("<td>").append(item.getStudentActivity().getStuActId()).append("</td>");
            rows.append("<td>").append(item.isSolvable()).append("</td>");
            rows.append("<td>").append(item.isUnderstandable()).append("</td>");
            rows.append("<td>").append(item.getDifficultyLevel()).append("</td>");
            rows.append("</tr>");
        }
        return EXP_LIST_TEMPLATE.replace("#head#", head).replace("#rows#", rows);
    }

    public static String addExperience() {
        return EXP_ADD_TEMPLATE.replace("#head#", "Add New");
    }

    public static String editExperience(final Experience experience) {
        final StringBuilder response = new StringBuilder(EXP_EDIT_TEMPLATE.replace("#head#", "Edit"));
        if (experience.isSolvable()) {
            int start = response.indexOf("#YS#");
            response.replace(start, start + 4, "checked");
            start = response.indexOf("#NS#");
            response.replace(start, start + 4, "");
        } else {
            int start = response.indexOf("#NS#");
            response.replace(start, start + 4, "checked");
            start = response.indexOf("#YS#");
            response.replace(start, start + 4, "");
        }
        if (experience.isUnderstandable()) {
            int start = response.indexOf("#YU#");
            response.replace(start, start + 4, "checked");
            start = response.indexOf("#NU#");
            response.replace(start, start + 4, "");
        } else {
            int start = response.indexOf("#NU#");
            response.replace(start, start + 4, "checked");
            start = response.indexOf("#YU#");
            response.replace(start, start + 4, "");
        }
        final DifficultyLevel[] levels = DifficultyLevel.values();
        for (final DifficultyLevel level : levels) {
            final int start = response.indexOf("#" + level.name() + "#");
            final int end = start + level.name().length() + 2;
            if (experience.getDifficultyLevel().equals(level)) {
                response.replace(start, end, "selected");
            } else {
                response.replace(start, end, "");
            }
        }
        return response.toString();
    }

}