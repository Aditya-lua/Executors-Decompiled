.class public final Li5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Li5/a;",
        "Lf5/b;",
        "Lg5/c;",
        "db",
        "<init>",
        "(Lg5/c;)V",
        "",
        "D",
        "()Z",
        "",
        "sql",
        "Lf5/d;",
        "r3",
        "(Ljava/lang/String;)Lf5/d;",
        "",
        "close",
        "()V",
        "a",
        "Lg5/c;",
        "()Lg5/c;",
        "sqlite-framework"
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
.field public final a:Lg5/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg5/c;)V
    .locals 1
    .param p1    # Lg5/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li5/a;->a:Lg5/c;

    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    iget-object v0, p0, Li5/a;->a:Lg5/c;

    invoke-interface {v0}, Lg5/c;->D()Z

    move-result v0

    return v0
.end method

.method public final a()Lg5/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Li5/a;->a:Lg5/c;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Li5/a;->a:Lg5/c;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public r3(Ljava/lang/String;)Lf5/d;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sql"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li5/a;->a:Lg5/c;

    invoke-interface {v0}, Lg5/c;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Li5/c;->d:Li5/c$a;

    iget-object v1, p0, Li5/a;->a:Lg5/c;

    invoke-virtual {v0, v1, p1}, Li5/c$a;->a(Lg5/c;Ljava/lang/String;)Li5/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 p1, 0x15

    const-string v0, "connection is closed"

    invoke-static {p1, v0}, Lf5/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1
.end method
