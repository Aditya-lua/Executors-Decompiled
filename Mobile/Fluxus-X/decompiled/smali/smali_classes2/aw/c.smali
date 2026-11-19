.class public final Law/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Law/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0008\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Law/c;",
        "",
        "Law/d;",
        "publicSuffixList",
        "<init>",
        "(Law/d;)V",
        "",
        "domain",
        "c",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "d",
        "(Ljava/lang/String;)Ljava/util/List;",
        "domainLabels",
        "b",
        "(Ljava/util/List;)Ljava/util/List;",
        "a",
        "Law/d;",
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


# static fields
.field public static final b:Law/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lew/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static e:Law/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Law/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Law/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Law/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Law/c;->b:Law/c$a;

    sget-object v0, Lew/h;->d:Lew/h$a;

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/16 v2, 0x2a

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    invoke-virtual {v0, v1}, Lew/h$a;->e([B)Lew/h;

    move-result-object v0

    sput-object v0, Law/c;->c:Lew/h;

    const-string v0, "*"

    invoke-static {v0}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Law/c;->d:Ljava/util/List;

    new-instance v0, Law/c;

    sget-object v1, Law/d;->a:Law/d$a;

    invoke-static {v1}, Law/e;->a(Law/d$a;)Law/d;

    move-result-object v1

    invoke-direct {v0, v1}, Law/c;-><init>(Law/d;)V

    sput-object v0, Law/c;->e:Law/c;

    return-void
.end method

.method public constructor <init>(Law/d;)V
    .locals 1
    .param p1    # Law/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "publicSuffixList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Law/c;->a:Law/d;

    return-void
.end method

.method public static final synthetic a()Law/c;
    .locals 1

    sget-object v0, Law/c;->e:Law/c;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Law/c;->a:Law/d;

    invoke-interface {v0}, Law/d;->b()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Lew/h;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    sget-object v4, Lew/h;->d:Lew/h$a;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Lew/h$a;->d(Ljava/lang/String;)Lew/h;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_1
    const/4 v3, 0x0

    if-ge p1, v0, :cond_2

    sget-object v4, Law/c;->b:Law/c$a;

    iget-object v5, p0, Law/c;->a:Law/d;

    invoke-interface {v5}, Law/d;->a()Lew/h;

    move-result-object v5

    invoke-static {v4, v5, v1, p1}, Law/c$a;->a(Law/c$a;Lew/h;[Lew/h;I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    move-object v4, v3

    :goto_2
    const/4 p1, 0x1

    if-le v0, p1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lew/h;

    array-length v6, v5

    sub-int/2addr v6, p1

    move v7, v2

    :goto_3
    if-ge v7, v6, :cond_4

    sget-object v8, Law/c;->c:Lew/h;

    aput-object v8, v5, v7

    sget-object v8, Law/c;->b:Law/c$a;

    iget-object v9, p0, Law/c;->a:Law/d;

    invoke-interface {v9}, Law/d;->a()Lew/h;

    move-result-object v9

    invoke-static {v8, v9, v5, v7}, Law/c$a;->a(Law/c$a;Lew/h;[Lew/h;I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    move-object v9, v8

    goto :goto_4

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    move-object v9, v3

    :goto_4
    if-eqz v9, :cond_6

    sub-int/2addr v0, p1

    move v5, v2

    :goto_5
    if-ge v5, v0, :cond_6

    sget-object v6, Law/c;->b:Law/c$a;

    iget-object v7, p0, Law/c;->a:Law/d;

    invoke-interface {v7}, Law/d;->c()Lew/h;

    move-result-object v7

    invoke-static {v6, v7, v1, v5}, Law/c$a;->a(Law/c$a;Lew/h;[Lew/h;I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    move-object v3, v6

    goto :goto_6

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_6
    :goto_6
    const/16 v0, 0x2e

    if-eqz v3, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v4, 0x21

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, p1, [C

    aput-char v0, v6, v2

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->N0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_7
    if-nez v4, :cond_8

    if-nez v9, :cond_8

    sget-object p1, Law/c;->d:Ljava/util/List;

    return-object p1

    :cond_8
    if-eqz v4, :cond_9

    move-object v3, v4

    new-array v4, p1, [C

    aput-char v0, v4, v2

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->N0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_a

    :cond_9
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v1

    :cond_a
    if-eqz v9, :cond_b

    new-array p1, p1, [C

    aput-char v0, p1, v2

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v9

    move-object v9, p1

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->N0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_c

    :cond_b
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object p1

    :cond_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-le v0, v2, :cond_d

    return-object v1

    :cond_d
    return-object p1
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "domain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Law/c;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Law/c;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0x21

    const/4 v5, 0x0

    if-ne v2, v3, :cond_0

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v4, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :goto_1
    invoke-virtual {p0, p1}, Law/c;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->U(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-static {p1, v0}, Lyu/p;->o(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;

    move-result-object v1

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const-string v2, "."

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lyu/p;->w(Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v2, v0, [C

    const/16 v1, 0x2e

    const/4 v3, 0x0

    aput-char v1, v2, v3

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->N0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->o0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->Z(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method
