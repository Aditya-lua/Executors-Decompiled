.class public Lo2/c;
.super Lw8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw8/a<",
        "Lo2/c;",
        ">;"
    }
.end annotation


# instance fields
.field public e:[Lo2/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Shortcut"

    invoke-direct {p0, v0}, Lw8/a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs l([Lo2/a;)Lo2/c;
    .locals 1
    .param p1    # [Lo2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lo2/c;->e:[Lo2/a;

    const-string v0, "capability"

    invoke-virtual {p0, v0, p1}, Lw8/a;->c(Ljava/lang/String;[Lw8/a;)Lw8/a;

    move-result-object p1

    check-cast p1, Lo2/c;

    return-object p1
.end method

.method public m(Ljava/lang/String;)Lo2/c;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lw8/a;->d(Ljava/lang/String;)Lw8/a;

    const-string v0, "shortcutDescription"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw8/a;->b(Ljava/lang/String;[Ljava/lang/String;)Lw8/a;

    move-result-object p1

    check-cast p1, Lo2/c;

    return-object p1
.end method

.method public n(Ljava/lang/String;)Lo2/c;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lw8/a;->g(Ljava/lang/String;)Lw8/a;

    const-string v0, "shortcutLabel"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw8/a;->b(Ljava/lang/String;[Ljava/lang/String;)Lw8/a;

    move-result-object p1

    check-cast p1, Lo2/c;

    return-object p1
.end method

.method public o(Ljava/lang/String;)Lo2/c;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "shortcutUrl"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw8/a;->b(Ljava/lang/String;[Ljava/lang/String;)Lw8/a;

    move-result-object p1

    check-cast p1, Lo2/c;

    return-object p1
.end method
