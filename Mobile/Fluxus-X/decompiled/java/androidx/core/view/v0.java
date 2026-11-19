package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "allViews", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class v0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyu/h;", "Landroid/view/View;", BuildConfig.FLAVOR, "<anonymous>", "(Lyu/h;)V"}, k = 3, mv = {2, 0, 0})
    @gu.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
    public static final class a extends gu.k implements Function2<yu.h<? super View>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1729u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f1730v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ View f1731w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f1731w = view;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f1731w, bVar);
            aVar.f1730v = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.f(r5, r4) == r0) goto L17;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            yu.h hVar;
            Object objE = fu.c.e();
            int i10 = this.f1729u;
            if (i10 != 0) {
                if (i10 == 1) {
                    hVar = (yu.h) this.f1730v;
                    zt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            hVar = (yu.h) this.f1730v;
            View view = this.f1731w;
            this.f1730v = hVar;
            this.f1729u = 1;
            if (hVar.a(view, this) != objE) {
            }
            return objE;
            View view2 = this.f1731w;
            if (view2 instanceof ViewGroup) {
                Sequence<View> sequenceB = u0.b((ViewGroup) view2);
                this.f1730v = null;
                this.f1729u = 2;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yu.h<? super View> hVar, eu.b<? super Unit> bVar) {
            return ((a) create(hVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @NotNull
    public static final Sequence<View> a(@NotNull View view) {
        return yu.i.b(new a(view, null));
    }
}
