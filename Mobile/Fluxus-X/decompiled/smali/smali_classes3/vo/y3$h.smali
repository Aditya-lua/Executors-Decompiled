.class public final Lvo/y3$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvo/y3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvo/y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lvo/y3$h;",
        "Lvo/y3;",
        "Lkr/l;",
        "transition",
        "<init>",
        "(Lkr/l;)V",
        "a",
        "Lkr/l;",
        "b",
        "()Lkr/l;",
        "government-id_release"
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
.field public final a:Lkr/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lvo/y3$h;-><init>(Lkr/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkr/l;)V
    .locals 1
    .param p1    # Lkr/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "transition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lvo/y3$h;->a:Lkr/l;

    return-void
.end method

.method public synthetic constructor <init>(Lkr/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lkr/l;->c:Lkr/l;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lvo/y3$h;-><init>(Lkr/l;)V

    return-void
.end method


# virtual methods
.method public a(Lvo/y3;)Z
    .locals 0
    .param p1    # Lvo/y3;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lvo/y3;->a(Lvo/y3;)Z

    move-result p1

    return p1
.end method

.method public b()Lkr/l;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lvo/y3$h;->a:Lkr/l;

    return-object v0
.end method
