package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import p201iu.AbstractC6980h;
import p201iu.C6981i;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10349k;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: androidx.core.view.v0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "allViews", "core-ktx_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0639v0 {

    /* JADX INFO: renamed from: androidx.core.view.v0$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Liu/h;", "Landroid/view/View;", "", "<anonymous>", "(Liu/h;)V"}, m31666k = 3, m31667mv = {2, 0, 0})
    @InterfaceC10344f(m39663c = "androidx.core.view.ViewKt$allViews$1", m39664f = "View.kt", m39665l = {410, 412}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10349k implements Function2<AbstractC6980h<? super View>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: u */
        public int f2492u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f2493v;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ View f2494w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f2494w = view;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f2494w, interfaceC9557b);
            aVar.f2493v = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.m29371g(r5, r4) == r0) goto L17;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AbstractC6980h abstractC6980h;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f2492u;
            if (i10 != 0) {
                if (i10 == 1) {
                    abstractC6980h = (AbstractC6980h) this.f2493v;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            abstractC6980h = (AbstractC6980h) this.f2493v;
            View view = this.f2494w;
            this.f2493v = abstractC6980h;
            this.f2492u = 1;
            if (abstractC6980h.mo29366a(view, this) != objM38805e) {
            }
            return objM38805e;
            View view2 = this.f2494w;
            if (view2 instanceof ViewGroup) {
                Sequence<View> sequenceM3199b = C0637u0.m3199b((ViewGroup) view2);
                this.f2493v = null;
                this.f2492u = 2;
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC6980h<? super View> abstractC6980h, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(abstractC6980h, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Sequence<View> m3203a(@NotNull View view) {
        return C6981i.m29373b(new a(view, null));
    }
}
