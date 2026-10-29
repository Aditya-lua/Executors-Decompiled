package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0019\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0005J\u0011\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u001d"}, m31665d2 = {"Lokhttp3/internal/http2/Settings;", "", "<init>", "()V", "set", "", "values", "", "headerTableSize", "getHeaderTableSize", "()I", "initialWindowSize", "getInitialWindowSize", "clear", "", "id", "value", "isSet", "", "get", "size", "getEnablePush", "defaultValue", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "merge", "other", "Companion", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Settings {
    public static final int COUNT = 10;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 4;
    public static final int MAX_CONCURRENT_STREAMS = 3;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;

    @NotNull
    private final int[] values = new int[10];

    public final void clear() {
        this.set = 0;
        C7691l.m31824s(this.values, 0, 0, 0, 6, null);
    }

    public final int get(int id2) {
        return this.values[id2];
    }

    public final boolean getEnablePush(boolean defaultValue) {
        if ((this.set & 4) != 0) {
            return this.values[2] == 1;
        }
        return defaultValue;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return 65535;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 8) != 0) {
            return this.values[3];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int defaultValue) {
        return (this.set & 32) != 0 ? this.values[5] : defaultValue;
    }

    public final int getMaxHeaderListSize(int defaultValue) {
        return (this.set & 64) != 0 ? this.values[6] : defaultValue;
    }

    public final boolean isSet(int id2) {
        return ((1 << id2) & this.set) != 0;
    }

    public final void merge(@NotNull Settings other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.isSet(i10)) {
                set(i10, other.get(i10));
            }
        }
    }

    @NotNull
    public final Settings set(int id2, int value) {
        if (id2 >= 0) {
            int[] iArr = this.values;
            if (id2 < iArr.length) {
                this.set = (1 << id2) | this.set;
                iArr[id2] = value;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
