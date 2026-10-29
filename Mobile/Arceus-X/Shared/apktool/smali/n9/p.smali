.class public Ln9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Ln9/q;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Ln9/r;->b:Ln9/r;

    invoke-static {p0, v0}, Ln9/p;->b(Landroid/content/Context;Ln9/r;)Ln9/q;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ln9/r;)Ln9/q;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ln9/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lp9/d;

    invoke-direct {v0, p0, p1}, Lp9/d;-><init>(Landroid/content/Context;Ln9/r;)V

    return-object v0
.end method
