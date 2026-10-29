package cr;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputTextComponent;
import gr.C6228p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016an.C0390s;
import p016an.InterfaceC0389r;
import p227jr.C7296d0;
import p229jt.C7345l;
import p526wq.C12536s;

/* JADX INFO: renamed from: cr.c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;", "config", "Lan/r;", "textController", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lan/r;)Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;", "", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;", "", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)Ljava/lang/String;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4217c2 {

    /* JADX INFO: renamed from: cr.c2$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18005a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f18006b;

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
            f18005a = iArr;
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
            f18006b = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TextInputLayout m21741b(@NotNull InputTextComponent inputTextComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputText config, @NotNull InterfaceC0389r textController) {
        Intrinsics.checkNotNullParameter(inputTextComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(textController, "textController");
        final C6228p c6228pM27401c = C6228p.m27401c(uiComponentHelper.getLayoutInflater());
        TextInputEditText editText = c6228pM27401c.f23718b;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        C0390s.m1453b(textController, editText);
        InputText.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                c6228pM27401c.f23719c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                c6228pM27401c.f23719c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = c6228pM27401c.f23719c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                C12536s.m46884a(inputLayout);
            }
            c6228pM27401c.f23718b.setInputType(m21744e(attributes.getInputType()));
            InputText.AutofillHint autofillHint = attributes.getAutofillHint();
            c6228pM27401c.f23719c.setAutofillHints(autofillHint != null ? m21745f(autofillHint) : null);
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4217c2.m21743d(config, c6228pM27401c);
            }
        });
        TextInputLayout textInputLayoutM27403b = c6228pM27401c.getRoot();
        Intrinsics.checkNotNullExpressionValue(textInputLayoutM27403b, "getRoot(...)");
        return textInputLayoutM27403b;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ TextInputLayout m21742c(InputTextComponent inputTextComponent, C4352y4 c4352y4, InputText inputText, InterfaceC0389r interfaceC0389r, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC0389r = inputTextComponent.getTextController();
        }
        return m21741b(inputTextComponent, c4352y4, inputText, interfaceC0389r);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m21743d(InputText inputText, C6228p c6228p) {
        InputTextBasedComponentStyle styles = inputText.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = c6228p.f23719c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            C7296d0.m30348k(inputLayout, styles);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public static final int m21744e(InputText.InputType inputType) {
        int i10 = a.f18005a[inputType.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 32;
        }
        if (i10 == 3) {
            return 2;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: f */
    public static final String m21745f(InputText.AutofillHint autofillHint) {
        switch (a.f18006b[autofillHint.ordinal()]) {
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
                throw new C7345l();
        }
    }
}
