package nn;

import android.content.res.Resources;
import android.view.View;
import av.CoroutineName;
import av.d2;
import av.g2;
import av.p0;
import av.q0;
import av.r0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroid/view/View;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lav/p0;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "block", "Lav/d2;", "b", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lav/d2;", "Lnn/c;", "a", "(Landroid/view/View;)Lnn/c;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class c0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements Function0<Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ c f25831i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f25832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, eu.b<? super Unit>, Object> f25833k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c cVar, CoroutineContext coroutineContext, Function2<? super p0, ? super eu.b<? super Unit>, ? extends Object> function2) {
            super(0);
            this.f25831i = cVar;
            this.f25832j = coroutineContext;
            this.f25833k = function2;
        }

        public final void b() {
            av.i.c(this.f25831i.getCoroutineScope(), this.f25832j, r0.UNDISPATCHED, this.f25833k);
        }

        @Override // p001kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f21506a;
        }
    }

    public static final c a(View view) {
        Object tag = view.getTag(p.b);
        c cVar = null;
        c cVar2 = tag instanceof c ? (c) tag : null;
        if (cVar2 != null && q0.i(cVar2.getCoroutineScope())) {
            cVar = cVar2;
        }
        if (cVar != null) {
            return cVar;
        }
        androidx.p000lifecycle.s sVarA = on.c.f28285a.a(view);
        if (sVarA == null) {
            throw new IllegalStateException("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
        }
        androidx.p000lifecycle.m mVarA = androidx.p000lifecycle.t.a(sVarA);
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
        c cVar3 = new c(q0.j(mVarA, new CoroutineName(string)));
        view.setTag(p.b, cVar3);
        view.addOnAttachStateChangeListener(cVar3);
        return cVar3;
    }

    @NotNull
    public static final d2 b(@NotNull View view, @NotNull CoroutineContext context, @NotNull Function2<? super p0, ? super eu.b<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        if (context.get(d2.INSTANCE) != null) {
            throw new IllegalArgumentException("Expected custom CoroutineContext to not contain a Job.");
        }
        c cVarA = a(view);
        a aVar = new a(cVarA, context, block);
        if (view.isAttachedToWindow()) {
            aVar.invoke();
        } else {
            cVarA.c(aVar);
        }
        return g2.j(cVarA.getCoroutineScope().getCoroutineContext());
    }

    public static /* synthetic */ d2 c(View view, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = p001kotlin.coroutines.e.f21548a;
        }
        return b(view, coroutineContext, function2);
    }
}
