package p305n9;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p213j9.C7103j;

/* JADX INFO: renamed from: n9.o */
/* JADX INFO: loaded from: classes.dex */
public class C8959o {

    /* JADX INFO: renamed from: a */
    public final Resources f32627a;

    /* JADX INFO: renamed from: b */
    public final String f32628b;

    public C8959o(@NonNull Context context) {
        C8953m.m36047l(context);
        Resources resources = context.getResources();
        this.f32627a = resources;
        this.f32628b = resources.getResourcePackageName(C7103j.f27724a);
    }

    /* JADX INFO: renamed from: a */
    public String m36061a(@NonNull String str) {
        String str2 = this.f32628b;
        Resources resources = this.f32627a;
        int identifier = resources.getIdentifier(str, InquiryField.StringField.TYPE, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
