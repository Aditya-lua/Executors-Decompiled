.class public final Lmj/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmj/j0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0086\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u0011\u0008\u0016\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001a\u001a\u0004\u0008\u001f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001c\u001a\u0004\u0008!\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001a\u001a\u0004\u0008#\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u001c\u001a\u0004\u0008%\u0010\u001d\u00a8\u0006&"
    }
    d2 = {
        "Lmj/c0;",
        "Lmj/j0;",
        "",
        "notificationId",
        "",
        "time",
        "authorUserName",
        "authorUserId",
        "bodyPreview",
        "messageId",
        "<init>",
        "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;J)V",
        "Lmj/f0;",
        "metadata",
        "(Lmj/f0;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "b",
        "J",
        "()J",
        "c",
        "n",
        "d",
        "m",
        "e",
        "getBodyPreview",
        "f",
        "o",
        "NativeShell_googleProdRelease"
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
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:J

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:J

.field public final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;J)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "notificationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmj/c0;->a:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Lmj/c0;->b:J

    .line 4
    iput-object p4, p0, Lmj/c0;->c:Ljava/lang/String;

    .line 5
    iput-wide p5, p0, Lmj/c0;->d:J

    .line 6
    iput-object p7, p0, Lmj/c0;->e:Ljava/lang/String;

    .line 7
    iput-wide p8, p0, Lmj/c0;->f:J

    return-void
.end method

.method public constructor <init>(Lmj/f0;)V
    .locals 11
    .param p1    # Lmj/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Lmj/f0;->c()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {p1}, Lmj/f0;->b()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "AuthorUserName"

    invoke-static {v0, v1}, Lmj/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-virtual {p1}, Lmj/f0;->b()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "AuthorUserId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 11
    invoke-virtual {p1}, Lmj/f0;->b()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "BodyPreview"

    invoke-static {v0, v1}, Lmj/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 12
    invoke-virtual {p1}, Lmj/f0;->b()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "MessageId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 13
    invoke-virtual {p1}, Lmj/f0;->b()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "EventDate"

    invoke-static {p1, v0}, Lmj/w;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    invoke-static {p1}, Lgk/g;->a(Ljava/lang/String;)J

    move-result-wide v0

    :goto_0
    move-wide v3, v0

    move-object v1, p0

    goto :goto_1

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {v1 .. v10}, Lmj/c0;-><init>(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;J)V

    .line 16
    iget-object p1, v1, Lmj/c0;->c:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    move p1, v0

    goto :goto_3

    :cond_2
    :goto_2
    move p1, v2

    :goto_3
    xor-int/2addr p1, v2

    new-instance v3, Lmj/x;

    invoke-direct {v3}, Lmj/x;-><init>()V

    invoke-static {p1, v3}, Lmj/w;->b(ZLkotlin/jvm/functions/Function0;)V

    .line 17
    iget-wide v3, v1, Lmj/c0;->d:J

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-lez p1, :cond_3

    move p1, v2

    goto :goto_4

    :cond_3
    move p1, v0

    :goto_4
    new-instance v3, Lmj/y;

    invoke-direct {v3}, Lmj/y;-><init>()V

    invoke-static {p1, v3}, Lmj/w;->b(ZLkotlin/jvm/functions/Function0;)V

    .line 18
    invoke-virtual {p0}, Lmj/c0;->a()J

    move-result-wide v3

    cmp-long p1, v3, v5

    if-lez p1, :cond_4

    move p1, v2

    goto :goto_5

    :cond_4
    move p1, v0

    :goto_5
    new-instance v3, Lmj/z;

    invoke-direct {v3}, Lmj/z;-><init>()V

    invoke-static {p1, v3}, Lmj/w;->b(ZLkotlin/jvm/functions/Function0;)V

    .line 19
    iget-object p1, v1, Lmj/c0;->e:Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_5

    goto :goto_6

    :cond_5
    move p1, v0

    goto :goto_7

    :cond_6
    :goto_6
    move p1, v2

    :goto_7
    xor-int/2addr p1, v2

    new-instance v3, Lmj/a0;

    invoke-direct {v3}, Lmj/a0;-><init>()V

    invoke-static {p1, v3}, Lmj/w;->b(ZLkotlin/jvm/functions/Function0;)V

    .line 20
    iget-wide v3, v1, Lmj/c0;->f:J

    cmp-long p1, v3, v5

    if-lez p1, :cond_7

    move v0, v2

    :cond_7
    new-instance p1, Lmj/b0;

    invoke-direct {p1}, Lmj/b0;-><init>()V

    invoke-static {v0, p1}, Lmj/w;->b(ZLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lmj/c0;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lmj/c0;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lmj/c0;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lmj/c0;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lmj/c0;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final h()Ljava/lang/String;
    .locals 1

    const-string v0, "PrivateMessageNotification authorUserName is null or empty"

    return-object v0
.end method

.method private static final i()Ljava/lang/String;
    .locals 1

    const-string v0, "PrivateMessageNotification authorUserId <= 0"

    return-object v0
.end method

.method private static final j()Ljava/lang/String;
    .locals 1

    const-string v0, "PrivateMessageNotification date is null or empty"

    return-object v0
.end method

.method private static final k()Ljava/lang/String;
    .locals 1

    const-string v0, "PrivateMessageNotification bodyPreview is null or empty"

    return-object v0
.end method

.method private static final l()Ljava/lang/String;
    .locals 1

    const-string v0, "PrivateMessageNotification messageId <= 0"

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lmj/c0;->b:J

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmj/c0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmj/c0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lmj/c0;

    iget-object v1, p0, Lmj/c0;->a:Ljava/lang/String;

    iget-object v3, p1, Lmj/c0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lmj/c0;->b:J

    iget-wide v5, p1, Lmj/c0;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lmj/c0;->c:Ljava/lang/String;

    iget-object v3, p1, Lmj/c0;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lmj/c0;->d:J

    iget-wide v5, p1, Lmj/c0;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lmj/c0;->e:Ljava/lang/String;

    iget-object v3, p1, Lmj/c0;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lmj/c0;->f:J

    iget-wide v5, p1, Lmj/c0;->f:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lmj/c0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lmj/c0;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmj/c0;->c:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lmj/c0;->d:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmj/c0;->e:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lmj/c0;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final m()J
    .locals 2

    iget-wide v0, p0, Lmj/c0;->d:J

    return-wide v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lmj/c0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final o()J
    .locals 2

    iget-wide v0, p0, Lmj/c0;->f:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmj/c0;->a:Ljava/lang/String;

    iget-wide v1, p0, Lmj/c0;->b:J

    iget-object v3, p0, Lmj/c0;->c:Ljava/lang/String;

    iget-wide v4, p0, Lmj/c0;->d:J

    iget-object v6, p0, Lmj/c0;->e:Ljava/lang/String;

    iget-wide v7, p0, Lmj/c0;->f:J

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "PrivateMessageNotification(notificationId="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", time="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", authorUserName="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", authorUserId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", bodyPreview="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", messageId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
