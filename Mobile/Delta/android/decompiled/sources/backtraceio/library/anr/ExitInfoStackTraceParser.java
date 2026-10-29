package backtraceio.library.anr;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ExitInfoStackTraceParser {
    private static final Pattern JAVA_FRAME_PATTERN = Pattern.compile("\\s*at (.*?)\\((.*?):(\\d+)\\)");
    private static final String MAIN_THREAD_NAME = "main";
    private static final int NATIVE_STACK_ELEMENTS_NUMBER = 6;

    private static Map<String, Object> getMainThreadInfo(List<Map<String, Object>> list) {
        for (Map<String, Object> map : list) {
            if (map.get("name").equals(MAIN_THREAD_NAME)) {
                return map;
            }
        }
        return null;
    }

    public static Map<String, Object> parseANRStackTrace(String str) {
        HashMap map = new HashMap();
        if (str != null && !str.isEmpty()) {
            map.put("timestamp", parseTimestamp(str));
            Matcher matcher = Pattern.compile("----- pid (\\d+) at").matcher(str);
            if (matcher.find()) {
                map.put("pid", Integer.valueOf(Integer.parseInt(matcher.group(1))));
            }
            Matcher matcher2 = Pattern.compile("Cmd line: (.*)").matcher(str);
            if (matcher2.find()) {
                map.put("command_line", matcher2.group(1));
            }
            Matcher matcher3 = Pattern.compile("Build fingerprint: '(.*?)'").matcher(str);
            if (matcher3.find()) {
                map.put("build_fingerprint", matcher3.group(1));
            }
            Matcher matcher4 = Pattern.compile("ABI: '(.*?)'").matcher(str);
            if (matcher4.find()) {
                map.put("abi", matcher4.group(1));
            }
            Matcher matcher5 = Pattern.compile("Build type: (.*)").matcher(str);
            if (matcher5.find()) {
                map.put("build_type", matcher5.group(1));
            }
            Matcher matcher6 = Pattern.compile("Heap: (.*)").matcher(str);
            if (matcher6.find()) {
                map.put("heap_info", matcher6.group(1));
            }
            List<Map<String, Object>> threadDumps = parseThreadDumps(str);
            map.put("threads", threadDumps);
            map.put("main_thread", getMainThreadInfo(threadDumps));
        }
        return map;
    }

    public static StackTraceElement parseFrame(String str) {
        StackTraceElement javaFrame = parseJavaFrame(str);
        return javaFrame != null ? javaFrame : parseNativeFrame(str);
    }

    public static StackTraceElement parseJavaFrame(String str) {
        Matcher matcher = JAVA_FRAME_PATTERN.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        int i10 = Integer.parseInt(matcher.group(3));
        int iLastIndexOf = strGroup.lastIndexOf(46);
        return new StackTraceElement(iLastIndexOf == -1 ? strGroup : strGroup.substring(0, iLastIndexOf), iLastIndexOf == -1 ? "" : strGroup.substring(iLastIndexOf + 1), strGroup2, i10);
    }

    public static StackTraceElement[] parseMainThreadStackTrace(Map<String, Object> map) {
        Map map2 = (Map) map.get("main_thread");
        if (map2 == null) {
            return new StackTraceElement[0];
        }
        List list = (List) map2.get("stack_trace");
        if (list == null) {
            return new StackTraceElement[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StackTraceElement frame = parseFrame((String) it.next());
            if (frame != null) {
                arrayList.add(frame);
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static StackTraceElement parseNativeFrame(String str) {
        if (!str.startsWith("native")) {
            return null;
        }
        String[] strArrSplit = str.split("\\s+", 6);
        if (strArrSplit.length < 6) {
            return null;
        }
        String str2 = strArrSplit[3];
        return new StackTraceElement(strArrSplit[4], strArrSplit[5], "address: " + str2, 0);
    }

    public static List<Map<String, Object>> parseThreadDumps(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("\\\"(.*?)\\\" (daemon )?prio=(\\d+) tid=(\\d+) (\\w+)(.*)\\n(?s)((.*?\\n))(?=(?:\\n\\n)|$)", 8).matcher(str);
        while (matcher.find()) {
            arrayList.add(parseThreadInformation(matcher.group()));
        }
        return arrayList;
    }

    private static Map<String, Object> parseThreadInformation(String str) {
        HashMap map = new HashMap();
        Matcher matcher = Pattern.compile("\"([^\"]+)\"\\s*(daemon)?\\s*prio=(\\d+)\\s*tid=(\\d+)\\s*([^\\n]+)").matcher(str);
        if (matcher.find()) {
            map.put("name", matcher.group(1));
            map.put("isDaemon", Boolean.valueOf(matcher.group(2) != null));
            map.put("prio", Integer.valueOf(Integer.parseInt(matcher.group(3))));
            map.put("tid", Integer.valueOf(Integer.parseInt(matcher.group(4))));
            map.put("status", matcher.group(5).trim());
        }
        map.put("stack_trace", parseThreadStackTrace(str));
        return map;
    }

    @NonNull
    private static List<String> parseThreadStackTrace(String str) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (String str2 : str.split("\n")) {
            String strTrim = str2.trim();
            if (z10 && (strTrim.isEmpty() || strTrim.startsWith("\""))) {
                break;
            }
            if (!strTrim.isEmpty() && !strTrim.startsWith("\"") && (strTrim.startsWith("at ") || strTrim.startsWith("native:"))) {
                arrayList.add(strTrim);
                z10 = true;
            }
        }
        return arrayList;
    }

    private static Object parseTimestamp(String str) {
        Matcher matcher = Pattern.compile("----- pid \\d+ at (.*?) -----").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
