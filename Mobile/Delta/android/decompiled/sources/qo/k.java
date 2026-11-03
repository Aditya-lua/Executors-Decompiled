package qo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.a0;
import ym.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lqo/k;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;", "Llo/h;", "binding", "<init>", "(Llo/h;)V", "rendering", "Lym/y;", "viewEnvironment", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;Lym/y;)V", "b", "Llo/h;", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements ym.k<Screen.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lo.h binding;

    /* JADX INFO: renamed from: qo.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lqo/k$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfu/c;", "getType", "()Lfu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<Screen.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<Screen.g> f30015a;

        /* JADX INFO: renamed from: qo.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0524a extends kotlin.jvm.internal.k implements xt.n<LayoutInflater, ViewGroup, Boolean, lo.h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0524a f30016a = new C0524a();

            public C0524a() {
                super(3, lo.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidRestartStepBinding;", 0);
            }

            public final lo.h d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return lo.h.c(p8, viewGroup, z10);
            }

            @Override // xt.n
            public /* bridge */ /* synthetic */ lo.h invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: qo.k$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<lo.h, k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f30017a = new b();

            public b() {
                super(1, k.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidRestartStepBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final k invoke(lo.h p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new k(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ym.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.g initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f30015a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public fu.c<? super Screen.g> getType() {
            return this.f30015a.getType();
        }

        public Companion() {
            ym.k.Companion companion = ym.k.INSTANCE;
            this.f30015a = new x(d0.b(Screen.g.class), C0524a.f30016a, b.f30017a);
        }
    }

    public k(@NotNull lo.h binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    @Override // ym.k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull Screen.g rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
    }
}
