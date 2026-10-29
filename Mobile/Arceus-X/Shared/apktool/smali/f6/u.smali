.class public final Lf6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/u$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lf6/u;",
        "Lf6/p;",
        "Lx4/u;",
        "__db",
        "<init>",
        "(Lx4/u;)V",
        "Lf6/o;",
        "systemIdInfo",
        "",
        "a",
        "(Lf6/o;)V",
        "",
        "workSpecId",
        "",
        "generation",
        "b",
        "(Ljava/lang/String;I)Lf6/o;",
        "",
        "c",
        "()Ljava/util/List;",
        "e",
        "(Ljava/lang/String;)V",
        "Lx4/u;",
        "Lx4/f;",
        "Lx4/f;",
        "__insertAdapterOfSystemIdInfo",
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
.field public static final c:Lf6/u$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lx4/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lx4/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx4/f<",
            "Lf6/o;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf6/u$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf6/u$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf6/u;->c:Lf6/u$b;

    return-void
.end method

.method public constructor <init>(Lx4/u;)V
    .locals 1
    .param p1    # Lx4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/u;->a:Lx4/u;

    new-instance p1, Lf6/u$a;

    invoke-direct {p1}, Lf6/u$a;-><init>()V

    iput-object p1, p0, Lf6/u;->b:Lx4/f;

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/lang/String;Lf5/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lf6/u;->m(Ljava/lang/String;Ljava/lang/String;Lf5/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Lf5/b;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lf6/u;->k(Ljava/lang/String;Lf5/b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;ILf5/b;)Lf6/o;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf6/u;->j(Ljava/lang/String;Ljava/lang/String;ILf5/b;)Lf6/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lf6/u;Lf6/o;Lf5/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lf6/u;->l(Lf6/u;Lf6/o;Lf5/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/lang/String;Ljava/lang/String;ILf5/b;)Lf6/o;
    .locals 2

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Lf5/b;->r3(Ljava/lang/String;)Lf5/d;

    move-result-object p0

    const/4 p3, 0x1

    :try_start_0
    invoke-interface {p0, p3, p1}, Lf5/d;->k0(ILjava/lang/String;)V

    const/4 p1, 0x2

    int-to-long p2, p2

    invoke-interface {p0, p1, p2, p3}, Lf5/d;->z(IJ)V

    const-string p1, "work_spec_id"

    invoke-static {p0, p1}, Lc5/j;->c(Lf5/d;Ljava/lang/String;)I

    move-result p1

    const-string p2, "generation"

    invoke-static {p0, p2}, Lc5/j;->c(Lf5/d;Ljava/lang/String;)I

    move-result p2

    const-string p3, "system_id"

    invoke-static {p0, p3}, Lc5/j;->c(Lf5/d;Ljava/lang/String;)I

    move-result p3

    invoke-interface {p0}, Lf5/d;->g3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lf5/d;->E2(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p2}, Lf5/d;->getLong(I)J

    move-result-wide v0

    long-to-int p2, v0

    invoke-interface {p0, p3}, Lf5/d;->getLong(I)J

    move-result-wide v0

    long-to-int p3, v0

    new-instance v0, Lf6/o;

    invoke-direct {v0, p1, p2, p3}, Lf6/o;-><init>(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Lf5/d;->close()V

    return-object v0

    :goto_1
    invoke-interface {p0}, Lf5/d;->close()V

    throw p1
.end method

.method public static final k(Ljava/lang/String;Lf5/b;)Ljava/util/List;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lf5/b;->r3(Ljava/lang/String;)Lf5/d;

    move-result-object p0

    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Lf5/d;->g3()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lf5/d;->E2(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lf5/d;->close()V

    return-object p1

    :goto_1
    invoke-interface {p0}, Lf5/d;->close()V

    throw p1
.end method

.method public static final l(Lf6/u;Lf6/o;Lf5/b;)Lkotlin/Unit;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lf6/u;->b:Lx4/f;

    invoke-virtual {p0, p2, p1}, Lx4/f;->d(Lf5/b;Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Ljava/lang/String;Ljava/lang/String;Lf5/b;)Lkotlin/Unit;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lf5/b;->r3(Ljava/lang/String;)Lf5/d;

    move-result-object p0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0, p2, p1}, Lf5/d;->k0(ILjava/lang/String;)V

    invoke-interface {p0}, Lf5/d;->g3()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Lf5/d;->close()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Lf5/d;->close()V

    throw p1
.end method


# virtual methods
.method public a(Lf6/o;)V
    .locals 3
    .param p1    # Lf6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "systemIdInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf6/u;->a:Lx4/u;

    new-instance v1, Lf6/q;

    invoke-direct {v1, p0, p1}, Lf6/q;-><init>(Lf6/u;Lf6/o;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lc5/a;->c(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/lang/String;I)Lf6/o;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf6/u;->a:Lx4/u;

    new-instance v1, Lf6/s;

    const-string v2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    invoke-direct {v1, v2, p1, p2}, Lf6/s;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Lc5/a;->c(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf6/o;

    return-object p1
.end method

.method public c()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lf6/u;->a:Lx4/u;

    new-instance v1, Lf6/r;

    const-string v2, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    invoke-direct {v1, v2}, Lf6/r;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lc5/a;->c(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf6/u;->a:Lx4/u;

    new-instance v1, Lf6/t;

    const-string v2, "DELETE FROM SystemIdInfo where work_spec_id=?"

    invoke-direct {v1, v2, p1}, Lf6/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lc5/a;->c(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method
