package com.withpersona.sdk2.inquiry.network.dto;

import android.graphics.Color;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/RgbaHexColorAdapter;", "", "<init>", "()V", "toJson", "", "rgba", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)Ljava/lang/Integer;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RgbaHexColorAdapter {

    @NotNull
    public static final RgbaHexColorAdapter INSTANCE = new RgbaHexColorAdapter();

    private RgbaHexColorAdapter() {
    }

    @RgbaHexColor
    @Nullable
    @InterfaceC11871f
    public final Integer fromJson(@NotNull String rgba) {
        Long lU;
        Intrinsics.checkNotNullParameter(rgba, "rgba");
        String upperCase = StringsKt.m32183p1(rgba).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String strG0 = StringsKt.m32126G0(upperCase, "#");
        int length = strG0.length();
        if (length != 6) {
            if (length != 8 || (lU = StringsKt.m32119u(strG0, 16)) == null) {
                return null;
            }
            long jLongValue = lU.longValue();
            return Integer.valueOf(Color.argb((int) (jLongValue & 255), (int) ((jLongValue >> 24) & 255), (int) ((jLongValue >> 16) & 255), (int) ((jLongValue >> 8) & 255)));
        }
        Integer numS = StringsKt.m32117s(strG0, 16);
        if (numS == null) {
            return null;
        }
        int iIntValue = numS.intValue();
        return Integer.valueOf(Color.rgb((iIntValue >> 16) & 255, (iIntValue >> 8) & 255, iIntValue & 255));
    }

    @NotNull
    @InterfaceC11891z
    public final String toJson(@RgbaHexColor @Nullable Integer rgba) {
        throw new IllegalStateException("Should not be called");
    }
}
