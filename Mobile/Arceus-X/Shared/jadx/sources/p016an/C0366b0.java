package p016an;

import android.content.res.Resources;
import android.view.View;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0980s;
import bn.C1471c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p256ku.C7865g2;
import p256ku.C7872i;
import p256ku.C7910q0;
import p256ku.CoroutineName;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: an.b0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m31665d2 = {"Landroid/view/View;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "", "block", "Lku/d2;", "b", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lku/d2;", "Lan/c;", "a", "(Landroid/view/View;)Lan/c;", "wf1-core-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0366b0 {

    /* JADX INFO: renamed from: an.b0$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"", "b", "()V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements Function0<Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ViewOnAttachStateChangeListenerC0367c f894i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ CoroutineContext f895j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> f896k;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super ku.p0, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewOnAttachStateChangeListenerC0367c viewOnAttachStateChangeListenerC0367c, CoroutineContext coroutineContext, Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2) {
            super(0);
            this.f894i = viewOnAttachStateChangeListenerC0367c;
            this.f895j = coroutineContext;
            this.f896k = function2;
        }

        /* JADX INFO: renamed from: b */
        public final void m1384b() {
            C7872i.m32680c(this.f894i.getCoroutineScope(), this.f895j, EnumC7914r0.UNDISPATCHED, this.f896k);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m1384b();
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap java.lang.Object:CAST), 64, (wrap int:INVOKE) */
    /* JADX INFO: renamed from: a */
    public static final ViewOnAttachStateChangeListenerC0367c m1381a(View view) {
        Object tag = view.getTag(C0386o.f947b);
        ViewOnAttachStateChangeListenerC0367c viewOnAttachStateChangeListenerC0367c = null;
        ViewOnAttachStateChangeListenerC0367c viewOnAttachStateChangeListenerC0367c2 = tag instanceof ViewOnAttachStateChangeListenerC0367c ? (ViewOnAttachStateChangeListenerC0367c) tag : null;
        if (viewOnAttachStateChangeListenerC0367c2 != null && C7910q0.m32893i(viewOnAttachStateChangeListenerC0367c2.getCoroutineScope())) {
            viewOnAttachStateChangeListenerC0367c = viewOnAttachStateChangeListenerC0367c2;
        }
        if (viewOnAttachStateChangeListenerC0367c != null) {
            return viewOnAttachStateChangeListenerC0367c;
        }
        InterfaceC0980s interfaceC0980sM7545a = C1471c.f5714a.m7545a(view);
        if (interfaceC0980sM7545a == null) {
            throw new IllegalStateException("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
        }
        AbstractC0968m abstractC0968mM4979a = C0982t.m4979a(interfaceC0980sM7545a);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) view.getClass().getName());
        sb3.append('@');
        sb3.append(view.hashCode());
        sb2.append(sb3.toString());
        if (view.getId() != -1) {
            try {
                String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                sb2.append('-');
                sb2.append(resourceEntryName);
            } catch (Resources.NotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        ViewOnAttachStateChangeListenerC0367c viewOnAttachStateChangeListenerC0367c3 = new ViewOnAttachStateChangeListenerC0367c(C7910q0.m32894j(abstractC0968mM4979a, new CoroutineName(string)));
        view.setTag(C0386o.f947b, viewOnAttachStateChangeListenerC0367c3);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0367c3);
        return viewOnAttachStateChangeListenerC0367c3;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC7850d2 m1382b(@NotNull View view, @NotNull CoroutineContext context, @NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        if (context.get(InterfaceC7850d2.INSTANCE) != null) {
            throw new IllegalArgumentException("Expected custom CoroutineContext to not contain a Job.");
        }
        ViewOnAttachStateChangeListenerC0367c viewOnAttachStateChangeListenerC0367cM1381a = m1381a(view);
        a aVar = new a(viewOnAttachStateChangeListenerC0367cM1381a, context, block);
        if (view.isAttachedToWindow()) {
            aVar.invoke();
        } else {
            viewOnAttachStateChangeListenerC0367cM1381a.m1387c(aVar);
        }
        return C7865g2.m32654h(viewOnAttachStateChangeListenerC0367cM1381a.getCoroutineScope().getCoroutineContext());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC7850d2 m1383c(View view, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = C7721e.f29393a;
        }
        return m1382b(view, coroutineContext, function2);
    }
}
