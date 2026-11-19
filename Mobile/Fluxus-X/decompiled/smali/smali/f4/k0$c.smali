.class public Lf4/k0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/k0;


# direct methods
.method public constructor <init>(Lf4/k0;)V
    .locals 0

    iput-object p1, p0, Lf4/k0$c;->a:Lf4/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/Menu;)V
    .locals 1
    .param p1    # Landroid/view/Menu;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/k0$c;->a:Lf4/k0;

    invoke-virtual {v0, p1}, Lf4/k0;->P(Landroid/view/Menu;)V

    return-void
.end method

.method public b(Landroid/view/Menu;)V
    .locals 1
    .param p1    # Landroid/view/Menu;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/k0$c;->a:Lf4/k0;

    invoke-virtual {v0, p1}, Lf4/k0;->T(Landroid/view/Menu;)Z

    return-void
.end method

.method public c(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroid/view/MenuItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/k0$c;->a:Lf4/k0;

    invoke-virtual {v0, p1}, Lf4/k0;->O(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1
    .param p1    # Landroid/view/Menu;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf4/k0$c;->a:Lf4/k0;

    invoke-virtual {v0, p1, p2}, Lf4/k0;->H(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    return-void
.end method
