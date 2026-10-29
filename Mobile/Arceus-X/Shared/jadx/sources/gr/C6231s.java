package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import ar.C1149d;
import ar.C1150e;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaTextInputLayout;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C6231s implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final PersonaTextInputLayout f23734a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PersonaTextInputLayout f23735b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AutoCompleteTextView f23736c;

    public C6231s(@NonNull PersonaTextInputLayout personaTextInputLayout, @NonNull PersonaTextInputLayout personaTextInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView) {
        this.f23734a = personaTextInputLayout;
        this.f23735b = personaTextInputLayout2;
        this.f23736c = autoCompleteTextView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6231s m27411a(@NonNull View view) {
        PersonaTextInputLayout personaTextInputLayout = (PersonaTextInputLayout) view;
        int i10 = C1149d.f4788J0;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) C10785b.m41116a(view, i10);
        if (autoCompleteTextView != null) {
            return new C6231s(personaTextInputLayout, personaTextInputLayout, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6231s m27412c(@NonNull LayoutInflater layoutInflater) {
        return m27413d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6231s m27413d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4882t, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27411a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersonaTextInputLayout getRoot() {
        return this.f23734a;
    }
}
