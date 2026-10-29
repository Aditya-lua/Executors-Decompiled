package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1ySDK {
    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    public static boolean registerClient(@NotNull String str, @NotNull String str2) {
        Pair pairM30477a;
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        String value7;
        String value8;
        String value9;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iAFKeystoreWrapper = AFj1kSDK.AFKeystoreWrapper(str);
        int iAFKeystoreWrapper2 = AFj1kSDK.AFKeystoreWrapper(str2);
        Intrinsics.checkNotNullParameter(str2, "");
        MatchResult matchResultM32112e = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").m32112e(str2);
        Pair pairM30477a2 = null;
        if (matchResultM32112e == null) {
            pairM30477a = null;
        } else {
            MatchGroup matchGroup = matchResultM32112e.getGroups().get(1);
            Integer intOrNull = (matchGroup == null || (value9 = matchGroup.getValue()) == null) ? null : StringsKt.toIntOrNull(value9);
            MatchGroup matchGroup2 = matchResultM32112e.getGroups().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (value8 = matchGroup2.getValue()) == null) ? null : StringsKt.toIntOrNull(value8);
            MatchGroup matchGroup3 = matchResultM32112e.getGroups().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (value7 = matchGroup3.getValue()) == null) ? null : StringsKt.toIntOrNull(value7);
            MatchGroup matchGroup4 = matchResultM32112e.getGroups().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (value6 = matchGroup4.getValue()) == null) ? null : StringsKt.toIntOrNull(value6);
            MatchGroup matchGroup5 = matchResultM32112e.getGroups().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (value5 = matchGroup5.getValue()) == null) ? null : StringsKt.toIntOrNull(value5);
            MatchGroup matchGroup6 = matchResultM32112e.getGroups().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (value4 = matchGroup6.getValue()) == null) ? null : StringsKt.toIntOrNull(value4);
            Object[] objArr = {intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6};
            Integer num = intOrNull6;
            Intrinsics.checkNotNullParameter(objArr, "");
            if (C7693m.m31838G(objArr, null)) {
                pairM30477a = null;
            } else {
                Intrinsics.checkNotNull(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull2);
                int iIntValue2 = iIntValue + (intOrNull2.intValue() * 1000);
                Intrinsics.checkNotNull(intOrNull3);
                Integer numValueOf = Integer.valueOf(iIntValue2 + intOrNull3.intValue());
                Intrinsics.checkNotNull(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull5);
                int iIntValue4 = iIntValue3 + (intOrNull5.intValue() * 1000);
                Intrinsics.checkNotNull(num);
                pairM30477a = C7352s.m30477a(numValueOf, Integer.valueOf(iIntValue4 + num.intValue()));
            }
        }
        Intrinsics.checkNotNullParameter(str2, "");
        MatchResult matchResultM32112e2 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").m32112e(str2);
        if (matchResultM32112e2 != null) {
            MatchGroup matchGroup7 = matchResultM32112e2.getGroups().get(1);
            Integer intOrNull7 = (matchGroup7 == null || (value3 = matchGroup7.getValue()) == null) ? null : StringsKt.toIntOrNull(value3);
            MatchGroup matchGroup8 = matchResultM32112e2.getGroups().get(3);
            Integer intOrNull8 = (matchGroup8 == null || (value2 = matchGroup8.getValue()) == null) ? null : StringsKt.toIntOrNull(value2);
            MatchGroup matchGroup9 = matchResultM32112e2.getGroups().get(4);
            Integer intOrNull9 = (matchGroup9 == null || (value = matchGroup9.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
            if (intOrNull7 != null) {
                pairM30477a2 = C7352s.m30477a(Integer.valueOf(intOrNull7.intValue() * 1000000), Integer.valueOf(((intOrNull7.intValue() + 1) * 1000000) - 1));
            } else if (intOrNull8 != null && intOrNull9 != null) {
                pairM30477a2 = C7352s.m30477a(Integer.valueOf((intOrNull8.intValue() * 1000000) + (intOrNull9.intValue() * 1000)), Integer.valueOf(((intOrNull8.intValue() * 1000000) + ((intOrNull9.intValue() + 1) * 1000)) - 1));
            }
        }
        if (iAFKeystoreWrapper2 != -1 && pairM30477a == null) {
            return iAFKeystoreWrapper2 == iAFKeystoreWrapper;
        }
        if (pairM30477a2 != null) {
            return ((Number) pairM30477a2.m31673c()).intValue() <= iAFKeystoreWrapper && iAFKeystoreWrapper <= ((Number) pairM30477a2.m31674d()).intValue();
        }
        return pairM30477a != null && ((Number) pairM30477a.m31673c()).intValue() <= iAFKeystoreWrapper && iAFKeystoreWrapper <= ((Number) pairM30477a.m31674d()).intValue();
    }
}
