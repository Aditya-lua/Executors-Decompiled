package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4085a;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import cr.C4253i1;
import cr.C4352y4;
import cr.MaskTextInputState;
import gr.C6229q;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0390s;
import p227jr.C7296d0;
import p227jr.C7304h0;
import p227jr.C7311o;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u0019\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "l", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$c;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$e;", "m", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$e;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcr/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "j", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgr/q;", "binding", "Lkotlin/Function0;", "", "onCountryInputClick", "onIdTypeInputClick", "", "countryError", "idTypeError", "valueError", "n", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;Lgr/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4085a {
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final ConstraintLayout m20873j(@NotNull InputInternationalDbComponent inputInternationalDbComponent, @NotNull C4352y4 uiComponentHelper, @NotNull final InputInternationalDb config) {
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final C6229q c6229qM27405c = C6229q.m27405c(uiComponentHelper.getLayoutInflater());
        InputInternationalDb.Attributes attributes = config.getAttributes();
        c6229qM27405c.f23727h.setText(attributes != null ? attributes.getLabel() : null);
        c6229qM27405c.f23722c.setHint(attributes != null ? attributes.getLabelIdbCountry() : null);
        c6229qM27405c.f23725f.setHint(attributes != null ? attributes.getLabelIdbType() : null);
        c6229qM27405c.f23728i.setHint(attributes != null ? attributes.getLabelIdbValue() : null);
        EditText editText = c6229qM27405c.f23728i.getEditText();
        if (editText != null) {
            C0390s.m1453b(inputInternationalDbComponent.getIdValueController(), editText);
        }
        uiComponentHelper.m22002d(new Function0() { // from class: cr.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4085a.m20874k(config, c6229qM27405c);
            }
        });
        c6229qM27405c.getRoot().setTag(c6229qM27405c);
        ConstraintLayout root = c6229qM27405c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m20874k(InputInternationalDb inputInternationalDb, C6229q c6229q) {
        InputInternationalDb.InputInternationalDbComponentStyle styles = inputInternationalDb.getStyles();
        if (styles != null) {
            InputSelectComponentStyle inputSelectStyle = styles.getInputSelectStyle();
            if (inputSelectStyle != null) {
                TextInputLayout idbCountryInput = c6229q.f23722c;
                Intrinsics.checkNotNullExpressionValue(idbCountryInput, "idbCountryInput");
                C7311o.m30401i(idbCountryInput, inputSelectStyle);
                TextInputLayout idbIdTypeInput = c6229q.f23725f;
                Intrinsics.checkNotNullExpressionValue(idbIdTypeInput, "idbIdTypeInput");
                C7311o.m30401i(idbIdTypeInput, inputSelectStyle);
            }
            InputTextBasedComponentStyle inputTextStyle = styles.getInputTextStyle();
            if (inputTextStyle != null) {
                TextInputLayout idbValueInput = c6229q.f23728i;
                Intrinsics.checkNotNullExpressionValue(idbValueInput, "idbValueInput");
                C7296d0.m30348k(idbValueInput, inputTextStyle);
            }
            TextBasedComponentStyle textStyle = styles.getTextStyle();
            if (textStyle != null) {
                TextView idbDescription = c6229q.f23724e;
                Intrinsics.checkNotNullExpressionValue(idbDescription, "idbDescription");
                C7304h0.m30392l(idbDescription, textStyle, null, 2, null);
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Option m20875l(InputInternationalDbComponent.CountryOption countryOption) {
        return new Option(countryOption.getCountryName(), countryOption.getCountryCode(), null, 4, null);
    }

    /* JADX INFO: renamed from: m */
    public static final Option m20876m(InputInternationalDbComponent.IdOption idOption) {
        return new Option(idOption.getName(), idOption.getIdType(), null, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public static final void m20877n(@NotNull InputInternationalDbComponent inputInternationalDbComponent, @NotNull C6229q binding, @NotNull final Function0<Unit> onCountryInputClick, @NotNull final Function0<Unit> onIdTypeInputClick, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        InputInternationalDb.IdType idType;
        Object next;
        Intrinsics.checkNotNullParameter(inputInternationalDbComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        Intrinsics.checkNotNullParameter(onIdTypeInputClick, "onIdTypeInputClick");
        EditText editText = binding.f23722c.getEditText();
        if (editText != null) {
            editText.setText(CollectionsKt.m31715m0(inputInternationalDbComponent.getCountryOptionsController().m24146b(), "\n", null, null, 0, null, new Function1() { // from class: cr.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4085a.m20882s((Option) obj);
                }
            }, 30, null));
        }
        EditText editText2 = binding.f23725f.getEditText();
        if (editText2 != null) {
            editText2.setText(CollectionsKt.m31715m0(inputInternationalDbComponent.getIdTypeOptionsController().m24146b(), "\n", null, null, 0, null, new Function1() { // from class: cr.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4085a.m20883t((Option) obj);
                }
            }, 30, null));
        }
        String selectedCountry = inputInternationalDbComponent.getSelectedCountry();
        String selectedIdType = inputInternationalDbComponent.getSelectedIdType();
        List<InputInternationalDbComponent.CountryOption> listM20707j = inputInternationalDbComponent.m20707j();
        List<InputInternationalDbComponent.IdOption> listM20714r = inputInternationalDbComponent.m20714r();
        boolean hideCountryField = inputInternationalDbComponent.getHideCountryField();
        boolean hideIdTypeField = inputInternationalDbComponent.getHideIdTypeField();
        if (selectedCountry == null) {
            binding.f23725f.setEnabled(false);
        } else {
            binding.f23725f.setEnabled(true);
        }
        if (selectedCountry == null && listM20707j != null && listM20707j.size() == 1) {
            inputInternationalDbComponent.getCountryOptionsController().m24147c(C7697o.m31878d(m20875l((InputInternationalDbComponent.CountryOption) CollectionsKt.m31706d0(listM20707j))));
            if (Intrinsics.m31980c(inputInternationalDbComponent.getHideCountryIfSingleChoice(), Boolean.TRUE)) {
                hideCountryField = true;
            }
        }
        if (selectedCountry != null && listM20714r != null && listM20714r.size() == 1) {
            inputInternationalDbComponent.getIdTypeOptionsController().m24147c(C7697o.m31878d(m20876m((InputInternationalDbComponent.IdOption) CollectionsKt.m31706d0(listM20714r))));
            if (Intrinsics.m31980c(inputInternationalDbComponent.getHideTypeIfSingleChoice(), Boolean.TRUE)) {
                hideIdTypeField = true;
            }
        }
        binding.f23722c.setVisibility(hideCountryField ? 8 : 0);
        binding.f23725f.setVisibility(hideIdTypeField ? 8 : 0);
        if (selectedCountry == null || selectedIdType == null) {
            binding.f23728i.setEnabled(false);
            binding.f23724e.setVisibility(8);
        } else {
            binding.f23728i.setEnabled(true);
            List<InputInternationalDb.IdType> listM20706g = inputInternationalDbComponent.m20706g();
            if (listM20706g != null) {
                Iterator<T> it = listM20706g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InputInternationalDb.IdType idType2 = (InputInternationalDb.IdType) next;
                    if (Intrinsics.m31980c(idType2.getCountryCode(), selectedCountry) && Intrinsics.m31980c(idType2.getIdType(), selectedIdType)) {
                        break;
                    }
                }
                idType = (InputInternationalDb.IdType) next;
            } else {
                idType = null;
            }
            TextInputLayout idbValueInput = binding.f23728i;
            Intrinsics.checkNotNullExpressionValue(idbValueInput, "idbValueInput");
            C4253i1.m21781d(idbValueInput, new MaskTextInputState(null, idType != null ? idType.getMask() : null, idType != null ? idType.getSecure() : null, null, idType != null ? idType.getPlaceholder() : null));
            String description = idType != null ? idType.getDescription() : null;
            if (description == null || StringsKt.m32182p0(description)) {
                binding.f23724e.setVisibility(8);
            } else {
                binding.f23724e.setVisibility(0);
                binding.f23724e.setText(idType != null ? idType.getDescription() : null);
            }
        }
        binding.f23722c.setOnClickListener(new View.OnClickListener() { // from class: cr.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4085a.m20878o(onCountryInputClick, view);
            }
        });
        EditText editText3 = binding.f23722c.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: cr.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4085a.m20879p(onCountryInputClick, view);
                }
            });
        }
        binding.f23725f.setOnClickListener(new View.OnClickListener() { // from class: cr.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4085a.m20880q(onIdTypeInputClick, view);
            }
        });
        EditText editText4 = binding.f23725f.getEditText();
        if (editText4 != null) {
            editText4.setOnClickListener(new View.OnClickListener() { // from class: cr.f1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4085a.m20881r(onIdTypeInputClick, view);
                }
            });
        }
        binding.f23722c.setError(str);
        binding.f23725f.setError(str2);
        binding.f23728i.setError(str3);
    }

    /* JADX INFO: renamed from: o */
    public static final void m20878o(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: p */
    public static final void m20879p(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: q */
    public static final void m20880q(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: r */
    public static final void m20881r(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: s */
    public static final CharSequence m20882s(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: renamed from: t */
    public static final CharSequence m20883t(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }
}
