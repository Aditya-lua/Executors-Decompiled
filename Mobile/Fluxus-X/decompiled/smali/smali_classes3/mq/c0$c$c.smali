.class public final Lmq/c0$c$c;
.super Lmq/c0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmq/c0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0013\u001a\u0004\u0008\u000c\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lmq/c0$c$c;",
        "Lmq/c0$c;",
        "Lxn/c;",
        "error",
        "",
        "poseScore",
        "Lxn/b;",
        "brightnessInfo",
        "",
        "isDimLightConditions",
        "<init>",
        "(Lxn/c;FLxn/b;Z)V",
        "a",
        "Lxn/c;",
        "b",
        "()Lxn/c;",
        "F",
        "c",
        "()F",
        "Lxn/b;",
        "()Lxn/b;",
        "d",
        "Z",
        "()Z",
        "selfie_release"
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
.field public final a:Lxn/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:F

.field public final c:Lxn/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Z


# direct methods
.method public constructor <init>(Lxn/c;FLxn/b;Z)V
    .locals 1
    .param p1    # Lxn/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lxn/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lmq/c0$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lmq/c0$c$c;->a:Lxn/c;

    iput p2, p0, Lmq/c0$c$c;->b:F

    iput-object p3, p0, Lmq/c0$c$c;->c:Lxn/b;

    iput-boolean p4, p0, Lmq/c0$c$c;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Lxn/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lmq/c0$c$c;->c:Lxn/b;

    return-object v0
.end method

.method public final b()Lxn/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmq/c0$c$c;->a:Lxn/c;

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lmq/c0$c$c;->b:F

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lmq/c0$c$c;->d:Z

    return v0
.end method
