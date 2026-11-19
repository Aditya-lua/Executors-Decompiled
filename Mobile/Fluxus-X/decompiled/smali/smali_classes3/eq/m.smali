.class public final Leq/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leq/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldv/g0<",
        "Leq/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0004\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0096A\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Leq/m;",
        "Ldv/g0;",
        "Leq/l;",
        "<init>",
        "()V",
        "output",
        "",
        "b",
        "(Leq/l;)Z",
        "Ldv/i;",
        "collector",
        "",
        "collect",
        "(Ldv/i;Leu/b;)Ljava/lang/Object;",
        "a",
        "nfc_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Leq/m$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ldv/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/b0<",
            "Leq/l;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final synthetic a:Ldv/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/b0<",
            "Leq/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Leq/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Leq/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Leq/m;->b:Leq/m$a;

    const/4 v0, 0x1

    sget-object v2, Lcv/a;->b:Lcv/a;

    const/4 v3, 0x0

    invoke-static {v3, v0, v2, v0, v1}, Ldv/i0;->b(IILcv/a;ILjava/lang/Object;)Ldv/b0;

    move-result-object v0

    sput-object v0, Leq/m;->c:Ldv/b0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Leq/m;->c:Ldv/b0;

    iput-object v0, p0, Leq/m;->a:Ldv/b0;

    return-void
.end method


# virtual methods
.method public final b(Leq/l;)Z
    .locals 1
    .param p1    # Leq/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leq/m;->c:Ldv/b0;

    invoke-interface {v0, p1}, Ldv/b0;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public collect(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ldv/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Leq/l;",
            ">;",
            "Leu/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Leq/m;->a:Ldv/b0;

    invoke-interface {v0, p1, p2}, Ldv/g0;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
