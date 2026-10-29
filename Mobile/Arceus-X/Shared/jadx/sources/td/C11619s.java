package td;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: renamed from: td.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C11619s extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a */
    public final String f41017a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11618r1 f41018b;

    public C11619s(String str, AbstractC11618r1 abstractC11618r1) {
        this.f41017a = str;
        this.f41018b = abstractC11618r1;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f41017a;
    }
}
