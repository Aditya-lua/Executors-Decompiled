.class public abstract Llt/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llt/e$a;,
        Llt/e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Llt/e$a;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Llt/f;

    invoke-direct {v0, p0}, Llt/f;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lmt/a;->r()Lmt/a;

    move-result-object p0

    invoke-virtual {v0, p0}, Llt/f;->a(Llt/j;)Llt/e$a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;)Llt/e;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Llt/e;->a(Landroid/content/Context;)Llt/e$a;

    move-result-object p0

    invoke-static {}, Lmt/a;->r()Lmt/a;

    move-result-object v0

    invoke-interface {p0, v0}, Llt/e$a;->a(Llt/j;)Llt/e$a;

    move-result-object p0

    invoke-interface {p0}, Llt/e$a;->build()Llt/e;

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
