.class public final Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "determineDeviceGMSVersionCode",
        "(Landroid/content/Context;)J",
        "curAuthVersion",
        "",
        "needsBackwardsCompatibleRequest",
        "(J)Z",
        "Lic/b;",
        "option",
        "La9/a$b;",
        "convertToGoogleIdTokenOption",
        "(Lic/b;)La9/a$b;",
        "Le3/k0;",
        "request",
        "La9/a;",
        "constructBeginSignInRequest$credentials_play_services_auth_release",
        "(Le3/k0;Landroid/content/Context;)La9/a;",
        "constructBeginSignInRequest",
        "",
        "TAG",
        "Ljava/lang/String;",
        "AUTH_MIN_VERSION_JSON_PARSING",
        "J",
        "AUTH_MIN_VERSION_PREFER_IMME_CRED",
        "credentials-play-services-auth_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;-><init>()V

    return-void
.end method

.method private final convertToGoogleIdTokenOption(Lic/b;)La9/a$b;
    .locals 2

    invoke-static {}, La9/a$b;->A3()La9/a$b$a;

    move-result-object v0

    invoke-virtual {p1}, Lic/b;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, La9/a$b$a;->c(Z)La9/a$b$a;

    move-result-object v0

    invoke-virtual {p1}, Lic/b;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La9/a$b$a;->d(Ljava/lang/String;)La9/a$b$a;

    move-result-object v0

    invoke-virtual {p1}, Lic/b;->l()Z

    move-result v1

    invoke-virtual {v0, v1}, La9/a$b$a;->e(Z)La9/a$b$a;

    move-result-object v0

    invoke-virtual {p1}, Lic/b;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La9/a$b$a;->f(Ljava/lang/String;)La9/a$b$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La9/a$b$a;->g(Z)La9/a$b$a;

    move-result-object v0

    const-string v1, "setSupported(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lic/b;->j()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lic/b;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lic/b;->i()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, La9/a$b$a;->a(Ljava/lang/String;Ljava/util/List;)La9/a$b$a;

    :cond_0
    invoke-virtual {v0}, La9/a$b$a;->b()La9/a$b;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final determineDeviceGMSVersionCode(Landroid/content/Context;)J
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "getPackageManager(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "com.google.android.gms"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v0, p1

    return-wide v0
.end method

.method private final needsBackwardsCompatibleRequest(J)Z
    .locals 2

    const-wide/32 v0, 0xdd13758

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final constructBeginSignInRequest$credentials_play_services_auth_release(Le3/k0;Landroid/content/Context;)La9/a;
    .locals 9
    .param p1    # Le3/k0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La9/a$a;

    invoke-direct {v0}, La9/a$a;-><init>()V

    invoke-direct {p0, p2}, Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;->determineDeviceGMSVersionCode(Landroid/content/Context;)J

    move-result-wide v1

    invoke-virtual {p1}, Le3/k0;->a()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le3/r;

    instance-of v7, v6, Le3/o0;

    const/4 v8, 0x1

    if-eqz v7, :cond_3

    new-instance v7, La9/a$e$a;

    invoke-direct {v7}, La9/a$e$a;-><init>()V

    invoke-virtual {v7, v8}, La9/a$e$a;->b(Z)La9/a$e$a;

    move-result-object v7

    invoke-virtual {v7}, La9/a$e$a;->a()La9/a$e;

    move-result-object v7

    invoke-virtual {v0, v7}, La9/a$a;->f(La9/a$e;)La9/a$a;

    if-nez v4, :cond_2

    invoke-virtual {v6}, Le3/r;->e()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move v4, v3

    goto :goto_0

    :cond_2
    :goto_1
    move v4, v8

    goto :goto_0

    :cond_3
    instance-of v7, v6, Le3/p0;

    if-eqz v7, :cond_5

    if-nez v5, :cond_5

    invoke-direct {p0, v1, v2}, Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;->needsBackwardsCompatibleRequest(J)Z

    move-result v5

    if-eqz v5, :cond_4

    sget-object v5, Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility;->Companion:Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$Companion;

    check-cast v6, Le3/p0;

    invoke-virtual {v5, v6}, Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$Companion;->convertToPlayAuthPasskeyRequest(Le3/p0;)La9/a$d;

    move-result-object v5

    invoke-virtual {v0, v5}, La9/a$a;->e(La9/a$d;)La9/a$a;

    goto :goto_2

    :cond_4
    sget-object v5, Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility;->Companion:Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$Companion;

    check-cast v6, Le3/p0;

    invoke-virtual {v5, v6}, Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/PublicKeyCredentialControllerUtility$Companion;->convertToPlayAuthPasskeyJsonRequest(Le3/p0;)La9/a$c;

    move-result-object v5

    invoke-virtual {v0, v5}, La9/a$a;->d(La9/a$c;)La9/a$a;

    :goto_2
    move v5, v8

    goto :goto_0

    :cond_5
    instance-of v7, v6, Lic/b;

    if-eqz v7, :cond_0

    check-cast v6, Lic/b;

    invoke-direct {p0, v6}, Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;->convertToGoogleIdTokenOption(Lic/b;)La9/a$b;

    move-result-object v7

    invoke-virtual {v0, v7}, La9/a$a;->c(La9/a$b;)La9/a$a;

    if-nez v4, :cond_2

    invoke-virtual {v6}, Lic/b;->g()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_6
    const-wide/32 v5, 0xe60ade8

    cmp-long p2, v1, v5

    if-lez p2, :cond_7

    invoke-virtual {p1}, Le3/k0;->e()Z

    move-result p1

    invoke-virtual {v0, p1}, La9/a$a;->g(Z)La9/a$a;

    :cond_7
    invoke-virtual {v0, v4}, La9/a$a;->b(Z)La9/a$a;

    move-result-object p1

    invoke-virtual {p1}, La9/a$a;->a()La9/a;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
