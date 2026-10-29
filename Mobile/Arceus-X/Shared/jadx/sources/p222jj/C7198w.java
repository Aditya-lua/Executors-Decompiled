package p222jj;

import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.datastructures.NameValuePair;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: jj.w */
/* JADX INFO: loaded from: classes2.dex */
public class C7198w {
    /* JADX INFO: renamed from: a */
    public static List<NameValuePair> m30118a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS");
        if (bundleExtra != null) {
            for (String str : bundleExtra.keySet()) {
                arrayList.add(new NameValuePair(str, bundleExtra.getString(str)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m30119b(String str) {
        try {
            return str.equals(UUID.fromString(str).toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return false;
        }
    }
}
