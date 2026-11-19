package o2;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class b extends x8.a<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f26724e;

    public b() {
        super("Parameter");
    }

    @NonNull
    public b l(@NonNull String... strArr) {
        this.f26724e = strArr;
        return b("value", strArr);
    }
}
