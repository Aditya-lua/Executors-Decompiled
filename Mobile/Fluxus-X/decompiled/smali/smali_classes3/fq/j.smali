.class public final Lfq/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/o;
.implements Lls/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfq/j$a;,
        Lfq/j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lln/o<",
        "Lfq/j$b;",
        ">;",
        "Lls/j<",
        "Lfq/j$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000e\u0012B!\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lfq/j;",
        "Lln/o;",
        "Lfq/j$b;",
        "Lls/j;",
        "Lg/d;",
        "Lg/i;",
        "resolvableApiLauncher",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Lg/d;Landroid/content/Context;)V",
        "Ldv/h;",
        "run",
        "()Ldv/h;",
        "b",
        "Lg/d;",
        "c",
        "Landroid/content/Context;",
        "a",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lg/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/d<",
            "Lg/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg/d;Landroid/content/Context;)V
    .locals 1
    .param p1    # Lg/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/d<",
            "Lg/i;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const-string v0, "resolvableApiLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/j;->b:Lg/d;

    iput-object p2, p0, Lfq/j;->c:Landroid/content/Context;

    return-void
.end method

.method public static final synthetic d(Lfq/j;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lfq/j;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lfq/j;)Lg/d;
    .locals 0

    iget-object p0, p0, Lfq/j;->b:Lg/d;

    return-object p0
.end method


# virtual methods
.method public a(Lln/o;)Z
    .locals 0
    .param p1    # Lln/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/o<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Lln/o$b;->a(Lln/o;Lln/o;)Z

    move-result p1

    return p1
.end method

.method public b(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->b(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public c(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->c(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public run()Ldv/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lfq/j$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lfq/j$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfq/j$c;-><init>(Lfq/j;Leu/b;)V

    invoke-static {v0}, Ldv/j;->w(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v0

    return-object v0
.end method
