.class public abstract Lus/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lus/e$a;,
        Lus/e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lus/e$a;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lus/f;

    invoke-direct {v0, p0}, Lus/f;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lvs/a;->r()Lvs/a;

    move-result-object p0

    invoke-virtual {v0, p0}, Lus/f;->a(Lus/j;)Lus/e$a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;)Lus/e;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lus/e;->a(Landroid/content/Context;)Lus/e$a;

    move-result-object p0

    invoke-static {}, Lvs/a;->r()Lvs/a;

    move-result-object v0

    invoke-interface {p0, v0}, Lus/e$a;->a(Lus/j;)Lus/e$a;

    move-result-object p0

    invoke-interface {p0}, Lus/e$a;->build()Lus/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract c(Landroid/widget/TextView;Ljava/lang/String;)V
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract d(Landroid/widget/TextView;Landroid/text/Spanned;)V
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/text/Spanned;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract e(Ljava/lang/String;)Landroid/text/Spanned;
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
