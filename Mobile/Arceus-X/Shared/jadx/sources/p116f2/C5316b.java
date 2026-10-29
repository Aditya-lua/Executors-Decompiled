package p116f2;

import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: renamed from: f2.b */
/* JADX INFO: loaded from: classes.dex */
public class C5316b {

    /* JADX INFO: renamed from: f */
    public static final HashMap<Pair<Integer, Integer>, String> f20671f;

    /* JADX INFO: renamed from: g */
    public static final HashMap<String, String> f20672g;

    /* JADX INFO: renamed from: a */
    public final C5324j f20673a;

    /* JADX INFO: renamed from: b */
    public String f20674b = null;

    /* JADX INFO: renamed from: c */
    public String f20675c = null;

    /* JADX INFO: renamed from: d */
    public int f20676d = -1;

    /* JADX INFO: renamed from: e */
    public int f20677e = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f20671f = map;
        HashMap<String, String> map2 = new HashMap<>();
        f20672g = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public C5316b(C5324j c5324j) {
        this.f20673a = c5324j;
    }
}
