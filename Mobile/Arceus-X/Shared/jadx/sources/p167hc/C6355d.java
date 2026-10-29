package p167hc;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p092e3.C4766i0;

/* JADX INFO: renamed from: hc.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m31665d2 = {"Lhc/d;", "Le3/i0;", "", "id", "idToken", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "m", "b", "a", "java.com.google.android.libraries.identity.googleid.granule_granule"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6355d extends C4766i0 {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f24101d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f24102e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f24103f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String f24104g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f24105h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final Uri f24106i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f24107j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final String f24108k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final String f24109l;

    /* JADX INFO: renamed from: hc.d$a */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Lhc/d$a;", "", "<init>", "()V", "", "displayName", "b", "(Ljava/lang/String;)Lhc/d$a;", "familyName", "c", "givenName", "d", "id", "e", "idToken", "f", "phoneNumber", "g", "Landroid/net/Uri;", "profilePictureUri", "h", "(Landroid/net/Uri;)Lhc/d$a;", "Lhc/d;", "a", "()Lhc/d;", "Ljava/lang/String;", "Landroid/net/Uri;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public String f24110a = "";

        /* JADX INFO: renamed from: b */
        @NotNull
        public String f24111b = "";

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f24112c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f24113d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public String f24114e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public Uri f24115f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f24116g;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C6355d m27672a() {
            return new C6355d(this.f24110a, this.f24111b, this.f24112c, this.f24113d, this.f24114e, this.f24115f, this.f24116g);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m27673b(@Nullable String displayName) {
            this.f24112c = displayName;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m27674c(@Nullable String familyName) {
            this.f24113d = familyName;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m27675d(@Nullable String givenName) {
            this.f24114e = givenName;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m27676e(@NonNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f24110a = id2;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m27677f(@NonNull String idToken) {
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            this.f24111b = idToken;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m27678g(@Nullable String phoneNumber) {
            this.f24116g = phoneNumber;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final a m27679h(@Nullable Uri profilePictureUri) {
            this.f24115f = profilePictureUri;
            return this;
        }
    }

    /* JADX INFO: renamed from: hc.d$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u0012\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u0012\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u0012\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b!\u0010\u0017\u0012\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b#\u0010\u0017\u0012\u0004\b$\u0010\u001cR\u001a\u0010%\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b%\u0010\u0017\u0012\u0004\b&\u0010\u001cR\u001a\u0010'\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b'\u0010\u0017\u0012\u0004\b(\u0010\u001c¨\u0006)"}, m31665d2 = {"Lhc/d$b;", "", "Landroid/os/Bundle;", "data", "Lhc/d;", "a", "(Landroid/os/Bundle;)Lhc/d;", "", "idToken", "Lkotlin/Pair;", "parseIdToken", "(Ljava/lang/String;)Lkotlin/Pair;", "id", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/Bundle;", "toBundle", "TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", "Ljava/lang/String;", "TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL", "BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "BUNDLE_KEY_ID", "getBUNDLE_KEY_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "()V", "BUNDLE_KEY_ID_TOKEN", "getBUNDLE_KEY_ID_TOKEN$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_DISPLAY_NAME", "getBUNDLE_KEY_DISPLAY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_FAMILY_NAME", "getBUNDLE_KEY_FAMILY_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_GIVEN_NAME", "getBUNDLE_KEY_GIVEN_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PROFILE_PICTURE_URI", "getBUNDLE_KEY_PROFILE_PICTURE_URI$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_PHONE_NUMBER", "getBUNDLE_KEY_PHONE_NUMBER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "java.com.google.android.libraries.identity.googleid.granule_granule"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Pair m27680b(@NonNull Companion companion, @NonNull String str) {
            return m27681c(str);
        }

        /* JADX INFO: renamed from: c */
        public static final Pair m27681c(String str) {
            List listSplit$default = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
            if (listSplit$default.size() != 3) {
                throw new IllegalArgumentException("Invalid token format");
            }
            try {
                byte[] bArrDecode = Base64.decode((String) listSplit$default.get(1), 8);
                Intrinsics.checkNotNull(bArrDecode);
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                JSONObject jSONObject = new JSONObject(new String(bArrDecode, UTF_8));
                String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL);
                String str2 = null;
                if (strOptString.length() == 0) {
                    strOptString = null;
                }
                String strOptString2 = jSONObject.optString("sub");
                if (strOptString2.length() != 0) {
                    str2 = strOptString2;
                }
                if (str2 != null) {
                    return new Pair(strOptString, str2);
                }
                throw new IllegalArgumentException("ID token missing required field: sub");
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C6355d m27682a(@NonNull Bundle data) throws C6356e {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNull(string2);
                return new C6355d(string, string2, string3, string4, string5, uri, string6);
            } catch (Exception e10) {
                throw new C6356e(e10);
            }
        }
    }

    public C6355d(@NonNull String id2, @NonNull String idToken, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Uri uri, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.f24101d = id2;
        this.f24102e = idToken;
        this.f24103f = str;
        this.f24104g = str2;
        this.f24105h = str3;
        this.f24106i = uri;
        this.f24107j = str4;
        if (id2.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (idToken.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
        Pair pairM27680b = Companion.m27680b(INSTANCE, idToken);
        String str5 = (String) pairM27680b.m31671a();
        String str6 = (String) pairM27680b.m31672b();
        this.f24108k = str5;
        this.f24109l = str6;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF24102e() {
        return this.f24102e;
    }
}
