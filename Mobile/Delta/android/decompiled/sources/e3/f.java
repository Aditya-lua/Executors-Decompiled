package e3;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Le3/f;", "Le3/c;", "", "responseJson", "<init>", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "getResponseJson", "()Ljava/lang/String;", "e", "a", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String responseJson;

    /* JADX INFO: renamed from: e3.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Le3/f$a;", "", "<init>", "()V", "", "responseJson", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "data", "Le3/f;", "a", "(Landroid/os/Bundle;)Le3/f;", "BUNDLE_KEY_RESPONSE_JSON", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f a(@NotNull Bundle data) throws j3.c {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                Intrinsics.checkNotNull(string);
                return new f(string);
            } catch (Exception unused) {
                throw new j3.c();
            }
        }

        @NotNull
        public final Bundle b(@NotNull String responseJson) {
            Intrinsics.checkNotNullParameter(responseJson, "responseJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", responseJson);
            return bundle;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull String responseJson) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", INSTANCE.b(responseJson));
        Intrinsics.checkNotNullParameter(responseJson, "responseJson");
        this.responseJson = responseJson;
        if (!j3.d.INSTANCE.a(responseJson)) {
            throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
        }
    }
}
