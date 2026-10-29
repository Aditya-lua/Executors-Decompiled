package p016an;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7348o;
import p256ku.C7905p;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: an.s */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m31665d2 = {"Lan/r;", "Landroid/widget/EditText;", "view", "", "b", "(Lan/r;Landroid/widget/EditText;)V", "Landroid/widget/TextView;", "Lkotlin/Function1;", "", "handler", "", "c", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "wf1-core-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0390s {

    /* JADX INFO: renamed from: an.s$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1", m39664f = "TextControllerControlEditText.kt", m39665l = {47}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f955t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f956u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC0389r f957v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ EditText f958w;

        /* JADX INFO: renamed from: an.s$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m31665d2 = {"<anonymous>", "", "textValue", ""}, m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1", m39664f = "TextControllerControlEditText.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class C14068a extends AbstractC10351m implements Function2<String, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f959t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f960u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ EditText f961v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14068a(EditText editText, InterfaceC9557b<? super C14068a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f961v = editText;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                C14068a c14068a = new C14068a(this.f961v, interfaceC9557b);
                c14068a.f960u = obj;
                return c14068a;
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                C10047c.m38805e();
                if (this.f959t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                String str = (String) this.f960u;
                if (!Intrinsics.m31980c(str, this.f961v.getText().toString())) {
                    this.f961v.setText(str);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull String str, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14068a) create(str, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: an.s$a$b */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"", "updatedText", "", "a", "(Ljava/lang/CharSequence;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class b extends AbstractC7746m implements Function1<CharSequence, Unit> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC0389r f962i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC0389r interfaceC0389r) {
                super(1);
                this.f962i = interfaceC0389r;
            }

            /* JADX INFO: renamed from: a */
            public final void m1456a(@Nullable CharSequence charSequence) {
                InterfaceC0389r interfaceC0389r = this.f962i;
                String string = charSequence == null ? null : charSequence.toString();
                if (string == null) {
                    string = "";
                }
                interfaceC0389r.mo1451c(string);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
                m1456a(charSequence);
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0389r interfaceC0389r, EditText editText, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f957v = interfaceC0389r;
            this.f958w = editText;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f957v, this.f958w, interfaceC9557b);
            aVar.f956u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f955t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C9579j.m37809z(C9579j.m37768E(this.f957v.mo1449a(), new C14068a(this.f958w, null)), (InterfaceC7906p0) this.f956u);
                EditText editText = this.f958w;
                b bVar = new b(this.f957v);
                this.f955t = 1;
                if (C0390s.m1454c(editText, bVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: an.s$b */
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt", m39664f = "TextControllerControlEditText.kt", m39665l = {91}, m39666m = "listenForTextChangesUntilCancelled")
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f963t;

        /* JADX INFO: renamed from: u */
        public Object f964u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f965v;

        /* JADX INFO: renamed from: w */
        public int f966w;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f965v = obj;
            this.f966w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C0390s.m1454c(null, null, this);
        }
    }

    /* JADX INFO: renamed from: an.s$c */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class c extends AbstractC7746m implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ TextView f967i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ d f968j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextView textView, d dVar) {
            super(1);
            this.f967i = textView;
            this.f968j = dVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m1457a(@Nullable Throwable th2) {
            this.f967i.removeTextChangedListener(this.f968j);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m1457a(th2);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: an.s$d */
    @Metadata(m31664d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m31665d2 = {"an/s$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "before", "count", "", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "after", "beforeTextChanged", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<CharSequence, Unit> f969a;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super CharSequence, Unit> function1) {
            this.f969a = function1;
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
            this.f969a.invoke(s8);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: an.b0.c(android.view.View, kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function2, int, java.lang.Object):ku.d2 */
    /* JADX INFO: renamed from: b */
    public static final void m1453b(@NotNull InterfaceC0389r interfaceC0389r, @NotNull EditText view) {
        InterfaceC7850d2 subscription;
        Intrinsics.checkNotNullParameter(interfaceC0389r, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        int i10 = C0386o.f946a;
        Object tag = view.getTag(i10);
        C0393v c0393v = tag instanceof C0393v ? (C0393v) tag : null;
        if ((c0393v == null ? null : c0393v.getController()) == interfaceC0389r && c0393v.getSubscription().mo32556b()) {
            return;
        }
        if (c0393v != null && (subscription = c0393v.getSubscription()) != null) {
            InterfaceC7850d2.a.m32603a(subscription, null, 1, null);
        }
        view.setText(interfaceC0389r.mo1450b());
        view.setTag(i10, new C0393v(interfaceC0389r, C0366b0.m1383c(view, null, new a(interfaceC0389r, view, null), 1, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m1454c(TextView textView, Function1<? super CharSequence, Unit> function1, InterfaceC9557b<?> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f966w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f966w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f965v;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f966w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            bVar.f963t = textView;
            bVar.f964u = function1;
            bVar.f966w = 1;
            C7905p c7905p = new C7905p(C10046b.m38803c(bVar), 1);
            c7905p.m32860H();
            d dVar = new d(function1);
            textView.addTextChangedListener(dVar);
            c7905p.mo32815n(new c(textView, dVar));
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(bVar);
            }
            if (objM32857A == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
        }
        throw new C7334d();
    }
}
