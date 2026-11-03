package ym;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import iu.d2;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lym/r;", "Landroid/widget/EditText;", "view", "", "b", "(Lym/r;Landroid/widget/EditText;)V", "Landroid/widget/TextView;", "Lkotlin/Function1;", "", "handler", "", "c", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class s {

    @nt.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1", f = "TextControllerControlEditText.kt", l = {47}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36880t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f36881u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ r f36882v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ EditText f36883w;

        /* JADX INFO: renamed from: ym.s$a$a, reason: collision with other inner class name */
        @nt.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1", f = "TextControllerControlEditText.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "textValue", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class C0677a extends nt.m implements Function2<String, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f36884t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f36885u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ EditText f36886v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0677a(EditText editText, lt.b<? super C0677a> bVar) {
                super(2, bVar);
                this.f36886v = editText;
            }

            @Override // nt.a
            @NotNull
            public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
                C0677a c0677a = new C0677a(this.f36886v, bVar);
                c0677a.f36885u = obj;
                return c0677a;
            }

            @Override // nt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                mt.c.e();
                if (this.f36884t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                String str = (String) this.f36885u;
                if (!Intrinsics.c(str, this.f36886v.getText().toString())) {
                    this.f36886v.setText(str);
                }
                return Unit.f22938a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull String str, @Nullable lt.b<? super Unit> bVar) {
                return ((C0677a) create(str, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "updatedText", "", "a", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 6, 0})
        public static final class b extends kotlin.jvm.internal.m implements Function1<CharSequence, Unit> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ r f36887i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r rVar) {
                super(1);
                this.f36887i = rVar;
            }

            public final void a(@Nullable CharSequence charSequence) {
                r rVar = this.f36887i;
                String string = charSequence == null ? null : charSequence.toString();
                if (string == null) {
                    string = "";
                }
                rVar.c(string);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
                a(charSequence);
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, EditText editText, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f36882v = rVar;
            this.f36883w = editText;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            a aVar = new a(this.f36882v, this.f36883w, bVar);
            aVar.f36881u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f36880t;
            if (i10 == 0) {
                gt.o.b(obj);
                lu.j.z(lu.j.E(this.f36882v.a(), new C0677a(this.f36883w, null)), (p0) this.f36881u);
                EditText editText = this.f36883w;
                b bVar = new b(this.f36882v);
                this.f36880t = 1;
                if (s.c(editText, bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }
    }

    @nt.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt", f = "TextControllerControlEditText.kt", l = {91}, m = "listenForTextChangesUntilCancelled")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f36888t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f36889u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f36890v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f36891w;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36890v = obj;
            this.f36891w |= Integer.MIN_VALUE;
            return s.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextView f36892i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f36893j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextView textView, d dVar) {
            super(1);
            this.f36892i = textView;
            this.f36893j = dVar;
        }

        public final void a(@Nullable Throwable th2) {
            this.f36892i.removeTextChangedListener(this.f36893j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"ym/s$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "before", "count", "", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "after", "beforeTextChanged", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1<CharSequence, Unit> f36894a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super CharSequence, Unit> function1) {
            this.f36894a = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable s8) {
            Intrinsics.checkNotNullParameter(s8, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s8, int start, int before, int count) {
            this.f36894a.invoke(s8);
        }
    }

    public static final void b(@NotNull r rVar, @NotNull EditText view) {
        d2 subscription;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        int i10 = o.f36873a;
        Object tag = view.getTag(i10);
        v vVar = tag instanceof v ? (v) tag : null;
        if ((vVar == null ? null : vVar.getController()) == rVar && vVar.getSubscription().b()) {
            return;
        }
        if (vVar != null && (subscription = vVar.getSubscription()) != null) {
            d2.a.a(subscription, null, 1, null);
        }
        view.setText(rVar.b());
        view.setTag(i10, new v(rVar, b0.c(view, null, new a(rVar, view, null), 1, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(TextView textView, Function1<? super CharSequence, Unit> function1, lt.b<?> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f36891w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f36891w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f36890v;
        Object objE = mt.c.e();
        int i11 = bVar2.f36891w;
        if (i11 == 0) {
            gt.o.b(obj);
            bVar2.f36888t = textView;
            bVar2.f36889u = function1;
            bVar2.f36891w = 1;
            iu.p pVar = new iu.p(mt.b.c(bVar2), 1);
            pVar.H();
            d dVar = new d(function1);
            textView.addTextChangedListener(dVar);
            pVar.o(new c(textView, dVar));
            Object objA = pVar.A();
            if (objA == mt.c.e()) {
                nt.h.c(bVar2);
            }
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
        }
        throw new gt.d();
    }
}
