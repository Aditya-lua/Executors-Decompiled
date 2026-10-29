package com.appsflyer.internal;

import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFj1jSDK;", "", "<init>", "()V", "", "p0", "AFKeystoreWrapper", "(Ljava/lang/String;)Ljava/lang/String;", "p1", "unregisterClient", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "AFLogger"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFj1jSDK {

    @NotNull
    public static final AFj1jSDK INSTANCE = new AFj1jSDK();

    public /* synthetic */ class AFa1vSDK {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f5439d;

        static {
            int[] iArr = new int[kotlin.text.a.values().length];
            try {
                iArr[kotlin.text.a.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.text.a.FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.text.a.DASH_PUNCTUATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.text.a.START_PUNCTUATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.text.a.END_PUNCTUATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.text.a.CONNECTOR_PUNCTUATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.text.a.OTHER_PUNCTUATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kotlin.text.a.INITIAL_QUOTE_PUNCTUATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[kotlin.text.a.FINAL_QUOTE_PUNCTUATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5439d = iArr;
        }
    }

    private AFj1jSDK() {
    }

    public static String AFKeystoreWrapper(String p8, String p10) throws IOException {
        String str = p8 + p10;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @NotNull
    public static String AFLogger(@NotNull String p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < p8.length(); i10++) {
            char cCharAt = p8.charAt(i10);
            switch (AFa1vSDK.f5439d[CharsKt.b(cCharAt).ordinal()]) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    sb2.append(cCharAt);
                    break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    @NotNull
    public static String unregisterClient(@NotNull String p8, @NotNull String p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        return "+" + StringsKt.s1(AFKeystoreWrapper(p8, p10), '0');
    }

    @NotNull
    public static String AFKeystoreWrapper(@NotNull String p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < p8.length(); i10++) {
            char cCharAt = p8.charAt(i10);
            if (!CharsKt.c(cCharAt)) {
                int i11 = AFa1vSDK.f5439d[CharsKt.b(cCharAt).ordinal()];
                if (i11 != 1 && i11 != 2) {
                    sb2.append(cCharAt);
                }
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }
}
