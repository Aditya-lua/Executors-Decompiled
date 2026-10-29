.class public final Lve/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# static fields
.field public static final b:Ljava/lang/String; = "c"


# instance fields
.field public final a:Lpe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lve/b;->c(Ljava/lang/String;)Lpe/a;

    move-result-object p1

    iput-object p1, p0, Lve/c;->a:Lpe/a;

    return-void
.end method

.method public static c()V
    .locals 4

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    int-to-long v0, v0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 3

    :try_start_0
    iget-object v0, p0, Lve/c;->a:Lpe/a;

    invoke-interface {v0, p1, p2}, Lpe/a;->a([B[B)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    sget-object v1, Lve/c;->b:Ljava/lang/String;

    const-string v2, "encountered a potentially transient KeyStore error, will wait and retry"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lve/c;->c()V

    iget-object v0, p0, Lve/c;->a:Lpe/a;

    invoke-interface {v0, p1, p2}, Lpe/a;->a([B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 3

    :try_start_0
    iget-object v0, p0, Lve/c;->a:Lpe/a;

    invoke-interface {v0, p1, p2}, Lpe/a;->b([B[B)[B

    move-result-object p1
    :try_end_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_1

    :goto_0
    sget-object v1, Lve/c;->b:Ljava/lang/String;

    const-string v2, "encountered a potentially transient KeyStore error, will wait and retry"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lve/c;->c()V

    iget-object v0, p0, Lve/c;->a:Lpe/a;

    invoke-interface {v0, p1, p2}, Lpe/a;->b([B[B)[B

    move-result-object p1

    return-object p1

    :goto_1
    throw p1
.end method
