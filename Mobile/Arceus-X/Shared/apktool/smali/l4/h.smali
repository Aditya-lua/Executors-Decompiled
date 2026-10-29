.class public final Ll4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u000b*\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Ll4/h;",
        "",
        "Landroidx/lifecycle/b1;",
        "store",
        "Landroidx/lifecycle/a1$c;",
        "factory",
        "Lk4/a;",
        "defaultExtras",
        "<init>",
        "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Lk4/a;)V",
        "Landroidx/lifecycle/x0;",
        "T",
        "Lhu/c;",
        "modelClass",
        "",
        "key",
        "d",
        "(Lhu/c;Ljava/lang/String;)Landroidx/lifecycle/x0;",
        "a",
        "Landroidx/lifecycle/b1;",
        "b",
        "Landroidx/lifecycle/a1$c;",
        "c",
        "Lk4/a;",
        "Ll4/f;",
        "Ll4/f;",
        "lock",
        "lifecycle-viewmodel"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/b1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Landroidx/lifecycle/a1$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lk4/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ll4/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Lk4/a;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/b1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/a1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lk4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/h;->a:Landroidx/lifecycle/b1;

    iput-object p2, p0, Ll4/h;->b:Landroidx/lifecycle/a1$c;

    iput-object p3, p0, Ll4/h;->c:Lk4/a;

    new-instance p1, Ll4/f;

    invoke-direct {p1}, Ll4/f;-><init>()V

    iput-object p1, p0, Ll4/h;->d:Ll4/f;

    return-void
.end method

.method public static final synthetic a(Ll4/h;)Lk4/a;
    .locals 0

    iget-object p0, p0, Ll4/h;->c:Lk4/a;

    return-object p0
.end method

.method public static final synthetic b(Ll4/h;)Landroidx/lifecycle/a1$c;
    .locals 0

    iget-object p0, p0, Ll4/h;->b:Landroidx/lifecycle/a1$c;

    return-object p0
.end method

.method public static final synthetic c(Ll4/h;)Landroidx/lifecycle/b1;
    .locals 0

    iget-object p0, p0, Ll4/h;->a:Landroidx/lifecycle/b1;

    return-object p0
.end method

.method public static synthetic e(Ll4/h;Lhu/c;Ljava/lang/String;ILjava/lang/Object;)Landroidx/lifecycle/x0;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Ll4/j;->a:Ll4/j;

    invoke-virtual {p2, p1}, Ll4/j;->c(Lhu/c;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Ll4/h;->d(Lhu/c;Ljava/lang/String;)Landroidx/lifecycle/x0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Lhu/c;Ljava/lang/String;)Landroidx/lifecycle/x0;
    .locals 3
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/x0;",
            ">(",
            "Lhu/c<",
            "TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll4/h;->d:Ll4/f;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Ll4/h;->c(Ll4/h;)Landroidx/lifecycle/b1;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroidx/lifecycle/b1;->b(Ljava/lang/String;)Landroidx/lifecycle/x0;

    move-result-object v1

    invoke-interface {p1, v1}, Lhu/c;->b(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0}, Ll4/h;->b(Ll4/h;)Landroidx/lifecycle/a1$c;

    move-result-object p1

    instance-of p1, p1, Landroidx/lifecycle/a1$e;

    if-eqz p1, :cond_0

    invoke-static {p0}, Ll4/h;->b(Ll4/h;)Landroidx/lifecycle/a1$c;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/a1$e;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroidx/lifecycle/a1$e;->d(Landroidx/lifecycle/x0;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v1, Lk4/b;

    invoke-static {p0}, Ll4/h;->a(Ll4/h;)Lk4/a;

    move-result-object v2

    invoke-direct {v1, v2}, Lk4/b;-><init>(Lk4/a;)V

    sget-object v2, Landroidx/lifecycle/a1;->c:Lk4/a$c;

    invoke-virtual {v1, v2, p2}, Lk4/b;->c(Lk4/a$c;Ljava/lang/Object;)V

    invoke-static {p0}, Ll4/h;->b(Ll4/h;)Landroidx/lifecycle/a1$c;

    move-result-object v2

    invoke-static {v2, p1, v1}, Ll4/i;->a(Landroidx/lifecycle/a1$c;Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;

    move-result-object v1

    invoke-static {p0}, Ll4/h;->c(Ll4/h;)Landroidx/lifecycle/b1;

    move-result-object p1

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/b1;->d(Ljava/lang/String;Landroidx/lifecycle/x0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v0

    return-object v1

    :goto_2
    monitor-exit v0

    throw p1
.end method
