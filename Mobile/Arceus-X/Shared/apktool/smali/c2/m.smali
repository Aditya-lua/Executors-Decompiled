.class public Lc2/m;
.super Lc2/e;
.source "SourceFile"


# instance fields
.field public L0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc2/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc2/e;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(Lc2/e;)V
    .locals 1

    iget-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lc2/e;->K()Lc2/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc2/e;->K()Lc2/e;

    move-result-object v0

    check-cast v0, Lc2/m;

    invoke-virtual {v0, p1}, Lc2/m;->u1(Lc2/e;)V

    :cond_0
    invoke-virtual {p1, p0}, Lc2/e;->d1(Lc2/e;)V

    return-void
.end method

.method public s1()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lc2/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    return-object v0
.end method

.method public t0()V
    .locals 1

    iget-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Lc2/e;->t0()V

    return-void
.end method

.method public t1()V
    .locals 4

    iget-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/e;

    instance-of v3, v2, Lc2/m;

    if-eqz v3, :cond_1

    check-cast v2, Lc2/m;

    invoke-virtual {v2}, Lc2/m;->t1()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public u1(Lc2/e;)V
    .locals 1

    iget-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lc2/e;->t0()V

    return-void
.end method

.method public v1()V
    .locals 1

    iget-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public w0(Lz1/c;)V
    .locals 3

    invoke-super {p0, p1}, Lc2/e;->w0(Lz1/c;)V

    iget-object v0, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/e;

    invoke-virtual {v2, p1}, Lc2/e;->w0(Lz1/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
