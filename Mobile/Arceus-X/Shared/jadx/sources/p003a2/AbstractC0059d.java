package p003a2;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: renamed from: a2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059d {

    /* JADX INFO: renamed from: a */
    public String f116a;

    /* JADX INFO: renamed from: b */
    public int f117b = 0;

    /* JADX INFO: renamed from: c */
    public String f118c = null;

    /* JADX INFO: renamed from: d */
    public int f119d = 0;

    /* JADX INFO: renamed from: e */
    public ArrayList<a> f120e = new ArrayList<>();

    /* JADX INFO: renamed from: a2.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f121a;

        /* JADX INFO: renamed from: b */
        public float f122b;
    }

    public String toString() {
        String str = this.f116a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<a> arrayList = this.f120e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = arrayList.get(i10);
            i10++;
            a aVar2 = aVar;
            str = str + "[" + aVar2.f121a + " , " + decimalFormat.format(aVar2.f122b) + "] ";
        }
        return str;
    }
}
