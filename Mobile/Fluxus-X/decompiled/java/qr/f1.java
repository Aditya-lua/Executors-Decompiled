package qr;

import android.text.Editable;
import android.text.TextWatcher;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f1 {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"qr/f1$a", "Landroid/text/TextWatcher;", BuildConfig.FLAVOR, "s", BuildConfig.FLAVOR, "start", "count", "after", BuildConfig.FLAVOR, "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.c0<String> f30284a;
        public final /* synthetic */ ur.l b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Currency f30285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ NumberFormat f30286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ NumberFormat f30287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InputCurrencyComponent f30288f;

        public a(p001kotlin.jvm.internal.c0<String> c0Var, ur.l lVar, Currency currency, NumberFormat numberFormat, NumberFormat numberFormat2, InputCurrencyComponent inputCurrencyComponent) {
            this.f30284a = c0Var;
            this.b = lVar;
            this.f30285c = currency;
            this.f30286d = numberFormat;
            this.f30287e = numberFormat2;
            this.f30288f = inputCurrencyComponent;
        }

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
            if (Intrinsics.c(String.valueOf(s8), this.f30284a.f21575a) || s8 == null || StringsKt.p0(s8)) {
                return;
            }
            this.b.b.removeTextChangedListener(this);
            String strQuote = Pattern.quote(this.f30285c.getSymbol());
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            String strReplace = new Regex(strQuote).replace(s8, BuildConfig.FLAVOR);
            StringBuilder sb2 = new StringBuilder();
            int length = strReplace.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = strReplace.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            Number number = this.f30286d.parse(sb2.toString());
            if (number != null) {
                double dDoubleValue = number.doubleValue() / 100.0d;
                ?? r10 = this.f30287e.format(dDoubleValue);
                this.f30284a.f21575a = r10;
                this.b.b.setText((CharSequence) r10);
                this.b.b.setSelection(r10.length());
                this.b.b.addTextChangedListener(this);
                this.f30288f.getNumberController().c(Double.valueOf(dDoubleValue));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s8, int start, int before, int count) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final TextInputLayout b(@NotNull InputCurrencyComponent inputCurrencyComponent, @NotNull z5 uiComponentHelper, @NotNull final InputCurrency config) {
        Intrinsics.checkNotNullParameter(inputCurrencyComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.l lVarC = ur.l.c(uiComponentHelper.getLayoutInflater());
        InputCurrency.Attributes attributes = config.getAttributes();
        String str = "USD";
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                lVarC.f33906c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                lVarC.f33906c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = lVarC.f33906c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                kr.t.a(inputLayout);
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
        p001kotlin.jvm.internal.c0 c0Var = new p001kotlin.jvm.internal.c0();
        Editable text = lVarC.b.getText();
        c0Var.f21575a = text != null ? text.toString() : 0;
        a aVar = new a(c0Var, lVarC, currency, numberFormat, currencyInstance, inputCurrencyComponent);
        if (inputCurrencyComponent.getValue() != null) {
            try {
                lVarC.b.setText(currencyInstance.format(inputCurrencyComponent.getValue().doubleValue()));
            } catch (Exception unused) {
            }
        }
        lVarC.b.addTextChangedListener(aVar);
        uiComponentHelper.d(new Function0() { // from class: qr.e1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.c(config, lVarC);
            }
        });
        TextInputLayout root = lVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(InputCurrency inputCurrency, ur.l lVar) {
        InputTextBasedComponentStyle styles = inputCurrency.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = lVar.f33906c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            yr.d0.k(inputLayout, styles);
        }
        return Unit.f21506a;
    }
}
