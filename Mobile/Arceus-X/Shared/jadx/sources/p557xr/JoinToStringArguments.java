package p557xr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xr.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, m31665d2 = {"Lxr/d;", "", "", "elementsToJoin", "", "separator", "prefix", "postfix", "", "limit", "truncated", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "e", "c", "d", "I", "f", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class JoinToStringArguments {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Object> elementsToJoin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String separator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String prefix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String postfix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final int limit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String truncated;

    public JoinToStringArguments(@NotNull List<? extends Object> elementsToJoin, @NotNull String separator, @NotNull String prefix, @NotNull String postfix, int i10, @NotNull String truncated) {
        Intrinsics.checkNotNullParameter(elementsToJoin, "elementsToJoin");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        this.elementsToJoin = elementsToJoin;
        this.separator = separator;
        this.prefix = prefix;
        this.postfix = postfix;
        this.limit = i10;
        this.truncated = truncated;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<Object> m47924a() {
        return this.elementsToJoin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPostfix() {
        return this.postfix;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSeparator() {
        return this.separator;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinToStringArguments)) {
            return false;
        }
        JoinToStringArguments joinToStringArguments = (JoinToStringArguments) other;
        return Intrinsics.m31980c(this.elementsToJoin, joinToStringArguments.elementsToJoin) && Intrinsics.m31980c(this.separator, joinToStringArguments.separator) && Intrinsics.m31980c(this.prefix, joinToStringArguments.prefix) && Intrinsics.m31980c(this.postfix, joinToStringArguments.postfix) && this.limit == joinToStringArguments.limit && Intrinsics.m31980c(this.truncated, joinToStringArguments.truncated);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTruncated() {
        return this.truncated;
    }

    public int hashCode() {
        return (((((((((this.elementsToJoin.hashCode() * 31) + this.separator.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.postfix.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31) + this.truncated.hashCode();
    }

    @NotNull
    public String toString() {
        return "JoinToStringArguments(elementsToJoin=" + this.elementsToJoin + ", separator=" + this.separator + ", prefix=" + this.prefix + ", postfix=" + this.postfix + ", limit=" + this.limit + ", truncated=" + this.truncated + ")";
    }
}
