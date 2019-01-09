package net.alex9849.arm;

import java.sql.Statement;

public class ArmSettings {
    private static boolean isAllowSubRegionUserReset = false;
    private static boolean isSubregionBlockReset = false;
    private static boolean isSubregionAutoReset = false;
    private static boolean isTeleportAfterSellRegionBought = false;
    private static boolean teleportAfterRentRegionBought = false;
    private static boolean isTeleportAfterRentRegionExtend = false;
    private static boolean isTeleportAfterContractRegionBought = false;
    private static boolean isSendContractRegionExtendMessage = false;
    private static boolean isRegionInfoParticleBorder = true;
    private static boolean useShortCountdown = false;
    private static String REMAINING_TIME_TIMEFORMAT = "%date%";
    private static String DATE_TIMEFORMAT = "dd.MM.yyyy hh:mm";
    private static int autoResetAfter;
    private static int takeoverAfter;
    private static boolean enableAutoReset;
    private static boolean enableTakeOver;
    private static Statement stmt;
    private static String sqlPrefix;

    protected static void setIsAllowSubRegionUserReset(boolean isAllowSubRegionUserReset) {
        ArmSettings.isAllowSubRegionUserReset = isAllowSubRegionUserReset;
    }

    protected static void setIsRegionInfoParticleBorder(boolean isRegionInfoParticleBorder) {
        ArmSettings.isRegionInfoParticleBorder = isRegionInfoParticleBorder;
    }

    protected static void setIsSubregionBlockReset(boolean isSubregionBlockReset) {
        ArmSettings.isSubregionBlockReset = isSubregionBlockReset;
    }

    protected static void setIsSubregionAutoReset(boolean isSubregionAutoReset) {
        ArmSettings.isSubregionAutoReset = isSubregionAutoReset;
    }

    protected static void setIsTeleportAfterSellRegionBought(boolean isTeleportAfterSellRegionBought) {
        ArmSettings.isTeleportAfterSellRegionBought = isTeleportAfterSellRegionBought;
    }

    protected static void setIsTeleportAfterRentRegionBought(boolean teleportAfterRentRegionBought) {
        ArmSettings.teleportAfterRentRegionBought = teleportAfterRentRegionBought;
    }

    protected static void setIsTeleportAfterRentRegionExtend(boolean isTeleportAfterRentRegionExtend) {
        ArmSettings.isTeleportAfterRentRegionExtend = isTeleportAfterRentRegionExtend;
    }

    protected static void setIsTeleportAfterContractRegionBought(boolean isTeleportAfterContractRegionBought) {
        ArmSettings.isTeleportAfterContractRegionBought = isTeleportAfterContractRegionBought;
    }

    protected static void setIsSendContractRegionExtendMessage(boolean isSendContractRegionExtendMessage) {
        ArmSettings.isSendContractRegionExtendMessage = isSendContractRegionExtendMessage;
    }

    protected static void setUseShortCountdown(boolean useShortCountdown) {
        ArmSettings.useShortCountdown = useShortCountdown;
    }

    protected static void setRemainingTimeTimeformat(String remainingTimeTimeformat) {
        REMAINING_TIME_TIMEFORMAT = remainingTimeTimeformat;
    }

    protected static void setDateTimeformat(String dateTimeformat) {
        DATE_TIMEFORMAT = dateTimeformat;
    }

    protected static void setAutoResetAfter(int autoResetAfter) {
        ArmSettings.autoResetAfter = autoResetAfter;
    }

    protected static void setTakeoverAfter(int takeoverAfter) {
        ArmSettings.takeoverAfter = takeoverAfter;
    }

    protected static void setEnableAutoReset(boolean enableAutoReset) {
        ArmSettings.enableAutoReset = enableAutoReset;
    }

    protected static void setEnableTakeOver(boolean enableTakeOver) {
        ArmSettings.enableTakeOver = enableTakeOver;
    }

    protected static void setStmt(Statement stmt) {
        ArmSettings.stmt = stmt;
    }

    protected static void setSqlPrefix(String sqlPrefix) {
        ArmSettings.sqlPrefix = sqlPrefix;
    }

    public static boolean isAllowSubRegionUserReset() {
        return isAllowSubRegionUserReset;
    }

    public static boolean isSubregionBlockReset() {
        return isSubregionBlockReset;
    }

    public static boolean isSubregionAutoReset() {
        return isSubregionAutoReset;
    }

    public static boolean isTeleportAfterSellRegionBought() {
        return isTeleportAfterSellRegionBought;
    }

    public static boolean isTeleportAfterRentRegionBought() {
        return teleportAfterRentRegionBought;
    }

    public static boolean isTeleportAfterRentRegionExtend() {
        return isTeleportAfterRentRegionExtend;
    }

    public static boolean isTeleportAfterContractRegionBought() {
        return isTeleportAfterContractRegionBought;
    }

    public static boolean isSendContractRegionExtendMessage() {
        return isSendContractRegionExtendMessage;
    }

    public static boolean isUseShortCountdown() {
        return useShortCountdown;
    }

    public static String getRemainingTimeTimeformat() {
        return REMAINING_TIME_TIMEFORMAT;
    }

    public static String getDateTimeformat() {
        return DATE_TIMEFORMAT;
    }

    public static int getAutoResetAfter() {
        return autoResetAfter;
    }

    public static int getTakeoverAfter() {
        return takeoverAfter;
    }

    public static boolean isEnableAutoReset() {
        return enableAutoReset;
    }

    public static boolean isEnableTakeOver() {
        return enableTakeOver;
    }

    public static boolean isRegionInfoParticleBorder() {
        return isRegionInfoParticleBorder;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public static String getSqlPrefix() {
        return sqlPrefix;
    }
}
