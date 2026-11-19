.class public Lo9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lo9/y;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lo9/z;->b:Lo9/z;

    invoke-static {p0, v0}, Lo9/x;->b(Landroid/content/Context;Lo9/z;)Lo9/y;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lo9/z;)Lo9/y;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lo9/z;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lq9/d;

    invoke-direct {v0, p0, p1}, Lq9/d;-><init>(Landroid/content/Context;Lo9/z;)V

    return-object v0
.end method
