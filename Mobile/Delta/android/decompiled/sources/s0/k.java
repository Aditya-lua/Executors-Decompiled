package s0;

import g0.f1;
import g0.r1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001e"}, d2 = {"Ls0/k;", "Lg0/f1$j;", "screenFlash", "<init>", "(Lg0/f1$j;)V", "", "expirationTimeMillis", "Lg0/f1$k;", "screenFlashListener", "", "a", "(JLg0/f1$k;)V", "clear", "()V", "h", "()Lg0/f1$j;", "f", "e", "d", "Lg0/f1$j;", "Ljava/lang/Object;", "b", "Ljava/lang/Object;", "lock", "", "c", "Z", "isClearScreenFlashPending", "Lg0/f1$k;", "pendingListener", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements f1.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final f1.j screenFlash;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isClearScreenFlashPending;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public f1.k pendingListener;

    /* JADX INFO: renamed from: s0.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls0/k$a;", "", "<init>", "()V", "Lg0/f1$j;", "screenFlash", "Ls0/k;", "a", "(Lg0/f1$j;)Ls0/k;", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final k a(@Nullable f1.j screenFlash) {
            return new k(screenFlash, null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ k(f1.j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar);
    }

    public static final void c(k kVar) {
        synchronized (kVar.lock) {
            try {
                if (kVar.pendingListener == null) {
                    r1.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                kVar.e();
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public static final k g(@Nullable f1.j jVar) {
        return INSTANCE.a(jVar);
    }

    @Override // g0.f1.j
    public void a(long expirationTimeMillis, @NotNull f1.k screenFlashListener) {
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            Unit unit = Unit.f22483a;
        }
        f1.j jVar = this.screenFlash;
        if (jVar != null) {
            jVar.a(expirationTimeMillis, new f1.k() { // from class: s0.j
                @Override // g0.f1.k
                public final void a() {
                    k.c(this.f30434a);
                }
            });
        } else {
            r1.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // g0.f1.j
    public void clear() {
        d();
    }

    public final void d() {
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    f1.j jVar = this.screenFlash;
                    if (jVar != null) {
                        jVar.clear();
                    } else {
                        r1.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    r1.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.lock) {
            try {
                f1.k kVar = this.pendingListener;
                if (kVar != null) {
                    kVar.a();
                }
                this.pendingListener = null;
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        e();
        d();
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final f1.j getScreenFlash() {
        return this.screenFlash;
    }

    public k(f1.j jVar) {
        this.screenFlash = jVar;
        this.lock = new Object();
    }
}
