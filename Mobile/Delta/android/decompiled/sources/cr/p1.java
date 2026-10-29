package cr;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;)Lcom/google/android/material/textfield/TextInputLayout;", "Lgr/m;", "binding", "Lkotlin/Function0;", "", "onCountryInputClick", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lgr/m;Lkotlin/jvm/functions/Function0;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p1 {
    @NotNull
    public static final TextInputLayout c(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull y4 uiComponentHelper, @NotNull final InputPhoneNumber config) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final gr.m mVarC = gr.m.c(uiComponentHelper.getLayoutInflater());
        InputPhoneNumber.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = mVarC.b.getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                mVarC.b.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                mVarC.b.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = mVarC.b;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                wq.s.a(inputLayout);
            }
            EditText editText2 = mVarC.b.getEditText();
            if (editText2 != null) {
                an.s.b(inputPhoneNumberComponent.getTextController(), editText2);
                jq.h0.a(editText2, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
            }
        }
        uiComponentHelper.d(new Function0() { // from class: cr.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p1.d(config, mVarC);
            }
        });
        mVarC.getRoot().setTag(mVarC);
        TextInputLayout root = mVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit d(InputPhoneNumber inputPhoneNumber, gr.m mVar) {
        InputTextBasedComponentStyle styles = inputPhoneNumber.getStyles();
        if (styles != null) {
            TextView prefixTextView = mVar.b.getPrefixTextView();
            Intrinsics.checkNotNullExpressionValue(prefixTextView, "getPrefixTextView(...)");
            jr.h0.l(prefixTextView, styles.getTextBasedStyle(), null, 2, null);
            TextInputLayout inputLayout = mVar.b;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            jr.d0.k(inputLayout, styles);
        }
        return Unit.f22483a;
    }

    public static final void e(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull gr.m binding, @NotNull final Function0<Unit> onCountryInputClick) {
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        binding.b.setPrefixText(er.f.f15752a.i((Option) CollectionsKt.d0(inputPhoneNumberComponent.getCountryCodeOptionsController().b())));
        String selectedCountryCode = inputPhoneNumberComponent.getSelectedCountryCode();
        List<Option> listM = inputPhoneNumberComponent.m();
        if (selectedCountryCode == null && listM.size() == 1) {
            inputPhoneNumberComponent.getCountryCodeOptionsController().c(kotlin.collections.o.d(CollectionsKt.d0(listM)));
        }
        if (inputPhoneNumberComponent.getDisableCountryCodeSelection()) {
            binding.b.getPrefixTextView().setOnClickListener(null);
            binding.b.getPrefixTextView().setClickable(false);
        } else {
            binding.b.getPrefixTextView().setOnClickListener(new View.OnClickListener() { // from class: cr.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p1.f(onCountryInputClick, view);
                }
            });
        }
        TextView prefixTextView = binding.b.getPrefixTextView();
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        prefixTextView.setBackground(er.h.b(context, binding.b.getPrefixTextView().getTextColors().getDefaultColor(), (int) binding.b.getPrefixTextView().getPaint().measureText(String.valueOf(binding.b.getPrefixText())), inputPhoneNumberComponent.getActiveOptionBackgroundColor()));
        EditText editText = binding.b.getEditText();
        if (editText != null) {
            jq.h0.a(editText, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
        }
    }

    public static final void f(Function0 function0, View view) {
        function0.invoke();
    }
}
