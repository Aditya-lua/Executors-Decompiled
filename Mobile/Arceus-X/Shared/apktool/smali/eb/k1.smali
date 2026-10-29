.class public final Leb/k1;
.super Leb/g1;
.source "SourceFile"


# instance fields
.field public final synthetic c:Leb/l1;


# direct methods
.method public constructor <init>(Leb/l1;)V
    .locals 0

    iput-object p1, p0, Leb/k1;->c:Leb/l1;

    invoke-direct {p0}, Leb/g1;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Leb/c2;
    .locals 2

    invoke-virtual {p0}, Leb/h1;->i()Leb/e1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leb/e1;->l(I)Leb/d2;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Leb/h1;->i()Leb/e1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leb/e1;->l(I)Leb/d2;

    move-result-object v0

    return-object v0
.end method

.method public final k()Leb/e1;
    .locals 1

    new-instance v0, Leb/j1;

    invoke-direct {v0, p0}, Leb/j1;-><init>(Leb/k1;)V

    return-object v0
.end method

.method public final t()Leb/f1;
    .locals 1

    iget-object v0, p0, Leb/k1;->c:Leb/l1;

    return-object v0
.end method
