package com.roblox.client.flags;

import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8922a;
    public T[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Optional<String> f8923c;

    /* JADX INFO: renamed from: com.roblox.client.flags.a$a, reason: collision with other inner class name */
    public static class C0143a extends a<Boolean> {
        public C0143a(String str, Boolean bool, boolean z10) {
            super(str, bool, z10);
        }

        public Boolean k() {
            return a() ? Boolean.valueOf(bi.f.f4423a.l(b())) : (Boolean) super.i();
        }
    }

    public static class b extends a<Integer> {
        public b(String str, Integer num, boolean z10) {
            super(str, num, z10);
        }
    }

    public static class c extends a<Long> {
        public c(String str, Long l10, boolean z10) {
            super(str, l10, z10);
        }
    }

    public static class d extends e<Boolean> {
        public d(String str, Boolean bool, boolean z10) {
            super(str, bool, z10);
        }

        @Override // com.roblox.client.flags.a
        @NonNull
        public String b() {
            String strB = super.b();
            if (strB.isEmpty()) {
                return BuildConfig.FLAVOR;
            }
            return "FFlag" + strB;
        }

        @Override // com.roblox.client.flags.a.e
        public void m(String str, int i10) {
            FlagJniInterface.nativeRegisterFFlag(str, i10);
        }

        @Override // com.roblox.client.flags.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean k(String str, Boolean bool) {
            return Boolean.valueOf(FlagJniInterface.nativeGetFFlag(str, bool.booleanValue()));
        }

        public Boolean o() {
            if (!a()) {
                return (Boolean) super.i();
            }
            if (l()) {
                com.roblox.client.flags.b.f8926a.h(this.f8924d);
            }
            return Boolean.valueOf(bi.f.f4423a.o(b()));
        }
    }

    public static abstract class e<T> extends a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f8924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f8925e;

        public e(String str, T t8, boolean z10) {
            super(str, t8, z10);
            this.f8925e = new AtomicBoolean(true);
            this.f8924d = str;
        }

        @Override // com.roblox.client.flags.a
        public T i() {
            com.roblox.client.flags.b bVar = com.roblox.client.flags.b.f8926a;
            if (bVar.g()) {
                if (l()) {
                    m(this.f8924d, bVar.e());
                }
                return k(this.f8924d, d());
            }
            q.k("Roblox.AppFlag", "Native flag '" + this.f8924d + "' accessed before native flags are initialized. Returning initial value.");
            return d();
        }

        public abstract T k(String str, T t8);

        public boolean l() {
            return this.f8925e.getAndSet(false);
        }

        public abstract void m(String str, int i10);
    }

    public static class f extends e<Integer> {
        public f(String str, Integer num, boolean z10) {
            super(str, num, z10);
        }

        @Override // com.roblox.client.flags.a.e
        public void m(String str, int i10) {
            FlagJniInterface.nativeRegisterFInt(str, i10);
        }

        @Override // com.roblox.client.flags.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer k(String str, Integer num) {
            return Integer.valueOf(FlagJniInterface.nativeGetFInt(str, num.intValue()));
        }
    }

    public static class g extends e<String> {
        public g(String str, String str2, boolean z10) {
            super(str, str2, z10);
        }

        @Override // com.roblox.client.flags.a.e
        public void m(String str, int i10) {
            FlagJniInterface.nativeRegisterFString(str, i10);
        }

        @Override // com.roblox.client.flags.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String k(String str, String str2) {
            return FlagJniInterface.nativeGetFString(str, str2);
        }
    }

    public static class h {
        public static int a() {
            return 4;
        }
    }

    public static class i extends a<String> {
        public i(String str, String str2, boolean z10) {
            super(str, str2, z10);
        }
    }

    public boolean a() {
        return this.f8923c.isPresent();
    }

    @NonNull
    public String b() {
        return this.f8923c.orElse(BuildConfig.FLAVOR);
    }

    public void c(int i10) {
        f(null, i10);
    }

    public T d() {
        return j(0);
    }

    public int e() {
        return this.f8922a;
    }

    public void f(T t8, int i10) {
        if (i10 == 0) {
            return;
        }
        this.b[i10] = t8;
        int i11 = this.f8922a;
        if (i10 >= i11) {
            if (t8 == null) {
                h(i11);
            } else {
                this.f8922a = i10;
            }
        }
    }

    public void g(T t8) {
        this.b[0] = t8;
    }

    public final void h(int i10) {
        while (i10 >= 0) {
            if (this.b[i10] != null) {
                this.f8922a = i10;
                return;
            }
            i10--;
        }
    }

    public T i() {
        return this.b[this.f8922a];
    }

    public T j(int i10) {
        return this.b[i10];
    }

    public a(String str, T t8, boolean z10) {
        T[] tArr = (T[]) new Object[h.a()];
        this.b = tArr;
        tArr[0] = t8;
        this.f8922a = 0;
        if (z10) {
            this.f8923c = Optional.of(str);
        } else {
            this.f8923c = Optional.empty();
        }
    }
}
