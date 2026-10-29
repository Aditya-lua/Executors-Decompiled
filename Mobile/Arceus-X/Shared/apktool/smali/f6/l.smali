.class public final Lf6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/l$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0010R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lf6/l;",
        "Lf6/i;",
        "Lx4/u;",
        "__db",
        "<init>",
        "(Lx4/u;)V",
        "Lf6/h;",
        "preference",
        "",
        "a",
        "(Lf6/h;)V",
        "",
        "key",
        "",
        "b",
        "(Ljava/lang/String;)Ljava/lang/Long;",
        "Lx4/u;",
        "Lx4/f;",
        "Lx4/f;",
        "__insertAdapterOfPreference",
        "c",
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
.field public static final c:Lf6/l$b;
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
            "Lf6/h;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf6/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf6/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf6/l;->c:Lf6/l$b;

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

    iput-object p1, p0, Lf6/l;->a:Lx4/u;

    new-instance p1, Lf6/l$a;

    invoke-direct {p1}, Lf6/l$a;-><init>()V

    iput-object p1, p0, Lf6/l;->b:Lx4/f;

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Lf5/b;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1, p2}, Lf6/l;->e(Ljava/lang/String;Ljava/lang/String;Lf5/b;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf6/l;Lf6/h;Lf5/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lf6/l;->f(Lf6/l;Lf6/h;Lf5/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;Lf5/b;)Ljava/lang/Long;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lf5/b;->r3(Ljava/lang/String;)Lf5/d;

    move-result-object p0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0, p2, p1}, Lf5/d;->k0(ILjava/lang/String;)V

    invoke-interface {p0}, Lf5/d;->g3()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lf5/d;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lf5/d;->getLong(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p0}, Lf5/d;->close()V

    return-object p2

    :goto_1
    invoke-interface {p0}, Lf5/d;->close()V

    throw p1
.end method

.method public static final f(Lf6/l;Lf6/h;Lf5/b;)Lkotlin/Unit;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lf6/l;->b:Lx4/f;

    invoke-virtual {p0, p2, p1}, Lx4/f;->d(Lf5/b;Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public a(Lf6/h;)V
    .locals 3
    .param p1    # Lf6/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf6/l;->a:Lx4/u;

    new-instance v1, Lf6/j;

    invoke-direct {v1, p0, p1}, Lf6/j;-><init>(Lf6/l;Lf6/h;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lc5/a;->c(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Long;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf6/l;->a:Lx4/u;

    new-instance v1, Lf6/k;

    const-string v2, "SELECT long_value FROM Preference where `key`=?"

    invoke-direct {v1, v2, p1}, Lf6/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1}, Lc5/a;->c(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method
