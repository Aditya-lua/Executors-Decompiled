package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "allViews", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class v0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/h;", "Landroid/view/View;", "", "<anonymous>", "(Liu/h;)V"}, k = 3, mv = {2, 0, 0})
    @pt.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
    public static final class a extends pt.k implements Function2<iu.h<? super View>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1922u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f1923v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ View f1924w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f1924w = view;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f1924w, bVar);
            aVar.f1923v = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.g(r5, r4) == r0) goto L17;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r4.f1922u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f1923v
                iu.h r1 = (iu.h) r1
                jt.o.b(r5)
                goto L37
            L22:
                jt.o.b(r5)
                java.lang.Object r5 = r4.f1923v
                r1 = r5
                iu.h r1 = (iu.h) r1
                android.view.View r5 = r4.f1924w
                r4.f1923v = r1
                r4.f1922u = r3
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f1924w
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                kotlin.sequences.Sequence r5 = androidx.core.view.u0.b(r5)
                r3 = 0
                r4.f1923v = r3
                r4.f1922u = r2
                java.lang.Object r5 = r1.g(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r5 = kotlin.Unit.f22483a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.v0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(iu.h<? super View> hVar, nt.b<? super Unit> bVar) {
            return ((a) create(hVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @NotNull
    public static final Sequence<View> a(@NotNull View view) {
        return iu.i.b(new a(view, null));
    }
}
