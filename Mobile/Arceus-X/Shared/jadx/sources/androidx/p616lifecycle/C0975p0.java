package androidx.p616lifecycle;

import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.lifecycle.p0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "key", "b", "(Ljava/lang/String;)Ljava/lang/String;", "lifecycle-viewmodel-savedstate"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0975p0 {
    /* JADX INFO: renamed from: b */
    public static final String m4970b(String str) {
        return "StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '" + str + "', but not both.";
    }
}
