package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C1054e {

    /* JADX INFO: renamed from: a */
    public final b f4157a;

    /* JADX INFO: renamed from: e */
    public View f4161e;

    /* JADX INFO: renamed from: d */
    public int f4160d = 0;

    /* JADX INFO: renamed from: b */
    public final a f4158b = new a();

    /* JADX INFO: renamed from: c */
    public final List<View> f4159c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f4162a = 0;

        /* JADX INFO: renamed from: b */
        public a f4163b;

        /* JADX INFO: renamed from: a */
        public void m5895a(int i10) {
            if (i10 < 64) {
                this.f4162a &= ~(1 << i10);
                return;
            }
            a aVar = this.f4163b;
            if (aVar != null) {
                aVar.m5895a(i10 - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m5896b(int i10) {
            a aVar = this.f4163b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f4162a) : Long.bitCount(this.f4162a & ((1 << i10) - 1));
            }
            return i10 < 64 ? Long.bitCount(this.f4162a & ((1 << i10) - 1)) : aVar.m5896b(i10 - 64) + Long.bitCount(this.f4162a);
        }

        /* JADX INFO: renamed from: c */
        public final void m5897c() {
            if (this.f4163b == null) {
                this.f4163b = new a();
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m5898d(int i10) {
            if (i10 < 64) {
                return (this.f4162a & (1 << i10)) != 0;
            }
            m5897c();
            return this.f4163b.m5898d(i10 - 64);
        }

        /* JADX INFO: renamed from: e */
        public void m5899e(int i10, boolean z10) {
            if (i10 >= 64) {
                m5897c();
                this.f4163b.m5899e(i10 - 64, z10);
                return;
            }
            long j10 = this.f4162a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f4162a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                m5902h(i10);
            } else {
                m5895a(i10);
            }
            if (z11 || this.f4163b != null) {
                m5897c();
                this.f4163b.m5899e(0, z11);
            }
        }

        /* JADX INFO: renamed from: f */
        public boolean m5900f(int i10) {
            if (i10 >= 64) {
                m5897c();
                return this.f4163b.m5900f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4162a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f4162a = j12;
            long j13 = j10 - 1;
            this.f4162a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f4163b;
            if (aVar != null) {
                if (aVar.m5898d(0)) {
                    m5902h(63);
                }
                this.f4163b.m5900f(0);
            }
            return z10;
        }

        /* JADX INFO: renamed from: g */
        public void m5901g() {
            this.f4162a = 0L;
            a aVar = this.f4163b;
            if (aVar != null) {
                aVar.m5901g();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m5902h(int i10) {
            if (i10 < 64) {
                this.f4162a |= 1 << i10;
            } else {
                m5897c();
                this.f4163b.m5902h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f4163b == null) {
                return Long.toBinaryString(this.f4162a);
            }
            return this.f4163b.toString() + "xx" + Long.toBinaryString(this.f4162a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        View mo5409a(int i10);

        void addView(View view, int i10);

        /* JADX INFO: renamed from: b */
        void mo5410b(View view);

        /* JADX INFO: renamed from: c */
        int mo5411c();

        /* JADX INFO: renamed from: d */
        RecyclerView.AbstractC1023f0 mo5412d(View view);

        /* JADX INFO: renamed from: e */
        void mo5413e(int i10);

        /* JADX INFO: renamed from: f */
        void mo5414f();

        /* JADX INFO: renamed from: g */
        int mo5415g(View view);

        /* JADX INFO: renamed from: h */
        void mo5416h(View view);

        /* JADX INFO: renamed from: i */
        void mo5417i(int i10);

        /* JADX INFO: renamed from: j */
        void mo5418j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public C1054e(b bVar) {
        this.f4157a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m5875a(View view, int i10, boolean z10) {
        int iMo5411c = i10 < 0 ? this.f4157a.mo5411c() : m5882h(i10);
        this.f4158b.m5899e(iMo5411c, z10);
        if (z10) {
            m5886l(view);
        }
        this.f4157a.addView(view, iMo5411c);
    }

    /* JADX INFO: renamed from: b */
    public void m5876b(View view, boolean z10) {
        m5875a(view, -1, z10);
    }

    /* JADX INFO: renamed from: c */
    public void m5877c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iMo5411c = i10 < 0 ? this.f4157a.mo5411c() : m5882h(i10);
        this.f4158b.m5899e(iMo5411c, z10);
        if (z10) {
            m5886l(view);
        }
        this.f4157a.mo5418j(view, iMo5411c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m5878d(int i10) {
        int iM5882h = m5882h(i10);
        this.f4158b.m5900f(iM5882h);
        this.f4157a.mo5413e(iM5882h);
    }

    /* JADX INFO: renamed from: e */
    public View m5879e(int i10) {
        int size = this.f4159c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f4159c.get(i11);
            RecyclerView.AbstractC1023f0 abstractC1023f0Mo5412d = this.f4157a.mo5412d(view);
            if (abstractC1023f0Mo5412d.m5445n() == i10 && !abstractC1023f0Mo5412d.m5452u() && !abstractC1023f0Mo5412d.m5454w()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View m5880f(int i10) {
        return this.f4157a.mo5409a(m5882h(i10));
    }

    /* JADX INFO: renamed from: g */
    public int m5881g() {
        return this.f4157a.mo5411c() - this.f4159c.size();
    }

    /* JADX INFO: renamed from: h */
    public final int m5882h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iMo5411c = this.f4157a.mo5411c();
        int i11 = i10;
        while (i11 < iMo5411c) {
            int iM5896b = i10 - (i11 - this.f4158b.m5896b(i11));
            if (iM5896b == 0) {
                while (this.f4158b.m5898d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iM5896b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public View m5883i(int i10) {
        return this.f4157a.mo5409a(i10);
    }

    /* JADX INFO: renamed from: j */
    public int m5884j() {
        return this.f4157a.mo5411c();
    }

    /* JADX INFO: renamed from: k */
    public void m5885k(View view) {
        int iMo5415g = this.f4157a.mo5415g(view);
        if (iMo5415g >= 0) {
            this.f4158b.m5902h(iMo5415g);
            m5886l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5886l(View view) {
        this.f4159c.add(view);
        this.f4157a.mo5410b(view);
    }

    /* JADX INFO: renamed from: m */
    public int m5887m(View view) {
        int iMo5415g = this.f4157a.mo5415g(view);
        if (iMo5415g == -1 || this.f4158b.m5898d(iMo5415g)) {
            return -1;
        }
        return iMo5415g - this.f4158b.m5896b(iMo5415g);
    }

    /* JADX INFO: renamed from: n */
    public boolean m5888n(View view) {
        return this.f4159c.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public void m5889o() {
        this.f4158b.m5901g();
        for (int size = this.f4159c.size() - 1; size >= 0; size--) {
            this.f4157a.mo5416h(this.f4159c.get(size));
            this.f4159c.remove(size);
        }
        this.f4157a.mo5414f();
    }

    /* JADX INFO: renamed from: p */
    public void m5890p(View view) {
        int i10 = this.f4160d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f4160d = 1;
            this.f4161e = view;
            int iMo5415g = this.f4157a.mo5415g(view);
            if (iMo5415g >= 0) {
                if (this.f4158b.m5900f(iMo5415g)) {
                    m5894t(view);
                }
                this.f4157a.mo5417i(iMo5415g);
            }
        } finally {
            this.f4160d = 0;
            this.f4161e = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m5891q(int i10) {
        int i11 = this.f4160d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM5882h = m5882h(i10);
            View viewMo5409a = this.f4157a.mo5409a(iM5882h);
            if (viewMo5409a != null) {
                this.f4160d = 1;
                this.f4161e = viewMo5409a;
                if (this.f4158b.m5900f(iM5882h)) {
                    m5894t(viewMo5409a);
                }
                this.f4157a.mo5417i(iM5882h);
            }
        } finally {
            this.f4160d = 0;
            this.f4161e = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m5892r(View view) {
        int i10 = this.f4160d;
        if (i10 == 1) {
            if (this.f4161e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f4160d = 2;
            int iMo5415g = this.f4157a.mo5415g(view);
            if (iMo5415g == -1) {
                m5894t(view);
                return true;
            }
            if (!this.f4158b.m5898d(iMo5415g)) {
                return false;
            }
            this.f4158b.m5900f(iMo5415g);
            m5894t(view);
            this.f4157a.mo5417i(iMo5415g);
            return true;
        } finally {
            this.f4160d = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m5893s(View view) {
        int iMo5415g = this.f4157a.mo5415g(view);
        if (iMo5415g < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f4158b.m5898d(iMo5415g)) {
            this.f4158b.m5895a(iMo5415g);
            m5894t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5894t(View view) {
        if (!this.f4159c.remove(view)) {
            return false;
        }
        this.f4157a.mo5416h(view);
        return true;
    }

    public String toString() {
        return this.f4158b.toString() + ", hidden list:" + this.f4159c.size();
    }
}
