.class public final Lqe/a;
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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->a:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->b:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->c:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->d:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->e:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->f:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->g:Ljava/lang/String;

    const-string v0, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-static {v0}, Lqe/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqe/a;->h:Ljava/lang/String;

    invoke-static {}, Laf/q0;->a0()Laf/q0;

    move-result-object v0

    sput-object v0, Lqe/a;->i:Laf/q0;

    sput-object v0, Lqe/a;->j:Laf/q0;

    sput-object v0, Lqe/a;->k:Laf/q0;

    :try_start_0
    invoke-static {}, Lqe/a;->a()V
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

    invoke-static {}, Lqe/a;->c()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method public static c()V
    .locals 2

    invoke-static {}, Lqe/e;->d()V

    invoke-static {}, Lxe/p;->c()V

    const/4 v0, 0x1

    invoke-static {v0}, Lqe/j;->d(Z)V

    invoke-static {v0}, Lqe/t;->e(Z)V

    invoke-static {}, Lte/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lqe/o;->e(Z)V

    invoke-static {v0}, Lqe/y;->e(Z)V

    invoke-static {v0}, Lqe/d0;->f(Z)V

    invoke-static {v0}, Lqe/h0;->f(Z)V

    invoke-static {v0}, Lqe/l0;->f(Z)V

    invoke-static {v0}, Lqe/s1;->f(Z)V

    invoke-static {v0}, Lqe/n1;->d(Z)V

    return-void
.end method
