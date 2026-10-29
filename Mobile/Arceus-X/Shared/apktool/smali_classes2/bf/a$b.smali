.class public final Lbf/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lbf/a$e;

.field public b:Lbf/a$c;

.field public c:Lbf/a$d;

.field public d:Lbf/a$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lbf/a$b;->a:Lbf/a$e;

    .line 4
    iput-object v0, p0, Lbf/a$b;->b:Lbf/a$c;

    .line 5
    iput-object v0, p0, Lbf/a$b;->c:Lbf/a$d;

    .line 6
    sget-object v0, Lbf/a$f;->e:Lbf/a$f;

    iput-object v0, p0, Lbf/a$b;->d:Lbf/a$f;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbf/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lbf/a;
    .locals 6

    iget-object v1, p0, Lbf/a$b;->a:Lbf/a$e;

    if-eqz v1, :cond_9

    iget-object v2, p0, Lbf/a$b;->b:Lbf/a$c;

    if-eqz v2, :cond_8

    iget-object v3, p0, Lbf/a$b;->c:Lbf/a$d;

    if-eqz v3, :cond_7

    iget-object v4, p0, Lbf/a$b;->d:Lbf/a$f;

    if-eqz v4, :cond_6

    sget-object v0, Lbf/a$c;->c:Lbf/a$c;

    if-ne v2, v0, :cond_1

    sget-object v0, Lbf/a$d;->b:Lbf/a$d;

    if-ne v3, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P256 requires SHA256"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    sget-object v0, Lbf/a$c;->d:Lbf/a$c;

    if-ne v2, v0, :cond_3

    sget-object v0, Lbf/a$d;->c:Lbf/a$d;

    if-eq v3, v0, :cond_3

    sget-object v0, Lbf/a$d;->d:Lbf/a$d;

    if-ne v3, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P384 requires SHA384 or SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v0, Lbf/a$c;->e:Lbf/a$c;

    if-ne v2, v0, :cond_5

    sget-object v0, Lbf/a$d;->d:Lbf/a$d;

    if-ne v3, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P521 requires SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    new-instance v0, Lbf/a;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lbf/a;-><init>(Lbf/a$e;Lbf/a$c;Lbf/a$d;Lbf/a$f;Lbf/a$a;)V

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

.method public b(Lbf/a$c;)Lbf/a$b;
    .locals 0

    iput-object p1, p0, Lbf/a$b;->b:Lbf/a$c;

    return-object p0
.end method

.method public c(Lbf/a$d;)Lbf/a$b;
    .locals 0

    iput-object p1, p0, Lbf/a$b;->c:Lbf/a$d;

    return-object p0
.end method

.method public d(Lbf/a$e;)Lbf/a$b;
    .locals 0

    iput-object p1, p0, Lbf/a$b;->a:Lbf/a$e;

    return-object p0
.end method

.method public e(Lbf/a$f;)Lbf/a$b;
    .locals 0

    iput-object p1, p0, Lbf/a$b;->d:Lbf/a$f;

    return-object p0
.end method
