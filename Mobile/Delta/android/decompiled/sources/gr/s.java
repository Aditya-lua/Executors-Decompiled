package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final PersonaTextInputLayout f18458a;

    @NonNull
    public final PersonaTextInputLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f18459c;

    public s(@NonNull PersonaTextInputLayout personaTextInputLayout, @NonNull PersonaTextInputLayout personaTextInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView) {
        this.f18458a = personaTextInputLayout;
        this.b = personaTextInputLayout2;
        this.f18459c = autoCompleteTextView;
    }

    @NonNull
    public static s a(@NonNull View view) {
        PersonaTextInputLayout personaTextInputLayout = (PersonaTextInputLayout) view;
        int i10 = ar.d.J0;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r5.b.a(view, i10);
        if (autoCompleteTextView != null) {
            return new s(personaTextInputLayout, personaTextInputLayout, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static s c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static s d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(ar.e.f3727t, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersonaTextInputLayout getRoot() {
        return this.f18458a;
    }
}
