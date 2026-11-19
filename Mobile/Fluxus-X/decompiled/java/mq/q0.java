package mq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Lmq/q0;", "Lnn/k;", "Lmq/q5$d$e;", "Loq/d;", "binding", "<init>", "(Loq/d;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "b", "(Lmq/q5$d$e;Lnn/z;)V", "Loq/d;", "c", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 implements nn.k<q5.d.e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final oq.d binding;

    /* JADX INFO: renamed from: mq.q0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lmq/q0$a;", "Lnn/b0;", "Lmq/q5$d$e;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lmq/q5$d$e;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements nn.b0<q5.d.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.b0<q5.d.e> f23777a;

        /* JADX INFO: renamed from: mq.q0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0464a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, oq.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0464a f23778a = new C0464a();

            public C0464a() {
                super(3, oq.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;", 0);
            }

            public final oq.d d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return oq.d.c(p8, viewGroup, z10);
            }

            @Override // pu.n
            public /* bridge */ /* synthetic */ oq.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: mq.q0$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function1<oq.d, q0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f23779a = new b();

            public b() {
                super(1, q0.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;)V", 0);
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final q0 invoke(oq.d p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new q0(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull q5.d.e initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f23777a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super q5.d.e> getType() {
            return this.f23777a.getType();
        }

        public Companion() {
            nn.k.Companion companion = nn.k.INSTANCE;
            this.f23777a = new nn.y(p001kotlin.jvm.internal.d0.b(q5.d.e.class), C0464a.f23778a, b.f23779a);
        }
    }

    public q0(@NotNull oq.d binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @Override // nn.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull q5.d.e rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        rendering.a().invoke();
    }
}
