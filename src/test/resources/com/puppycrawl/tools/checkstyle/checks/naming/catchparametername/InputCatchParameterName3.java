/*
CatchParameterName
format = [a-z]


*/

package com.puppycrawl.tools.checkstyle.checks.naming.catchparametername;

public class InputCatchParameterName3 {
    {
        try {
        } catch (Exception e) {
        }
        try {
        } catch (Exception ex) {
        }
        try {
        } catch (Error | Exception err) {
        }
        try {
        } catch (Exception exception) {
        }
        try {
        } catch (Exception exception1) {
        }
        try {
        } catch (Exception noWorries) {
        }
        try {
        } catch (Throwable t) {
        }
        try {
            throw new InterruptedException("interruptedException");
        } catch (InterruptedException ie) {
        }
        try {
        } catch (Exception iException) {
        }
        try {
        } catch (Exception ok) {
            // appropriate to take no action here
        }
        try {
        } catch (Exception e1) {
            try {
            } catch (Exception e2) {
            }
        }
        try {
        } catch (Throwable t1) {
            try {
            } catch (Throwable t2) {
            }
        }
    }
}
