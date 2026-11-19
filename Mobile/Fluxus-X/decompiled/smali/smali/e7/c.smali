.class public final Le7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le7/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Le7/c;",
        "Le7/d;",
        "Le7/e;",
        "target",
        "Ly6/k;",
        "result",
        "<init>",
        "(Le7/e;Ly6/k;)V",
        "",
        "a",
        "()V",
        "Le7/e;",
        "b",
        "Ly6/k;",
        "coil-core_release"
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
.field public final a:Le7/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ly6/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le7/e;Ly6/k;)V
    .locals 0
    .param p1    # Le7/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/c;->a:Le7/e;

    iput-object p2, p0, Le7/c;->b:Ly6/k;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Le7/c;->b:Ly6/k;

    instance-of v1, v0, Ly6/t;

    if-eqz v1, :cond_0

    iget-object v1, p0, Le7/c;->a:Le7/e;

    check-cast v0, Ly6/t;

    invoke-virtual {v0}, Ly6/t;->q()Ll6/n;

    move-result-object v0

    invoke-interface {v1, v0}, Lc7/c;->a(Ll6/n;)V

    return-void

    :cond_0
    instance-of v1, v0, Ly6/e;

    if-eqz v1, :cond_1

    iget-object v1, p0, Le7/c;->a:Le7/e;

    check-cast v0, Ly6/e;

    invoke-virtual {v0}, Ly6/e;->q()Ll6/n;

    move-result-object v0

    invoke-interface {v1, v0}, Lc7/c;->c(Ll6/n;)V

    return-void

    :cond_1
    new-instance v0, Lzt/l;

    invoke-direct {v0}, Lzt/l;-><init>()V

    throw v0
.end method
