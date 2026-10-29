package cr;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;", "config", "Lan/r;", "textController", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lan/r;)Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;", "", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;", "", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)Ljava/lang/String;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c2 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14103a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[InputText.InputType.values().length];
            try {
                iArr[InputText.InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputText.InputType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputText.InputType.NUMBER_PAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14103a = iArr;
            int[] iArr2 = new int[InputText.AutofillHint.values().length];
            try {
                iArr2[InputText.AutofillHint.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InputText.AutofillHint.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InputText.AutofillHint.CITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InputText.AutofillHint.COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InputText.AutofillHint.POSTAL_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final TextInputLayout b(@NotNull InputTextComponent inputTextComponent, @NotNull y4 uiComponentHelper, @NotNull final InputText config, @NotNull an.r textController) {
        Intrinsics.checkNotNullParameter(inputTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(textController, "textController");
        final gr.p pVarC = gr.p.c(uiComponentHelper.getLayoutInflater());
        TextInputEditText editText = pVarC.b;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        an.s.b(textController, editText);
        InputText.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                pVarC.f18445c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                pVarC.f18445c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = pVarC.f18445c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                wq.s.a(inputLayout);
            }
            pVarC.b.setInputType(e(attributes.getInputType()));
            InputText.AutofillHint autofillHint = attributes.getAutofillHint();
            pVarC.f18445c.setAutofillHints(autofillHint != null ? f(autofillHint) : null);
        }
        uiComponentHelper.d(new Function0() { // from class: cr.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c2.d(config, pVarC);
            }
        });
        TextInputLayout textInputLayoutB = pVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutB, "getRoot(...)");
        return textInputLayoutB;
    }

    public static /* synthetic */ TextInputLayout c(InputTextComponent inputTextComponent, y4 y4Var, InputText inputText, an.r rVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            rVar = inputTextComponent.getTextController();
        }
        return b(inputTextComponent, y4Var, inputText, rVar);
    }

    public static final Unit d(InputText inputText, gr.p pVar) {
        InputTextBasedComponentStyle styles = inputText.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = pVar.f18445c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            jr.d0.k(inputLayout, styles);
        }
        return Unit.f22483a;
    }

    public static final int e(InputText.InputType inputType) {
        int i10 = a.f14103a[inputType.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 32;
        }
        if (i10 == 3) {
            return 2;
        }
        throw new jt.l();
    }

    public static final String f(InputText.AutofillHint autofillHint) {
        switch (a.b[autofillHint.ordinal()]) {
            case 1:
                return "personName";
            case 2:
                return "personGivenName";
            case 3:
                return "personMiddleName";
            case 4:
                return "personFamilyName";
            case 5:
                return "emailAddress";
            case 6:
                return "streetAddress";
            case 7:
                return "extendedAddress";
            case 8:
                return "addressLocality";
            case 9:
                return "addressCountry";
            case 10:
                return "postalCode";
            default:
                throw new jt.l();
        }
    }
}
