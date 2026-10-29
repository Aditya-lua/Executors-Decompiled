package jg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f21442a = new a("DEFAULT", 0);
    public static final v b = new v("STRING", 1) { // from class: jg.v.b
        {
            a aVar = null;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v[] f21443c = a();

    public final enum a extends v {
        public a(String str, int i10) {
            super(str, i10, null);
        }
    }

    public v(String str, int i10) {
        super(str, i10);
    }

    public static /* synthetic */ v[] a() {
        return new v[]{f21442a, b};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f21443c.clone();
    }

    public /* synthetic */ v(String str, int i10, a aVar) {
        this(str, i10);
    }
}
