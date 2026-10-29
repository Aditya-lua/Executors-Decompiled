.class public final Lx5/g0;
.super Lx5/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/g0$a;,
        Lx5/g0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\u0008B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "Lx5/g0;",
        "Lx5/q0;",
        "Lx5/g0$a;",
        "builder",
        "<init>",
        "(Lx5/g0$a;)V",
        "e",
        "a",
        "b",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lx5/g0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx5/g0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx5/g0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lx5/g0;->e:Lx5/g0$b;

    return-void
.end method

.method public constructor <init>(Lx5/g0$a;)V
    .locals 2
    .param p1    # Lx5/g0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx5/q0$a;->e()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1}, Lx5/q0$a;->h()Lf6/j0;

    move-result-object v1

    invoke-virtual {p1}, Lx5/q0$a;->f()Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lx5/q0;-><init>(Ljava/util/UUID;Lf6/j0;Ljava/util/Set;)V

    return-void
.end method
