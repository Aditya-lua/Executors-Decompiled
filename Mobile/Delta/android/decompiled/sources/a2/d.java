package a2;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f81a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f82c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<a> f84e = new ArrayList<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85a;
        public float b;
    }

    public String toString() {
        String str = this.f81a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList<a> arrayList = this.f84e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = arrayList.get(i10);
            i10++;
            a aVar2 = aVar;
            str = str + "[" + aVar2.f85a + " , " + decimalFormat.format(aVar2.b) + "] ";
        }
        return str;
    }
}
