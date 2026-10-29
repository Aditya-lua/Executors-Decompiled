package nn;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f26363a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.b != 0) {
            this.f26363a.append('\n');
        }
        this.f26363a.append(charSequence);
        this.b++;
    }

    public String b() {
        return this.f26363a.toString();
    }
}
