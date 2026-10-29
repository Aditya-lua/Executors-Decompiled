.class public final Lx4/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lx4/a$b;",
        "Lf5/c;",
        "actual",
        "<init>",
        "(Lx4/a;Lf5/c;)V",
        "",
        "fileName",
        "Lf5/b;",
        "a",
        "(Ljava/lang/String;)Lf5/b;",
        "filename",
        "d",
        "Lf5/c;",
        "",
        "b",
        "()Z",
        "hasConnectionPool",
        "room-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lf5/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic b:Lx4/a;


# direct methods
.method public constructor <init>(Lx4/a;Lf5/c;)V
    .locals 1
    .param p1    # Lx4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/c;",
            ")V"
        }
    .end annotation

    const-string v0, "actual"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lx4/a$b;->b:Lx4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx4/a$b;->a:Lf5/c;

    return-void
.end method

.method public static synthetic c(Lx4/a;Lx4/a$b;Ljava/lang/String;)Lf5/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lx4/a$b;->e(Lx4/a;Lx4/a$b;Ljava/lang/String;)Lf5/b;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lx4/a;Lx4/a$b;Ljava/lang/String;)Lf5/b;
    .locals 1

    invoke-static {p0}, Lx4/a;->d(Lx4/a;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p1, Lx4/a$b;->a:Lf5/c;

    invoke-interface {p1, p2}, Lf5/c;->a(Ljava/lang/String;)Lf5/b;

    move-result-object p1

    invoke-static {p0}, Lx4/a;->c(Lx4/a;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, p2}, Lx4/a;->e(Lx4/a;Z)V

    invoke-static {p0, p1}, Lx4/a;->b(Lx4/a;Lf5/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v0}, Lx4/a;->e(Lx4/a;Z)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p0, v0}, Lx4/a;->e(Lx4/a;Z)V

    throw p1

    :cond_0
    invoke-static {p0, p1}, Lx4/a;->a(Lx4/a;Lf5/b;)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lf5/b;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx4/a$b;->b:Lx4/a;

    invoke-virtual {v0, p1}, Lx4/a;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx4/a$b;->d(Ljava/lang/String;)Lf5/b;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lx4/a$b;->a:Lf5/c;

    invoke-interface {v0}, Lf5/c;->b()Z

    move-result v0

    return v0
.end method

.method public final d(Ljava/lang/String;)Lf5/b;
    .locals 3

    new-instance v0, Ly4/b;

    iget-object v1, p0, Lx4/a$b;->b:Lx4/a;

    invoke-static {v1}, Lx4/a;->c(Lx4/a;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lx4/a$b;->b:Lx4/a;

    invoke-static {v1}, Lx4/a;->d(Lx4/a;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ":memory:"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p1, v1}, Ly4/b;-><init>(Ljava/lang/String;Z)V

    iget-object v1, p0, Lx4/a$b;->b:Lx4/a;

    new-instance v2, Lx4/b;

    invoke-direct {v2, v1, p0, p1}, Lx4/b;-><init>(Lx4/a;Lx4/a$b;Ljava/lang/String;)V

    new-instance v1, Lx4/a$b$a;

    invoke-direct {v1, p1}, Lx4/a$b$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Ly4/b;->b(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf5/b;

    return-object p1
.end method
