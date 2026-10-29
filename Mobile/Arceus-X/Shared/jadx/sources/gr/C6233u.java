package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ar.C1150e;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaTextView;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C6233u implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final PersonaTextView f23738a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final PersonaTextView f23739b;

    public C6233u(@NonNull PersonaTextView personaTextView, @NonNull PersonaTextView personaTextView2) {
        this.f23738a = personaTextView;
        this.f23739b = personaTextView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6233u m27419a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PersonaTextView personaTextView = (PersonaTextView) view;
        return new C6233u(personaTextView, personaTextView);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6233u m27420c(@NonNull LayoutInflater layoutInflater) {
        return m27421d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6233u m27421d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4884v, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27419a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PersonaTextView getRoot() {
        return this.f23738a;
    }
}
