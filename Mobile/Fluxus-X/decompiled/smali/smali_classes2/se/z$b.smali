.class public final Lse/z$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Lse/z$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lse/z$b;->a:Ljava/lang/Integer;

    .line 4
    sget-object v0, Lse/z$c;->d:Lse/z$c;

    iput-object v0, p0, Lse/z$b;->b:Lse/z$c;

    return-void
.end method

.method public synthetic constructor <init>(Lse/z$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lse/z$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lse/z;
    .locals 4

    iget-object v0, p0, Lse/z$b;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lse/z$b;->b:Lse/z$c;

    if-eqz v1, :cond_0

    new-instance v1, Lse/z;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lse/z$b;->b:Lse/z$c;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lse/z;-><init>(ILse/z$c;Lse/z$a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(I)Lse/z$b;
    .locals 2

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lse/z$b;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public c(Lse/z$c;)Lse/z$b;
    .locals 0

    iput-object p1, p0, Lse/z$b;->b:Lse/z$c;

    return-object p0
.end method
