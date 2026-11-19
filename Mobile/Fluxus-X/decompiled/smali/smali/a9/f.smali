.class public final La9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)La9/c;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lza/e;

    invoke-static {p0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    new-instance v1, La9/n;

    invoke-direct {v1}, La9/n;-><init>()V

    invoke-direct {v0, p0, v1}, Lza/e;-><init>(Landroid/content/Context;La9/n;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)La9/i;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lza/o;

    invoke-static {p0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    new-instance v1, La9/y;

    invoke-direct {v1}, La9/y;-><init>()V

    invoke-direct {v0, p0, v1}, Lza/o;-><init>(Landroid/content/Context;La9/y;)V

    return-object v0
.end method
