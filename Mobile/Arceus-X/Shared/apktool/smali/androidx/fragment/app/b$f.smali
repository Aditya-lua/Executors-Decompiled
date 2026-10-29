.class public Landroidx/fragment/app/b$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008R\u0011\u0010\u000c\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/fragment/app/b$f;",
        "",
        "Landroidx/fragment/app/i$d;",
        "operation",
        "<init>",
        "(Landroidx/fragment/app/i$d;)V",
        "a",
        "Landroidx/fragment/app/i$d;",
        "()Landroidx/fragment/app/i$d;",
        "",
        "b",
        "()Z",
        "isVisibilityUnchanged",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroidx/fragment/app/i$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/i$d;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/i$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/b$f;->a:Landroidx/fragment/app/i$d;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/fragment/app/i$d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/b$f;->a:Landroidx/fragment/app/i$d;

    return-object v0
.end method

.method public final b()Z
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/b$f;->a:Landroidx/fragment/app/i$d;

    invoke-virtual {v0}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/c;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    sget-object v1, Landroidx/fragment/app/i$d$b;->a:Landroidx/fragment/app/i$d$b$a;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/i$d$b$a;->a(Landroid/view/View;)Landroidx/fragment/app/i$d$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/b$f;->a:Landroidx/fragment/app/i$d;

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object v1

    if-eq v0, v1, :cond_2

    sget-object v2, Landroidx/fragment/app/i$d$b;->c:Landroidx/fragment/app/i$d$b;

    if-eq v0, v2, :cond_1

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
