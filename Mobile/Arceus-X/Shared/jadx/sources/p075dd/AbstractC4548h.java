package p075dd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import p075dd.AbstractC4542b;

/* JADX INFO: renamed from: dd.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4548h<S extends AbstractC4542b> {

    /* JADX INFO: renamed from: a */
    public S f18638a;

    /* JADX INFO: renamed from: dd.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public float f18639a;

        /* JADX INFO: renamed from: b */
        public float f18640b;

        /* JADX INFO: renamed from: c */
        public int f18641c;

        /* JADX INFO: renamed from: d */
        public int f18642d;
    }

    public AbstractC4548h(S s8) {
        this.f18638a = s8;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo22522a(@NonNull Canvas canvas, @NonNull Rect rect, float f10, boolean z10, boolean z11);

    /* JADX INFO: renamed from: b */
    public abstract void mo22523b(@NonNull Canvas canvas, @NonNull Paint paint, int i10, int i11);

    /* JADX INFO: renamed from: c */
    public abstract void mo22524c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull a aVar, int i10);

    /* JADX INFO: renamed from: d */
    public abstract void mo22525d(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, int i12);

    /* JADX INFO: renamed from: e */
    public abstract int mo22526e();

    /* JADX INFO: renamed from: f */
    public abstract int mo22527f();

    /* JADX INFO: renamed from: g */
    public void m22589g(@NonNull Canvas canvas, @NonNull Rect rect, float f10, boolean z10, boolean z11) {
        this.f18638a.m22521e();
        mo22522a(canvas, rect, f10, z10, z11);
    }
}
