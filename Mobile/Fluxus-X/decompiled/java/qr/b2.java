package qr;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;)Lcom/google/android/material/textfield/TextInputLayout;", "Lur/m;", "binding", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onCountryInputClick", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lur/m;Lkotlin/jvm/functions/Function0;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b2 {
    @NotNull
    public static final TextInputLayout c(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull z5 uiComponentHelper, @NotNull final InputPhoneNumber config) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.m mVarC = ur.m.c(uiComponentHelper.getLayoutInflater());
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
                kr.t.a(inputLayout);
            }
            EditText editText2 = mVarC.b.getEditText();
            if (editText2 != null) {
                nn.t.b(inputPhoneNumberComponent.getTextController(), editText2);
                xq.h0.a(editText2, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
            }
        }
        uiComponentHelper.d(new Function0() { // from class: qr.a2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b2.d(config, mVarC);
            }
        });
        mVarC.getRoot().setTag(mVarC);
        TextInputLayout root = mVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit d(InputPhoneNumber inputPhoneNumber, ur.m mVar) {
        InputTextBasedComponentStyle styles = inputPhoneNumber.getStyles();
        if (styles != null) {
            TextView prefixTextView = mVar.b.getPrefixTextView();
            Intrinsics.checkNotNullExpressionValue(prefixTextView, "getPrefixTextView(...)");
            yr.h0.l(prefixTextView, styles.getTextBasedStyle(), null, 2, null);
            TextInputLayout inputLayout = mVar.b;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            yr.d0.k(inputLayout, styles);
        }
        return Unit.f21506a;
    }

    public static final void e(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull ur.m binding, @NotNull final Function0<Unit> onCountryInputClick) {
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        binding.b.setPrefixText(sr.f.f31881a.i((Option) CollectionsKt.d0(inputPhoneNumberComponent.getCountryCodeOptionsController().b())));
        String selectedCountryCode = inputPhoneNumberComponent.getSelectedCountryCode();
        List<Option> listL = inputPhoneNumberComponent.l();
        if (selectedCountryCode == null && listL.size() == 1) {
            inputPhoneNumberComponent.getCountryCodeOptionsController().c(p001kotlin.collections.o.d(CollectionsKt.d0(listL)));
        }
        if (inputPhoneNumberComponent.getDisableCountryCodeSelection()) {
            binding.b.getPrefixTextView().setOnClickListener(null);
            binding.b.getPrefixTextView().setClickable(false);
        } else {
            binding.b.getPrefixTextView().setOnClickListener(new View.OnClickListener() { // from class: qr.z1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b2.f(onCountryInputClick, view);
                }
            });
        }
        TextView prefixTextView = binding.b.getPrefixTextView();
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        prefixTextView.setBackground(sr.h.b(context, binding.b.getPrefixTextView().getTextColors().getDefaultColor(), (int) binding.b.getPrefixTextView().getPaint().measureText(String.valueOf(binding.b.getPrefixText())), inputPhoneNumberComponent.getActiveOptionBackgroundColor()));
        EditText editText = binding.b.getEditText();
        if (editText != null) {
            xq.h0.a(editText, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
        }
    }

    public static final void f(Function0 function0, View view) {
        function0.invoke();
    }
}
