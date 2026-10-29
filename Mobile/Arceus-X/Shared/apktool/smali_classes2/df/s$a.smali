.class public Ldf/s$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Ljavax/crypto/Mac;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ldf/s;


# direct methods
.method public constructor <init>(Ldf/s;)V
    .locals 0

    iput-object p1, p0, Ldf/s$a;->a:Ldf/s;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljavax/crypto/Mac;
    .locals 2

    :try_start_0
    sget-object v0, Ldf/m;->c:Ldf/m;

    iget-object v1, p0, Ldf/s$a;->a:Ldf/s;

    invoke-static {v1}, Ldf/s;->b(Ldf/s;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;

    iget-object v1, p0, Ldf/s$a;->a:Ldf/s;

    invoke-static {v1}, Ldf/s;->c(Ldf/s;)Ljava/security/Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldf/s$a;->a()Ljavax/crypto/Mac;

    move-result-object v0

    return-object v0
.end method
