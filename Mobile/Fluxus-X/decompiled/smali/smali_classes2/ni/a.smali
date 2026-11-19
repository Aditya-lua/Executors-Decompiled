.class public Lni/a;
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
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0;->m()Lmv/z;

    move-result-object v1

    invoke-virtual {v1}, Lmv/z;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".*/settings-compressed/application/[^/]+/(?:bucket/[^/]+/)?[^/]+\\.dcz"

    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    const-string v2, ".dcz"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object v0

    const-string v2, "X-Rbx-Zstd-Dict-SHA"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v0

    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1

    return-object p1
.end method
