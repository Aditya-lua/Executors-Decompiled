package p116f2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: f2.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public class C5315a {
    /* JADX INFO: renamed from: a */
    public static String m24625a(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return "?" + i10;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m24626b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
