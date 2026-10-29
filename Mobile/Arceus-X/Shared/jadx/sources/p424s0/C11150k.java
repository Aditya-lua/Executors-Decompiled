package p424s0;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.C5883f1;
import p140g0.C5931r1;

/* JADX INFO: renamed from: s0.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Ls0/k;", "Lg0/f1$j;", "screenFlash", "<init>", "(Lg0/f1$j;)V", "", "expirationTimeMillis", "Lg0/f1$k;", "screenFlashListener", "", "a", "(JLg0/f1$k;)V", "clear", "()V", "h", "()Lg0/f1$j;", "f", "e", "d", "Lg0/f1$j;", "Ljava/lang/Object;", "b", "Ljava/lang/Object;", "lock", "", "c", "Z", "isClearScreenFlashPending", "Lg0/f1$k;", "pendingListener", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C11150k implements C5883f1.j {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final C5883f1.j screenFlash;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isClearScreenFlashPending;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C5883f1.k pendingListener;

    /* JADX INFO: renamed from: s0.k$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Ls0/k$a;", "", "<init>", "()V", "Lg0/f1$j;", "screenFlash", "Ls0/k;", "a", "(Lg0/f1$j;)Ls0/k;", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: s0.k.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C11150k m42012a(@Nullable C5883f1.j screenFlash) {
            return new C11150k(screenFlash, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 g0.f1$j) A[MD:(g0.f1$j):void (m)] (LINE:1) call: s0.k.<init>(g0.f1$j):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C11150k(C5883f1.j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar);
    }

    /* JADX INFO: renamed from: c */
    public static final void m42006c(C11150k c11150k) {
        synchronized (c11150k.lock) {
            try {
                if (c11150k.pendingListener == null) {
                    C5931r1.m26572l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                c11150k.m42009e();
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C11150k m42007g(@Nullable C5883f1.j jVar) {
        return INSTANCE.m42012a(jVar);
    }

    @Override // p140g0.C5883f1.j
    /* JADX INFO: renamed from: a */
    public void mo26438a(long expirationTimeMillis, @NotNull C5883f1.k screenFlashListener) {
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            Unit unit = Unit.f29331a;
        }
        C5883f1.j jVar = this.screenFlash;
        if (jVar != null) {
            jVar.mo26438a(expirationTimeMillis, new C5883f1.k() { // from class: s0.j
                @Override // p140g0.C5883f1.k
                /* JADX INFO: renamed from: a */
                public final void mo26439a() {
                    C11150k.m42006c(this.f39378a);
                }
            });
        } else {
            C5931r1.m26563c("ScreenFlashWrapper", "apply: screenFlash is null!");
            m42009e();
        }
    }

    @Override // p140g0.C5883f1.j
    public void clear() {
        m42008d();
    }

    /* JADX INFO: renamed from: d */
    public final void m42008d() {
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    C5883f1.j jVar = this.screenFlash;
                    if (jVar != null) {
                        jVar.clear();
                    } else {
                        C5931r1.m26563c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    C5931r1.m26572l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m42009e() {
        synchronized (this.lock) {
            try {
                C5883f1.k kVar = this.pendingListener;
                if (kVar != null) {
                    kVar.mo26439a();
                }
                this.pendingListener = null;
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m42010f() {
        m42009e();
        m42008d();
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final C5883f1.j getScreenFlash() {
        return this.screenFlash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11150k(C5883f1.j jVar) {
        this.screenFlash = jVar;
        this.lock = new Object();
    }
}
