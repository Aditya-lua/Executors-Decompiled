.class public Lse/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lye/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/j0<",
            "Lre/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lye/s$a;

.field public final c:Lye/s$a;


# direct methods
.method public constructor <init>(Lye/j0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lye/j0<",
            "Lre/a;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lse/e$b;->a:Lye/j0;

    .line 4
    invoke-virtual {p1}, Lye/j0;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lye/y;->b()Lye/y;

    move-result-object v0

    invoke-virtual {v0}, Lye/y;->a()Lye/s;

    move-result-object v0

    .line 6
    invoke-static {p1}, Lye/u;->a(Lye/j0;)Lye/t;

    move-result-object p1

    .line 7
    const-string v1, "encrypt"

    const-string v2, "aead"

    invoke-interface {v0, p1, v2, v1}, Lye/s;->a(Lye/t;Ljava/lang/String;Ljava/lang/String;)Lye/s$a;

    move-result-object v1

    iput-object v1, p0, Lse/e$b;->b:Lye/s$a;

    .line 8
    const-string v1, "decrypt"

    invoke-interface {v0, p1, v2, v1}, Lye/s;->a(Lye/t;Ljava/lang/String;Ljava/lang/String;)Lye/s$a;

    move-result-object p1

    iput-object p1, p0, Lse/e$b;->c:Lye/s$a;

    return-void

    .line 9
    :cond_0
    sget-object p1, Lye/u;->a:Lye/s$a;

    iput-object p1, p0, Lse/e$b;->b:Lye/s$a;

    .line 10
    iput-object p1, p0, Lse/e$b;->c:Lye/s$a;

    return-void
.end method

.method public synthetic constructor <init>(Lye/j0;Lse/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lse/e$b;-><init>(Lye/j0;)V

    return-void
.end method


# virtual methods
.method public a([B[B)[B
    .locals 4

    :try_start_0
    iget-object v0, p0, Lse/e$b;->a:Lye/j0;

    invoke-virtual {v0}, Lye/j0;->d()Lye/j0$c;

    move-result-object v0

    invoke-virtual {v0}, Lye/j0$c;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre/a;

    invoke-interface {v0, p1, p2}, Lre/a;->a([B[B)[B

    move-result-object p2

    iget-object v0, p0, Lse/e$b;->b:Lye/s$a;

    iget-object v1, p0, Lse/e$b;->a:Lye/j0;

    invoke-virtual {v1}, Lye/j0;->d()Lye/j0$c;

    move-result-object v1

    invoke-virtual {v1}, Lye/j0$c;->c()I

    move-result v1

    array-length p1, p1

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, Lye/s$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    iget-object p2, p0, Lse/e$b;->b:Lye/s$a;

    invoke-interface {p2}, Lye/s$a;->b()V

    throw p1
.end method

.method public b([B[B)[B
    .locals 6

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lse/e$b;->a:Lye/j0;

    invoke-virtual {v1, v0}, Lye/j0;->e([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lye/j0$c;

    :try_start_0
    invoke-virtual {v1}, Lye/j0$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lre/a;

    invoke-interface {v2, p1, p2}, Lre/a;->b([B[B)[B

    move-result-object v2

    iget-object v3, p0, Lse/e$b;->c:Lye/s$a;

    invoke-virtual {v1}, Lye/j0$c;->c()I

    move-result v1

    array-length v4, p1

    int-to-long v4, v4

    invoke-interface {v3, v1, v4, v5}, Lye/s$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :cond_0
    iget-object v0, p0, Lse/e$b;->a:Lye/j0;

    invoke-virtual {v0}, Lye/j0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lye/j0$c;

    :try_start_1
    invoke-virtual {v1}, Lye/j0$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lre/a;

    invoke-interface {v2, p1, p2}, Lre/a;->b([B[B)[B

    move-result-object v2

    iget-object v3, p0, Lse/e$b;->c:Lye/s$a;

    invoke-virtual {v1}, Lye/j0$c;->c()I

    move-result v1

    array-length v4, p1

    int-to-long v4, v4

    invoke-interface {v3, v1, v4, v5}, Lye/s$a;->a(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :cond_1
    iget-object p1, p0, Lse/e$b;->c:Lye/s$a;

    invoke-interface {p1}, Lye/s$a;->b()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
