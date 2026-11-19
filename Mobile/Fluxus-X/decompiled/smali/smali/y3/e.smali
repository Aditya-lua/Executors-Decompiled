.class public final Ly3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JU\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00080\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JU\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00122\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00080\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Ly3/e;",
        "",
        "<init>",
        "()V",
        "Lv3/b;",
        "Ly3/f;",
        "corruptionHandler",
        "",
        "Lu3/g;",
        "migrations",
        "Lav/p0;",
        "scope",
        "Lkotlin/Function0;",
        "Ljava/io/File;",
        "produceFile",
        "Lu3/i;",
        "b",
        "(Lv3/b;Ljava/util/List;Lav/p0;Lkotlin/jvm/functions/Function0;)Lu3/i;",
        "Lu3/e0;",
        "storage",
        "a",
        "(Lu3/e0;Lv3/b;Ljava/util/List;Lav/p0;)Lu3/i;",
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
.field public static final a:Ly3/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly3/e;

    invoke-direct {v0}, Ly3/e;-><init>()V

    sput-object v0, Ly3/e;->a:Ly3/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lu3/e0;Lv3/b;Ljava/util/List;Lav/p0;)Lu3/i;
    .locals 2
    .param p1    # Lu3/e0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lv3/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/e0<",
            "Ly3/f;",
            ">;",
            "Lv3/b<",
            "Ly3/f;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lu3/g<",
            "Ly3/f;",
            ">;>;",
            "Lav/p0;",
            ")",
            "Lu3/i<",
            "Ly3/f;",
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

    new-instance v0, Ly3/d;

    sget-object v1, Lu3/j;->a:Lu3/j;

    invoke-virtual {v1, p1, p2, p3, p4}, Lu3/j;->b(Lu3/e0;Lv3/b;Ljava/util/List;Lav/p0;)Lu3/i;

    move-result-object p1

    invoke-direct {v0, p1}, Ly3/d;-><init>(Lu3/i;)V

    return-object v0
.end method

.method public final b(Lv3/b;Ljava/util/List;Lav/p0;Lkotlin/jvm/functions/Function0;)Lu3/i;
    .locals 7
    .param p1    # Lv3/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lav/p0;
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
            "Lv3/b<",
            "Ly3/f;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lu3/g<",
            "Ly3/f;",
            ">;>;",
            "Lav/p0;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lu3/i<",
            "Ly3/f;",
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

    new-instance v1, Lu3/o;

    sget-object v2, Ly3/h;->a:Ly3/h;

    new-instance v4, Ly3/e$a;

    invoke-direct {v4, p4}, Ly3/e$a;-><init>(Lkotlin/jvm/functions/Function0;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lu3/o;-><init>(Lu3/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1, p1, p2, p3}, Ly3/e;->a(Lu3/e0;Lv3/b;Ljava/util/List;Lav/p0;)Lu3/i;

    move-result-object p1

    new-instance p2, Ly3/d;

    invoke-direct {p2, p1}, Ly3/d;-><init>(Lu3/i;)V

    return-object p2
.end method
