.class public final Lbf/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:Laf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final j:Laf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final k:Laf/q0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->a:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->b:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->c:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->d:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->e:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->f:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->g:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-static {v0}, Lbf/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbf/z0;->h:Ljava/lang/String;

    invoke-static {}, Laf/q0;->a0()Laf/q0;

    move-result-object v0

    sput-object v0, Lbf/z0;->i:Laf/q0;

    invoke-static {}, Laf/q0;->a0()Laf/q0;

    move-result-object v0

    sput-object v0, Lbf/z0;->j:Laf/q0;

    invoke-static {}, Laf/q0;->a0()Laf/q0;

    move-result-object v0

    sput-object v0, Lbf/z0;->k:Laf/q0;

    :try_start_0
    invoke-static {}, Lbf/z0;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lbf/z0;->c()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method public static c()V
    .locals 2

    invoke-static {}, Lbf/g0;->d()V

    invoke-static {}, Lbf/i0;->d()V

    const/4 v0, 0x1

    invoke-static {v0}, Lbf/g;->e(Z)V

    invoke-static {v0}, Lbf/p0;->e(Z)V

    invoke-static {v0}, Lbf/x0;->e(Z)V

    invoke-static {}, Lte/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lbf/n;->d(Z)V

    return-void
.end method
