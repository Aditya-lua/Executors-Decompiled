.class public final Lz8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lz8/a;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lya/e;

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    new-instance v1, Lz8/e;

    invoke-direct {v1}, Lz8/e;-><init>()V

    invoke-direct {v0, p0, v1}, Lya/e;-><init>(Landroid/content/Context;Lz8/e;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lz8/c;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lya/o;

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    new-instance v1, Lz8/l;

    invoke-direct {v1}, Lz8/l;-><init>()V

    invoke-direct {v0, p0, v1}, Lya/o;-><init>(Landroid/content/Context;Lz8/l;)V

    return-object v0
.end method
