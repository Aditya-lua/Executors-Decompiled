.class public final Lkotlin/time/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/time/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkotlin/time/e$b;",
        "Lkotlin/time/e;",
        "",
        "epochSeconds",
        "",
        "nanosecondsOfSecond",
        "<init>",
        "(JI)V",
        "Lkotlin/time/c;",
        "toInstant",
        "()Lkotlin/time/c;",
        "a",
        "J",
        "getEpochSeconds",
        "()J",
        "b",
        "I",
        "getNanosecondsOfSecond",
        "()I",
        "kotlin-stdlib"
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
.field public final a:J

.field public final b:I


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lkotlin/time/e$b;->a:J

    iput p3, p0, Lkotlin/time/e$b;->b:I

    return-void
.end method


# virtual methods
.method public toInstant()Lkotlin/time/c;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-wide v0, p0, Lkotlin/time/e$b;->a:J

    sget-object v2, Lkotlin/time/c;->c:Lkotlin/time/c$a;

    invoke-virtual {v2}, Lkotlin/time/c$a;->d()Lkotlin/time/c;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/time/c;->d()J

    move-result-wide v3

    cmp-long v0, v0, v3

    if-ltz v0, :cond_0

    iget-wide v0, p0, Lkotlin/time/e$b;->a:J

    invoke-virtual {v2}, Lkotlin/time/c$a;->c()Lkotlin/time/c;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/time/c;->d()J

    move-result-wide v3

    cmp-long v0, v0, v3

    if-gtz v0, :cond_0

    iget-wide v0, p0, Lkotlin/time/e$b;->a:J

    iget v3, p0, Lkotlin/time/e$b;->b:I

    invoke-virtual {v2, v0, v1, v3}, Lkotlin/time/c$a;->a(JI)Lkotlin/time/c;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lju/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The parsed date is outside the range representable by Instant (Unix epoch second "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lkotlin/time/e$b;->a:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lju/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method
