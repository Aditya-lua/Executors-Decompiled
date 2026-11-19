.class public final Lsw/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lmv/h0;

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final c:Lmv/i0;


# direct methods
.method public constructor <init>(Lmv/h0;Ljava/lang/Object;Lmv/i0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/h0;",
            "TT;",
            "Lmv/i0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw/x;->a:Lmv/h0;

    iput-object p2, p0, Lsw/x;->b:Ljava/lang/Object;

    iput-object p3, p0, Lsw/x;->c:Lmv/i0;

    return-void
.end method

.method public static c(ILmv/i0;)Lsw/x;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lmv/i0;",
            ")",
            "Lsw/x<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "body == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/16 v0, 0x190

    if-lt p0, v0, :cond_0

    new-instance v0, Lmv/h0$a;

    invoke-direct {v0}, Lmv/h0$a;-><init>()V

    new-instance v1, Lsw/q$c;

    invoke-virtual {p1}, Lmv/i0;->f()Lmv/b0;

    move-result-object v2

    invoke-virtual {p1}, Lmv/i0;->e()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lsw/q$c;-><init>(Lmv/b0;J)V

    invoke-virtual {v0, v1}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object p0

    const-string v0, "Response.error()"

    invoke-virtual {p0, v0}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object p0

    sget-object v0, Lmv/e0;->d:Lmv/e0;

    invoke-virtual {p0, v0}, Lmv/h0$a;->o(Lmv/e0;)Lmv/h0$a;

    move-result-object p0

    new-instance v0, Lmv/f0$a;

    invoke-direct {v0}, Lmv/f0$a;-><init>()V

    const-string v1, "http://localhost/"

    invoke-virtual {v0, v1}, Lmv/f0$a;->t(Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p0

    invoke-static {p1, p0}, Lsw/x;->d(Lmv/i0;Lmv/h0;)Lsw/x;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "code < 400: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static d(Lmv/i0;Lmv/h0;)Lsw/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmv/i0;",
            "Lmv/h0;",
            ")",
            "Lsw/x<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "body == null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Lmv/h0;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lsw/x;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lsw/x;-><init>(Lmv/h0;Ljava/lang/Object;Lmv/i0;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse should not be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i(Ljava/lang/Object;)Lsw/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lsw/x<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lmv/h0$a;

    invoke-direct {v0}, Lmv/h0$a;-><init>()V

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object v0

    const-string v1, "OK"

    invoke-virtual {v0, v1}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object v0

    sget-object v1, Lmv/e0;->d:Lmv/e0;

    invoke-virtual {v0, v1}, Lmv/h0$a;->o(Lmv/e0;)Lmv/h0$a;

    move-result-object v0

    new-instance v1, Lmv/f0$a;

    invoke-direct {v1}, Lmv/f0$a;-><init>()V

    const-string v2, "http://localhost/"

    invoke-virtual {v1, v2}, Lmv/f0$a;->t(Ljava/lang/String;)Lmv/f0$a;

    move-result-object v1

    invoke-virtual {v1}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v0

    invoke-static {p0, v0}, Lsw/x;->j(Ljava/lang/Object;Lmv/h0;)Lsw/x;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/Object;Lmv/h0;)Lsw/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lmv/h0;",
            ")",
            "Lsw/x<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "rawResponse == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Lmv/h0;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lsw/x;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lsw/x;-><init>(Lmv/h0;Ljava/lang/Object;Lmv/i0;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse must be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lsw/x;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lsw/x;->a:Lmv/h0;

    invoke-virtual {v0}, Lmv/h0;->f()I

    move-result v0

    return v0
.end method

.method public e()Lmv/i0;
    .locals 1

    iget-object v0, p0, Lsw/x;->c:Lmv/i0;

    return-object v0
.end method

.method public f()Lmv/y;
    .locals 1

    iget-object v0, p0, Lsw/x;->a:Lmv/h0;

    invoke-virtual {v0}, Lmv/h0;->o()Lmv/y;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lsw/x;->a:Lmv/h0;

    invoke-virtual {v0}, Lmv/h0;->isSuccessful()Z

    move-result v0

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsw/x;->a:Lmv/h0;

    invoke-virtual {v0}, Lmv/h0;->p()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsw/x;->a:Lmv/h0;

    invoke-virtual {v0}, Lmv/h0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
