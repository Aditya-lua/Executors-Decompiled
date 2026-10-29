package p203j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p181i.C6598j;
import p316o.AbstractC9609b;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6991a {

    /* JADX INFO: renamed from: j.a$b */
    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    /* JADX INFO: renamed from: j.a$c */
    @Deprecated
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract CharSequence m29440a();

        /* JADX INFO: renamed from: b */
        public abstract View m29441b();

        /* JADX INFO: renamed from: c */
        public abstract Drawable m29442c();

        /* JADX INFO: renamed from: d */
        public abstract CharSequence m29443d();

        /* JADX INFO: renamed from: e */
        public abstract void m29444e();
    }

    /* JADX INFO: renamed from: f */
    public boolean m29424f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo29425g();

    /* JADX INFO: renamed from: h */
    public abstract void mo29426h(boolean z10);

    /* JADX INFO: renamed from: i */
    public abstract int mo29427i();

    /* JADX INFO: renamed from: j */
    public abstract Context mo29428j();

    /* JADX INFO: renamed from: k */
    public abstract void mo29429k();

    /* JADX INFO: renamed from: l */
    public boolean m29430l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo29431m(Configuration configuration);

    /* JADX INFO: renamed from: n */
    public void m29432n() {
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo29433o(int i10, KeyEvent keyEvent);

    /* JADX INFO: renamed from: p */
    public boolean m29434p(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m29435q() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo29436r(boolean z10);

    /* JADX INFO: renamed from: s */
    public abstract void mo29437s(boolean z10);

    /* JADX INFO: renamed from: t */
    public abstract void mo29438t(CharSequence charSequence);

    /* JADX INFO: renamed from: u */
    public abstract AbstractC9609b mo29439u(AbstractC9609b.a aVar);

    /* JADX INFO: renamed from: j.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f27268a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27268a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6598j.f25421t);
            this.f27268a = typedArrayObtainStyledAttributes.getInt(C6598j.f25426u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i10, int i11) {
            super(i10, i11);
            this.f27268a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f27268a = 0;
            this.f27268a = aVar.f27268a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27268a = 0;
        }
    }
}
