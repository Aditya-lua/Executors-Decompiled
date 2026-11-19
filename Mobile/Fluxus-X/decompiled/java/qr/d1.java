package qr;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.IndexedValue;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.sequences.Sequence;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Lqr/z5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/EditText;", "editText", "Lkotlin/Function0;", BuildConfig.FLAVOR, "moveToPreviousEditText", "l", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V", "n", "(Landroid/widget/EditText;)V", BuildConfig.FLAVOR, "originalString", "k", "(Landroid/widget/EditText;Ljava/lang/String;)V", "code", BuildConfig.FLAVOR, "editTexts", "j", "(Ljava/lang/String;Ljava/util/List;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30254a = new a();

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof TextInputLayout);
        }
    }

    @NotNull
    public static final ConstraintLayout f(@NotNull InputConfirmationCodeComponent inputConfirmationCodeComponent, @NotNull z5 uiComponentHelper, @NotNull final InputConfirmationCode config) {
        final InputConfirmationCodeComponent inputConfirmationCodeComponent2;
        Intrinsics.checkNotNullParameter(inputConfirmationCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final ur.c cVarC = ur.c.c(uiComponentHelper.getLayoutInflater());
        String strB = inputConfirmationCodeComponent.getTextController().b();
        final List listN = p001kotlin.collections.p.n(cVarC.b.getEditText(), cVarC.f33859e.getEditText(), cVarC.f33861g.getEditText(), cVarC.f33858d.getEditText());
        for (IndexedValue indexedValue : CollectionsKt.S0(listN)) {
            int index = indexedValue.getIndex();
            final EditText editText = (EditText) indexedValue.b();
            final EditText editText2 = (EditText) CollectionsKt.f0(listN, index - 1);
            final EditText editText3 = (EditText) CollectionsKt.f0(listN, index + 1);
            Character chV1 = p001kotlin.text.c0.v1(strB, index);
            if (chV1 != null) {
                char cCharValue = chV1.charValue();
                if (editText != null) {
                    editText.setText(String.valueOf(cCharValue));
                }
            }
            if (editText != null) {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
                xq.h0.b(editText, new Function1() { // from class: qr.y0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d1.g(inputConfirmationCodeComponent2, cVarC, listN, editText, editText2, editText3, (String) obj);
                    }
                });
            } else {
                inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
            }
            if (editText2 != null) {
                l(editText, new Function0() { // from class: qr.z0
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d1.h(editText2);
                    }
                });
            }
            n(editText);
            inputConfirmationCodeComponent = inputConfirmationCodeComponent2;
        }
        uiComponentHelper.d(new Function0() { // from class: qr.a1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d1.i(cVarC, config);
            }
        });
        ConstraintLayout root = cVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit g(InputConfirmationCodeComponent inputConfirmationCodeComponent, ur.c cVar, List list, EditText editText, EditText editText2, EditText editText3, String newText) {
        Context context;
        Intrinsics.checkNotNullParameter(newText, "newText");
        nn.s textController = inputConfirmationCodeComponent.getTextController();
        tr.a aVar = tr.a.f32836a;
        ConstraintLayout root = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        textController.c(aVar.a(root));
        if (newText.length() >= list.size()) {
            j(newText, list);
        } else if (newText.length() > 1) {
            k(editText, newText);
        } else if (StringsKt.p0(newText) && editText2 != null) {
            editText2.requestFocus();
            editText2.setSelection(editText2.length());
        } else if (!StringsKt.p0(newText) && editText3 != null) {
            editText3.requestFocus();
        } else if (!StringsKt.p0(newText)) {
            inputConfirmationCodeComponent.getSubmitCodeHelper().b().invoke();
            EditText editText4 = cVar.f33858d.getEditText();
            if (editText4 != null && (context = editText4.getContext()) != null) {
                xq.g.d(context);
            }
            EditText editText5 = cVar.f33858d.getEditText();
            if (editText5 != null) {
                editText5.clearFocus();
            }
        }
        return Unit.f21506a;
    }

    public static final Unit h(EditText editText) {
        editText.requestFocus();
        editText.setSelection(editText.length());
        return Unit.f21506a;
    }

    public static final Unit i(ur.c cVar, InputConfirmationCode inputConfirmationCode) {
        ConstraintLayout root = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Sequence<TextInputLayout> sequenceP = yu.p.p(androidx.core.view.u0.a(root), a.f30254a);
        Intrinsics.d(sequenceP, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        for (TextInputLayout textInputLayout : sequenceP) {
            InputTextBasedComponentStyle styles = inputConfirmationCode.getStyles();
            if (styles != null) {
                yr.d0.k(textInputLayout, styles);
            }
        }
        return Unit.f21506a;
    }

    public static final void j(String str, List<? extends EditText> list) {
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

    public static final void k(EditText editText, String str) {
        if (editText.getSelectionStart() == 1) {
            editText.setText(String.valueOf(p001kotlin.text.c0.u1(str)));
        } else {
            editText.setText(String.valueOf(p001kotlin.text.c0.w1(str)));
        }
    }

    public static final void l(final EditText editText, final Function0<Unit> function0) {
        if (editText != null) {
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: qr.c1
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return d1.m(editText, function0, view, i10, keyEvent);
                }
            });
        }
    }

    public static final boolean m(EditText editText, Function0 function0, View view, int i10, KeyEvent keyEvent) {
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

    public static final void n(final EditText editText) {
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: qr.b1
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    d1.o(editText, view, z10);
                }
            });
        }
    }

    public static final void o(EditText editText, View view, boolean z10) {
        if (z10) {
            Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        }
    }
}
