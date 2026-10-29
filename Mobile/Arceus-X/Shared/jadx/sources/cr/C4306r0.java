package cr;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0637u0;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputConfirmationCodeComponent;
import fr.C5821a;
import gr.C6215c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.C7776c0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p016an.InterfaceC0389r;
import p201iu.C6988p;
import p226jq.C7259g;
import p226jq.C7262h0;
import p227jr.C7296d0;

/* JADX INFO: renamed from: cr.r0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/EditText;", "editText", "Lkotlin/Function0;", "", "moveToPreviousEditText", "l", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V", "n", "(Landroid/widget/EditText;)V", "", "originalString", "k", "(Landroid/widget/EditText;Ljava/lang/String;)V", "code", "", "editTexts", "j", "(Ljava/lang/String;Ljava/util/List;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4306r0 {

    /* JADX INFO: renamed from: cr.r0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final a f18136a = new a();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof TextInputLayout);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ConstraintLayout m21926f(@NotNull InputConfirmationCodeComponent inputConfirmationCodeComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputConfirmationCode config) {
        final InputConfirmationCodeComponent inputConfirmationCodeComponent2;
        Intrinsics.checkNotNullParameter(inputConfirmationCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6215c c6215cM27349c = C6215c.m27349c(uiComponentHelper.getLayoutInflater());
        String strMo1450b = inputConfirmationCodeComponent.getTextController().mo1450b();
        final List listM31895n = C7699p.m31895n(c6215cM27349c.f23649b.getEditText(), c6215cM27349c.f23652e.getEditText(), c6215cM27349c.f23654g.getEditText(), c6215cM27349c.f23651d.getEditText());
        for (IndexedValue indexedValue : CollectionsKt.m31693S0(listM31895n)) {
            int index = indexedValue.getIndex();
            final EditText editText = (EditText) indexedValue.m31730b();
            final EditText editText2 = (EditText) CollectionsKt.m31708f0(listM31895n, index - 1);
            final EditText editText3 = (EditText) CollectionsKt.m31708f0(listM31895n, index + 1);
            Character chM32215x1 = C7776c0.m32215x1(strMo1450b, index);
            if (chM32215x1 != null) {
                char cCharValue = chM32215x1.charValue();
                if (editText != null) {
                    editText.setText(String.valueOf(cCharValue));
                }
            }
            if (editText != null) {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
                C7262h0.m30282b(editText, new Function1() { // from class: cr.m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4306r0.m21927g(inputConfirmationCodeComponent2, c6215cM27349c, listM31895n, editText, editText2, editText3, (String) obj);
                    }
                });
            } else {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
            }
            if (editText2 != null) {
                m21932l(editText, new Function0() { // from class: cr.n0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4306r0.m21928h(editText2);
                    }
                });
            }
            m21934n(editText);
            inputConfirmationCodeComponent = inputConfirmationCodeComponent2;
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4306r0.m21929i(c6215cM27349c, config);
            }
        });
        ConstraintLayout root = c6215cM27349c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m21927g(InputConfirmationCodeComponent inputConfirmationCodeComponent, C6215c c6215c, List list, EditText editText, EditText editText2, EditText editText3, String newText) {
        Context context;
        Intrinsics.checkNotNullParameter(newText, "newText");
        InterfaceC0389r textController = inputConfirmationCodeComponent.getTextController();
        C5821a c5821a = C5821a.f22221a;
        ConstraintLayout root = c6215c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        textController.mo1451c(c5821a.m26159a(root));
        if (newText.length() >= list.size()) {
            m21930j(newText, list);
        } else if (newText.length() > 1) {
            m21931k(editText, newText);
        } else if (StringsKt.m32182p0(newText) && editText2 != null) {
            editText2.requestFocus();
            editText2.setSelection(editText2.length());
        } else if (!StringsKt.m32182p0(newText) && editText3 != null) {
            editText3.requestFocus();
        } else if (!StringsKt.m32182p0(newText)) {
            inputConfirmationCodeComponent.getSubmitCodeHelper().m26163b().invoke();
            EditText editText4 = c6215c.f23651d.getEditText();
            if (editText4 != null && (context = editText4.getContext()) != null) {
                C7259g.m30270d(context);
            }
            EditText editText5 = c6215c.f23651d.getEditText();
            if (editText5 != null) {
                editText5.clearFocus();
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m21928h(EditText editText) {
        editText.requestFocus();
        editText.setSelection(editText.length());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m21929i(C6215c c6215c, InputConfirmationCode inputConfirmationCode) {
        ConstraintLayout root = c6215c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Sequence<TextInputLayout> sequenceM29388p = C6988p.m29388p(C0637u0.m3198a(root), a.f18136a);
        Intrinsics.m31981d(sequenceM29388p, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (TextInputLayout textInputLayout : sequenceM29388p) {
            InputTextBasedComponentStyle styles = inputConfirmationCode.getStyles();
            if (styles != null) {
                C7296d0.m30348k(textInputLayout, styles);
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m21930j(String str, List<? extends EditText> list) {
        if (str.length() >= list.size()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int length = (str.length() - list.size()) + i10;
                EditText editText = list.get(i10);
                if (editText != null) {
                    editText.setText(String.valueOf(str.charAt(length)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m21931k(EditText editText, String str) {
        if (editText.getSelectionStart() == 1) {
            editText.setText(String.valueOf(C7776c0.m32214w1(str)));
        } else {
            editText.setText(String.valueOf(C7776c0.m32216y1(str)));
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m21932l(final EditText editText, final Function0<Unit> function0) {
        if (editText != null) {
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: cr.q0
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return C4306r0.m21933m(editText, function0, view, i10, keyEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m21933m(EditText editText, Function0 function0, View view, int i10, KeyEvent keyEvent) {
        if (i10 != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() != 0) {
            return false;
        }
        function0.invoke();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static final void m21934n(final EditText editText) {
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: cr.p0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    C4306r0.m21935o(editText, view, z10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m21935o(EditText editText, View view, boolean z10) {
        if (z10) {
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
    }
}
