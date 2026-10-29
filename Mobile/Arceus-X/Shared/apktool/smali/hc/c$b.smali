.class public final Lhc/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0086\u0003\u0018\u00002\u00020\u0001JC\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u0012\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u0012\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0014\u0012\u0004\u0008\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0014\u0012\u0004\u0008\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0014\u0012\u0004\u0008\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0014\u0012\u0004\u0008 \u0010\u0016R\u001a\u0010!\u001a\u00020\u00028\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0014\u0012\u0004\u0008\"\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lhc/c$b;",
        "",
        "",
        "serverClientId",
        "hostedDomainFilter",
        "nonce",
        "",
        "autoSelectEnabled",
        "",
        "Lhc/a;",
        "claims",
        "Landroid/os/Bundle;",
        "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Landroid/os/Bundle;",
        "toBundle",
        "claimsBundle",
        "parseClaims$java_com_google_android_libraries_identity_googleid_granule_granule",
        "(Landroid/os/Bundle;)Ljava/util/List;",
        "parseClaims",
        "BUNDLE_KEY_SERVER_CLIENT_ID",
        "Ljava/lang/String;",
        "getBUNDLE_KEY_SERVER_CLIENT_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations",
        "()V",
        "BUNDLE_KEY_NONCE",
        "getBUNDLE_KEY_NONCE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations",
        "BUNDLE_KEY_HOSTED_DOMAIN_FILTER",
        "getBUNDLE_KEY_HOSTED_DOMAIN_FILTER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations",
        "BUNDLE_KEY_AUTO_SELECT_ENABLED",
        "getBUNDLE_KEY_AUTO_SELECT_ENABLED$java_com_google_android_libraries_identity_googleid_granule_granule$annotations",
        "BUNDLE_KEY_CLAIMS",
        "getBUNDLE_KEY_CLAIMS$java_com_google_android_libraries_identity_googleid_granule_granule$annotations",
        "BUNDLE_KEY_CLAIM_PREFIX",
        "getBUNDLE_KEY_CLAIM_PREFIX$java_com_google_android_libraries_identity_googleid_granule_granule$annotations",
        "BUNDLE_KEY_CLAIMS_SIZE",
        "getBUNDLE_KEY_CLAIMS_SIZE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations",
        "java.com.google.android.libraries.identity.googleid.granule_granule"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .param p1    # Lkotlin/jvm/internal/DefaultConstructorMarker;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Landroid/os/Bundle;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "serverClientId"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID"

    invoke-virtual {p3, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE"

    invoke-virtual {p3, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER"

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED"

    const/4 p1, 0x1

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE"

    const-string p1, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL"

    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p4, :cond_1

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string p1, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS_SIZE"

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIM_PREFIX"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhc/a;

    invoke-static {v1}, Lhc/a$a;->a(Lhc/a;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    const-string p1, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS"

    invoke-virtual {p3, p1, p0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    return-object p3
.end method
