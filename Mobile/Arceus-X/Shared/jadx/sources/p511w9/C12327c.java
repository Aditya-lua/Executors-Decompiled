package p511w9;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: w9.c */
/* JADX INFO: loaded from: classes.dex */
public class C12327c {

    /* JADX INFO: renamed from: b */
    public static final C12327c f44183b = new C12327c();

    /* JADX INFO: renamed from: a */
    public C12326b f44184a = null;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C12326b m46181a(@NonNull Context context) {
        return f44183b.m46182b(context);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final synchronized C12326b m46182b(@NonNull Context context) {
        try {
            if (this.f44184a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f44184a = new C12326b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f44184a;
    }
}
