package okhttp3.internal;

import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m31665d2 = {"Lokhttp3/internal/Tags;", "", "<init>", "()V", "T", "Lhu/c;", "key", "value", "plus", "(Lhu/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lhu/c;)Ljava/lang/Object;", "Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/LinkedTags;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class Tags {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.Tags.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Tags(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract <T> T get(@NotNull InterfaceC6567c<T> key);

    @NotNull
    public abstract <T> Tags plus(@NotNull InterfaceC6567c<T> key, @Nullable T value);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private Tags() {
    }
}
