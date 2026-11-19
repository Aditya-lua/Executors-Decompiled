.class public final Lmv/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmv/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\"\u0010\u0014\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u000f\u001a\u0004\u0008\u0016\u0010\u0011\"\u0004\u0008\u0017\u0010\u0013R\"\u0010\u001f\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010\u001b\u001a\u0004\u0008 \u0010\u001c\"\u0004\u0008!\u0010\u001eR\"\u0010%\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u001b\u001a\u0004\u0008#\u0010\u001c\"\u0004\u0008$\u0010\u001eR\"\u0010(\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u000f\u001a\u0004\u0008&\u0010\u0011\"\u0004\u0008\'\u0010\u0013R\"\u0010+\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u000f\u001a\u0004\u0008)\u0010\u0011\"\u0004\u0008*\u0010\u0013R\"\u0010-\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0011\"\u0004\u0008,\u0010\u0013\u00a8\u0006."
    }
    d2 = {
        "Lmv/d$a;",
        "",
        "<init>",
        "()V",
        "k",
        "()Lmv/d$a;",
        "l",
        "Lkotlin/time/a;",
        "maxStale",
        "j",
        "(J)Lmv/d$a;",
        "Lmv/d;",
        "a",
        "()Lmv/d;",
        "",
        "Z",
        "f",
        "()Z",
        "m",
        "(Z)V",
        "noCache",
        "b",
        "g",
        "setNoStore$okhttp",
        "noStore",
        "",
        "c",
        "I",
        "()I",
        "setMaxAgeSeconds$okhttp",
        "(I)V",
        "maxAgeSeconds",
        "d",
        "setMaxStaleSeconds$okhttp",
        "maxStaleSeconds",
        "e",
        "setMinFreshSeconds$okhttp",
        "minFreshSeconds",
        "i",
        "n",
        "onlyIfCached",
        "h",
        "setNoTransform$okhttp",
        "noTransform",
        "setImmutable$okhttp",
        "immutable",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lmv/d$a;->c:I

    iput v0, p0, Lmv/d$a;->d:I

    iput v0, p0, Lmv/d$a;->e:I

    return-void
.end method


# virtual methods
.method public final a()Lmv/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lnv/j;->a(Lmv/d$a;)Lmv/d;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lmv/d$a;->h:Z

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lmv/d$a;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lmv/d$a;->d:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lmv/d$a;->e:I

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lmv/d$a;->a:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lmv/d$a;->b:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lmv/d$a;->g:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lmv/d$a;->f:Z

    return v0
.end method

.method public final j(J)Lmv/d$a;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1, p2}, Lkotlin/time/a;->y(J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    invoke-static {p1, p2}, Lnv/j;->b(J)I

    move-result p1

    iput p1, p0, Lmv/d$a;->d:I

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "maxStale < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final k()Lmv/d$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lnv/j;->e(Lmv/d$a;)Lmv/d$a;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lmv/d$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lnv/j;->f(Lmv/d$a;)Lmv/d$a;

    move-result-object v0

    return-object v0
.end method

.method public final m(Z)V
    .locals 0

    iput-boolean p1, p0, Lmv/d$a;->a:Z

    return-void
.end method

.method public final n(Z)V
    .locals 0

    iput-boolean p1, p0, Lmv/d$a;->f:Z

    return-void
.end method
