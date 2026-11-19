.class public final Ldf/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ldf/a$e;

.field public b:Ldf/a$c;

.field public c:Ldf/a$d;

.field public d:Ldf/a$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Ldf/a$b;->a:Ldf/a$e;

    .line 4
    iput-object v0, p0, Ldf/a$b;->b:Ldf/a$c;

    .line 5
    iput-object v0, p0, Ldf/a$b;->c:Ldf/a$d;

    .line 6
    sget-object v0, Ldf/a$f;->e:Ldf/a$f;

    iput-object v0, p0, Ldf/a$b;->d:Ldf/a$f;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ldf/a;
    .locals 6

    iget-object v1, p0, Ldf/a$b;->a:Ldf/a$e;

    if-eqz v1, :cond_9

    iget-object v2, p0, Ldf/a$b;->b:Ldf/a$c;

    if-eqz v2, :cond_8

    iget-object v3, p0, Ldf/a$b;->c:Ldf/a$d;

    if-eqz v3, :cond_7

    iget-object v4, p0, Ldf/a$b;->d:Ldf/a$f;

    if-eqz v4, :cond_6

    sget-object v0, Ldf/a$c;->c:Ldf/a$c;

    if-ne v2, v0, :cond_1

    sget-object v0, Ldf/a$d;->b:Ldf/a$d;

    if-ne v3, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P256 requires SHA256"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    sget-object v0, Ldf/a$c;->d:Ldf/a$c;

    if-ne v2, v0, :cond_3

    sget-object v0, Ldf/a$d;->c:Ldf/a$d;

    if-eq v3, v0, :cond_3

    sget-object v0, Ldf/a$d;->d:Ldf/a$d;

    if-ne v3, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P384 requires SHA384 or SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v0, Ldf/a$c;->e:Ldf/a$c;

    if-ne v2, v0, :cond_5

    sget-object v0, Ldf/a$d;->d:Ldf/a$d;

    if-ne v3, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P521 requires SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    new-instance v0, Ldf/a;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Ldf/a;-><init>(Ldf/a$e;Ldf/a$c;Ldf/a$d;Ldf/a$f;Ldf/a$a;)V

    return-object v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "EC curve type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "signature encoding is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ldf/a$c;)Ldf/a$b;
    .locals 0

    iput-object p1, p0, Ldf/a$b;->b:Ldf/a$c;

    return-object p0
.end method

.method public c(Ldf/a$d;)Ldf/a$b;
    .locals 0

    iput-object p1, p0, Ldf/a$b;->c:Ldf/a$d;

    return-object p0
.end method

.method public d(Ldf/a$e;)Ldf/a$b;
    .locals 0

    iput-object p1, p0, Ldf/a$b;->a:Ldf/a$e;

    return-object p0
.end method

.method public e(Ldf/a$f;)Ldf/a$b;
    .locals 0

    iput-object p1, p0, Ldf/a$b;->d:Ldf/a$f;

    return-object p0
.end method
