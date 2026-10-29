package com.roblox.engine.jni.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecInfoUtils {

    /* JADX INFO: renamed from: a */
    public static final Map<Integer, List<String>> f12623a = m15836d(MediaCodecInfo.CodecProfileLevel.class, "Profile");

    /* JADX INFO: renamed from: b */
    public static final Map<Integer, List<String>> f12624b = m15836d(MediaCodecInfo.CodecProfileLevel.class, "Level");

    /* JADX INFO: renamed from: c */
    public static final Map<Integer, List<String>> f12625c = m15836d(MediaCodecInfo.CodecProfileLevel.class, "AACObject");

    /* JADX INFO: renamed from: d */
    public static final Map<String, String> f12626d;

    static {
        HashMap map = new HashMap();
        f12626d = map;
        map.put("heic", "HEVC");
        map.put("hevc", "HEVC");
        map.put("avc", "AVC");
        map.put("3gpp", "H263");
        map.put("mpeg2", "MPEG2");
        map.put("mp4v-es", "MPEG4");
        map.put("vp8", "VP8");
        map.put("vp9", "VP9");
        map.put("av01", "AV1");
        map.put("vorbis", "Vorbis");
        map.put("opus", "Opus");
    }

    /* JADX INFO: renamed from: a */
    public static <T> Field[] m15833a(Class<T> cls) {
        Field[] fields = cls.getFields();
        Field[] declaredFields = cls.getDeclaredFields();
        Field[] fieldArr = new Field[fields.length + declaredFields.length];
        System.arraycopy(fields, 0, fieldArr, 0, fields.length);
        System.arraycopy(declaredFields, 0, fieldArr, fields.length, declaredFields.length);
        return fieldArr;
    }

    /* JADX INFO: renamed from: b */
    public static MediaCodecInfo.CodecCapabilities m15834b(MediaCodecInfo mediaCodecInfo, String str) {
        try {
            return mediaCodecInfo.getCapabilitiesForType(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m15835c(String str) {
        if (str.contains("aac") || str.contains("mp4a")) {
            return "AAC";
        }
        for (Map.Entry<String, String> entry : f12626d.entrySet()) {
            if (str.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Map<Integer, List<String>> m15836d(Class<?> cls, String str) {
        Field[] fieldArrM15833a = m15833a(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Field field : fieldArrM15833a) {
            if (field.getName().contains(str)) {
                try {
                    int i11 = field.getInt(null);
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(Integer.valueOf(i11))) {
                        linkedHashMap.put(Integer.valueOf(i11), new ArrayList());
                    }
                    ((List) linkedHashMap.get(Integer.valueOf(i11))).add(name);
                } catch (IllegalAccessException unused) {
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            linkedHashMap2.put(num, (List) linkedHashMap.get(num));
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> V m15837e(Map<K, V> map, K k10, V v5) {
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : v5;
    }

    /* JADX INFO: renamed from: f */
    public static Pair<String, String> m15838f(String str, MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        String strValueOf;
        String strValueOf2;
        String strM15835c = m15835c(str);
        boolean zEquals = "AAC".equals(strM15835c);
        Iterator it = (zEquals ? (List) m15837e(f12625c, Integer.valueOf(codecProfileLevel.profile), Collections.EMPTY_LIST) : (List) m15837e(f12623a, Integer.valueOf(codecProfileLevel.profile), Collections.EMPTY_LIST)).iterator();
        do {
            strValueOf = "";
            if (!it.hasNext()) {
                strValueOf2 = "";
                break;
            }
            strValueOf2 = (String) it.next();
            if (strM15835c == null) {
                break;
            }
        } while (!strValueOf2.contains(strM15835c));
        if (strValueOf2.isEmpty()) {
            strValueOf2 = String.valueOf(codecProfileLevel.profile);
        }
        for (String str2 : zEquals ? Collections.singletonList(String.valueOf(codecProfileLevel.level)) : (List) m15837e(f12624b, Integer.valueOf(codecProfileLevel.level), Collections.EMPTY_LIST)) {
            if (strM15835c == null || str2.contains(strM15835c)) {
                strValueOf = str2;
                break;
            }
        }
        if (strValueOf.isEmpty()) {
            strValueOf = String.valueOf(codecProfileLevel.level);
        }
        return new Pair<>(strValueOf2, strValueOf);
    }

    /* JADX INFO: renamed from: g */
    public static String m15839g(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            String strM15835c = m15835c(str);
            if (strM15835c != null) {
                return strM15835c;
            }
        }
        return null;
    }

    @Keep
    public static VideoCodecCapability[] getVideoCodecs() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!m15840h(mediaCodecInfo) && m15842j(mediaCodecInfo) && m15839g(mediaCodecInfo) != null) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    VideoCodecCapability videoCodecCapabilityM15844l = m15844l(mediaCodecInfo, str);
                    if (videoCodecCapabilityM15844l != null) {
                        arrayList.add(videoCodecCapabilityM15844l);
                    }
                }
            }
        }
        return (VideoCodecCapability[]) arrayList.toArray(new VideoCodecCapability[0]);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m15840h(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isAlias();
        }
        return false;
    }

    @Keep
    public static boolean hevcHardwareEncodingSupported(int i10, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/hevc")) {
                        if (m15841i(mediaCodecInfo) || (videoCapabilities = mediaCodecInfo.getCapabilitiesForType("video/hevc").getVideoCapabilities()) == null || !videoCapabilities.areSizeAndRateSupported(i10, i11, i12)) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m15841i(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29 && (!mediaCodecInfo.isHardwareAccelerated() || mediaCodecInfo.isSoftwareOnly())) {
            return true;
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.contains(".sw.dec") || lowerCase.contains(".sw.enc") || lowerCase.contains("ffmpeg");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m15842j(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static int m15843k(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static VideoCodecCapability m15844l(MediaCodecInfo mediaCodecInfo, String str) {
        int iIntValue;
        int iIntValue2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        MediaCodecInfo.CodecCapabilities codecCapabilitiesM15834b = m15834b(mediaCodecInfo, str);
        Integer num6 = null;
        if (codecCapabilitiesM15834b == null) {
            return null;
        }
        List<Pair> arrayList = codecCapabilitiesM15834b.profileLevels == null ? Collections.EMPTY_LIST : new ArrayList();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilitiesM15834b.profileLevels) {
            arrayList.add(m15838f(str, codecProfileLevel));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Pair pair : arrayList) {
            arrayList2.add((String) pair.first);
            arrayList3.add((String) pair.second);
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilitiesM15834b.getVideoCapabilities();
        if (videoCapabilities == null || videoCapabilities.getBitrateRange() == null) {
            iIntValue = 0;
            iIntValue2 = 0;
        } else {
            iIntValue = ((Integer) videoCapabilities.getBitrateRange().getLower()).intValue();
            iIntValue2 = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedHeights() == null) {
            num = null;
            num2 = null;
        } else {
            num = (Integer) videoCapabilities.getSupportedHeights().getLower();
            num2 = (Integer) videoCapabilities.getSupportedHeights().getUpper();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedWidths() == null) {
            num3 = null;
            num4 = null;
        } else {
            num3 = (Integer) videoCapabilities.getSupportedWidths().getLower();
            num4 = (Integer) videoCapabilities.getSupportedWidths().getUpper();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedFrameRates() == null) {
            num5 = null;
        } else {
            num6 = (Integer) videoCapabilities.getSupportedFrameRates().getLower();
            num5 = (Integer) videoCapabilities.getSupportedFrameRates().getUpper();
        }
        VideoCodecCapability videoCodecCapability = new VideoCodecCapability();
        videoCodecCapability.isEncoder = mediaCodecInfo.isEncoder();
        videoCodecCapability.isHardware = !m15841i(mediaCodecInfo);
        videoCodecCapability.codec = m15835c(str);
        videoCodecCapability.name = mediaCodecInfo.getName();
        videoCodecCapability.profiles = (String[]) arrayList2.toArray(new String[0]);
        videoCodecCapability.levels = (String[]) arrayList3.toArray(new String[0]);
        videoCodecCapability.maxInstances = codecCapabilitiesM15834b.getMaxSupportedInstances();
        videoCodecCapability.minWidth = m15843k(num3);
        videoCodecCapability.maxWidth = m15843k(num4);
        videoCodecCapability.minHeight = m15843k(num);
        videoCodecCapability.maxHeight = m15843k(num2);
        videoCodecCapability.minFps = m15843k(num6);
        videoCodecCapability.maxFps = m15843k(num5);
        videoCodecCapability.minBitrate = iIntValue;
        videoCodecCapability.maxBitrate = iIntValue2;
        return videoCodecCapability;
    }
}
