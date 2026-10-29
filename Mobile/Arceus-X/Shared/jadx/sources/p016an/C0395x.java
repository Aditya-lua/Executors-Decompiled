package p016an;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402r5.InterfaceC10784a;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: an.x */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B[\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012*\u0010\r\u001a&\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\f\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR8\u0010\r\u001a&\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m31665d2 = {"Lan/x;", "Lr5/a;", "BindingT", "", "RenderingT", "Lan/a0;", "Lhu/c;", Payload.TYPE, "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/squareup/workflow1/ui/ViewBindingInflater;", "bindingInflater", "Lkotlin/Function1;", "Lan/k;", "runnerConstructor", "<init>", "(Lhu/c;Lzt/n;Lkotlin/jvm/functions/Function1;)V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "container", "Landroid/view/View;", "a", "(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", "b", "Lzt/n;", "c", "Lkotlin/jvm/functions/Function1;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0395x<BindingT extends InterfaceC10784a, RenderingT> implements InterfaceC0364a0<RenderingT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6567c<RenderingT> type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, BindingT> bindingInflater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<BindingT, InterfaceC0382k<RenderingT>> runnerConstructor;

    /* JADX INFO: renamed from: an.x$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "rendering", "Lan/y;", "environment", "", "a", "(Ljava/lang/Object;Lan/y;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements Function2<RenderingT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC0382k<RenderingT> f978i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0382k<RenderingT> interfaceC0382k) {
            super(2);
            this.f978i = interfaceC0382k;
        }

        /* JADX INFO: renamed from: a */
        public final void m1461a(@NotNull RenderingT rendering, @NotNull ViewEnvironment environment) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.f978i.mo1442a(rendering, environment);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
            m1461a(obj, viewEnvironment);
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: zt.n<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends BindingT extends r5.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super BindingT extends r5.a, ? extends an.k<RenderingT>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0395x(@NotNull InterfaceC6567c<RenderingT> type, @NotNull InterfaceC14057n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends BindingT> bindingInflater, @NotNull Function1<? super BindingT, ? extends InterfaceC0382k<RenderingT>> runnerConstructor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bindingInflater, "bindingInflater");
        Intrinsics.checkNotNullParameter(runnerConstructor, "runnerConstructor");
        this.type = type;
        this.bindingInflater = bindingInflater;
        this.runnerConstructor = runnerConstructor;
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo1379a(@NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, BindingT> interfaceC14057n = this.bindingInflater;
        LayoutInflater layoutInflaterM1443a = C0383l.m1443a(contextForNewView, container);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterM1443a, "contextForNewView.viewBi…LayoutInflater(container)");
        BindingT bindingtInvoke = interfaceC14057n.invoke(layoutInflaterM1443a, container, Boolean.FALSE);
        InterfaceC0382k<RenderingT> interfaceC0382kInvoke = this.runnerConstructor.invoke(bindingtInvoke);
        View root = bindingtInvoke.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        C0372e0.m1408a(root, initialRendering, initialViewEnvironment, new a(interfaceC0382kInvoke));
        View root2 = bindingtInvoke.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "bindingInflater(contextF…    }\n      }\n      .root");
        return root2;
    }

    @Override // p016an.InterfaceC0364a0
    @NotNull
    public InterfaceC6567c<RenderingT> getType() {
        return this.type;
    }
}
