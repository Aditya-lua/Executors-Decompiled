.class public Lni/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lmv/a0$a;)Lmv/h0;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v0

    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Lmv/h0;->o()Lmv/y;

    move-result-object v0

    const-string v1, "Content-Encoding"

    invoke-virtual {v0, v1}, Lmv/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v1, "zstd"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "dcz"

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v0

    const/16 v1, 0x194

    invoke-virtual {v0, v1}, Lmv/h0$a;->f(I)Lmv/h0$a;

    move-result-object v0

    const-string v1, "Dictionary not found"

    invoke-virtual {v0, v1}, Lmv/h0$a;->l(Ljava/lang/String;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v1

    const-string v2, "X-Rbx-Zstd-Dict-SHA"

    invoke-virtual {v1, v2}, Lmv/f0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lmi/b;->b()Lmi/b;

    move-result-object v2

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lmi/b;->a(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 v1, 0x0

    :cond_4
    new-instance v0, Lcom/github/luben/zstd/ZstdInputStream;

    invoke-virtual {p1}, Lmv/h0;->b()Lmv/i0;

    move-result-object v2

    invoke-virtual {v2}, Lmv/i0;->a()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v0}, Lew/v;->j(Ljava/io/InputStream;)Lew/l0;

    move-result-object v2

    invoke-static {v2}, Lew/v;->c(Lew/l0;)Lew/g;

    move-result-object v2

    if-eqz v1, :cond_5

    invoke-virtual {v0, v1}, Lcom/github/luben/zstd/ZstdInputStream;->setDict([B)Lcom/github/luben/zstd/ZstdInputStream;

    :cond_5
    invoke-virtual {p1}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/i0;->f()Lmv/b0;

    move-result-object v0

    const-wide/16 v3, -0x1

    invoke-static {v0, v3, v4, v2}, Lmv/i0;->g(Lmv/b0;JLew/g;)Lmv/i0;

    move-result-object v0

    invoke-virtual {p1}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    :cond_6
    :goto_0
    return-object p1
.end method
