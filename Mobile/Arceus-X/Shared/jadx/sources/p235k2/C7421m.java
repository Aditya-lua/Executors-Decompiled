package p235k2;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: k2.m */
/* JADX INFO: loaded from: classes.dex */
public class C7421m {

    /* JADX INFO: renamed from: a */
    public static final Object f28639a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f28640b = new Object();

    /* JADX INFO: renamed from: a */
    public static Bundle m30880a(C7419k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatM30745d = aVar.m30745d();
        bundle.putInt("icon", iconCompatM30745d != null ? iconCompatM30745d.m2690g() : 0);
        bundle.putCharSequence(Title.type, aVar.m30749h());
        bundle.putParcelable("actionIntent", aVar.m30742a());
        Bundle bundle2 = aVar.m30744c() != null ? new Bundle(aVar.m30744c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m30743b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m30882c(aVar.m30746e()));
        bundle.putBoolean("showsUserInterface", aVar.m30748g());
        bundle.putInt("semanticAction", aVar.m30747f());
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m30881b(C7428t c7428t) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c7428t.m30941i());
        bundle.putCharSequence("label", c7428t.m30940h());
        bundle.putCharSequenceArray(InquiryField.ChoicesField.TYPE, c7428t.m30937e());
        bundle.putBoolean("allowFreeFormInput", c7428t.m30935c());
        bundle.putBundle("extras", c7428t.m30939g());
        Set<String> setM30936d = c7428t.m30936d();
        if (setM30936d != null && !setM30936d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setM30936d.size());
            Iterator<String> it = setM30936d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static Bundle[] m30882c(C7428t[] c7428tArr) {
        if (c7428tArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c7428tArr.length];
        for (int i10 = 0; i10 < c7428tArr.length; i10++) {
            bundleArr[i10] = m30881b(c7428tArr[i10]);
        }
        return bundleArr;
    }
}
