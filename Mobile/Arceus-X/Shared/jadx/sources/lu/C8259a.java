package lu;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p256ku.AbstractC7900n2;
import p395qu.InterfaceC10746s;

/* JADX INFO: renamed from: lu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Llu/a;", "Lqu/s;", "<init>", "()V", "", "allFactories", "Lku/n2;", "b", "(Ljava/util/List;)Lku/n2;", "", "a", "()Ljava/lang/String;", "", "c", "()I", "loadPriority", "kotlinx-coroutines-android"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8259a implements InterfaceC10746s {
    @Override // p395qu.InterfaceC10746s
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo33642a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p395qu.InterfaceC10746s
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC7900n2 mo33643b(@NotNull List<? extends InterfaceC10746s> allFactories) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C8264f(C8266h.m33654a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p395qu.InterfaceC10746s
    /* JADX INFO: renamed from: c */
    public int mo33644c() {
        return 1073741823;
    }
}
