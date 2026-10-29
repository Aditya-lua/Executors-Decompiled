package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ar.C1150e;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaTextView;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C6237y implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final PersonaTextView f23751a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PersonaTextView f23752b;

    public C6237y(@NonNull PersonaTextView personaTextView, @NonNull PersonaTextView personaTextView2) {
        this.f23751a = personaTextView;
        this.f23752b = personaTextView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6237y m27435a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PersonaTextView personaTextView = (PersonaTextView) view;
        return new C6237y(personaTextView, personaTextView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6237y m27436c(@NonNull LayoutInflater layoutInflater) {
        return m27437d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6237y m27437d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4888z, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27435a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersonaTextView getRoot() {
        return this.f23751a;
    }
}
