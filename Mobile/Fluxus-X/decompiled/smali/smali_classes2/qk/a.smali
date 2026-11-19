.class public final Lqk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lqk/a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll6/s;",
        "a",
        "(Landroid/content/Context;)Ll6/s;",
        "NativeShell_googleProdRelease"
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
.field public static final a:Lqk/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqk/a;

    invoke-direct {v0}, Lqk/a;-><init>()V

    sput-object v0, Lqk/a;->a:Lqk/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ll6/s;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll6/s$a;

    invoke-direct {v0, p1}, Ll6/s$a;-><init>(Landroid/content/Context;)V

    new-instance v1, Lt6/d$a;

    invoke-direct {v1}, Lt6/d$a;-><init>()V

    const-wide v2, 0x3fc3333333333333L    # 0.15

    invoke-virtual {v1, p1, v2, v3}, Lt6/d$a;->c(Landroid/content/Context;D)Lt6/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lt6/d$a;->b()Lt6/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll6/s$a;->k(Lt6/d;)Ll6/s$a;

    move-result-object v0

    new-instance v1, Lo6/a$a;

    invoke-direct {v1}, Lo6/a$a;-><init>()V

    const-wide/32 v2, 0xa00000

    invoke-virtual {v1, v2, v3}, Lo6/a$a;->c(J)Lo6/a$a;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v2, "getCacheDir(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "img_cache"

    invoke-static {p1, v2}, Llu/k;->s(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-static {v1, p1}, Lo6/b;->a(Lo6/a$a;Ljava/io/File;)Lo6/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lo6/a$a;->a()Lo6/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll6/s$a;->i(Lo6/a;)Ll6/s$a;

    move-result-object p1

    invoke-virtual {p1}, Ll6/s$a;->d()Ll6/s;

    move-result-object p1

    return-object p1
.end method
