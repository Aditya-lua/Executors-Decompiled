.class public final Lfb/j1;
.super Lfb/e1;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lfb/k1;


# direct methods
.method public constructor <init>(Lfb/k1;)V
    .locals 0

    iput-object p1, p0, Lfb/j1;->c:Lfb/k1;

    invoke-direct {p0}, Lfb/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    iget-object v1, p0, Lfb/j1;->c:Lfb/k1;

    iget-object v1, v1, Lfb/k1;->c:Lfb/l1;

    invoke-static {v1}, Lfb/l1;->j(Lfb/l1;)Lfb/v1;

    move-result-object v1

    iget-object v1, v1, Lfb/v1;->e:Lfb/e1;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lfb/j1;->c:Lfb/k1;

    iget-object v2, v2, Lfb/k1;->c:Lfb/l1;

    invoke-static {v2}, Lfb/l1;->d(Lfb/l1;)Lfb/e1;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lfb/j1;->c:Lfb/k1;

    iget-object v0, v0, Lfb/k1;->c:Lfb/l1;

    invoke-virtual {v0}, Lfb/l1;->size()I

    move-result v0

    return v0
.end method
