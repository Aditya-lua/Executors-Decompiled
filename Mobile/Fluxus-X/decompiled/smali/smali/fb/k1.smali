.class public final Lfb/k1;
.super Lfb/g1;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lfb/l1;


# direct methods
.method public constructor <init>(Lfb/l1;)V
    .locals 0

    iput-object p1, p0, Lfb/k1;->c:Lfb/l1;

    invoke-direct {p0}, Lfb/g1;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Lfb/c2;
    .locals 2

    invoke-virtual {p0}, Lfb/h1;->i()Lfb/e1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lfb/e1;->l(I)Lfb/d2;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lfb/h1;->i()Lfb/e1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lfb/e1;->l(I)Lfb/d2;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lfb/e1;
    .locals 1

    new-instance v0, Lfb/j1;

    invoke-direct {v0, p0}, Lfb/j1;-><init>(Lfb/k1;)V

    return-object v0
.end method

.method public final q()Lfb/f1;
    .locals 1

    iget-object v0, p0, Lfb/k1;->c:Lfb/l1;

    return-object v0
.end method
