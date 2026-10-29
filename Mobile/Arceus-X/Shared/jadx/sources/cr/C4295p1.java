package cr;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import er.C5197f;
import er.C5199h;
import gr.C6225m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016an.C0390s;
import p226jq.C7262h0;
import p227jr.C7296d0;
import p227jr.C7304h0;
import p526wq.C12536s;

/* JADX INFO: renamed from: cr.p1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;)Lcom/google/android/material/textfield/TextInputLayout;", "Lgr/m;", "binding", "Lkotlin/Function0;", "", "onCountryInputClick", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lgr/m;Lkotlin/jvm/functions/Function0;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4295p1 {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final TextInputLayout m21836c(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputPhoneNumber config) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6225m c6225mM27389c = C6225m.m27389c(uiComponentHelper.getLayoutInflater());
        InputPhoneNumber.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = c6225mM27389c.f23709b.getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                c6225mM27389c.f23709b.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                c6225mM27389c.f23709b.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = c6225mM27389c.f23709b;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                C12536s.m46884a(inputLayout);
            }
            EditText editText2 = c6225mM27389c.f23709b.getEditText();
            if (editText2 != null) {
                C0390s.m1453b(inputPhoneNumberComponent.getTextController(), editText2);
                C7262h0.m30281a(editText2, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
            }
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4295p1.m21837d(config, c6225mM27389c);
            }
        });
        c6225mM27389c.getRoot().setTag(c6225mM27389c);
        TextInputLayout root = c6225mM27389c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m21837d(InputPhoneNumber inputPhoneNumber, C6225m c6225m) {
        InputTextBasedComponentStyle styles = inputPhoneNumber.getStyles();
        if (styles != null) {
            TextView prefixTextView = c6225m.f23709b.getPrefixTextView();
            Intrinsics.checkNotNullExpressionValue(prefixTextView, "getPrefixTextView(...)");
            C7304h0.m30392l(prefixTextView, styles.getTextBasedStyle(), null, 2, null);
            TextInputLayout inputLayout = c6225m.f23709b;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            C7296d0.m30348k(inputLayout, styles);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m21838e(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull C6225m binding, @NotNull final Function0<Unit> onCountryInputClick) {
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        binding.f23709b.setPrefixText(C5197f.f20219a.m24111i((Option) CollectionsKt.m31706d0(inputPhoneNumberComponent.getCountryCodeOptionsController().m24146b())));
        String selectedCountryCode = inputPhoneNumberComponent.getSelectedCountryCode();
        List<Option> listM20760m = inputPhoneNumberComponent.m20760m();
        if (selectedCountryCode == null && listM20760m.size() == 1) {
            inputPhoneNumberComponent.getCountryCodeOptionsController().m24147c(C7697o.m31878d(CollectionsKt.m31706d0(listM20760m)));
        }
        if (inputPhoneNumberComponent.getDisableCountryCodeSelection()) {
            binding.f23709b.getPrefixTextView().setOnClickListener(null);
            binding.f23709b.getPrefixTextView().setClickable(false);
        } else {
            binding.f23709b.getPrefixTextView().setOnClickListener(new View.OnClickListener() { // from class: cr.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4295p1.m21839f(onCountryInputClick, view);
                }
            });
        }
        TextView prefixTextView = binding.f23709b.getPrefixTextView();
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        prefixTextView.setBackground(C5199h.m24126b(context, binding.f23709b.getPrefixTextView().getTextColors().getDefaultColor(), (int) binding.f23709b.getPrefixTextView().getPaint().measureText(String.valueOf(binding.f23709b.getPrefixText())), inputPhoneNumberComponent.getActiveOptionBackgroundColor()));
        EditText editText = binding.f23709b.getEditText();
        if (editText != null) {
            C7262h0.m30281a(editText, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m21839f(Function0 function0, View view) {
        function0.invoke();
    }
}
