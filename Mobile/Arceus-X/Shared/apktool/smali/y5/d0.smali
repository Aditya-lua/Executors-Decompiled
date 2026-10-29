.class public final Ly5/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\u001a+\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lku/p0;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/a;",
        "configuration",
        "Landroidx/work/impl/WorkDatabase;",
        "db",
        "",
        "c",
        "(Lku/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V",
        "",
        "a",
        "Ljava/lang/String;",
        "TAG",
        "",
        "b",
        "J",
        "MAX_DELAY_MS",
        "work-runtime_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "UnfinishedWorkListener"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ly5/d0;->a:Ljava/lang/String;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ly5/d0;->b:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Ly5/d0;->b:J

    return-wide v0
.end method

.method public static final synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Ly5/d0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static final c(Lku/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 1
    .param p0    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/work/impl/WorkDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "db"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lg6/x;->b(Landroid/content/Context;Landroidx/work/a;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p3}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object p2

    invoke-interface {p2}, Lf6/k0;->s()Lnu/h;

    move-result-object p2

    new-instance p3, Ly5/d0$a;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ly5/d0$a;-><init>(Lnt/b;)V

    invoke-static {p2, p3}, Lnu/j;->I(Lnu/h;Lzt/o;)Lnu/h;

    move-result-object p2

    invoke-static {p2}, Lnu/j;->k(Lnu/h;)Lnu/h;

    move-result-object p2

    invoke-static {p2}, Lnu/j;->m(Lnu/h;)Lnu/h;

    move-result-object p2

    new-instance p3, Ly5/d0$b;

    invoke-direct {p3, p1, v0}, Ly5/d0$b;-><init>(Landroid/content/Context;Lnt/b;)V

    invoke-static {p2, p3}, Lnu/j;->E(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object p1

    invoke-static {p1, p0}, Lnu/j;->z(Lnu/h;Lku/p0;)Lku/d2;

    :cond_0
    return-void
.end method
