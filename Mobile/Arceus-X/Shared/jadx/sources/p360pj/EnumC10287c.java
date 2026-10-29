package p360pj;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import sg.C11347q0;

/* JADX INFO: renamed from: pj.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m31665d2 = {"Lpj/c;", "", "", "id", "", "nameId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "c", "()I", "d", "e", "f", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC10287c {
    SOCIAL("channel_group_social", C11347q0.f39955a1),
    EXPERIENCES("channel_group_experiences", C11347q0.f39951Z),
    COMMUNITIES("channel_group_communities", C11347q0.f39949Y),
    PLATFORM_NEWS("channel_group_platform_news", C11347q0.f39954a0);


    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC10707a f36963h = C10708b.m40805a(m39520a());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int nameId;

    EnumC10287c(String str, int i10) {
        this.id = str;
        this.nameId = i10;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static InterfaceC10707a<EnumC10287c> m39521b() {
        return f36963h;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
