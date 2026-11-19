.class public Lf4/o$e;
.super Lf4/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/o;->k()Lf4/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/x;

.field public final synthetic b:Lf4/o;


# direct methods
.method public constructor <init>(Lf4/o;Lf4/x;)V
    .locals 0

    iput-object p1, p0, Lf4/o$e;->b:Lf4/o;

    iput-object p2, p0, Lf4/o$e;->a:Lf4/x;

    invoke-direct {p0}, Lf4/x;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lf4/o$e;->a:Lf4/x;

    invoke-virtual {v0}, Lf4/x;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/o$e;->a:Lf4/x;

    invoke-virtual {v0, p1}, Lf4/x;->d(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lf4/o$e;->b:Lf4/o;

    invoke-virtual {v0, p1}, Lf4/o;->l2(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lf4/o$e;->a:Lf4/x;

    invoke-virtual {v0}, Lf4/x;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf4/o$e;->b:Lf4/o;

    invoke-virtual {v0}, Lf4/o;->m2()Z

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
