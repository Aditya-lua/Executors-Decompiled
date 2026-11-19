.class public final Lda/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lda/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lda/u;

.field public b:Lda/w;

.field public c:[B

.field public d:Ljava/util/List;

.field public e:Ljava/lang/Double;

.field public f:Ljava/util/List;

.field public g:Lda/k;

.field public h:Ljava/lang/Integer;

.field public i:Lda/a0;

.field public j:Lda/c;

.field public k:Lda/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lda/r;
    .locals 14
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lda/r;

    iget-object v1, p0, Lda/r$a;->a:Lda/u;

    iget-object v2, p0, Lda/r$a;->b:Lda/w;

    iget-object v3, p0, Lda/r$a;->c:[B

    iget-object v4, p0, Lda/r$a;->d:Ljava/util/List;

    iget-object v5, p0, Lda/r$a;->e:Ljava/lang/Double;

    iget-object v6, p0, Lda/r$a;->f:Ljava/util/List;

    iget-object v7, p0, Lda/r$a;->g:Lda/k;

    iget-object v8, p0, Lda/r$a;->h:Ljava/lang/Integer;

    iget-object v9, p0, Lda/r$a;->i:Lda/a0;

    iget-object v10, p0, Lda/r$a;->j:Lda/c;

    if-nez v10, :cond_0

    const/4 v10, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v10}, Lda/c;->toString()Ljava/lang/String;

    move-result-object v10

    :goto_0
    iget-object v11, p0, Lda/r$a;->k:Lda/d;

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v0 .. v13}, Lda/r;-><init>(Lda/u;Lda/w;[BLjava/util/List;Ljava/lang/Double;Ljava/util/List;Lda/k;Ljava/lang/Integer;Lda/a0;Ljava/lang/String;Lda/d;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    return-object v0
.end method

.method public b(Lda/c;)Lda/r$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lda/r$a;->j:Lda/c;

    return-object p0
.end method

.method public c(Lda/d;)Lda/r$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lda/r$a;->k:Lda/d;

    return-object p0
.end method

.method public d(Lda/k;)Lda/r$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lda/r$a;->g:Lda/k;

    return-object p0
.end method

.method public e([B)Lda/r$a;
    .locals 0
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lda/r$a;->c:[B

    return-object p0
.end method

.method public f(Ljava/util/List;)Lda/r$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lda/s;",
            ">;)",
            "Lda/r$a;"
        }
    .end annotation

    iput-object p1, p0, Lda/r$a;->f:Ljava/util/List;

    return-object p0
.end method

.method public g(Ljava/util/List;)Lda/r$a;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lda/t;",
            ">;)",
            "Lda/r$a;"
        }
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lda/r$a;->d:Ljava/util/List;

    return-object p0
.end method

.method public h(Lda/u;)Lda/r$a;
    .locals 0
    .param p1    # Lda/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lda/u;

    iput-object p1, p0, Lda/r$a;->a:Lda/u;

    return-object p0
.end method

.method public i(Ljava/lang/Double;)Lda/r$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lda/r$a;->e:Ljava/lang/Double;

    return-object p0
.end method

.method public j(Lda/w;)Lda/r$a;
    .locals 0
    .param p1    # Lda/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lda/w;

    iput-object p1, p0, Lda/r$a;->b:Lda/w;

    return-object p0
.end method
