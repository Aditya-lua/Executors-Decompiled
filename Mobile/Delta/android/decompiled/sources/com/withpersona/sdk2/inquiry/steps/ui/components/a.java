package com.withpersona.sdk2.inquiry.steps.ui.components;

import an.s;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import cr.MaskTextInputState;
import cr.i1;
import cr.y4;
import gr.q;
import java.util.Iterator;
import java.util.List;
import jr.d0;
import jr.h0;
import jr.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u0019\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "l", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$c;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$e;", "m", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$e;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "j", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgr/q;", "binding", "Lkotlin/Function0;", "", "onCountryInputClick", "onIdTypeInputClick", "", "countryError", "idTypeError", "valueError", "n", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;Lgr/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    @NotNull
    public static final ConstraintLayout j(@NotNull InputInternationalDbComponent inputInternationalDbComponent, @NotNull y4 uiComponentHelper, @NotNull final InputInternationalDb config) {
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final q qVarC = q.c(uiComponentHelper.getLayoutInflater());
        InputInternationalDb.Attributes attributes = config.getAttributes();
        qVarC.f18452h.setText(attributes != null ? attributes.getLabel() : null);
        qVarC.f18447c.setHint(attributes != null ? attributes.getLabelIdbCountry() : null);
        qVarC.f18450f.setHint(attributes != null ? attributes.getLabelIdbType() : null);
        qVarC.f18453i.setHint(attributes != null ? attributes.getLabelIdbValue() : null);
        EditText editText = qVarC.f18453i.getEditText();
        if (editText != null) {
            s.b(inputInternationalDbComponent.getIdValueController(), editText);
        }
        uiComponentHelper.d(new Function0() { // from class: cr.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.steps.ui.components.a.k(config, qVarC);
            }
        });
        qVarC.getRoot().setTag(qVarC);
        ConstraintLayout root = qVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit k(InputInternationalDb inputInternationalDb, q qVar) {
        InputInternationalDb.InputInternationalDbComponentStyle styles = inputInternationalDb.getStyles();
        if (styles != null) {
            InputSelectComponentStyle inputSelectStyle = styles.getInputSelectStyle();
            if (inputSelectStyle != null) {
                TextInputLayout idbCountryInput = qVar.f18447c;
                Intrinsics.checkNotNullExpressionValue(idbCountryInput, "idbCountryInput");
                o.i(idbCountryInput, inputSelectStyle);
                TextInputLayout idbIdTypeInput = qVar.f18450f;
                Intrinsics.checkNotNullExpressionValue(idbIdTypeInput, "idbIdTypeInput");
                o.i(idbIdTypeInput, inputSelectStyle);
            }
            InputTextBasedComponentStyle inputTextStyle = styles.getInputTextStyle();
            if (inputTextStyle != null) {
                TextInputLayout idbValueInput = qVar.f18453i;
                Intrinsics.checkNotNullExpressionValue(idbValueInput, "idbValueInput");
                d0.k(idbValueInput, inputTextStyle);
            }
            TextBasedComponentStyle textStyle = styles.getTextStyle();
            if (textStyle != null) {
                TextView idbDescription = qVar.f18449e;
                Intrinsics.checkNotNullExpressionValue(idbDescription, "idbDescription");
                h0.l(idbDescription, textStyle, null, 2, null);
            }
        }
        return Unit.f22483a;
    }

    public static final Option l(InputInternationalDbComponent.CountryOption countryOption) {
        return new Option(countryOption.getCountryName(), countryOption.getCountryCode(), null, 4, null);
    }

    public static final Option m(InputInternationalDbComponent.IdOption idOption) {
        return new Option(idOption.getName(), idOption.getIdType(), null, 4, null);
    }

    public static final void n(@NotNull InputInternationalDbComponent inputInternationalDbComponent, @NotNull q binding, @NotNull final Function0<Unit> onCountryInputClick, @NotNull final Function0<Unit> onIdTypeInputClick, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        InputInternationalDb.IdType idType;
        Object next;
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        Intrinsics.checkNotNullParameter(onIdTypeInputClick, "onIdTypeInputClick");
        EditText editText = binding.f18447c.getEditText();
        if (editText != null) {
            editText.setText(CollectionsKt.m0(inputInternationalDbComponent.getCountryOptionsController().b(), "\n", null, null, 0, null, new Function1() { // from class: cr.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.steps.ui.components.a.s((Option) obj);
                }
            }, 30, null));
        }
        EditText editText2 = binding.f18450f.getEditText();
        if (editText2 != null) {
            editText2.setText(CollectionsKt.m0(inputInternationalDbComponent.getIdTypeOptionsController().b(), "\n", null, null, 0, null, new Function1() { // from class: cr.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.steps.ui.components.a.t((Option) obj);
                }
            }, 30, null));
        }
        String selectedCountry = inputInternationalDbComponent.getSelectedCountry();
        String selectedIdType = inputInternationalDbComponent.getSelectedIdType();
        List<InputInternationalDbComponent.CountryOption> listJ = inputInternationalDbComponent.j();
        List<InputInternationalDbComponent.IdOption> listR = inputInternationalDbComponent.r();
        boolean hideCountryField = inputInternationalDbComponent.getHideCountryField();
        boolean hideIdTypeField = inputInternationalDbComponent.getHideIdTypeField();
        if (selectedCountry == null) {
            binding.f18450f.setEnabled(false);
        } else {
            binding.f18450f.setEnabled(true);
        }
        if (selectedCountry == null && listJ != null && listJ.size() == 1) {
            inputInternationalDbComponent.getCountryOptionsController().c(kotlin.collections.o.d(l((InputInternationalDbComponent.CountryOption) CollectionsKt.d0(listJ))));
            if (Intrinsics.c(inputInternationalDbComponent.getHideCountryIfSingleChoice(), Boolean.TRUE)) {
                hideCountryField = true;
            }
        }
        if (selectedCountry != null && listR != null && listR.size() == 1) {
            inputInternationalDbComponent.getIdTypeOptionsController().c(kotlin.collections.o.d(m((InputInternationalDbComponent.IdOption) CollectionsKt.d0(listR))));
            if (Intrinsics.c(inputInternationalDbComponent.getHideTypeIfSingleChoice(), Boolean.TRUE)) {
                hideIdTypeField = true;
            }
        }
        binding.f18447c.setVisibility(hideCountryField ? 8 : 0);
        binding.f18450f.setVisibility(hideIdTypeField ? 8 : 0);
        if (selectedCountry == null || selectedIdType == null) {
            binding.f18453i.setEnabled(false);
            binding.f18449e.setVisibility(8);
        } else {
            binding.f18453i.setEnabled(true);
            List<InputInternationalDb.IdType> listG = inputInternationalDbComponent.g();
            if (listG != null) {
                Iterator<T> it = listG.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InputInternationalDb.IdType idType2 = (InputInternationalDb.IdType) next;
                    if (Intrinsics.c(idType2.getCountryCode(), selectedCountry) && Intrinsics.c(idType2.getIdType(), selectedIdType)) {
                        break;
                    }
                }
                idType = (InputInternationalDb.IdType) next;
            } else {
                idType = null;
            }
            TextInputLayout idbValueInput = binding.f18453i;
            Intrinsics.checkNotNullExpressionValue(idbValueInput, "idbValueInput");
            i1.d(idbValueInput, new MaskTextInputState(null, idType != null ? idType.getMask() : null, idType != null ? idType.getSecure() : null, null, idType != null ? idType.getPlaceholder() : null));
            String description = idType != null ? idType.getDescription() : null;
            if (description == null || StringsKt.p0(description)) {
                binding.f18449e.setVisibility(8);
            } else {
                binding.f18449e.setVisibility(0);
                binding.f18449e.setText(idType != null ? idType.getDescription() : null);
            }
        }
        binding.f18447c.setOnClickListener(new View.OnClickListener() { // from class: cr.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.steps.ui.components.a.o(onCountryInputClick, view);
            }
        });
        EditText editText3 = binding.f18447c.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: cr.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.steps.ui.components.a.p(onCountryInputClick, view);
                }
            });
        }
        binding.f18450f.setOnClickListener(new View.OnClickListener() { // from class: cr.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.steps.ui.components.a.q(onIdTypeInputClick, view);
            }
        });
        EditText editText4 = binding.f18450f.getEditText();
        if (editText4 != null) {
            editText4.setOnClickListener(new View.OnClickListener() { // from class: cr.f1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.steps.ui.components.a.r(onIdTypeInputClick, view);
                }
            });
        }
        binding.f18447c.setError(str);
        binding.f18450f.setError(str2);
        binding.f18453i.setError(str3);
    }

    public static final void o(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void p(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void q(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void r(Function0 function0, View view) {
        function0.invoke();
    }

    public static final CharSequence s(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    public static final CharSequence t(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }
}
