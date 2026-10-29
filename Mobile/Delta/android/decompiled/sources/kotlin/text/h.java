package kotlin.text;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, d2 = {"Lkotlin/text/h;", "", "", "", InquiryField.StringField.TYPE, "<init>", "(Ljava/lang/CharSequence;)V", "", "hasNext", "()Z", "b", "()Ljava/lang/String;", "a", "Ljava/lang/CharSequence;", "", "I", "state", "c", "tokenStartIndex", "d", "delimiterStartIndex", "e", "delimiterLength", "f", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements Iterator<String>, au.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CharSequence string;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int tokenStartIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int delimiterStartIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int delimiterLength;

    public h(@NotNull CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.string = string;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        int i10 = this.delimiterStartIndex;
        int i11 = this.tokenStartIndex;
        this.tokenStartIndex = this.delimiterLength + i10;
        return this.string.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.state;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.delimiterLength < 0) {
            this.state = 2;
            return false;
        }
        int length = this.string.length();
        int length2 = this.string.length();
        for (int i13 = this.tokenStartIndex; i13 < length2; i13++) {
            char cCharAt = this.string.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.string.length() && this.string.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.state = 1;
                this.delimiterLength = i10;
                this.delimiterStartIndex = length;
                return true;
            }
        }
        i10 = -1;
        this.state = 1;
        this.delimiterLength = i10;
        this.delimiterStartIndex = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
