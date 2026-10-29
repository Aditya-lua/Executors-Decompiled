package p388qn;

/* JADX INFO: renamed from: qn.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10601a extends AbstractC10623s {
    @Override // p388qn.AbstractC10623s
    /* JADX INFO: renamed from: k */
    public void mo40635k(AbstractC10623s abstractC10623s) {
        if (!(abstractC10623s instanceof AbstractC10601a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.mo40635k(abstractC10623s);
    }

    /* JADX DEBUG: Method merged with bridge method: g()Lqn/s; */
    @Override // p388qn.AbstractC10623s
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC10601a mo40634g() {
        return (AbstractC10601a) super.mo40634g();
    }
}
