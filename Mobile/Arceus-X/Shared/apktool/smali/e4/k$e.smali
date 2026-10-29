.class public Le4/k$e;
.super Le4/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le4/k;->k()Le4/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le4/r;

.field public final synthetic b:Le4/k;


# direct methods
.method public constructor <init>(Le4/k;Le4/r;)V
    .locals 0

    iput-object p1, p0, Le4/k$e;->b:Le4/k;

    iput-object p2, p0, Le4/k$e;->a:Le4/r;

    invoke-direct {p0}, Le4/r;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Le4/k$e;->a:Le4/r;

    invoke-virtual {v0}, Le4/r;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le4/k$e;->a:Le4/r;

    invoke-virtual {v0, p1}, Le4/r;->d(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Le4/k$e;->b:Le4/k;

    invoke-virtual {v0, p1}, Le4/k;->l2(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Le4/k$e;->a:Le4/r;

    invoke-virtual {v0}, Le4/r;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le4/k$e;->b:Le4/k;

    invoke-virtual {v0}, Le4/k;->m2()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
