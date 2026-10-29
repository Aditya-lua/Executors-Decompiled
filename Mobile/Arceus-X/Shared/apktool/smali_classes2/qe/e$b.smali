.class public Lqe/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqe/e;
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
            "Lpe/a;",
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
            "Lpe/a;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lqe/e$b;->a:Lwe/j0;

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
    const-string v1, "encrypt"

    const-string v2, "aead"

    invoke-interface {v0, p1, v2, v1}, Lwe/s;->a(Lwe/t;Ljava/lang/String;Ljava/lang/String;)Lwe/s$a;

    move-result-object v1

    iput-object v1, p0, Lqe/e$b;->b:Lwe/s$a;

    .line 8
    const-string v1, "decrypt"

    invoke-interface {v0, p1, v2, v1}, Lwe/s;->a(Lwe/t;Ljava/lang/String;Ljava/lang/String;)Lwe/s$a;

    move-result-object p1

    iput-object p1, p0, Lqe/e$b;->c:Lwe/s$a;

    return-void

    .line 9
    :cond_0
    sget-object p1, Lwe/u;->a:Lwe/s$a;

    iput-object p1, p0, Lqe/e$b;->b:Lwe/s$a;

    .line 10
    iput-object p1, p0, Lqe/e$b;->c:Lwe/s$a;

    return-void
.end method

.method public synthetic constructor <init>(Lwe/j0;Lqe/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lqe/e$b;-><init>(Lwe/j0;)V

    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4

    :try_start_0
    iget-object v0, p0, Lqe/e$b;->a:Lwe/j0;

    invoke-virtual {v0}, Lwe/j0;->d()Lwe/j0$c;

    move-result-object v0

    invoke-virtual {v0}, Lwe/j0$c;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpe/a;

    invoke-interface {v0, p1, p2}, Lpe/a;->a([B[B)[B

    move-result-object p2

    iget-object v0, p0, Lqe/e$b;->b:Lwe/s$a;

    iget-object v1, p0, Lqe/e$b;->a:Lwe/j0;

    invoke-virtual {v1}, Lwe/j0;->d()Lwe/j0$c;

    move-result-object v1

    invoke-virtual {v1}, Lwe/j0$c;->c()I

    move-result v1

    array-length p1, p1

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, Lwe/s$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    iget-object p2, p0, Lqe/e$b;->b:Lwe/s$a;

    invoke-interface {p2}, Lwe/s$a;->b()V

    throw p1
.end method

.method public b([B[B)[B
    .locals 6

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lqe/e$b;->a:Lwe/j0;

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

    check-cast v2, Lpe/a;

    invoke-interface {v2, p1, p2}, Lpe/a;->b([B[B)[B

    move-result-object v2

    iget-object v3, p0, Lqe/e$b;->c:Lwe/s$a;

    invoke-virtual {v1}, Lwe/j0$c;->c()I

    move-result v1

    array-length v4, p1

    int-to-long v4, v4

    invoke-interface {v3, v1, v4, v5}, Lwe/s$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :cond_0
    iget-object v0, p0, Lqe/e$b;->a:Lwe/j0;

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

    check-cast v2, Lpe/a;

    invoke-interface {v2, p1, p2}, Lpe/a;->b([B[B)[B

    move-result-object v2

    iget-object v3, p0, Lqe/e$b;->c:Lwe/s$a;

    invoke-virtual {v1}, Lwe/j0$c;->c()I

    move-result v1

    array-length v4, p1

    int-to-long v4, v4

    invoke-interface {v3, v1, v4, v5}, Lwe/s$a;->a(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :cond_1
    iget-object p1, p0, Lqe/e$b;->c:Lwe/s$a;

    invoke-interface {p1}, Lwe/s$a;->b()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
