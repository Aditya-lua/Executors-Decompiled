package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import zo.e0;
import zo.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f4296a;

    @NonNull
    public final View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4297c;

    public b(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.f4296a = view;
        this.b = view2;
        this.f4297c = frameLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = e0.f37858i;
        View viewA = r5.b.a(view, i10);
        if (viewA != null) {
            i10 = e0.f37862m;
            FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
            if (frameLayout != null) {
                return new b(view, viewA, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(f0.b, viewGroup);
        return a(viewGroup);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f4296a;
    }
}
