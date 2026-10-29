package cr;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCurrencyComponent;
import gr.C6224l;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p227jr.C7296d0;
import p526wq.C12536s;

/* JADX INFO: renamed from: cr.t0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4318t0 {

    /* JADX INFO: renamed from: cr.t0$a */
    @Metadata(m31664d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"cr/t0$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7729c0<String> f18159a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6224l f18160b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Currency f18161c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ NumberFormat f18162d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ NumberFormat f18163e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InputCurrencyComponent f18164f;

        public a(C7729c0<String> c7729c0, C6224l c6224l, Currency currency, NumberFormat numberFormat, NumberFormat numberFormat2, InputCurrencyComponent inputCurrencyComponent) {
            this.f18159a = c7729c0;
            this.f18160b = c6224l;
            this.f18161c = currency;
            this.f18162d = numberFormat;
            this.f18163e = numberFormat2;
            this.f18164f = inputCurrencyComponent;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.google.android.material.textfield.TextInputEditText */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) throws IOException, ParseException {
            if (Intrinsics.m31980c(String.valueOf(s8), this.f18159a.f29425a) || s8 == null || StringsKt.m32182p0(s8)) {
                return;
            }
            this.f18160b.f23706b.removeTextChangedListener(this);
            String strQuote = Pattern.quote(this.f18161c.getSymbol());
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            String strReplace = new Regex(strQuote).replace(s8, "");
            StringBuilder sb2 = new StringBuilder();
            int length = strReplace.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = strReplace.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            Number number = this.f18162d.parse(sb2.toString());
            if (number != null) {
                double dDoubleValue = number.doubleValue() / 100.0d;
                ?? r8 = this.f18163e.format(dDoubleValue);
                this.f18159a.f29425a = r8;
                this.f18160b.f23706b.setText((CharSequence) r8);
                this.f18160b.f23706b.setSelection(r8.length());
                this.f18160b.f23706b.addTextChangedListener(this);
                this.f18164f.getNumberController().m24142c(Double.valueOf(dDoubleValue));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s8, int start, int before, int count) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TextInputLayout m21946b(@NotNull InputCurrencyComponent inputCurrencyComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputCurrency config) {
        Intrinsics.checkNotNullParameter(inputCurrencyComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6224l c6224lM27385c = C6224l.m27385c(uiComponentHelper.getLayoutInflater());
        InputCurrency.Attributes attributes = config.getAttributes();
        String str = "USD";
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                c6224lM27385c.f23707c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                c6224lM27385c.f23707c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = c6224lM27385c.f23707c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                C12536s.m46884a(inputLayout);
            }
            String currencyCode = attributes.getCurrencyCode();
            if (currencyCode != null) {
                str = currencyCode;
            }
        }
        Currency currency = Currency.getInstance(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        NumberFormat numberFormat = NumberFormat.getInstance();
        C7729c0 c7729c0 = new C7729c0();
        Editable text = c6224lM27385c.f23706b.getText();
        c7729c0.f29425a = text != null ? text.toString() : 0;
        a aVar = new a(c7729c0, c6224lM27385c, currency, numberFormat, currencyInstance, inputCurrencyComponent);
        if (inputCurrencyComponent.getValue() != null) {
            try {
                c6224lM27385c.f23706b.setText(currencyInstance.format(inputCurrencyComponent.getValue().doubleValue()));
            } catch (Exception unused) {
            }
        }
        c6224lM27385c.f23706b.addTextChangedListener(aVar);
        uiComponentHelper.m22002d(new Function0() { // from class: cr.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4318t0.m21947c(config, c6224lM27385c);
            }
        });
        TextInputLayout root = c6224lM27385c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21947c(InputCurrency inputCurrency, C6224l c6224l) {
        InputTextBasedComponentStyle styles = inputCurrency.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = c6224l.f23707c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            C7296d0.m30348k(inputLayout, styles);
        }
        return Unit.f29331a;
    }
}
