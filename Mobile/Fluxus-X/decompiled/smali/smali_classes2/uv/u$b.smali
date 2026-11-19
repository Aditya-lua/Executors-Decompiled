.class public final Luv/u$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew/l0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luv/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008\u001d\u0010\u0018\"\u0004\u0008\u001c\u0010\u001aR\"\u0010\"\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010\u0016\u001a\u0004\u0008 \u0010\u0018\"\u0004\u0008!\u0010\u001aR\"\u0010#\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u0013\u0010\u0018\"\u0004\u0008\u001f\u0010\u001aR\"\u0010&\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010\u0016\u001a\u0004\u0008%\u0010\u0018\"\u0004\u0008$\u0010\u001a\u00a8\u0006\'"
    }
    d2 = {
        "Luv/u$b;",
        "Lew/l0;",
        "Lew/g;",
        "source",
        "<init>",
        "(Lew/g;)V",
        "Lew/e;",
        "sink",
        "",
        "byteCount",
        "f3",
        "(Lew/e;J)J",
        "Lew/m0;",
        "t",
        "()Lew/m0;",
        "",
        "close",
        "()V",
        "b",
        "a",
        "Lew/g;",
        "",
        "I",
        "getLength",
        "()I",
        "e",
        "(I)V",
        "length",
        "c",
        "getFlags",
        "flags",
        "d",
        "getStreamId",
        "g",
        "streamId",
        "left",
        "f",
        "getPadding",
        "padding",
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
.field public final a:Lew/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Lew/g;)V
    .locals 1
    .param p1    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/u$b;->a:Lew/g;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Luv/u$b;->e:I

    return v0
.end method

.method public final b()V
    .locals 9

    iget v0, p0, Luv/u$b;->d:I

    iget-object v1, p0, Luv/u$b;->a:Lew/g;

    invoke-static {v1}, Lnv/n;->A(Lew/g;)I

    move-result v1

    iput v1, p0, Luv/u$b;->e:I

    iput v1, p0, Luv/u$b;->b:I

    iget-object v1, p0, Luv/u$b;->a:Lew/g;

    invoke-interface {v1}, Lew/g;->readByte()B

    move-result v1

    const/16 v2, 0xff

    invoke-static {v1, v2}, Lnv/n;->b(BI)I

    move-result v7

    iget-object v1, p0, Luv/u$b;->a:Lew/g;

    invoke-interface {v1}, Lew/g;->readByte()B

    move-result v1

    invoke-static {v1, v2}, Lnv/n;->b(BI)I

    move-result v1

    iput v1, p0, Luv/u$b;->c:I

    sget-object v1, Luv/u;->e:Luv/u$a;

    invoke-virtual {v1}, Luv/u$a;->a()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Luv/u$a;->a()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v3, Luv/f;->a:Luv/f;

    iget v5, p0, Luv/u$b;->d:I

    iget v6, p0, Luv/u$b;->b:I

    iget v8, p0, Luv/u$b;->c:I

    const/4 v4, 0x1

    invoke-virtual/range {v3 .. v8}, Luv/f;->c(ZIIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Luv/u$b;->a:Lew/g;

    invoke-interface {v1}, Lew/g;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    iput v1, p0, Luv/u$b;->d:I

    const/16 v2, 0x9

    if-ne v7, v2, :cond_2

    if-ne v1, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "TYPE_CONTINUATION streamId changed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " != TYPE_CONTINUATION"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Luv/u$b;->c:I

    return-void
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Luv/u$b;->e:I

    return-void
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Luv/u$b;->b:I

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Luv/u$b;->f:I

    return-void
.end method

.method public f3(Lew/e;J)J
    .locals 6
    .param p1    # Lew/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget v0, p0, Luv/u$b;->e:I

    const-wide/16 v1, -0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Luv/u$b;->a:Lew/g;

    iget v3, p0, Luv/u$b;->f:I

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, Lew/g;->skip(J)V

    const/4 v0, 0x0

    iput v0, p0, Luv/u$b;->f:I

    iget v0, p0, Luv/u$b;->c:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p0}, Luv/u$b;->b()V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Luv/u$b;->a:Lew/g;

    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Lew/l0;->f3(Lew/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_2

    return-wide v1

    :cond_2
    iget p3, p0, Luv/u$b;->e:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, Luv/u$b;->e:I

    return-wide p1
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Luv/u$b;->d:I

    return-void
.end method

.method public t()Lew/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/u$b;->a:Lew/g;

    invoke-interface {v0}, Lew/l0;->t()Lew/m0;

    move-result-object v0

    return-object v0
.end method
