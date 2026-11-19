package x3;

import androidx.datastore.preferences.protobuf.a0;
import com.github.luben.zstd.BuildConfig;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lx3/d;", BuildConfig.FLAVOR, "a", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x3.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx3/d$a;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/io/InputStream;", "input", "Lx3/f;", "a", "(Ljava/io/InputStream;)Lx3/f;", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f a(@NotNull InputStream input) throws u3.d {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f fVarB0 = f.b0(input);
                Intrinsics.checkNotNullExpressionValue(fVarB0, "{\n                Prefer…From(input)\n            }");
                return fVarB0;
            } catch (a0 e10) {
                throw new u3.d("Unable to parse preferences proto.", e10);
            }
        }

        public Companion() {
        }
    }
}
