package cr;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputNumberComponent;
import gr.C6224l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7796w;
import org.jetbrains.annotations.NotNull;
import p227jr.C7296d0;
import p526wq.C12536s;

/* JADX INFO: renamed from: cr.m1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4277m1 {

    /* JADX INFO: renamed from: cr.m1$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m31665d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", Text.type, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InputNumberComponent f18092a;

        public a(InputNumberComponent inputNumberComponent) {
            this.f18092a = inputNumberComponent;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            String string;
            this.f18092a.getNumberController().m24142c((s8 == null || (string = s8.toString()) == null) ? null : C7796w.m32289r(string));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final TextInputLayout m21829b(@NotNull InputNumberComponent inputNumberComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputNumber config) {
        Intrinsics.checkNotNullParameter(inputNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6224l c6224lM27385c = C6224l.m27385c(uiComponentHelper.getLayoutInflater());
        InputNumber.Attributes attributes = config.getAttributes();
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
            Integer precision = attributes.getPrecision();
            if (precision != null) {
                int iIntValue = precision.intValue();
                EditText editText = c6224lM27385c.f23707c.getEditText();
                if (editText != null) {
                    editText.setFilters(new C4281n[]{new C4281n(iIntValue)});
                }
            }
        }
        c6224lM27385c.f23706b.setText(String.valueOf(inputNumberComponent.getNumberController().m24141b()));
        TextInputEditText editText2 = c6224lM27385c.f23706b;
        Intrinsics.checkNotNullExpressionValue(editText2, "editText");
        editText2.addTextChangedListener(new a(inputNumberComponent));
        uiComponentHelper.m22002d(new Function0() { // from class: cr.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4277m1.m21830c(config, c6224lM27385c);
            }
        });
        TextInputLayout root = c6224lM27385c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m21830c(InputNumber inputNumber, C6224l c6224l) {
        InputTextBasedComponentStyle styles = inputNumber.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = c6224l.f23707c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            C7296d0.m30348k(inputLayout, styles);
        }
        return Unit.f29331a;
    }
}
