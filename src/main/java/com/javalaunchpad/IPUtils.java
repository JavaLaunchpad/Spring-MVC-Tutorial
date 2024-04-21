package com.javalaunchpad;

import jakarta.servlet.http.HttpServletRequest;

public class IPUtils {

    static String[] blacklistedIps =  {"127.0.0.1" , "" , ""}; // Add the blacklisted IPs here


    // Method to get the IP address of the client
    public static String getClientIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    // Method to test if the IP address is blacklisted
    public static boolean isIpBlacklisted(String ip) {
        for (String blacklistedIp : blacklistedIps) {
            if (blacklistedIp.equals(ip)) {
                return true;
            }
        }
        return false;
    }
}
