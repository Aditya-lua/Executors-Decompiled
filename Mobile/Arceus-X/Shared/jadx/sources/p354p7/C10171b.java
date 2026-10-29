package p354p7;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: p7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C10171b implements InterfaceC10175f {
    @Override // p354p7.InterfaceC10175f
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC10173d mo39187a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C10170a(httpURLConnection);
    }
}
