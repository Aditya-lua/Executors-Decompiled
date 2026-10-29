package p140g0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.InterfaceC0494d;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p002a1.C0052a;
import p002a1.C0054c;
import p002a1.C0055d;
import p182i0.AbstractC6600b;
import p233k0.ImageFormatFeature;
import p281m0.AbstractC8303k0;
import p281m0.AbstractC8307l1;
import p281m0.C8282d0;
import p281m0.InterfaceC8277b1;
import p281m0.InterfaceC8279c0;
import p296n0.AbstractC8827t3;
import p296n0.C8734c3;
import p296n0.C8742e;
import p296n0.C8757g2;
import p296n0.C8785l1;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.EnumC8832u3;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8775j2;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p296n0.InterfaceC8812q3;
import p296n0.InterfaceC8841w2;
import p347p0.C10085a0;
import p347p0.C10087c;
import p347p0.C10089e;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p424s0.C11150k;
import p424s0.C11154o;
import p424s0.InterfaceC11148i;
import p424s0.InterfaceC11156q;
import p436t.InterfaceC11464a;
import p480v0.C11987b;
import p503w0.C12272b;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5883f1 extends AbstractC5952w2 {

    /* JADX INFO: renamed from: E */
    public static final c f22445E = new c();

    /* JADX INFO: renamed from: F */
    public static final C11987b f22446F = new C11987b();

    /* JADX INFO: renamed from: A */
    public C8282d0 f22447A;

    /* JADX INFO: renamed from: B */
    public InterfaceC8277b1 f22448B;

    /* JADX INFO: renamed from: C */
    public C8802o3.c f22449C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC8279c0 f22450D;

    /* JADX INFO: renamed from: s */
    public final InterfaceC8775j2.a f22451s;

    /* JADX INFO: renamed from: t */
    public final int f22452t;

    /* JADX INFO: renamed from: u */
    public final AtomicReference<Integer> f22453u;

    /* JADX INFO: renamed from: v */
    public final int f22454v;

    /* JADX INFO: renamed from: w */
    public int f22455w;

    /* JADX INFO: renamed from: x */
    public Rational f22456x;

    /* JADX INFO: renamed from: y */
    public C11150k f22457y;

    /* JADX INFO: renamed from: z */
    public C8802o3.b f22458z;

    /* JADX INFO: renamed from: g0.f1$a */
    public class a implements InterfaceC8279c0 {
        public a() {
        }

        @Override // p281m0.InterfaceC8279c0
        /* JADX INFO: renamed from: a */
        public InterfaceFutureC9440x<Void> mo26396a(List<C8785l1> list) {
            return C5883f1.this.m26380S0(list);
        }

        @Override // p281m0.InterfaceC8279c0
        /* JADX INFO: renamed from: b */
        public void mo26397b() {
            C5883f1.this.m26372K0();
        }

        @Override // p281m0.InterfaceC8279c0
        /* JADX INFO: renamed from: c */
        public void mo26398c() {
            C5883f1.this.m26384W0();
        }
    }

    /* JADX INFO: renamed from: g0.f1$b */
    public static final class b implements InterfaceC8771i4.b<C5883f1, C8757g2, b>, InterfaceC8769i2.a<b> {

        /* JADX INFO: renamed from: a */
        public final C8846x2 f22460a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
            this(C8846x2.m35505k0());
        }

        /* JADX INFO: renamed from: g */
        public static b m26399g(InterfaceC8795n1 interfaceC8795n1) {
            return new b(C8846x2.m35506l0(interfaceC8795n1));
        }

        @Override // p140g0.InterfaceC5906l0
        /* JADX INFO: renamed from: a */
        public InterfaceC8841w2 mo6684a() {
            return this.f22460a;
        }

        /* JADX INFO: renamed from: f */
        public C5883f1 m26400f() {
            Integer num = (Integer) mo6684a().mo35030h(C8757g2.f31834T, null);
            if (num != null) {
                mo6684a().mo35473G(InterfaceC8763h2.f31863j, num);
            } else if (C5883f1.m26354E0(mo6684a())) {
                mo6684a().mo35473G(InterfaceC8763h2.f31863j, 32);
            } else if (C5883f1.m26355F0(mo6684a())) {
                mo6684a().mo35473G(InterfaceC8763h2.f31863j, 32);
                mo6684a().mo35473G(InterfaceC8763h2.f31864k, 256);
            } else if (C5883f1.m26356G0(mo6684a())) {
                mo6684a().mo35473G(InterfaceC8763h2.f31863j, 4101);
                mo6684a().mo35473G(InterfaceC8763h2.f31865l, C5902k0.f22549c);
            } else {
                mo6684a().mo35473G(InterfaceC8763h2.f31863j, 256);
            }
            C8757g2 c8757g2Mo6688e = mo6688e();
            InterfaceC8769i2.m35182Y(c8757g2Mo6688e);
            C5883f1 c5883f1 = new C5883f1(c8757g2Mo6688e);
            Size size = (Size) mo6684a().mo35030h(InterfaceC8769i2.f31886q, null);
            if (size != null) {
                c5883f1.m26374M0(new Rational(size.getWidth(), size.getHeight()));
            }
            C12637g.m47076h((Executor) mo6684a().mo35030h(InterfaceC11148i.f39377L, C10417c.m40083d()), "The IO executor can't be null");
            InterfaceC8841w2 interfaceC8841w2Mo6684a = mo6684a();
            InterfaceC8795n1.a<Integer> aVar = C8757g2.f31832R;
            if (interfaceC8841w2Mo6684a.mo35023a(aVar)) {
                Integer num2 = (Integer) mo6684a().mo35027e(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && mo6684a().mo35030h(C8757g2.f31841a0, null) == null) {
                    throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
            }
            return c5883f1;
        }

        /* JADX DEBUG: Method merged with bridge method: e()Ln0/i4; */
        @Override // p296n0.InterfaceC8771i4.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C8757g2 mo6688e() {
            return new C8757g2(C8734c3.m35022j0(this.f22460a));
        }

        /* JADX INFO: renamed from: i */
        public b m26402i(int i10) {
            mo6684a().mo35473G(C8757g2.f31831Q, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m26403j(InterfaceC8777j4.b bVar) {
            mo6684a().mo35473G(InterfaceC8771i4.f31902G, bVar);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m26404k(C5902k0 c5902k0) {
            mo6684a().mo35473G(InterfaceC8763h2.f31865l, c5902k0);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public b m26405l(Executor executor) {
            mo6684a().mo35473G(InterfaceC11148i.f39377L, executor);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public b m26406m(int i10) {
            mo6684a().mo35473G(C8757g2.f31835U, Integer.valueOf(i10));
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: b(La1/c;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b mo24411b(C0054c c0054c) {
            mo6684a().mo35473G(InterfaceC8769i2.f31890u, c0054c);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public b m26408o(EnumC8832u3 enumC8832u3) {
            mo6684a().mo35473G(InterfaceC8771i4.f31906K, enumC8832u3);
            return this;
        }

        /* JADX INFO: renamed from: p */
        public b m26409p(int i10) {
            mo6684a().mo35473G(InterfaceC8771i4.f31896A, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: q */
        public b m26410q(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            mo6684a().mo35473G(InterfaceC8769i2.f31882m, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: r */
        public b m26411r(Class<C5883f1> cls) {
            mo6684a().mo35473G(InterfaceC11156q.f39401N, cls);
            if (mo6684a().mo35030h(InterfaceC11156q.f39400M, null) == null) {
                m26412s(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public b m26412s(String str) {
            mo6684a().mo35473G(InterfaceC11156q.f39400M, str);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/util/Size;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        @Deprecated
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mo24413d(Size size) {
            mo6684a().mo35473G(InterfaceC8769i2.f31886q, size);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: c(I)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b mo24412c(int i10) {
            mo6684a().mo35473G(InterfaceC8769i2.f31883n, Integer.valueOf(i10));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(C8846x2 c8846x2) {
            this.f22460a = c8846x2;
            Class cls = (Class) c8846x2.mo35030h(InterfaceC11156q.f39401N, null);
            if (cls == null || cls.equals(C5883f1.class)) {
                m26403j(InterfaceC8777j4.b.IMAGE_CAPTURE);
                m26411r(C5883f1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: renamed from: g0.f1$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final EnumC8832u3 f22461a;

        /* JADX INFO: renamed from: b */
        public static final C0054c f22462b;

        /* JADX INFO: renamed from: c */
        public static final C8757g2 f22463c;

        /* JADX INFO: renamed from: d */
        public static final C5902k0 f22464d;

        static {
            EnumC8832u3 enumC8832u3 = EnumC8832u3.STILL_CAPTURE;
            f22461a = enumC8832u3;
            C0054c c0054cM116a = new C0054c.a().m118d(C0052a.f98c).m120f(C0055d.f110c).m116a();
            f22462b = c0054cM116a;
            C5902k0 c5902k0 = C5902k0.f22550d;
            f22464d = c5902k0;
            f22463c = new b().m26409p(4).m26408o(enumC8832u3).m26410q(0).mo24411b(c0054cM116a).m26406m(0).m26404k(c5902k0).mo6688e();
        }

        /* JADX INFO: renamed from: a */
        public C8757g2 m26415a() {
            return f22463c;
        }
    }

    /* JADX INFO: renamed from: g0.f1$d */
    public static class d implements InterfaceC5887g1 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5937t f22465a;

        public d(InterfaceC5937t interfaceC5937t) {
            this.f22465a = interfaceC5937t;
        }

        @Override // p140g0.InterfaceC5887g1
        /* JADX INFO: renamed from: a */
        public Set<Integer> mo26416a() {
            Set<Integer> setM26417b = m26417b();
            if (setM26417b != null) {
                return setM26417b;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (m26419d()) {
                hashSet.add(1);
            }
            if (m26418c()) {
                hashSet.add(2);
                hashSet.add(3);
            }
            return hashSet;
        }

        /* JADX INFO: renamed from: b */
        public final Set<Integer> m26417b() {
            InterfaceC5937t interfaceC5937t = this.f22465a;
            HashSet hashSet = null;
            if (!(interfaceC5937t instanceof C8742e)) {
                return null;
            }
            InterfaceC8795n1 interfaceC8795n1Mo35228a = ((C8742e) interfaceC5937t).m35068C().m35137k().mo35228a(InterfaceC8777j4.b.IMAGE_CAPTURE, 1);
            if (interfaceC8795n1Mo35228a != null) {
                InterfaceC8795n1.a<List<Pair<Integer, Size[]>>> aVar = InterfaceC8769i2.f31889t;
                if (interfaceC8795n1Mo35228a.mo35023a(aVar)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) interfaceC8795n1Mo35228a.mo35027e(aVar)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            return hashSet;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m26418c() {
            InterfaceC5937t interfaceC5937t = this.f22465a;
            if (!(interfaceC5937t instanceof InterfaceC8799o0)) {
                return false;
            }
            InterfaceC8799o0 interfaceC8799o0 = (InterfaceC8799o0) interfaceC5937t;
            if (interfaceC8799o0.mo35051n().contains(3)) {
                return interfaceC8799o0.mo35042a().contains(32);
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m26419d() {
            InterfaceC5937t interfaceC5937t = this.f22465a;
            if (interfaceC5937t instanceof InterfaceC8799o0) {
                return ((InterfaceC8799o0) interfaceC5937t).mo35042a().contains(4101);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: g0.f1$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public boolean f22466a;

        /* JADX INFO: renamed from: b */
        public boolean f22467b = false;

        /* JADX INFO: renamed from: c */
        public boolean f22468c;

        /* JADX INFO: renamed from: d */
        public Location f22469d;

        /* JADX INFO: renamed from: a */
        public Location m26420a() {
            return this.f22469d;
        }

        /* JADX INFO: renamed from: b */
        public boolean m26421b() {
            return this.f22466a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m26422c() {
            return this.f22468c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f22466a + ", mIsReversedVertical=" + this.f22468c + ", mLocation=" + this.f22469d + "}";
        }
    }

    /* JADX INFO: renamed from: g0.f1$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public abstract void m26423a(int i10);

        /* JADX INFO: renamed from: b */
        public abstract void m26424b();

        /* JADX INFO: renamed from: c */
        public abstract void m26425c(InterfaceC0494d interfaceC0494d);

        /* JADX INFO: renamed from: d */
        public abstract void m26426d(C5891h1 c5891h1);

        /* JADX INFO: renamed from: e */
        public abstract void m26427e(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: g0.f1$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        default void m26428a(int i10) {
        }

        /* JADX INFO: renamed from: b */
        default void m26429b(Bitmap bitmap) {
        }

        /* JADX INFO: renamed from: c */
        default void m26430c() {
        }

        /* JADX INFO: renamed from: d */
        void mo16207d(i iVar);

        /* JADX INFO: renamed from: e */
        void mo16208e(C5891h1 c5891h1);
    }

    /* JADX INFO: renamed from: g0.f1$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final File f22470a;

        /* JADX INFO: renamed from: b */
        public final ContentResolver f22471b;

        /* JADX INFO: renamed from: c */
        public final Uri f22472c;

        /* JADX INFO: renamed from: d */
        public final ContentValues f22473d;

        /* JADX INFO: renamed from: e */
        public final OutputStream f22474e;

        /* JADX INFO: renamed from: f */
        public final e f22475f;

        /* JADX INFO: renamed from: g0.f1$h$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public File f22476a;

            /* JADX INFO: renamed from: b */
            public ContentResolver f22477b;

            /* JADX INFO: renamed from: c */
            public Uri f22478c;

            /* JADX INFO: renamed from: d */
            public ContentValues f22479d;

            /* JADX INFO: renamed from: e */
            public OutputStream f22480e;

            /* JADX INFO: renamed from: f */
            public e f22481f;

            public a(File file) {
                this.f22476a = file;
            }

            /* JADX INFO: renamed from: a */
            public h m26437a() {
                return new h(this.f22476a, this.f22477b, this.f22478c, this.f22479d, this.f22480e, this.f22481f);
            }
        }

        public h(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, e eVar) {
            this.f22470a = file;
            this.f22471b = contentResolver;
            this.f22472c = uri;
            this.f22473d = contentValues;
            this.f22474e = outputStream;
            this.f22475f = eVar == null ? new e() : eVar;
        }

        /* JADX INFO: renamed from: a */
        public ContentResolver m26431a() {
            return this.f22471b;
        }

        /* JADX INFO: renamed from: b */
        public ContentValues m26432b() {
            return this.f22473d;
        }

        /* JADX INFO: renamed from: c */
        public File m26433c() {
            return this.f22470a;
        }

        /* JADX INFO: renamed from: d */
        public e m26434d() {
            return this.f22475f;
        }

        /* JADX INFO: renamed from: e */
        public OutputStream m26435e() {
            return this.f22474e;
        }

        /* JADX INFO: renamed from: f */
        public Uri m26436f() {
            return this.f22472c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f22470a + ", mContentResolver=" + this.f22471b + ", mSaveCollection=" + this.f22472c + ", mContentValues=" + this.f22473d + ", mOutputStream=" + this.f22474e + ", mMetadata=" + this.f22475f + "}";
        }
    }

    /* JADX INFO: renamed from: g0.f1$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public final Uri f22482a;

        /* JADX INFO: renamed from: b */
        public final int f22483b;

        public i(Uri uri, int i10) {
            this.f22482a = uri;
            this.f22483b = i10;
        }
    }

    /* JADX INFO: renamed from: g0.f1$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        void mo26438a(long j10, k kVar);

        void clear();
    }

    /* JADX INFO: renamed from: g0.f1$k */
    public interface k {
        /* JADX INFO: renamed from: a */
        void mo26439a();
    }

    public C5883f1(C8757g2 c8757g2) {
        super(c8757g2);
        this.f22451s = new InterfaceC8775j2.a() { // from class: g0.d1
            @Override // p296n0.InterfaceC8775j2.a
            /* JADX INFO: renamed from: a */
            public final void mo26326a(InterfaceC8775j2 interfaceC8775j2) {
                C5883f1.m26358h0(interfaceC8775j2);
            }
        };
        this.f22453u = new AtomicReference<>(null);
        this.f22455w = -1;
        this.f22456x = null;
        this.f22450D = new a();
        C8757g2 c8757g3 = (C8757g2) m26707l();
        if (c8757g3.mo35023a(C8757g2.f31831Q)) {
            this.f22452t = c8757g3.m35124i0();
        } else {
            this.f22452t = 1;
        }
        this.f22454v = c8757g3.m35126k0(0);
        this.f22457y = C11150k.m42007g(c8757g3.m35130o0());
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m26353D0(List<Pair<Integer, Size[]>> list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m26354E0(InterfaceC8841w2 interfaceC8841w2) {
        return Objects.equals(interfaceC8841w2.mo35030h(C8757g2.f31835U, null), 2);
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m26355F0(InterfaceC8841w2 interfaceC8841w2) {
        return Objects.equals(interfaceC8841w2.mo35030h(C8757g2.f31835U, null), 3);
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m26356G0(InterfaceC8841w2 interfaceC8841w2) {
        return Objects.equals(interfaceC8841w2.mo35030h(C8757g2.f31835U, null), 1);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m26357g0(C5883f1 c5883f1, C8802o3 c8802o3, C8802o3.g gVar) {
        if (c5883f1.m26704i() == null) {
            return;
        }
        c5883f1.f22448B.pause();
        c5883f1.m26388r0(true);
        C8802o3.b bVarM26389s0 = c5883f1.m26389s0(c5883f1.m26706k(), (C8757g2) c5883f1.m26707l(), (AbstractC8827t3) C12637g.m47075g(c5883f1.m26702g()));
        c5883f1.f22458z = bVarM26389s0;
        c5883f1.m26697d0(C5918o0.m26551a(new Object[]{bVarM26389s0.m35331p()}));
        c5883f1.m26685L();
        c5883f1.f22448B.mo33689e();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m26358h0(InterfaceC8775j2 interfaceC8775j2) {
        try {
            InterfaceC0494d interfaceC0494dMo2208b = interfaceC8775j2.mo2208b();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + interfaceC0494dMo2208b);
                if (interfaceC0494dMo2208b != null) {
                    interfaceC0494dMo2208b.close();
                }
            } catch (Throwable th2) {
                if (interfaceC0494dMo2208b != null) {
                    try {
                        interfaceC0494dMo2208b.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ Void m26359i0(List list) {
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    private void m26364q0() {
        m26388r0(false);
    }

    /* JADX INFO: renamed from: x0 */
    public static InterfaceC5887g1 m26365x0(InterfaceC5937t interfaceC5937t) {
        return new d(interfaceC5937t);
    }

    /* JADX INFO: renamed from: A0 */
    public final InterfaceC8812q3 m26366A0() {
        return m26704i().mo35082f().m35139w(null);
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: B */
    public Set<Integer> mo6655B() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    /* JADX INFO: renamed from: B0 */
    public final Rect m26367B0() {
        Rect rectM26678E = m26678E();
        Size sizeM26703h = m26703h();
        Objects.requireNonNull(sizeM26703h);
        if (rectM26678E != null) {
            return rectM26678E;
        }
        if (!C12272b.m45560i(this.f22456x)) {
            return new Rect(0, 0, sizeM26703h.getWidth(), sizeM26703h.getHeight());
        }
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i);
        int iM26714t = m26714t(interfaceC8804p0M26704i);
        Rational rational = new Rational(this.f22456x.getDenominator(), this.f22456x.getNumerator());
        if (!C10085a0.m38881i(iM26714t)) {
            rational = this.f22456x;
        }
        Rect rectM45552a = C12272b.m45552a(sizeM26703h, rational);
        Objects.requireNonNull(rectM45552a);
        return rectM45552a;
    }

    /* JADX INFO: renamed from: C0 */
    public int m26368C0() {
        return m26677C();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: D */
    public InterfaceC8771i4.b<?, ?, ?> mo6658D(InterfaceC8795n1 interfaceC8795n1) {
        return b.m26399g(interfaceC8795n1);
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: n0.n1$a<java.lang.Boolean>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: H0 */
    public boolean m26369H0() {
        return ((Boolean) m26707l().mo35030h(C8757g2.f31843c0, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m26370I0(Map<Integer, List<Size>> map, int i10) {
        return map.containsKey(Integer.valueOf(i10)) && !map.get(Integer.valueOf(i10)).isEmpty();
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m26371J0() {
        return (m26704i() == null || m26704i().mo35082f().m35139w(null) == null) ? false : true;
    }

    /* JADX INFO: renamed from: K0 */
    public void m26372K0() {
        synchronized (this.f22453u) {
            try {
                if (this.f22453u.get() != null) {
                    return;
                }
                this.f22453u.set(Integer.valueOf(m26393w0()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m26373L0(Executor executor, f fVar, g gVar) {
        C5891h1 c5891h1 = new C5891h1(4, "Not bound to a valid Camera [" + this + "]", null);
        if (gVar == null) {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
        gVar.mo16208e(c5891h1);
    }

    /* JADX INFO: renamed from: M0 */
    public void m26374M0(Rational rational) {
        this.f22456x = rational;
    }

    /* JADX INFO: renamed from: N0 */
    public void m26375N0(int i10) {
        C5931r1.m26561a("ImageCapture", "setFlashMode: flashMode = " + i10);
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i10);
            }
            if (this.f22457y.getScreenFlash() == null) {
                throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            }
            if (m26704i() != null && m26391u0() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f22453u) {
            this.f22455w = i10;
            m26383V0();
        }
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: O */
    public void mo6662O() {
        C12637g.m47076h(m26704i(), "Attached camera cannot be null");
        if (m26393w0() == 3 && m26391u0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m26376O0(j jVar) {
        this.f22457y = C11150k.m42007g(jVar);
        m26377P0();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: P */
    public void mo6663P() {
        C5931r1.m26561a("ImageCapture", "onCameraControlReady");
        m26383V0();
        m26377P0();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m26377P0() {
        m26378Q0(this.f22457y);
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: Q */
    public InterfaceC8771i4<?> mo6664Q(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4.b<?, ?, ?> bVar) {
        m26386o0(bVar);
        if (interfaceC8799o0.mo35049l().m35233a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            InterfaceC8841w2 interfaceC8841w2Mo6684a = bVar.mo6684a();
            InterfaceC8795n1.a<Boolean> aVar = C8757g2.f31838X;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(interfaceC8841w2Mo6684a.mo35030h(aVar, bool2))) {
                C5931r1.m26572l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                C5931r1.m26565e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bVar.mo6684a().mo35473G(aVar, bool2);
            }
        }
        boolean zM26390t0 = m26390t0(bVar.mo6684a());
        Integer num = (Integer) bVar.mo6684a().mo35030h(C8757g2.f31834T, null);
        if (num != null) {
            C12637g.m47070b(!m26371J0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, Integer.valueOf(zM26390t0 ? 35 : num.intValue()));
        } else if (m26354E0(bVar.mo6684a())) {
            bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, 32);
        } else if (m26355F0(bVar.mo6684a())) {
            bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, 32);
            bVar.mo6684a().mo35473G(InterfaceC8763h2.f31864k, 256);
        } else if (m26356G0(bVar.mo6684a())) {
            bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, 4101);
            bVar.mo6684a().mo35473G(InterfaceC8763h2.f31865l, C5902k0.f22549c);
        } else if (zM26390t0) {
            bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, 35);
        } else {
            List list = (List) bVar.mo6684a().mo35030h(InterfaceC8769i2.f31889t, null);
            if (list == null || m26353D0(list, 256)) {
                bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, 256);
            } else if (m26353D0(list, 35)) {
                bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, 35);
            }
        }
        return bVar.mo6688e();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m26378Q0(j jVar) {
        m26705j().mo35013h(jVar);
    }

    /* JADX INFO: renamed from: R0 */
    public void m26379R0(int i10) {
        int iM26368C0 = m26368C0();
        if (!m26692a0(i10) || this.f22456x == null) {
            return;
        }
        this.f22456x = C12272b.m45558g(Math.abs(C10087c.m38903b(i10) - C10087c.m38903b(iM26368C0)), this.f22456x);
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: S */
    public void mo6666S() {
        m26385k0();
    }

    /* JADX INFO: renamed from: S0 */
    public InterfaceFutureC9440x<Void> m26380S0(List<C8785l1> list) {
        C10110z.m39008b();
        return C10773n.m41001x(m26705j().mo6745f(list, this.f22452t, this.f22454v), new InterfaceC11464a() { // from class: g0.c1
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return C5883f1.m26359i0((List) obj);
            }
        }, C10417c.m40081b());
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: T */
    public AbstractC8827t3 mo6667T(InterfaceC8795n1 interfaceC8795n1) {
        this.f22458z.m35322g(interfaceC8795n1);
        m26697d0(C5918o0.m26551a(new Object[]{this.f22458z.m35331p()}));
        return m26702g().mo35398i().mo35402d(interfaceC8795n1).mo35399a();
    }

    /* JADX INFO: renamed from: T0 */
    public void m26381T0(final h hVar, final Executor executor, final g gVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C10417c.m40084e().execute(new Runnable() { // from class: g0.e1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22412a.m26381T0(hVar, executor, gVar);
                }
            });
        } else {
            m26382U0(executor, null, gVar, hVar, null);
        }
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: U */
    public AbstractC8827t3 mo6668U(AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        C5931r1.m26561a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + abstractC8827t3 + ", secondaryStreamSpec " + abstractC8827t4);
        C8802o3.b bVarM26389s0 = m26389s0(m26706k(), (C8757g2) m26707l(), abstractC8827t3);
        this.f22458z = bVarM26389s0;
        m26697d0(C5918o0.m26551a(new Object[]{bVarM26389s0.m35331p()}));
        m26683J();
        return abstractC8827t3;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m26382U0(Executor executor, f fVar, g gVar, h hVar, h hVar2) {
        C10110z.m39008b();
        if (m26393w0() == 3 && this.f22457y.getScreenFlash() == null) {
            throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
        }
        Log.d("ImageCapture", "takePictureInternal");
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        if (interfaceC8804p0M26704i == null || !m26680G()) {
            m26373L0(executor, fVar, gVar);
            return;
        }
        boolean z10 = m26707l().m35145Z() != 0;
        if (z10 && hVar2 == null) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        if (!z10 && hVar2 != null) {
            throw new IllegalArgumentException("Non simultaneous capture cannot have two output file options");
        }
        InterfaceC8277b1 interfaceC8277b1 = this.f22448B;
        Objects.requireNonNull(interfaceC8277b1);
        interfaceC8277b1.mo33686b(AbstractC8307l1.m33769v(executor, fVar, gVar, hVar, hVar2, m26367B0(), m26719y(), m26714t(interfaceC8804p0M26704i), m26394y0(), m26392v0(), z10, this.f22458z.m35333s()));
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: V */
    public void mo6669V() {
        m26385k0();
        m26364q0();
        m26378Q0(null);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m26383V0() {
        synchronized (this.f22453u) {
            try {
                if (this.f22453u.get() != null) {
                    return;
                }
                m26705j().mo35014i(m26393w0());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m26384W0() {
        synchronized (this.f22453u) {
            try {
                Integer andSet = this.f22453u.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != m26393w0()) {
                    m26383V0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m26385k0() {
        this.f22457y.m42010f();
        InterfaceC8277b1 interfaceC8277b1 = this.f22448B;
        if (interfaceC8277b1 != null) {
            interfaceC8277b1.mo33687c();
        }
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: m */
    public InterfaceC8771i4<?> mo6673m(boolean z10, InterfaceC8777j4 interfaceC8777j4) {
        c cVar = f22445E;
        InterfaceC8795n1 interfaceC8795n1Mo35228a = interfaceC8777j4.mo35228a(cVar.m26415a().mo35207X(), m26392v0());
        if (z10) {
            interfaceC8795n1Mo35228a = InterfaceC8795n1.m35288L(interfaceC8795n1Mo35228a, cVar.m26415a());
        }
        if (interfaceC8795n1Mo35228a == null) {
            return null;
        }
        return mo6658D(interfaceC8795n1Mo35228a).mo6688e();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m26386o0(InterfaceC8771i4.b<?, ?, ?> bVar) {
        Set<AbstractC6600b> setM26709o = m26709o();
        if (setM26709o != null) {
            int iM30685f = 0;
            for (AbstractC6600b abstractC6600b : setM26709o) {
                if (abstractC6600b instanceof ImageFormatFeature) {
                    iM30685f = ((ImageFormatFeature) abstractC6600b).getImageCaptureOutputFormat();
                }
            }
            bVar.mo6684a().mo35473G(C8757g2.f31835U, Integer.valueOf(iM30685f));
        }
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: n0.n1$a<a1.c>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: p0 */
    public final AbstractC8303k0 m26387p0(int i10, Size size) {
        InterfaceC8812q3 interfaceC8812q3M26366A0 = m26366A0();
        if (interfaceC8812q3M26366A0 == null) {
            return null;
        }
        Map<Integer, List<Size>> mapM35380f = interfaceC8812q3M26366A0.m35380f(size);
        ArrayList arrayList = new ArrayList();
        if (m26370I0(mapM35380f, 35)) {
            arrayList.add(35);
        }
        if (m26370I0(mapM35380f, 256)) {
            arrayList.add(256);
        }
        if (m26370I0(mapM35380f, 4101)) {
            arrayList.add(4101);
        }
        int iMo35105a = !arrayList.isEmpty() ? m26704i().mo35082f().m35133I().mo35105a(i10, arrayList) : 0;
        if (iMo35105a == 0) {
            return null;
        }
        List<Size> list = mapM35380f.get(Integer.valueOf(iMo35105a));
        C0054c c0054c = (C0054c) m26707l().mo35030h(C8757g2.f31842b0, null);
        if (c0054c == null) {
            return AbstractC8303k0.m33755a((Size) Collections.max(list, new C10089e()), iMo35105a);
        }
        Collections.sort(list, new C10089e(true));
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        Rect rectMo35046h = interfaceC8804p0M26704i.mo6698k().mo35046h();
        InterfaceC8799o0 interfaceC8799o0Mo6698k = interfaceC8804p0M26704i.mo6698k();
        List<Size> listM42028p = C11154o.m42028p(c0054c, list, null, m26368C0(), new Rational(rectMo35046h.width(), rectMo35046h.height()), interfaceC8799o0Mo6698k.mo6749d(), interfaceC8799o0Mo6698k.mo26583i());
        if (listM42028p.isEmpty()) {
            throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
        }
        return AbstractC8303k0.m33755a(listM42028p.get(0), iMo35105a);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m26388r0(boolean z10) {
        InterfaceC8277b1 interfaceC8277b1;
        Log.d("ImageCapture", "clearPipeline");
        C10110z.m39008b();
        C8802o3.c cVar = this.f22449C;
        if (cVar != null) {
            cVar.m35341b();
            this.f22449C = null;
        }
        C8282d0 c8282d0 = this.f22447A;
        if (c8282d0 != null) {
            c8282d0.m33697a();
            this.f22447A = null;
        }
        if (!z10 && (interfaceC8277b1 = this.f22448B) != null) {
            interfaceC8277b1.mo33687c();
            this.f22448B = null;
        }
        m26705j().mo35011b();
    }

    /* JADX INFO: renamed from: s0 */
    public final C8802o3.b m26389s0(String str, C8757g2 c8757g2, AbstractC8827t3 abstractC8827t3) {
        C10110z.m39008b();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, abstractC8827t3));
        Size sizeMo35395f = abstractC8827t3.mo35395f();
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i);
        boolean z10 = !interfaceC8804p0M26704i.mo6701q();
        if (this.f22447A != null) {
            C12637g.m47077i(z10);
            this.f22447A.m33697a();
        }
        Set<Integer> setMo26416a = m26365x0(m26704i().mo22074d()).mo26416a();
        C12637g.m47070b(setMo26416a.contains(Integer.valueOf(m26395z0())), "The specified output format (" + m26395z0() + ") is not supported by current configuration. Supported output formats: " + setMo26416a);
        CameraCharacteristics cameraCharacteristics = null;
        AbstractC8303k0 abstractC8303k0M26387p0 = m26369H0() ? m26387p0(c8757g2.mo26767p(), sizeMo35395f) : null;
        if (m26704i() != null) {
            try {
                Object objMo35048k = m26704i().mo6698k().mo35048k();
                if (objMo35048k instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objMo35048k;
                }
            } catch (Exception e10) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e10);
            }
        }
        this.f22447A = new C8282d0(c8757g2, sizeMo35395f, cameraCharacteristics, m26708n(), z10, abstractC8303k0M26387p0);
        if (this.f22448B == null) {
            this.f22448B = m26707l().m35212r().mo33693a(this.f22450D);
        }
        this.f22448B.mo33688d(this.f22447A);
        C8802o3.b bVarM33702f = this.f22447A.m33702f(abstractC8827t3.mo35395f());
        bVarM33702f.m35313A(abstractC8827t3.mo35396g());
        if (m26392v0() == 2 && !abstractC8827t3.mo35397h()) {
            m26705j().mo35010a(bVarM33702f);
        }
        if (abstractC8827t3.mo35393d() != null) {
            bVarM33702f.m35322g(abstractC8827t3.mo35393d());
        }
        C8802o3.c cVar = this.f22449C;
        if (cVar != null) {
            cVar.m35341b();
        }
        C8802o3.c cVar2 = new C8802o3.c(new C8802o3.d() { // from class: g0.b1
            @Override // p296n0.C8802o3.d
            /* JADX INFO: renamed from: a */
            public final void mo6644a(C8802o3 c8802o3, C8802o3.g gVar) {
                C5883f1.m26357g0(this.f22383a, c8802o3, gVar);
            }
        });
        this.f22449C = cVar2;
        bVarM33702f.m35335u(cVar2);
        return bVarM33702f;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m26390t0(InterfaceC8841w2 interfaceC8841w2) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        InterfaceC8795n1.a<Boolean> aVar = C8757g2.f31838X;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(interfaceC8841w2.mo35030h(aVar, bool2))) {
            if (m26371J0()) {
                C5931r1.m26572l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) interfaceC8841w2.mo35030h(C8757g2.f31834T, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                C5931r1.m26572l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                C5931r1.m26572l("ImageCapture", "Unable to support software JPEG. Disabling.");
                interfaceC8841w2.mo35473G(aVar, bool2);
            }
        }
        return z11;
    }

    public String toString() {
        return "ImageCapture:" + m26712r();
    }

    /* JADX INFO: renamed from: u0 */
    public final int m26391u0() {
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        if (interfaceC8804p0M26704i != null) {
            return interfaceC8804p0M26704i.mo22074d().mo26583i();
        }
        return -1;
    }

    /* JADX INFO: renamed from: v0 */
    public int m26392v0() {
        return this.f22452t;
    }

    /* JADX INFO: renamed from: w0 */
    public int m26393w0() {
        int iM35125j0;
        synchronized (this.f22453u) {
            iM35125j0 = this.f22455w;
            if (iM35125j0 == -1) {
                iM35125j0 = ((C8757g2) m26707l()).m35125j0(2);
            }
        }
        return iM35125j0;
    }

    /* JADX INFO: renamed from: y0 */
    public final int m26394y0() {
        C8757g2 c8757g2 = (C8757g2) m26707l();
        if (c8757g2.mo35023a(C8757g2.f31840Z)) {
            return c8757g2.m35129n0();
        }
        int i10 = this.f22452t;
        if (i10 == 0) {
            return 100;
        }
        if (i10 == 1 || i10 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f22452t + " is invalid");
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: n0.n1$a<java.lang.Integer>, n0.n1$a<ValueT> */
    /* JADX INFO: renamed from: z0 */
    public int m26395z0() {
        return ((Integer) C12637g.m47075g((Integer) m26707l().mo35030h(C8757g2.f31835U, 0))).intValue();
    }
}
