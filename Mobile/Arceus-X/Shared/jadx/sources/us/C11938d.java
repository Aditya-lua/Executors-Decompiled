package us;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: us.d */
/* JADX INFO: loaded from: classes3.dex */
public class C11938d implements InterfaceC11937c {
    @NonNull
    /* JADX INFO: renamed from: b */
    public static Uri m44559b(@NonNull String str) {
        Uri uri = Uri.parse(str);
        return TextUtils.isEmpty(uri.getScheme()) ? uri.buildUpon().scheme("https").build() : uri;
    }

    @Override // us.InterfaceC11937c
    /* JADX INFO: renamed from: a */
    public void mo44558a(@NonNull View view, @NonNull String str) {
        Uri uriM44559b = m44559b(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriM44559b);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}
