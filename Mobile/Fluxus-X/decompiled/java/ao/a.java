package ao;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f3055a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.b != 0) {
            this.f3055a.append('\n');
        }
        this.f3055a.append(charSequence);
        this.b++;
    }

    public String b() {
        return this.f3055a.toString();
    }
}
