package ps;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ps.r, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lps/r;", "", "", Text.type, "", "char", "Lps/s;", "mode", "<init>", "(Ljava/lang/String;CLps/s;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "C", "()C", "Lps/s;", "()Lps/s;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class TrimArguments {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final char char;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final AbstractC10337s mode;

    public TrimArguments(@NotNull String text, char c10, @NotNull AbstractC10337s mode) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.text = text;
        this.char = c10;
        this.mode = mode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final char getChar() {
        return this.char;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC10337s getMode() {
        return this.mode;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrimArguments)) {
            return false;
        }
        TrimArguments trimArguments = (TrimArguments) other;
        return Intrinsics.m31980c(this.text, trimArguments.text) && this.char == trimArguments.char && Intrinsics.m31980c(this.mode, trimArguments.mode);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Character.hashCode(this.char)) * 31) + this.mode.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrimArguments(text=" + this.text + ", char=" + this.char + ", mode=" + this.mode + ")";
    }
}
