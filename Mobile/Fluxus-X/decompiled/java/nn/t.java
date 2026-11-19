package nn;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import av.d2;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lnn/s;", "Landroid/widget/EditText;", "view", BuildConfig.FLAVOR, "b", "(Lnn/s;Landroid/widget/EditText;)V", "Landroid/widget/TextView;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "handler", BuildConfig.FLAVOR, "c", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 6, 0})
    @gu.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1", f = "TextControllerControlEditText.kt", l = {47}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f25890t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25891u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s f25892v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ EditText f25893w;

        /* JADX INFO: renamed from: nn.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "textValue", BuildConfig.FLAVOR}, k = 3, mv = {1, 6, 0}, xi = 48)
        @gu.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1", f = "TextControllerControlEditText.kt", l = {}, m = "invokeSuspend")
        public static final class C0508a extends gu.m implements Function2<String, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f25894t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f25895u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ EditText f25896v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0508a(EditText editText, eu.b<? super C0508a> bVar) {
                super(2, bVar);
                this.f25896v = editText;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                C0508a c0508a = new C0508a(this.f25896v, bVar);
                c0508a.f25895u = obj;
                return c0508a;
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                fu.c.e();
                if (this.f25894t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                String str = (String) this.f25895u;
                if (!Intrinsics.c(str, this.f25896v.getText().toString())) {
                    this.f25896v.setText(str);
                }
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull String str, @Nullable eu.b<? super Unit> bVar) {
                return ((C0508a) create(str, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "updatedText", BuildConfig.FLAVOR, "a", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 6, 0})
        public static final class b extends p001kotlin.jvm.internal.m implements Function1<CharSequence, Unit> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ s f25897i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s sVar) {
                super(1);
                this.f25897i = sVar;
            }

            public final void a(@Nullable CharSequence charSequence) {
                s sVar = this.f25897i;
                String string = charSequence == null ? null : charSequence.toString();
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                sVar.c(string);
            }

            @Override // p001kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
                a(charSequence);
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, EditText editText, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f25892v = sVar;
            this.f25893w = editText;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            a aVar = new a(this.f25892v, this.f25893w, bVar);
            aVar.f25891u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f25890t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.j.z(dv.j.E(this.f25892v.a(), new C0508a(this.f25893w, null)), (p0) this.f25891u);
                EditText editText = this.f25893w;
                b bVar = new b(this.f25892v);
                this.f25890t = 1;
                if (t.c(editText, bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @gu.f(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt", f = "TextControllerControlEditText.kt", l = {91}, m = "listenForTextChangesUntilCancelled")
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f25898t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f25899u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f25900v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f25901w;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25900v = obj;
            this.f25901w |= Integer.MIN_VALUE;
            return t.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends p001kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextView f25902i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f25903j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextView textView, d dVar) {
            super(1);
            this.f25902i = textView;
            this.f25903j = dVar;
        }

        public final void a(@Nullable Throwable th2) {
            this.f25902i.removeTextChangedListener(this.f25903j);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"nn/t$d", "Landroid/text/TextWatcher;", BuildConfig.FLAVOR, "s", BuildConfig.FLAVOR, "start", "before", "count", BuildConfig.FLAVOR, "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "after", "beforeTextChanged", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1<CharSequence, Unit> f25904a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super CharSequence, Unit> function1) {
            this.f25904a = function1;
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
            this.f25904a.invoke(s8);
        }
    }

    public static final void b(@NotNull s sVar, @NotNull EditText view) {
        d2 subscription;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(p.f25883a);
        w wVar = tag instanceof w ? (w) tag : null;
        if ((wVar == null ? null : wVar.getController()) == sVar && wVar.getSubscription().b()) {
            return;
        }
        if (wVar != null && (subscription = wVar.getSubscription()) != null) {
            d2.a.a(subscription, null, 1, null);
        }
        view.setText(sVar.b());
        view.setTag(p.f25883a, new w(sVar, c0.c(view, null, new a(sVar, view, null), 1, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(TextView textView, Function1<? super CharSequence, Unit> function1, eu.b<?> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f25901w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f25901w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f25900v;
        Object objE = fu.c.e();
        int i11 = bVar2.f25901w;
        if (i11 == 0) {
            zt.o.b(obj);
            bVar2.f25898t = textView;
            bVar2.f25899u = function1;
            bVar2.f25901w = 1;
            av.p pVar = new av.p(fu.b.c(bVar2), 1);
            pVar.G();
            d dVar = new d(function1);
            textView.addTextChangedListener(dVar);
            pVar.j(new c(textView, dVar));
            Object objY = pVar.y();
            if (objY == fu.c.e()) {
                gu.h.c(bVar2);
            }
            if (objY == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
        }
        throw new zt.d();
    }
}
