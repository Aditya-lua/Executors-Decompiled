package p515we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import pe.AbstractC10243x;

/* JADX INFO: renamed from: we.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C12401z {

    /* JADX INFO: renamed from: b */
    public static final C12401z f44366b = new C12401z();

    /* JADX INFO: renamed from: a */
    public final Map<String, AbstractC10243x> f44367a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static C12401z m46477a() {
        return f44366b;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m46478b(String str, AbstractC10243x abstractC10243x) {
        try {
            if (!this.f44367a.containsKey(str)) {
                this.f44367a.put(str, abstractC10243x);
                return;
            }
            if (this.f44367a.get(str).equals(abstractC10243x)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f44367a.get(str) + "), cannot insert " + abstractC10243x);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m46479c(Map<String, AbstractC10243x> map) {
        for (Map.Entry<String, AbstractC10243x> entry : map.entrySet()) {
            m46478b(entry.getKey(), entry.getValue());
        }
    }
}
