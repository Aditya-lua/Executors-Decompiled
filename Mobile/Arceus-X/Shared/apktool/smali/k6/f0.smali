.class public final Lk6/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lk6/d0$a;",
        "a",
        "Lk6/d0$a;",
        "DefaultSingletonImageLoaderFactory",
        "Lk6/l$c;",
        "",
        "b",
        "Lk6/l$c;",
        "DefaultSingletonImageLoaderKey",
        "coil_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lk6/d0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk6/e0;

    invoke-direct {v0}, Lk6/e0;-><init>()V

    sput-object v0, Lk6/f0;->a:Lk6/d0$a;

    new-instance v0, Lk6/l$c;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lk6/f0;->b:Lk6/l$c;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Lk6/s;
    .locals 0

    invoke-static {p0}, Lk6/f0;->b(Landroid/content/Context;)Lk6/s;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/content/Context;)Lk6/s;
    .locals 3

    new-instance v0, Lk6/s$a;

    invoke-direct {v0, p0}, Lk6/s$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lk6/s$a;->j()Lk6/l$a;

    move-result-object p0

    sget-object v1, Lk6/f0;->b:Lk6/l$c;

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p0, v1, v2}, Lk6/l$a;->b(Lk6/l$c;Ljava/lang/Object;)Lk6/l$a;

    invoke-virtual {v0}, Lk6/s$a;->d()Lk6/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lk6/d0$a;
    .locals 1

    sget-object v0, Lk6/f0;->a:Lk6/d0$a;

    return-object v0
.end method
