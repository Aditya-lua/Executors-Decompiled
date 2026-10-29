package p092e3;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e3.k0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001b2\u00020\u0001:\u0002\u000e\u0011BC\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078G¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, m31665d2 = {"Le3/k0;", "", "", "Le3/r;", "credentialOptions", "", "origin", "", "preferIdentityDocUi", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "()Z", "d", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "e", "f", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4770k0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<AbstractC4783r> credentialOptions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String origin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean preferIdentityDocUi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final ComponentName preferUiBrandingComponentName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean preferImmediatelyAvailableCredentials;

    /* JADX INFO: renamed from: e3.k0$a */
    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Le3/k0$a;", "", "<init>", "()V", "Le3/r;", "credentialOption", "a", "(Le3/r;)Le3/k0$a;", "", "preferImmediatelyAvailableCredentials", "c", "(Z)Le3/k0$a;", "Le3/k0;", "b", "()Le3/k0;", "", "Ljava/util/List;", "credentialOptions", "", "Ljava/lang/String;", "origin", "Z", "preferIdentityDocUi", "d", "Landroid/content/ComponentName;", "e", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public List<AbstractC4783r> credentialOptions = new ArrayList();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String origin;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean preferIdentityDocUi;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean preferImmediatelyAvailableCredentials;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public ComponentName preferUiBrandingComponentName;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m23193a(@NotNull AbstractC4783r credentialOption) {
            Intrinsics.checkNotNullParameter(credentialOption, "credentialOption");
            this.credentialOptions.add(credentialOption);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C4770k0 m23194b() {
            return new C4770k0(CollectionsKt.m31687M0(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m23195c(boolean preferImmediatelyAvailableCredentials) {
            this.preferImmediatelyAvailableCredentials = preferImmediatelyAvailableCredentials;
            return this;
        }
    }

    /* JADX INFO: renamed from: e3.k0$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m31665d2 = {"Le3/k0$b;", "", "<init>", "()V", "Le3/k0;", "request", "Landroid/os/Bundle;", "a", "(Le3/k0;)Landroid/os/Bundle;", "", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: e3.k0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Bundle m23196a(@NotNull C4770k0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", request.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.getPreferImmediatelyAvailableCredentials());
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", request.getPreferUiBrandingComponentName());
            return bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends e3.r> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4770k0(@NotNull List<? extends AbstractC4783r> credentialOptions, @Nullable String str, boolean z10, @Nullable ComponentName componentName, boolean z11) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        this.credentialOptions = credentialOptions;
        this.origin = str;
        this.preferIdentityDocUi = z10;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z11;
        if (credentialOptions.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
        if (credentialOptions.size() > 1) {
            List<? extends AbstractC4783r> list = credentialOptions;
            int i10 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ((((AbstractC4783r) it.next()) instanceof C4776n0) && (i10 = i10 + 1) < 0) {
                        C7699p.m31900s();
                    }
                }
            }
            if (i10 > 0 && i10 != this.credentialOptions.size()) {
                throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
            }
            Iterator<AbstractC4783r> it2 = this.credentialOptions.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C4782q0) {
                    throw new IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<AbstractC4783r> m23188a() {
        return this.credentialOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
      (r3v0 java.util.List)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
      (wrap android.content.ComponentName:?: TERNARY null = ((wrap int:0x000c: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.content.ComponentName) : (r6v0 android.content.ComponentName))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0011: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
     A[MD:(java.util.List<? extends e3.r>, java.lang.String, boolean, android.content.ComponentName, boolean):void (m)] (LINE:24) call: e3.k0.<init>(java.util.List, java.lang.String, boolean, android.content.ComponentName, boolean):void type: THIS */
    public /* synthetic */ C4770k0(List list, String str, boolean z10, ComponentName componentName, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : componentName, (i10 & 16) != 0 ? false : z11);
    }
}
