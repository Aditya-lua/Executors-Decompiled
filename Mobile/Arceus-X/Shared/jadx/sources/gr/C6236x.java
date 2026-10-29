package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ar.C1150e;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaTextView;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C6236x implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final PersonaTextView f23749a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PersonaTextView f23750b;

    public C6236x(@NonNull PersonaTextView personaTextView, @NonNull PersonaTextView personaTextView2) {
        this.f23749a = personaTextView;
        this.f23750b = personaTextView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6236x m27431a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PersonaTextView personaTextView = (PersonaTextView) view;
        return new C6236x(personaTextView, personaTextView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6236x m27432c(@NonNull LayoutInflater layoutInflater) {
        return m27433d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6236x m27433d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4887y, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27431a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersonaTextView getRoot() {
        return this.f23749a;
    }
}
