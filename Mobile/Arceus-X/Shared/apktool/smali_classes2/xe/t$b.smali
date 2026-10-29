.class public Lxe/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lwe/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/j0<",
            "Lpe/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwe/s$a;

.field public final c:Lwe/s$a;


# direct methods
.method public constructor <init>(Lwe/j0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/j0<",
            "Lpe/w;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lxe/t$b;->a:Lwe/j0;

    .line 4
    invoke-virtual {p1}, Lwe/j0;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lwe/y;->b()Lwe/y;

    move-result-object v0

    invoke-virtual {v0}, Lwe/y;->a()Lwe/s;

    move-result-object v0

    .line 6
    invoke-static {p1}, Lwe/u;->a(Lwe/j0;)Lwe/t;

    move-result-object p1

    .line 7
    const-string v1, "compute"

    const-string v2, "mac"

    invoke-interface {v0, p1, v2, v1}, Lwe/s;->a(Lwe/t;Ljava/lang/String;Ljava/lang/String;)Lwe/s$a;

    move-result-object v1

    iput-object v1, p0, Lxe/t$b;->b:Lwe/s$a;

    .line 8
    const-string v1, "verify"

    invoke-interface {v0, p1, v2, v1}, Lwe/s;->a(Lwe/t;Ljava/lang/String;Ljava/lang/String;)Lwe/s$a;

    move-result-object p1

    iput-object p1, p0, Lxe/t$b;->c:Lwe/s$a;

    return-void

    .line 9
    :cond_0
    sget-object p1, Lwe/u;->a:Lwe/s$a;

    iput-object p1, p0, Lxe/t$b;->b:Lwe/s$a;

    .line 10
    iput-object p1, p0, Lxe/t$b;->c:Lwe/s$a;

    return-void
.end method

.method public synthetic constructor <init>(Lwe/j0;Lxe/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxe/t$b;-><init>(Lwe/j0;)V

    return-void
.end method


# virtual methods
.method public a([B[B)V
    .locals 5

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_2

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lxe/t$b;->a:Lwe/j0;

    invoke-virtual {v1, v0}, Lwe/j0;->e([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwe/j0$c;

    :try_start_0
    invoke-virtual {v1}, Lwe/j0$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpe/w;

    invoke-interface {v2, p1, p2}, Lpe/w;->a([B[B)V

    iget-object v2, p0, Lxe/t$b;->c:Lwe/s$a;

    invoke-virtual {v1}, Lwe/j0$c;->c()I

    move-result v1

    array-length v3, p2

    int-to-long v3, v3

    invoke-interface {v2, v1, v3, v4}, Lwe/s$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxe/t$b;->a:Lwe/j0;

    invoke-virtual {v0}, Lwe/j0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwe/j0$c;

    :try_start_1
    invoke-virtual {v1}, Lwe/j0$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpe/w;

    invoke-interface {v2, p1, p2}, Lpe/w;->a([B[B)V

    iget-object v2, p0, Lxe/t$b;->c:Lwe/s$a;

    invoke-virtual {v1}, Lwe/j0$c;->c()I

    move-result v1

    array-length v3, p2

    int-to-long v3, v3

    invoke-interface {v2, v1, v3, v4}, Lwe/s$a;->a(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    return-void

    :cond_1
    iget-object p1, p0, Lxe/t$b;->c:Lwe/s$a;

    invoke-interface {p1}, Lwe/s$a;->b()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p0, Lxe/t$b;->c:Lwe/s$a;

    invoke-interface {p1}, Lwe/s$a;->b()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "tag too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B)[B
    .locals 5

    :try_start_0
    iget-object v0, p0, Lxe/t$b;->a:Lwe/j0;

    invoke-virtual {v0}, Lwe/j0;->d()Lwe/j0$c;

    move-result-object v0

    invoke-virtual {v0}, Lwe/j0$c;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpe/w;

    invoke-interface {v0, p1}, Lpe/w;->b([B)[B

    move-result-object v0

    iget-object v1, p0, Lxe/t$b;->b:Lwe/s$a;

    iget-object v2, p0, Lxe/t$b;->a:Lwe/j0;

    invoke-virtual {v2}, Lwe/j0;->d()Lwe/j0$c;

    move-result-object v2

    invoke-virtual {v2}, Lwe/j0$c;->c()I

    move-result v2

    array-length p1, p1

    int-to-long v3, p1

    invoke-interface {v1, v2, v3, v4}, Lwe/s$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lxe/t$b;->b:Lwe/s$a;

    invoke-interface {v0}, Lwe/s$a;->b()V

    throw p1
.end method
