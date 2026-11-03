package ln;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f23652a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.b != 0) {
            this.f23652a.append('\n');
        }
        this.f23652a.append(charSequence);
        this.b++;
    }

    public String b() {
        return this.f23652a.toString();
    }
}
