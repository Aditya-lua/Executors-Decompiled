.class public final Laq/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laq/v$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldv/g0<",
        "Ljava/util/List<",
        "+",
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0004\u0018\u0000 \u00082\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ$\u0010\r\u001a\u00020\u000c2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0096A\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Laq/v;",
        "Ldv/g0;",
        "",
        "Landroid/net/Uri;",
        "<init>",
        "()V",
        "uri",
        "",
        "b",
        "(Ljava/util/List;)Z",
        "Ldv/i;",
        "collector",
        "",
        "collect",
        "(Ldv/i;Leu/b;)Ljava/lang/Object;",
        "a",
        "launchers_release"
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
.field public static final b:Laq/v$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ldv/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/b0<",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
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
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Laq/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Laq/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Laq/v;->b:Laq/v$a;

    const/4 v0, 0x1

    sget-object v2, Lcv/a;->b:Lcv/a;

    const/4 v3, 0x0

    invoke-static {v3, v0, v2, v0, v1}, Ldv/i0;->b(IILcv/a;ILjava/lang/Object;)Ldv/b0;

    move-result-object v0

    sput-object v0, Laq/v;->c:Ldv/b0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Laq/v;->c:Ldv/b0;

    iput-object v0, p0, Laq/v;->a:Ldv/b0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/util/List;)Z
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Laq/v;->c:Ldv/b0;

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
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;>;",
            "Leu/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Laq/v;->a:Ldv/b0;

    invoke-interface {v0, p1, p2}, Ldv/g0;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
