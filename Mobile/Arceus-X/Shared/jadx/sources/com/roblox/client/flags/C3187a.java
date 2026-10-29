package com.roblox.client.flags;

import androidx.annotation.NonNull;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import p151gk.C6124q;
import th.C11657f;

/* JADX INFO: renamed from: com.roblox.client.flags.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3187a<T> {

    /* JADX INFO: renamed from: a */
    public int f11796a;

    /* JADX INFO: renamed from: b */
    public T[] f11797b;

    /* JADX INFO: renamed from: c */
    public Optional<String> f11798c;

    /* JADX INFO: renamed from: com.roblox.client.flags.a$a */
    public static class a extends C3187a<Boolean> {
        public a(String str, Boolean bool, boolean z10) {
            super(str, bool, z10);
        }

        /* JADX INFO: renamed from: k */
        public Boolean m15133k() {
            return m15123a() ? Boolean.valueOf(C11657f.f41211a.m43395l(mo15124b())) : (Boolean) super.mo15131i();
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$b */
    public static class b extends C3187a<Integer> {
        public b(String str, Integer num, boolean z10) {
            super(str, num, z10);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$c */
    public static class c extends C3187a<Long> {
        public c(String str, Long l10, boolean z10) {
            super(str, l10, z10);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$d */
    public static class d extends e<Boolean> {
        public d(String str, Boolean bool, boolean z10) {
            super(str, bool, z10);
        }

        @Override // com.roblox.client.flags.C3187a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo15124b() {
            String strMo15124b = super.mo15124b();
            if (strMo15124b.isEmpty()) {
                return "";
            }
            return "FFlag" + strMo15124b;
        }

        @Override // com.roblox.client.flags.C3187a.e
        /* JADX INFO: renamed from: m */
        public void mo15135m(String str, int i10) {
            FlagJniInterface.nativeRegisterFFlag(str, i10);
        }

        /* JADX DEBUG: Method merged with bridge method: k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.roblox.client.flags.C3187a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean mo15134k(String str, Boolean bool) {
            return Boolean.valueOf(FlagJniInterface.nativeGetFFlag(str, bool.booleanValue()));
        }

        /* JADX INFO: renamed from: o */
        public Boolean m15137o() {
            if (!m15123a()) {
                return (Boolean) super.mo15131i();
            }
            if (m15138l()) {
                C3188b.f11801a.m15149h(this.f11799d);
            }
            return Boolean.valueOf(C11657f.f41211a.m43398o(mo15124b()));
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$e */
    public static abstract class e<T> extends C3187a<T> {

        /* JADX INFO: renamed from: d */
        public final String f11799d;

        /* JADX INFO: renamed from: e */
        public final AtomicBoolean f11800e;

        public e(String str, T t8, boolean z10) {
            super(str, t8, z10);
            this.f11800e = new AtomicBoolean(true);
            this.f11799d = str;
        }

        @Override // com.roblox.client.flags.C3187a
        /* JADX INFO: renamed from: i */
        public T mo15131i() {
            C3188b c3188b = C3188b.f11801a;
            if (c3188b.m15148g()) {
                if (m15138l()) {
                    mo15135m(this.f11799d, c3188b.m15146e());
                }
                return mo15134k(this.f11799d, m15126d());
            }
            C6124q.m27066k("Roblox.AppFlag", "Native flag '" + this.f11799d + "' accessed before native flags are initialized. Returning initial value.");
            return m15126d();
        }

        /* JADX INFO: renamed from: k */
        public abstract T mo15134k(String str, T t8);

        /* JADX INFO: renamed from: l */
        public boolean m15138l() {
            return this.f11800e.getAndSet(false);
        }

        /* JADX INFO: renamed from: m */
        public abstract void mo15135m(String str, int i10);
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$f */
    public static class f extends e<Integer> {
        public f(String str, Integer num, boolean z10) {
            super(str, num, z10);
        }

        @Override // com.roblox.client.flags.C3187a.e
        /* JADX INFO: renamed from: m */
        public void mo15135m(String str, int i10) {
            FlagJniInterface.nativeRegisterFInt(str, i10);
        }

        /* JADX DEBUG: Method merged with bridge method: k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.roblox.client.flags.C3187a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer mo15134k(String str, Integer num) {
            return Integer.valueOf(FlagJniInterface.nativeGetFInt(str, num.intValue()));
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$g */
    public static class g extends e<String> {
        public g(String str, String str2, boolean z10) {
            super(str, str2, z10);
        }

        @Override // com.roblox.client.flags.C3187a.e
        /* JADX INFO: renamed from: m */
        public void mo15135m(String str, int i10) {
            FlagJniInterface.nativeRegisterFString(str, i10);
        }

        /* JADX DEBUG: Method merged with bridge method: k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.roblox.client.flags.C3187a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String mo15134k(String str, String str2) {
            return FlagJniInterface.nativeGetFString(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$h */
    public static class h {
        /* JADX INFO: renamed from: a */
        public static int m15141a() {
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.flags.a$i */
    public static class i extends C3187a<String> {
        public i(String str, String str2, boolean z10) {
            super(str, str2, z10);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m15123a() {
        return this.f11798c.isPresent();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String mo15124b() {
        return this.f11798c.orElse("");
    }

    /* JADX INFO: renamed from: c */
    public void m15125c(int i10) {
        m15128f(null, i10);
    }

    /* JADX INFO: renamed from: d */
    public T m15126d() {
        return m15132j(0);
    }

    /* JADX INFO: renamed from: e */
    public int m15127e() {
        return this.f11796a;
    }

    /* JADX INFO: renamed from: f */
    public void m15128f(T t8, int i10) {
        if (i10 == 0) {
            return;
        }
        this.f11797b[i10] = t8;
        int i11 = this.f11796a;
        if (i10 >= i11) {
            if (t8 == null) {
                m15130h(i11);
            } else {
                this.f11796a = i10;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m15129g(T t8) {
        this.f11797b[0] = t8;
    }

    /* JADX INFO: renamed from: h */
    public final void m15130h(int i10) {
        while (i10 >= 0) {
            if (this.f11797b[i10] != null) {
                this.f11796a = i10;
                return;
            }
            i10--;
        }
    }

    /* JADX INFO: renamed from: i */
    public T mo15131i() {
        return this.f11797b[this.f11796a];
    }

    /* JADX INFO: renamed from: j */
    public T m15132j(int i10) {
        return this.f11797b[i10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3187a(String str, T t8, boolean z10) {
        T[] tArr = (T[]) new Object[h.m15141a()];
        this.f11797b = tArr;
        tArr[0] = t8;
        this.f11796a = 0;
        if (z10) {
            this.f11798c = Optional.of(str);
        } else {
            this.f11798c = Optional.empty();
        }
    }
}
