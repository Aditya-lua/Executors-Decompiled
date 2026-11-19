.class public final Lf4/f$b;
.super Lf4/f$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/f;
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
        "Lf4/f$b;",
        "Lf4/f$f;",
        "Lf4/c1$d;",
        "operation",
        "",
        "isPop",
        "<init>",
        "(Lf4/c1$d;Z)V",
        "Landroid/content/Context;",
        "context",
        "Lf4/w$a;",
        "c",
        "(Landroid/content/Context;)Lf4/w$a;",
        "b",
        "Z",
        "isAnimLoaded",
        "d",
        "Lf4/w$a;",
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

.field public d:Lf4/w$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf4/c1$d;Z)V
    .locals 1
    .param p1    # Lf4/c1$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf4/f$f;-><init>(Lf4/c1$d;)V

    iput-boolean p2, p0, Lf4/f$b;->b:Z

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Lf4/w$a;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf4/f$b;->c:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lf4/f$b;->d:Lf4/w$a;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v0

    invoke-virtual {v0}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v0

    invoke-virtual {p0}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v1

    invoke-virtual {v1}, Lf4/c1$d;->g()Lf4/c1$d$b;

    move-result-object v1

    sget-object v2, Lf4/c1$d$b;->c:Lf4/c1$d$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Lf4/f$b;->b:Z

    invoke-static {p1, v0, v1, v2}, Lf4/w;->b(Landroid/content/Context;Lf4/q;ZZ)Lf4/w$a;

    move-result-object p1

    iput-object p1, p0, Lf4/f$b;->d:Lf4/w$a;

    iput-boolean v3, p0, Lf4/f$b;->c:Z

    return-object p1
.end method
