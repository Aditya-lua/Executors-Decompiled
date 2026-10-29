package p323o6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p287m6.EnumC8432f;
import p287m6.InterfaceC8445s;

/* JADX INFO: renamed from: o6.o, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lo6/o;", "Lo6/i;", "Lm6/s;", Payload.SOURCE, "", "mimeType", "Lm6/f;", "dataSource", "<init>", "(Lm6/s;Ljava/lang/String;Lm6/f;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lm6/s;", "c", "()Lm6/s;", "b", "Ljava/lang/String;", "Lm6/f;", "()Lm6/f;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SourceFetchResult implements InterfaceC9701i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final InterfaceC8445s source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String mimeType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC8432f dataSource;

    public SourceFetchResult(@NotNull InterfaceC8445s interfaceC8445s, @Nullable String str, @NotNull EnumC8432f enumC8432f) {
        this.source = interfaceC8445s;
        this.mimeType = str;
        this.dataSource = enumC8432f;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC8432f getDataSource() {
        return this.dataSource;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC8445s getSource() {
        return this.source;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceFetchResult)) {
            return false;
        }
        SourceFetchResult sourceFetchResult = (SourceFetchResult) other;
        return Intrinsics.m31980c(this.source, sourceFetchResult.source) && Intrinsics.m31980c(this.mimeType, sourceFetchResult.mimeType) && this.dataSource == sourceFetchResult.dataSource;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.mimeType;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dataSource.hashCode();
    }

    @NotNull
    public String toString() {
        return "SourceFetchResult(source=" + this.source + ", mimeType=" + this.mimeType + ", dataSource=" + this.dataSource + ')';
    }
}
