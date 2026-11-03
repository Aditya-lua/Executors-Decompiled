package yn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import xn.n2;
import xn.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f36910a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f36911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f36912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f36913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f36914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f36915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f36916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f36917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f36918j;

    public c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline3, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView3) {
        this.f36910a = coordinatorLayout;
        this.b = textView;
        this.f36911c = guideline;
        this.f36912d = textView2;
        this.f36913e = guideline2;
        this.f36914f = pi2NavigationBar;
        this.f36915g = recyclerView;
        this.f36916h = guideline3;
        this.f36917i = personaMaterialButton;
        this.f36918j = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = n2.f35896c;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = n2.f35897d;
            Guideline guideline = (Guideline) r5.b.a(view, i10);
            if (guideline != null) {
                i10 = n2.f35902i;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = n2.f35903j;
                    Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                    if (guideline2 != null) {
                        i10 = n2.f35908o;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = n2.f35911r;
                            RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                            if (recyclerView != null) {
                                i10 = n2.f35912s;
                                Guideline guideline3 = (Guideline) r5.b.a(view, i10);
                                if (guideline3 != null) {
                                    i10 = n2.f35913t;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = n2.f35914u;
                                        TextView textView3 = (TextView) r5.b.a(view, i10);
                                        if (textView3 != null) {
                                            return new c((CoordinatorLayout) view, textView, guideline, textView2, guideline2, pi2NavigationBar, recyclerView, guideline3, personaMaterialButton, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o2.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f36910a;
    }
}
