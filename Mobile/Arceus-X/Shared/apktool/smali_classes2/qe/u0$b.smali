.class public Lqe/u0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqe/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lqe/u0$d;

.field public b:Ljava/lang/String;

.field public c:Lqe/u0$c;

.field public d:Lqe/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqe/u0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqe/u0$b;-><init>()V

    return-void
.end method

.method public static b(Lqe/u0$c;Lqe/c;)Z
    .locals 2

    sget-object v0, Lqe/u0$c;->b:Lqe/u0$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    instance-of v0, p1, Lqe/u;

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lqe/u0$c;->d:Lqe/u0$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lqe/e0;

    if-eqz v0, :cond_1

    return v1

    :cond_1
    sget-object v0, Lqe/u0$c;->c:Lqe/u0$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Lqe/t1;

    if-eqz v0, :cond_2

    return v1

    :cond_2
    sget-object v0, Lqe/u0$c;->e:Lqe/u0$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p1, Lqe/k;

    if-eqz v0, :cond_3

    return v1

    :cond_3
    sget-object v0, Lqe/u0$c;->f:Lqe/u0$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    instance-of v0, p1, Lqe/p;

    if-eqz v0, :cond_4

    return v1

    :cond_4
    sget-object v0, Lqe/u0$c;->g:Lqe/u0$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    instance-of p0, p1, Lqe/z;

    if-eqz p0, :cond_5

    return v1

    :cond_5
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a()Lqe/u0;
    .locals 7

    iget-object v0, p0, Lqe/u0$b;->a:Lqe/u0$d;

    if-nez v0, :cond_0

    sget-object v0, Lqe/u0$d;->c:Lqe/u0$d;

    iput-object v0, p0, Lqe/u0$b;->a:Lqe/u0$d;

    :cond_0
    iget-object v0, p0, Lqe/u0$b;->b:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lqe/u0$b;->c:Lqe/u0$c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lqe/u0$b;->d:Lqe/c;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lpe/x;->a()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lqe/u0$b;->c:Lqe/u0$c;

    iget-object v1, p0, Lqe/u0$b;->d:Lqe/c;

    invoke-static {v0, v1}, Lqe/u0$b;->b(Lqe/u0$c;Lqe/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lqe/u0;

    iget-object v2, p0, Lqe/u0$b;->a:Lqe/u0$d;

    iget-object v3, p0, Lqe/u0$b;->b:Ljava/lang/String;

    iget-object v4, p0, Lqe/u0$b;->c:Lqe/u0$c;

    iget-object v5, p0, Lqe/u0$b;->d:Lqe/c;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lqe/u0;-><init>(Lqe/u0$d;Ljava/lang/String;Lqe/u0$c;Lqe/c;Lqe/u0$a;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot use parsing strategy "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lqe/u0$b;->c:Lqe/u0$c;

    invoke-virtual {v2}, Lqe/u0$c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " when new keys are picked according to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lqe/u0$b;->d:Lqe/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParametersForNewKeys must not have ID Requirements"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParametersForNewKeys must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParsingStrategy must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "kekUri must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Lqe/c;)Lqe/u0$b;
    .locals 0

    iput-object p1, p0, Lqe/u0$b;->d:Lqe/c;

    return-object p0
.end method

.method public d(Lqe/u0$c;)Lqe/u0$b;
    .locals 0

    iput-object p1, p0, Lqe/u0$b;->c:Lqe/u0$c;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lqe/u0$b;
    .locals 0

    iput-object p1, p0, Lqe/u0$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public f(Lqe/u0$d;)Lqe/u0$b;
    .locals 0

    iput-object p1, p0, Lqe/u0$b;->a:Lqe/u0$d;

    return-object p0
.end method
