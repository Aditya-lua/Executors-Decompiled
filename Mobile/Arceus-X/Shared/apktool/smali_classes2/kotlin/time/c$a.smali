.class public final Lkotlin/time/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/time/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\n\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0012\u001a\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkotlin/time/c$a;",
        "",
        "<init>",
        "()V",
        "",
        "epochSeconds",
        "nanosecondAdjustment",
        "Lkotlin/time/c;",
        "b",
        "(JJ)Lkotlin/time/c;",
        "",
        "a",
        "(JI)Lkotlin/time/c;",
        "",
        "input",
        "e",
        "(Ljava/lang/CharSequence;)Lkotlin/time/c;",
        "MIN",
        "Lkotlin/time/c;",
        "d",
        "()Lkotlin/time/c;",
        "MAX",
        "c",
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
    invoke-direct {p0}, Lkotlin/time/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JI)Lkotlin/time/c;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    int-to-long v0, p3

    invoke-virtual {p0, p1, p2, v0, v1}, Lkotlin/time/c$a;->b(JJ)Lkotlin/time/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(JJ)Lkotlin/time/c;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/32 v0, 0x3b9aca00

    div-long v2, p3, v0

    xor-long v4, p3, v0

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-gez v4, :cond_0

    mul-long v4, v2, v0

    cmp-long v4, v4, p3

    if-eqz v4, :cond_0

    const-wide/16 v4, -0x1

    add-long/2addr v2, v4

    :cond_0
    add-long v4, p1, v2

    xor-long v8, p1, v4

    cmp-long v8, v8, v6

    if-gez v8, :cond_2

    xor-long/2addr v2, p1

    cmp-long v2, v2, v6

    if-ltz v2, :cond_2

    cmp-long p1, p1, v6

    if-lez p1, :cond_1

    sget-object p1, Lkotlin/time/c;->c:Lkotlin/time/c$a;

    invoke-virtual {p1}, Lkotlin/time/c$a;->c()Lkotlin/time/c;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/time/c;->c:Lkotlin/time/c$a;

    invoke-virtual {p1}, Lkotlin/time/c$a;->d()Lkotlin/time/c;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide p1, -0x701cefeb9bec00L

    cmp-long p1, v4, p1

    if-gez p1, :cond_3

    invoke-virtual {p0}, Lkotlin/time/c$a;->d()Lkotlin/time/c;

    move-result-object p1

    return-object p1

    :cond_3
    const-wide p1, 0x701cd2fa9578ffL

    cmp-long p1, v4, p1

    if-lez p1, :cond_4

    invoke-virtual {p0}, Lkotlin/time/c$a;->c()Lkotlin/time/c;

    move-result-object p1

    return-object p1

    :cond_4
    rem-long/2addr p3, v0

    xor-long p1, p3, v0

    neg-long v2, p3

    or-long/2addr v2, p3

    and-long/2addr p1, v2

    const/16 v2, 0x3f

    shr-long/2addr p1, v2

    and-long/2addr p1, v0

    add-long/2addr p3, p1

    long-to-int p1, p3

    new-instance p2, Lkotlin/time/c;

    invoke-direct {p2, v4, v5, p1}, Lkotlin/time/c;-><init>(JI)V

    return-object p2
.end method

.method public final c()Lkotlin/time/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lkotlin/time/c;->a()Lkotlin/time/c;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lkotlin/time/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lkotlin/time/c;->b()Lkotlin/time/c;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/CharSequence;)Lkotlin/time/c;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/time/d;->h(Ljava/lang/CharSequence;)Lkotlin/time/e;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/time/e;->toInstant()Lkotlin/time/c;

    move-result-object p1

    return-object p1
.end method
