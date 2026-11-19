.class public final Lkotlin/time/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/time/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lkotlin/time/c;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0016B\u0019\u0008\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u0012\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkotlin/time/c;",
        "",
        "Ljava/io/Serializable;",
        "Lkotlin/io/Serializable;",
        "",
        "epochSeconds",
        "",
        "nanosecondsOfSecond",
        "<init>",
        "(JI)V",
        "other",
        "c",
        "(Lkotlin/time/c;)I",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "J",
        "d",
        "()J",
        "b",
        "I",
        "e",
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


# static fields
.field public static final c:Lkotlin/time/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lkotlin/time/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lkotlin/time/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/time/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/time/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/time/c;->c:Lkotlin/time/c$a;

    new-instance v0, Lkotlin/time/c;

    const-wide v1, -0x701cefeb9bec00L

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lkotlin/time/c;-><init>(JI)V

    sput-object v0, Lkotlin/time/c;->d:Lkotlin/time/c;

    new-instance v0, Lkotlin/time/c;

    const-wide v1, 0x701cd2fa9578ffL

    const v3, 0x3b9ac9ff

    invoke-direct {v0, v1, v2, v3}, Lkotlin/time/c;-><init>(JI)V

    sput-object v0, Lkotlin/time/c;->e:Lkotlin/time/c;

    return-void
.end method

.method public constructor <init>(JI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lkotlin/time/c;->a:J

    iput p3, p0, Lkotlin/time/c;->b:I

    const-wide v0, -0x701cefeb9bec00L

    cmp-long p3, v0, p1

    if-gtz p3, :cond_0

    const-wide v0, 0x701cd2fa957900L

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Instant exceeds minimum or maximum instant"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a()Lkotlin/time/c;
    .locals 1

    sget-object v0, Lkotlin/time/c;->e:Lkotlin/time/c;

    return-object v0
.end method

.method public static final synthetic b()Lkotlin/time/c;
    .locals 1

    sget-object v0, Lkotlin/time/c;->d:Lkotlin/time/c;

    return-object v0
.end method


# virtual methods
.method public c(Lkotlin/time/c;)I
    .locals 4
    .param p1    # Lkotlin/time/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lkotlin/time/c;->a:J

    iget-wide v2, p1, Lkotlin/time/c;->a:J

    invoke-static {v0, v1, v2, v3}, Lkotlin/jvm/internal/Intrinsics;->g(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lkotlin/time/c;->b:I

    iget p1, p1, Lkotlin/time/c;->b:I

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkotlin/time/c;

    invoke-virtual {p0, p1}, Lkotlin/time/c;->c(Lkotlin/time/c;)I

    move-result p1

    return p1
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lkotlin/time/c;->a:J

    return-wide v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lkotlin/time/c;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lkotlin/time/c;

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lkotlin/time/c;->a:J

    check-cast p1, Lkotlin/time/c;

    iget-wide v2, p1, Lkotlin/time/c;->a:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lkotlin/time/c;->b:I

    iget p1, p1, Lkotlin/time/c;->b:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lkotlin/time/c;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    iget v1, p0, Lkotlin/time/c;->b:I

    mul-int/lit8 v1, v1, 0x33

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lkotlin/time/d;->g(Lkotlin/time/c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
