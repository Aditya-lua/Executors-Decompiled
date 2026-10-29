.class public final Landroidx/work/impl/WorkDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/work/impl/WorkDatabase$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ljava/util/concurrent/Executor;",
        "queryExecutor",
        "Lx5/b;",
        "clock",
        "",
        "useTestDatabase",
        "Landroidx/work/impl/WorkDatabase;",
        "b",
        "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lx5/b;Z)Landroidx/work/impl/WorkDatabase;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Lg5/d$b;)Lg5/d;
    .locals 0

    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase$a;->c(Landroid/content/Context;Lg5/d$b;)Lg5/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/content/Context;Lg5/d$b;)Lg5/d;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg5/d$b;->f:Lg5/d$b$b;

    invoke-virtual {v0, p0}, Lg5/d$b$b;->a(Landroid/content/Context;)Lg5/d$b$a;

    move-result-object p0

    iget-object v0, p1, Lg5/d$b;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lg5/d$b$a;->d(Ljava/lang/String;)Lg5/d$b$a;

    move-result-object v0

    iget-object p1, p1, Lg5/d$b;->c:Lg5/d$a;

    invoke-virtual {v0, p1}, Lg5/d$b$a;->c(Lg5/d$a;)Lg5/d$b$a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lg5/d$b$a;->e(Z)Lg5/d$b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lg5/d$b$a;->a(Z)Lg5/d$b$a;

    new-instance p1, Lh5/i;

    invoke-direct {p1}, Lh5/i;-><init>()V

    invoke-virtual {p0}, Lg5/d$b$a;->b()Lg5/d$b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lh5/i;->a(Lg5/d$b;)Lg5/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;Ljava/util/concurrent/Executor;Lx5/b;Z)Landroidx/work/impl/WorkDatabase;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx5/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Landroidx/work/impl/WorkDatabase;

    if-eqz p4, :cond_0

    invoke-static {p1, v0}, Lx4/n;->b(Landroid/content/Context;Ljava/lang/Class;)Lx4/u$a;

    move-result-object p4

    invoke-virtual {p4}, Lx4/u$a;->c()Lx4/u$a;

    move-result-object p4

    goto :goto_0

    :cond_0
    const-string p4, "androidx.work.workdb"

    invoke-static {p1, v0, p4}, Lx4/n;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lx4/u$a;

    move-result-object p4

    new-instance v0, Ly5/g0;

    invoke-direct {v0, p1}, Ly5/g0;-><init>(Landroid/content/Context;)V

    invoke-virtual {p4, v0}, Lx4/u$a;->f(Lg5/d$c;)Lx4/u$a;

    move-result-object p4

    :goto_0
    invoke-virtual {p4, p2}, Lx4/u$a;->g(Ljava/util/concurrent/Executor;)Lx4/u$a;

    move-result-object p2

    new-instance p4, Ly5/c;

    invoke-direct {p4, p3}, Ly5/c;-><init>(Lx5/b;)V

    invoke-virtual {p2, p4}, Lx4/u$a;->a(Lx4/u$b;)Lx4/u$a;

    move-result-object p2

    const/4 p3, 0x1

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/j;->c:Ly5/j;

    const/4 v1, 0x0

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-instance p4, Ly5/t;

    const/4 v0, 0x2

    const/4 v2, 0x3

    invoke-direct {p4, p1, v0, v2}, Ly5/t;-><init>(Landroid/content/Context;II)V

    new-array v0, p3, [La5/b;

    aput-object p4, v0, v1

    invoke-virtual {p2, v0}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/k;->c:Ly5/k;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/l;->c:Ly5/l;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-instance p4, Ly5/t;

    const/4 v0, 0x5

    const/4 v2, 0x6

    invoke-direct {p4, p1, v0, v2}, Ly5/t;-><init>(Landroid/content/Context;II)V

    new-array v0, p3, [La5/b;

    aput-object p4, v0, v1

    invoke-virtual {p2, v0}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/m;->c:Ly5/m;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/n;->c:Ly5/n;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/o;->c:Ly5/o;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-instance p4, Ly5/g1;

    invoke-direct {p4, p1}, Ly5/g1;-><init>(Landroid/content/Context;)V

    new-array v0, p3, [La5/b;

    aput-object p4, v0, v1

    invoke-virtual {p2, v0}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-instance p4, Ly5/t;

    const/16 v0, 0xa

    const/16 v2, 0xb

    invoke-direct {p4, p1, v0, v2}, Ly5/t;-><init>(Landroid/content/Context;II)V

    new-array v0, p3, [La5/b;

    aput-object p4, v0, v1

    invoke-virtual {p2, v0}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/f;->c:Ly5/f;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/g;->c:Ly5/g;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/h;->c:Ly5/h;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-array p4, p3, [La5/b;

    sget-object v0, Ly5/i;->c:Ly5/i;

    aput-object v0, p4, v1

    invoke-virtual {p2, p4}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p2

    new-instance p4, Ly5/t;

    const/16 v0, 0x15

    const/16 v2, 0x16

    invoke-direct {p4, p1, v0, v2}, Ly5/t;-><init>(Landroid/content/Context;II)V

    new-array p1, p3, [La5/b;

    aput-object p4, p1, v1

    invoke-virtual {p2, p1}, Lx4/u$a;->b([La5/b;)Lx4/u$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lx4/u$a;->e(Z)Lx4/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lx4/u$a;->d()Lx4/u;

    move-result-object p1

    check-cast p1, Landroidx/work/impl/WorkDatabase;

    return-object p1
.end method
