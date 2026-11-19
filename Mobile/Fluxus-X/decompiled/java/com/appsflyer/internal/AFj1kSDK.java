package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import p001kotlin.text.MatchGroup;
import p001kotlin.text.MatchResult;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1kSDK {
    public static final int AFKeystoreWrapper(@NotNull String str) {
        String value;
        Integer intOrNull;
        String value2;
        Integer intOrNull2;
        String value3;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultE = new Regex("(\\d+).(\\d+).(\\d+).*").e(str);
        if (matchResultE == null) {
            return -1;
        }
        MatchGroup matchGroup = matchResultE.getGroups().get(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroup == null || (value3 = matchGroup.getValue()) == null || (intOrNull3 = StringsKt.toIntOrNull(value3)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroup2 = matchResultE.getGroups().get(2);
        int iIntValue3 = iIntValue2 + (((matchGroup2 == null || (value2 = matchGroup2.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
        MatchGroup matchGroup3 = matchResultE.getGroups().get(3);
        if (matchGroup3 != null && (value = matchGroup3.getValue()) != null && (intOrNull = StringsKt.toIntOrNull(value)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }

    public static final String registerClient(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str3 = BuildConfig.FLAVOR;
        for (byte b : bArrDigest) {
            p001kotlin.jvm.internal.g0 g0Var = p001kotlin.jvm.internal.g0.f21582a;
            String str4 = String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str3 + str4;
        }
        return str3;
    }
}
