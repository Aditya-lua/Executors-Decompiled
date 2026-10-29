package p101ed;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import p426s2.C11162a;

/* JADX INFO: renamed from: ed.h */
/* JADX INFO: loaded from: classes2.dex */
public class C5055h {
    /* JADX INFO: renamed from: a */
    public static Typeface m23764a(@NonNull Context context, @NonNull Typeface typeface) {
        return m23765b(context.getResources().getConfiguration(), typeface);
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m23765b(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C11162a.m42060c(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
