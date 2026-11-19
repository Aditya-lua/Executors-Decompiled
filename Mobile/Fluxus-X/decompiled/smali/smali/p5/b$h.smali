.class public Lp5/b$h;
.super Lp5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public a:Z

.field public final b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lp5/x;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp5/b$h;->a:Z

    iput-object p1, p0, Lp5/b$h;->b:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public b(Lp5/q;)V
    .locals 2
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lp5/b$h;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lp5/b$h;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lp5/h0;->b(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Lp5/q;->q0(Lp5/q$h;)Lp5/q;

    return-void
.end method

.method public f(Lp5/q;)V
    .locals 1
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lp5/b$h;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lp5/h0;->b(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public h(Lp5/q;)V
    .locals 1
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lp5/b$h;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lp5/h0;->b(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public k(Lp5/q;)V
    .locals 1
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lp5/b$h;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lp5/h0;->b(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp5/b$h;->a:Z

    return-void
.end method
