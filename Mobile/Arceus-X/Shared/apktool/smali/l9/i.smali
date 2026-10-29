.class public Ll9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll9/j;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll9/j;)V
    .locals 0
    .param p1    # Ll9/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/i;->a:Ll9/j;

    return-void
.end method

.method public static c(Landroid/app/Activity;)Ll9/j;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ll9/h;

    invoke-direct {v0, p0}, Ll9/h;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Ll9/i;->d(Ll9/h;)Ll9/j;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ll9/h;)Ll9/j;
    .locals 1
    .param p0    # Ll9/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ll9/h;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll9/h;->d()Le4/q;

    move-result-object p0

    invoke-static {p0}, Ll9/a2;->b2(Le4/q;)Ll9/a2;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ll9/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll9/h;->c()Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0}, Ll9/x1;->a(Landroid/app/Activity;)Ll9/x1;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can\'t get fragment for unexpected activity."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/io/PrintWriter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public b()Landroid/app/Activity;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/i;->a:Ll9/j;

    invoke-interface {v0}, Ll9/j;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public e(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method
