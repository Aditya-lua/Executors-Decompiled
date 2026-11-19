.class public final Lo6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/f$a;,
        Lo6/f$b;,
        Lo6/f$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00142\u00020\u0001:\u0003\u001a\u000f\u0012B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000c*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lo6/f;",
        "Lo6/a;",
        "",
        "maxSize",
        "Lew/b0;",
        "directory",
        "Lew/k;",
        "fileSystem",
        "Lkotlin/coroutines/CoroutineContext;",
        "cleanupCoroutineContext",
        "<init>",
        "(JLew/b0;Lew/k;Lkotlin/coroutines/CoroutineContext;)V",
        "",
        "key",
        "Lo6/a$c;",
        "b",
        "(Ljava/lang/String;)Lo6/a$c;",
        "Lo6/a$b;",
        "a",
        "(Ljava/lang/String;)Lo6/a$b;",
        "e",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "J",
        "d",
        "()J",
        "Lew/b0;",
        "c",
        "()Lew/b0;",
        "Lew/k;",
        "getFileSystem",
        "()Lew/k;",
        "Lo6/d;",
        "Lo6/d;",
        "cache",
        "coil-core_release"
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
.field public static final e:Lo6/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:Lew/b0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lew/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lo6/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo6/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo6/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo6/f;->e:Lo6/f$a;

    return-void
.end method

.method public constructor <init>(JLew/b0;Lew/k;Lkotlin/coroutines/CoroutineContext;)V
    .locals 8
    .param p3    # Lew/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lew/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lo6/f;->a:J

    iput-object p3, p0, Lo6/f;->b:Lew/b0;

    iput-object p4, p0, Lo6/f;->c:Lew/k;

    new-instance v0, Lo6/d;

    invoke-virtual {p0}, Lo6/f;->getFileSystem()Lew/k;

    move-result-object v1

    invoke-virtual {p0}, Lo6/f;->c()Lew/b0;

    move-result-object v2

    invoke-virtual {p0}, Lo6/f;->d()J

    move-result-wide v4

    const/4 v6, 0x3

    const/4 v7, 0x2

    move-object v3, p5

    invoke-direct/range {v0 .. v7}, Lo6/d;-><init>(Lew/k;Lew/b0;Lkotlin/coroutines/CoroutineContext;JII)V

    iput-object v0, p0, Lo6/f;->d:Lo6/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo6/a$b;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lo6/f;->d:Lo6/d;

    invoke-virtual {p0, p1}, Lo6/f;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo6/d;->z(Ljava/lang/String;)Lo6/d$b;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lo6/f$b;

    invoke-direct {v0, p1}, Lo6/f$b;-><init>(Lo6/d$b;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lo6/a$c;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lo6/f;->d:Lo6/d;

    invoke-virtual {p0, p1}, Lo6/f;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo6/d;->A(Ljava/lang/String;)Lo6/d$d;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lo6/f$c;

    invoke-direct {v0, p1}, Lo6/f$c;-><init>(Lo6/d$d;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public c()Lew/b0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lo6/f;->b:Lew/b0;

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lo6/f;->a:J

    return-wide v0
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lew/h;->d:Lew/h$a;

    invoke-virtual {v0, p1}, Lew/h$a;->d(Ljava/lang/String;)Lew/h;

    move-result-object p1

    invoke-virtual {p1}, Lew/h;->H()Lew/h;

    move-result-object p1

    invoke-virtual {p1}, Lew/h;->r()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getFileSystem()Lew/k;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lo6/f;->c:Lew/k;

    return-object v0
.end method
