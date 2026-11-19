package o9;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f27052a;
    public final String b;

    public v(@NonNull Context context) {
        s.l(context);
        Resources resources = context.getResources();
        this.f27052a = resources;
        this.b = resources.getResourcePackageName(k9.l.f21269a);
    }

    public String a(@NonNull String str) {
        String str2 = this.b;
        Resources resources = this.f27052a;
        int identifier = resources.getIdentifier(str, InquiryField.StringField.TYPE, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
