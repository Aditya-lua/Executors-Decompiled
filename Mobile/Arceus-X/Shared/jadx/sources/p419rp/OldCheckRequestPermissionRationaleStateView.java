package p419rp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0365b;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p203j.ActivityC6992b;
import p226jq.C7259g;
import p235k2.C7410b;
import p402r5.InterfaceC10784a;
import p434sp.C11442a;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: rp.h0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, m31665d2 = {"Lrp/h0;", "Lan/b;", "Lrp/i0;", "permission", "", "isPermanentPermissionRejectionCheck", "Lkotlin/Function1;", "", "callback", "<init>", "(Lrp/i0;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrp/i0;", "b", "Z", "c", "Lkotlin/jvm/functions/Function1;", "Lan/a0;", "d", "Lan/a0;", "()Lan/a0;", "viewFactory", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class OldCheckRequestPermissionRationaleStateView implements InterfaceC0365b<OldCheckRequestPermissionRationaleStateView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC11024i0 permission;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isPermanentPermissionRejectionCheck;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Function1<Boolean, Unit> callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0364a0<OldCheckRequestPermissionRationaleStateView> viewFactory;

    /* JADX INFO: renamed from: rp.h0$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "binding", "Lan/k;", "a", "(Lr5/a;)Lan/k;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class a extends AbstractC7746m implements Function1<C11442a, InterfaceC0382k<OldCheckRequestPermissionRationaleStateView>> {

        /* JADX INFO: renamed from: rp.h0$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "rendering", "Lan/y;", "viewEnvironment", "", "a", "(Ljava/lang/Object;Lan/y;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        public static final class C14238a<RenderingT> implements InterfaceC0382k {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC10784a f38967b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ OldCheckRequestPermissionRationaleStateView f38968c;

            public C14238a(InterfaceC10784a interfaceC10784a, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView) {
                this.f38967b = interfaceC10784a;
                this.f38968c = oldCheckRequestPermissionRationaleStateView;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: RenderingT */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p016an.InterfaceC0382k
            /* JADX INFO: renamed from: a */
            public final void mo1442a(@NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) rendering;
                C11442a c11442a = (C11442a) this.f38967b;
                Context context = c11442a.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ActivityC6992b activityC6992bM30274h = C7259g.m30274h(context);
                if (oldCheckRequestPermissionRationaleStateView.callback != null) {
                    c11442a.getRoot().post(new c(c11442a, this.f38968c, oldCheckRequestPermissionRationaleStateView, activityC6992bM30274h));
                }
            }
        }

        public a() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0382k<OldCheckRequestPermissionRationaleStateView> invoke(@NotNull C11442a binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new C14238a(binding, OldCheckRequestPermissionRationaleStateView.this);
        }
    }

    /* JADX INFO: renamed from: rp.h0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C11442a> {

        /* JADX INFO: renamed from: a */
        public static final b f38969a = new b();

        public b() {
            super(3, C11442a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C11442a m41721d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C11442a.m42856b(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C11442a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m41721d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: rp.h0$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11442a f38970a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OldCheckRequestPermissionRationaleStateView f38971b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ OldCheckRequestPermissionRationaleStateView f38972c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ActivityC6992b f38973d;

        public c(C11442a c11442a, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView, OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView2, ActivityC6992b activityC6992b) {
            this.f38970a = c11442a;
            this.f38971b = oldCheckRequestPermissionRationaleStateView;
            this.f38972c = oldCheckRequestPermissionRationaleStateView2;
            this.f38973d = activityC6992b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f38970a.getRoot().isAttachedToWindow()) {
                if (this.f38971b.permission != EnumC11024i0.RecordAudio || this.f38971b.isPermanentPermissionRejectionCheck) {
                    this.f38972c.callback.invoke(Boolean.valueOf(C7410b.m30698v(this.f38973d, C11040n1.m41737c(this.f38972c.permission))));
                } else {
                    this.f38972c.callback.invoke(Boolean.TRUE);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public OldCheckRequestPermissionRationaleStateView(@NotNull EnumC11024i0 permission, boolean z10, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z10;
        this.callback = function1;
        InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
        this.viewFactory = new C0395x(C7731d0.m32002b(OldCheckRequestPermissionRationaleStateView.class), b.f38969a, new a());
    }

    @Override // p016an.InterfaceC0365b
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC0364a0<OldCheckRequestPermissionRationaleStateView> mo1380a() {
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
        return this.permission == oldCheckRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == oldCheckRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && Intrinsics.m31980c(this.callback, oldCheckRequestPermissionRationaleStateView.callback);
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
