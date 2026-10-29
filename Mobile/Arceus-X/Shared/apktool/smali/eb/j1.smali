.class public final Leb/j1;
.super Leb/e1;
.source "SourceFile"


# instance fields
.field public final synthetic c:Leb/k1;


# direct methods
.method public constructor <init>(Leb/k1;)V
    .locals 0

    iput-object p1, p0, Leb/j1;->c:Leb/k1;

    invoke-direct {p0}, Leb/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    iget-object v1, p0, Leb/j1;->c:Leb/k1;

    iget-object v1, v1, Leb/k1;->c:Leb/l1;

    invoke-static {v1}, Leb/l1;->k(Leb/l1;)Leb/v1;

    move-result-object v1

    iget-object v1, v1, Leb/v1;->e:Leb/e1;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Leb/j1;->c:Leb/k1;

    iget-object v2, v2, Leb/k1;->c:Leb/l1;

    invoke-static {v2}, Leb/l1;->d(Leb/l1;)Leb/e1;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Leb/j1;->c:Leb/k1;

    iget-object v0, v0, Leb/k1;->c:Leb/l1;

    invoke-virtual {v0}, Leb/l1;->size()I

    move-result v0

    return v0
.end method
