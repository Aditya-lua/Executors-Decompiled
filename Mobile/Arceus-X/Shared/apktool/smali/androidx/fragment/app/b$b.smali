.class public final Landroidx/fragment/app/b$b;
.super Landroidx/fragment/app/b$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/fragment/app/b$b;",
        "Landroidx/fragment/app/b$f;",
        "Landroidx/fragment/app/i$d;",
        "operation",
        "",
        "isPop",
        "<init>",
        "(Landroidx/fragment/app/i$d;Z)V",
        "Landroid/content/Context;",
        "context",
        "Landroidx/fragment/app/d$a;",
        "c",
        "(Landroid/content/Context;)Landroidx/fragment/app/d$a;",
        "b",
        "Z",
        "isAnimLoaded",
        "d",
        "Landroidx/fragment/app/d$a;",
        "animation",
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
.field public final b:Z

.field public c:Z

.field public d:Landroidx/fragment/app/d$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/i$d;Z)V
    .locals 1
    .param p1    # Landroidx/fragment/app/i$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/fragment/app/b$f;-><init>(Landroidx/fragment/app/i$d;)V

    iput-boolean p2, p0, Landroidx/fragment/app/b$b;->b:Z

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Landroidx/fragment/app/d$a;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/b$b;->c:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/b$b;->d:Landroidx/fragment/app/d$a;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object v1

    sget-object v2, Landroidx/fragment/app/i$d$b;->c:Landroidx/fragment/app/i$d$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Landroidx/fragment/app/b$b;->b:Z

    invoke-static {p1, v0, v1, v2}, Landroidx/fragment/app/d;->b(Landroid/content/Context;Landroidx/fragment/app/c;ZZ)Landroidx/fragment/app/d$a;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/b$b;->d:Landroidx/fragment/app/d$a;

    iput-boolean v3, p0, Landroidx/fragment/app/b$b;->c:Z

    return-object p1
.end method
