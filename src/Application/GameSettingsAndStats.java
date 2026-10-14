package Application;

/**
 * The GameSettingsAndStats class encapsulates the game settings and statistics.
 * <p>
 * This class manages settings such as volume and time limit, as well as statistics like the
 * number of levels completed, total time played, and the identifier of the last played game element.
 * Additionally, it provides methods to enable or disable parental lock.
 * </p>
 * 
 * Author: Zachary Goodman
 */
public class GameSettingsAndStats {
    // Game volume (0 to 100)
    private int volume;
    // Number of levels completed or current level count
    private int levels;
    // Total time played (in seconds or another time unit)
    private int timePlayed;
    // Identifier or description of the last played element (e.g., duck or level)
    private String lastPlayed;
    // Time limit for the game (-1 indicates no limit/infinite)
    private int timeLimit;
    // Flag to indicate if the parental lock is active
    private boolean parentalLockActive;
    // Number of sessions played to calculate average
    private int numberOfSessions; 

    /**
     * Constructs a new GameSettingsAndStats object with default settings.
     * Default values:
     * <ul>
     *     <li>Volume: 50</li>
     *     <li>Levels: 0</li>
     *     <li>Time Played: 0</li>
     *     <li>Last Played: empty string</li>
     *     <li>Time Limit: -1 (infinite)</li>
     *     <li>Parental Lock: inactive</li>
     * </ul>
     */
    public GameSettingsAndStats() {
        this.volume = 50;
        this.levels = 0;
        this.timePlayed = 0;
        this.lastPlayed = "";
        this.timeLimit = -1;
        this.parentalLockActive = false;
        this.numberOfSessions = 0;
    }

    /**
     * Retrieves the current volume level.
     *
     * @return the volume level as an integer
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Retrieves the current level count.
     *
     * @return the number of levels completed
     */
    public int getLevels() {
        return levels;
    }

    /**
     * Retrieves the number of sessions played.
     *
     * @return the number of sessions played
     */
    public int getSessions() {
        return numberOfSessions;
    }

    /**
     * Updates the number of sessions played.
     *
     * @param change the amount to change the session count by
     */
    public void updateNumSessions(int change) {
        numberOfSessions += change;
    }

    /**
     * Increments the number of sessions played by 1.
     */
    public void addSession() {
        numberOfSessions += 1;
    }

    /**
     * Retrieves the total time played.
     *
     * @return the total time played
     */
    public int timePlayed() {
        return timePlayed;
    }

    /**
     * Retrieves the last played game element (e.g., duck or level).
     *
     * @return the identifier of the last played element
     */
    public String lastPlayed() {
        return lastPlayed;
    }

    /**
     * Retrieves the current time limit setting.
     *
     * @return the time limit, where -1 indicates no limit
     */
    public int getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the time limit for the game.
     *
     * @param limit the new time limit (use -1 for infinite)
     */
    public void setTimeLimit(int limit) {
        this.timeLimit = limit;
    }

    /**
     * Sets the volume level for the game.
     *
     * @param newV the new volume level
     */
    public void setVolume(int newV) {
        volume = newV;
    }

    /**
     * Sets the level count for the game.
     *
     * @param newL the new level count
     */
    public void setLevel(int newL) {
        levels = newL;
    }

    /**
     * Increments the total time played by a specified amount.
     *
     * @param change the amount of time to add to the total time played
     */
    public void setTimePLayed(int change) {
        timePlayed += change;
    }

    /**
     * Sets the last played game element (e.g., duck or level).
     *
     * @param element the identifier of the last played element
     */
    public void setLastPlayed(String element) {
        lastPlayed = element;
    }

    /**
     * Checks if the parental lock is active.
     *
     * @return true if the parental lock is active, false otherwise
     */
    public boolean isParentalLockActive() {
        return parentalLockActive;
    }

    /**
     * Sets the parental lock status.
     *
     * @param parentalLockActive true to activate the parental lock, false to deactivate it
     */
    public void setParentalLockActive(boolean parentalLockActive) {
        this.parentalLockActive = parentalLockActive;
    }

    /**
     * Prints the current volume level to the console.
     */
    public void printV() {
        System.out.println(volume);
    }
}

