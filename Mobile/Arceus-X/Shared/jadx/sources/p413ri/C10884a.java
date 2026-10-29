package p413ri;

import android.content.Context;
import android.content.res.Resources;
import java.util.IllegalFormatException;
import p151gk.C6124q;

/* JADX INFO: renamed from: ri.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10884a {
    /* JADX INFO: renamed from: a */
    public static String m41436a() {
        C6124q.m27060e("rbx.strings", "context is null");
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m41437b(Context context, int i10, Object... objArr) {
        try {
            C6124q.m27064i("rbx.strings", "ResourceId: " + i10);
            return objArr.length > 0 ? context.getString(i10, objArr) : context.getString(i10);
        } catch (Resources.NotFoundException unused) {
            C6124q.m27059d("Resources.NotFoundException thrown in getStringFromResources()");
            return "";
        } catch (IllegalFormatException unused2) {
            C6124q.m27059d("IllegalFormatException thrown in getStringFromResources()");
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m41438c(Context context, int i10, Object... objArr) {
        return context == null ? m41436a() : m41437b(context, i10, objArr);
    }
}
