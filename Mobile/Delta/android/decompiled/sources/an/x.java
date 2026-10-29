package an;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B[\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012*\u0010\r\u001a&\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\f\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR8\u0010\r\u001a&\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lan/x;", "Lr5/a;", "BindingT", "", "RenderingT", "Lan/a0;", "Lhu/c;", Payload.TYPE, "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/squareup/workflow1/ui/ViewBindingInflater;", "bindingInflater", "Lkotlin/Function1;", "Lan/k;", "runnerConstructor", "<init>", "(Lhu/c;Lzt/n;Lkotlin/jvm/functions/Function1;)V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "container", "Landroid/view/View;", "a", "(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", "b", "Lzt/n;", "c", "Lkotlin/jvm/functions/Function1;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class x<BindingT extends r5.a, RenderingT> implements a0<RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hu.c<RenderingT> type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zt.n<LayoutInflater, ViewGroup, Boolean, BindingT> bindingInflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<BindingT, k<RenderingT>> runnerConstructor;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "rendering", "Lan/y;", "environment", "", "a", "(Ljava/lang/Object;Lan/y;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function2<RenderingT, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k<RenderingT> f754i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k<RenderingT> kVar) {
            super(2);
            this.f754i = kVar;
        }

        public final void a(@NotNull RenderingT rendering, @NotNull ViewEnvironment environment) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.f754i.a(rendering, environment);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
            a(obj, viewEnvironment);
            return Unit.f22483a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull hu.c<RenderingT> type, @NotNull zt.n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends BindingT> bindingInflater, @NotNull Function1<? super BindingT, ? extends k<RenderingT>> runnerConstructor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bindingInflater, "bindingInflater");
        Intrinsics.checkNotNullParameter(runnerConstructor, "runnerConstructor");
        this.type = type;
        this.bindingInflater = bindingInflater;
        this.runnerConstructor = runnerConstructor;
    }

    @Override // an.a0
    @NotNull
    public View a(@NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        zt.n<LayoutInflater, ViewGroup, Boolean, BindingT> nVar = this.bindingInflater;
        LayoutInflater layoutInflaterA = l.a(contextForNewView, container);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterA, "contextForNewView.viewBi…LayoutInflater(container)");
        BindingT bindingtInvoke = nVar.invoke(layoutInflaterA, container, Boolean.FALSE);
        k<RenderingT> kVarInvoke = this.runnerConstructor.invoke(bindingtInvoke);
        View root = bindingtInvoke.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        e0.a(root, initialRendering, initialViewEnvironment, new a(kVarInvoke));
        View root2 = bindingtInvoke.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "bindingInflater(contextF…    }\n      }\n      .root");
        return root2;
    }

    @Override // an.a0
    @NotNull
    public hu.c<RenderingT> getType() {
        return this.type;
    }
}
