.class public final Lx3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JU\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00080\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JU\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00122\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00080\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lx3/e;",
        "",
        "<init>",
        "()V",
        "Lu3/b;",
        "Lx3/f;",
        "corruptionHandler",
        "",
        "Lt3/g;",
        "migrations",
        "Lku/p0;",
        "scope",
        "Lkotlin/Function0;",
        "Ljava/io/File;",
        "produceFile",
        "Lt3/i;",
        "b",
        "(Lu3/b;Ljava/util/List;Lku/p0;Lkotlin/jvm/functions/Function0;)Lt3/i;",
        "Lt3/e0;",
        "storage",
        "a",
        "(Lt3/e0;Lu3/b;Ljava/util/List;Lku/p0;)Lt3/i;",
        "datastore-preferences-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lx3/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx3/e;

    invoke-direct {v0}, Lx3/e;-><init>()V

    sput-object v0, Lx3/e;->a:Lx3/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lt3/e0;Lu3/b;Ljava/util/List;Lku/p0;)Lt3/i;
    .locals 2
    .param p1    # Lt3/e0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lu3/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/e0<",
            "Lx3/f;",
            ">;",
            "Lu3/b<",
            "Lx3/f;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lt3/g<",
            "Lx3/f;",
            ">;>;",
            "Lku/p0;",
            ")",
            "Lt3/i<",
            "Lx3/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx3/d;

    sget-object v1, Lt3/j;->a:Lt3/j;

    invoke-virtual {v1, p1, p2, p3, p4}, Lt3/j;->b(Lt3/e0;Lu3/b;Ljava/util/List;Lku/p0;)Lt3/i;

    move-result-object p1

    invoke-direct {v0, p1}, Lx3/d;-><init>(Lt3/i;)V

    return-object v0
.end method

.method public final b(Lu3/b;Ljava/util/List;Lku/p0;Lkotlin/jvm/functions/Function0;)Lt3/i;
    .locals 7
    .param p1    # Lu3/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/b<",
            "Lx3/f;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lt3/g<",
            "Lx3/f;",
            ">;>;",
            "Lku/p0;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lt3/i<",
            "Lx3/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "migrations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceFile"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt3/o;

    sget-object v2, Lx3/h;->a:Lx3/h;

    new-instance v4, Lx3/e$a;

    invoke-direct {v4, p4}, Lx3/e$a;-><init>(Lkotlin/jvm/functions/Function0;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lt3/o;-><init>(Lt3/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1, p1, p2, p3}, Lx3/e;->a(Lt3/e0;Lu3/b;Ljava/util/List;Lku/p0;)Lt3/i;

    move-result-object p1

    new-instance p2, Lx3/d;

    invoke-direct {p2, p1}, Lx3/d;-><init>(Lt3/i;)V

    return-object p2
.end method
