package jj;

import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.datastructures.NameValuePair;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class w {
    public static List<NameValuePair> a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS");
        if (bundleExtra != null) {
            for (String str : bundleExtra.keySet()) {
                arrayList.add(new NameValuePair(str, bundleExtra.getString(str)));
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        try {
            return str.equals(UUID.fromString(str).toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return false;
        }
    }
}
