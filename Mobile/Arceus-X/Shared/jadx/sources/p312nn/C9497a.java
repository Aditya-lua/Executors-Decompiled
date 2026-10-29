package p312nn;

/* JADX INFO: renamed from: nn.a */
/* JADX INFO: loaded from: classes3.dex */
public class C9497a {

    /* JADX INFO: renamed from: b */
    public int f34178b = 0;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f34177a = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public void m37441a(CharSequence charSequence) {
        if (this.f34178b != 0) {
            this.f34177a.append('\n');
        }
        this.f34177a.append(charSequence);
        this.f34178b++;
    }

    /* JADX INFO: renamed from: b */
    public String m37442b() {
        return this.f34177a.toString();
    }
}
