.class public final Lm6/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm6/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lm6/c$c;",
        "Lm6/i$a;",
        "Luu/h;",
        "parallelismLock",
        "Lm6/o;",
        "exifOrientationStrategy",
        "<init>",
        "(Luu/h;Lm6/o;)V",
        "Lo6/o;",
        "result",
        "Lx6/p;",
        "options",
        "Lk6/s;",
        "imageLoader",
        "Lm6/i;",
        "a",
        "(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;",
        "Luu/h;",
        "b",
        "Lm6/o;",
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
.field public final a:Luu/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lm6/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Luu/h;Lm6/o;)V
    .locals 0
    .param p1    # Luu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lm6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6/c$c;->a:Luu/h;

    iput-object p2, p0, Lm6/c$c;->b:Lm6/o;

    return-void
.end method


# virtual methods
.method public a(Lo6/o;Lx6/p;Lk6/s;)Lm6/i;
    .locals 2
    .param p1    # Lo6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lk6/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p3, Lm6/c;

    invoke-virtual {p1}, Lo6/o;->c()Lm6/s;

    move-result-object p1

    iget-object v0, p0, Lm6/c$c;->a:Luu/h;

    iget-object v1, p0, Lm6/c$c;->b:Lm6/o;

    invoke-direct {p3, p1, p2, v0, v1}, Lm6/c;-><init>(Lm6/s;Lx6/p;Luu/h;Lm6/o;)V

    return-object p3
.end method
