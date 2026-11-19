package fq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import nn.ViewEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fq.m0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"Lfq/m0;", "Lnn/b;", "Lfq/n0;", "permission", BuildConfig.FLAVOR, "isPermanentPermissionRejectionCheck", "Lkotlin/Function1;", BuildConfig.FLAVOR, "callback", "<init>", "(Lfq/n0;ZLkotlin/jvm/functions/Function1;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq/n0;", "b", "Z", "c", "Lkotlin/jvm/functions/Function1;", "Lnn/b0;", "d", "Lnn/b0;", "()Lnn/b0;", "viewFactory", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OldCheckRequestPermissionRationaleStateView implements nn.b<OldCheckRequestPermissionRationaleStateView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final n0 permission;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isPermanentPermissionRejectionCheck;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Function1<Boolean, Unit> callback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nn.b0<OldCheckRequestPermissionRationaleStateView> viewFactory;

    /* JADX INFO: renamed from: fq.m0$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls5/a;", "BindingT", BuildConfig.FLAVOR, "RenderingT", "binding", "Lnn/k;", "a", "(Ls5/a;)Lnn/k;"}, k = 3, mv = {2, 2, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements Function1<gq.a, nn.k<OldCheckRequestPermissionRationaleStateView>> {

        /* JADX INFO: renamed from: fq.m0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Ls5/a;", "BindingT", BuildConfig.FLAVOR, "RenderingT", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;Lnn/z;)V"}, k = 3, mv = {2, 2, 0})
        public static final class C0304a<RenderingT> implements nn.k {
            public final /* synthetic */ s5.a b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ OldCheckRequestPermissionRationaleStateView f16449c;

            public C0304a(s5.a aVar, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView) {
                this.b = aVar;
                this.f16449c = oldCheckRequestPermissionRationaleStateView;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // nn.k
            public final void a(@NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) rendering;
                gq.a aVar = (gq.a) this.b;
                Context context = aVar.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                j.b bVarH = xq.g.h(context);
                if (oldCheckRequestPermissionRationaleStateView.callback != null) {
                    aVar.getRoot().post(new c(aVar, this.f16449c, oldCheckRequestPermissionRationaleStateView, bVarH));
                }
            }
        }

        public a() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nn.k<OldCheckRequestPermissionRationaleStateView> invoke(@NotNull gq.a binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new C0304a(binding, OldCheckRequestPermissionRationaleStateView.this);
        }
    }

    /* JADX INFO: renamed from: fq.m0$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, gq.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16450a = new b();

        public b() {
            super(3, gq.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);
        }

        public final gq.a d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return gq.a.b(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ gq.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: fq.m0$c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gq.a f16451a;
        public final /* synthetic */ OldCheckRequestPermissionRationaleStateView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OldCheckRequestPermissionRationaleStateView f16452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j.b f16453d;

        public c(gq.a aVar, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView2, j.b bVar) {
            this.f16451a = aVar;
            this.b = oldCheckRequestPermissionRationaleStateView;
            this.f16452c = oldCheckRequestPermissionRationaleStateView2;
            this.f16453d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f16451a.getRoot().isAttachedToWindow()) {
                if (this.b.permission != n0.RecordAudio || this.b.isPermanentPermissionRejectionCheck) {
                    this.f16452c.callback.invoke(Boolean.valueOf(k2.b.v(this.f16453d, x1.c(this.f16452c.permission))));
                } else {
                    this.f16452c.callback.invoke(Boolean.TRUE);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OldCheckRequestPermissionRationaleStateView(@NotNull n0 permission, boolean z10, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z10;
        this.callback = function1;
        nn.k.Companion companion = nn.k.INSTANCE;
        this.viewFactory = new nn.y(p001kotlin.jvm.internal.d0.b(OldCheckRequestPermissionRationaleStateView.class), b.f16450a, new a());
    }

    @Override // nn.b
    @NotNull
    public nn.b0<OldCheckRequestPermissionRationaleStateView> a() {
        return this.viewFactory;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldCheckRequestPermissionRationaleStateView)) {
            return false;
        }
        OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) other;
        return this.permission == oldCheckRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == oldCheckRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && Intrinsics.c(this.callback, oldCheckRequestPermissionRationaleStateView.callback);
    }

    public int hashCode() {
        int iHashCode = ((this.permission.hashCode() * 31) + Boolean.hashCode(this.isPermanentPermissionRejectionCheck)) * 31;
        Function1<Boolean, Unit> function1 = this.callback;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    @NotNull
    public String toString() {
        return "OldCheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }
}
