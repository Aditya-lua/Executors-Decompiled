package mv;

import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\f\tB%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lmv/t;", "Lmv/g0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lmv/b0;", "b", "()Lmv/b0;", BuildConfig.FLAVOR, "a", "()J", "Lew/f;", "sink", BuildConfig.FLAVOR, "h", "(Lew/f;)V", BuildConfig.FLAVOR, "countBytes", "i", "(Lew/f;Z)J", "c", "Ljava/util/List;", "d", "e", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b0 f24779f = b0.INSTANCE.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> encodedNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> encodedValues;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"Lmv/t$a;", BuildConfig.FLAVOR, "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", BuildConfig.FLAVOR, "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lmv/t$a;", "b", "Lmv/t;", "c", "()Lmv/t;", "Ljava/nio/charset/Charset;", BuildConfig.FLAVOR, "Ljava/util/List;", "names", "values", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Charset charset;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<String> names;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> values;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.names.add(cw.a.d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.charset, 91, null));
            this.values.add(cw.a.d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.charset, 91, null));
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.names.add(cw.a.d(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.charset, 83, null));
            this.values.add(cw.a.d(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.charset, 83, null));
            return this;
        }

        @NotNull
        public final t c() {
            return new t(this.names, this.values);
        }

        public a(@Nullable Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public t(@NotNull List<String> encodedNames, @NotNull List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.encodedNames = nv.q.v(encodedNames);
        this.encodedValues = nv.q.v(encodedValues);
    }

    @Override // mv.g0
    public long a() {
        return i(null, true);
    }

    @Override // mv.g0
    @NotNull
    /* JADX INFO: renamed from: b */
    public b0 getMediaType() {
        return f24779f;
    }

    @Override // mv.g0
    public void h(@NotNull ew.f sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        i(sink, false);
    }

    public final long i(ew.f sink, boolean countBytes) throws EOFException {
        ew.e bufferField;
        if (countBytes) {
            bufferField = new ew.e();
        } else {
            Intrinsics.checkNotNull(sink);
            bufferField = sink.getBufferField();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                bufferField.writeByte(38);
            }
            bufferField.D0(this.encodedNames.get(i10));
            bufferField.writeByte(61);
            bufferField.D0(this.encodedValues.get(i10));
        }
        if (!countBytes) {
            return 0L;
        }
        long size2 = bufferField.getSize();
        bufferField.a();
        return size2;
    }
}
