package n9;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f25292a;
    public final String b;

    public o(@NonNull Context context) {
        m.l(context);
        Resources resources = context.getResources();
        this.f25292a = resources;
        this.b = resources.getResourcePackageName(j9.j.f21198a);
    }

    public String a(@NonNull String str) {
        String str2 = this.b;
        Resources resources = this.f25292a;
        int identifier = resources.getIdentifier(str, InquiryField.StringField.TYPE, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
