.class final Lokhttp3/internal/LinkedTags;
.super Lokhttp3/internal/Tags;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lokhttp3/internal/Tags;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\u0008\u0008\u0001\u0010\n*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\u0008\u0008\u0001\u0010\n*\u00020\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lokhttp3/internal/LinkedTags;",
        "",
        "K",
        "Lokhttp3/internal/Tags;",
        "Lhu/c;",
        "key",
        "value",
        "next",
        "<init>",
        "(Lhu/c;Ljava/lang/Object;Lokhttp3/internal/Tags;)V",
        "T",
        "plus",
        "(Lhu/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;",
        "get",
        "(Lhu/c;)Ljava/lang/Object;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lhu/c;",
        "Ljava/lang/Object;",
        "Lokhttp3/internal/Tags;",
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
.field private final key:Lhu/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhu/c<",
            "TK;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final next:Lokhttp3/internal/Tags;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhu/c;Ljava/lang/Object;Lokhttp3/internal/Tags;)V
    .locals 1
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lokhttp3/internal/Tags;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu/c<",
            "TK;>;TK;",
            "Lokhttp3/internal/Tags;",
            ")V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "next"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokhttp3/internal/Tags;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lokhttp3/internal/LinkedTags;->key:Lhu/c;

    iput-object p2, p0, Lokhttp3/internal/LinkedTags;->value:Ljava/lang/Object;

    iput-object p3, p0, Lokhttp3/internal/LinkedTags;->next:Lokhttp3/internal/Tags;

    return-void
.end method

.method public static synthetic a(Lokhttp3/internal/LinkedTags;)Lokhttp3/internal/LinkedTags;
    .locals 0

    invoke-static {p0}, Lokhttp3/internal/LinkedTags;->toString$lambda$0(Lokhttp3/internal/LinkedTags;)Lokhttp3/internal/LinkedTags;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lokhttp3/internal/LinkedTags;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lokhttp3/internal/LinkedTags;->toString$lambda$1(Lokhttp3/internal/LinkedTags;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final toString$lambda$0(Lokhttp3/internal/LinkedTags;)Lokhttp3/internal/LinkedTags;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lokhttp3/internal/LinkedTags;->next:Lokhttp3/internal/Tags;

    instance-of v0, p0, Lokhttp3/internal/LinkedTags;

    if-eqz v0, :cond_0

    check-cast p0, Lokhttp3/internal/LinkedTags;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final toString$lambda$1(Lokhttp3/internal/LinkedTags;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lokhttp3/internal/LinkedTags;->key:Lhu/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lokhttp3/internal/LinkedTags;->value:Ljava/lang/Object;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public get(Lhu/c;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhu/c<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lokhttp3/internal/LinkedTags;->key:Lhu/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyt/a;->a(Lhu/c;)Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lokhttp3/internal/LinkedTags;->value:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/LinkedTags;->next:Lokhttp3/internal/Tags;

    invoke-virtual {v0, p1}, Lokhttp3/internal/Tags;->get(Lhu/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lhu/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;
    .locals 4
    .param p1    # Lhu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhu/c<",
            "TT;>;TT;)",
            "Lokhttp3/internal/Tags;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lokhttp3/internal/LinkedTags;->key:Lhu/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/LinkedTags;->next:Lokhttp3/internal/Tags;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/LinkedTags;->next:Lokhttp3/internal/Tags;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lokhttp3/internal/Tags;->plus(Lhu/c;Ljava/lang/Object;)Lokhttp3/internal/Tags;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/LinkedTags;->next:Lokhttp3/internal/Tags;

    if-ne v0, v1, :cond_1

    move-object v0, p0

    goto :goto_0

    :cond_1
    new-instance v1, Lokhttp3/internal/LinkedTags;

    iget-object v2, p0, Lokhttp3/internal/LinkedTags;->key:Lhu/c;

    iget-object v3, p0, Lokhttp3/internal/LinkedTags;->value:Ljava/lang/Object;

    invoke-direct {v1, v2, v3, v0}, Lokhttp3/internal/LinkedTags;-><init>(Lhu/c;Ljava/lang/Object;Lokhttp3/internal/Tags;)V

    move-object v0, v1

    :goto_0
    if-eqz p2, :cond_2

    new-instance v1, Lokhttp3/internal/LinkedTags;

    invoke-direct {v1, p1, p2, v0}, Lokhttp3/internal/LinkedTags;-><init>(Lhu/c;Ljava/lang/Object;Lokhttp3/internal/Tags;)V

    return-object v1

    :cond_2
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lokhttp3/internal/a;

    invoke-direct {v0}, Lokhttp3/internal/a;-><init>()V

    invoke-static {p0, v0}, Liu/m;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Liu/p;->z(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v7, Lokhttp3/internal/b;

    invoke-direct {v7}, Lokhttp3/internal/b;-><init>()V

    const/16 v8, 0x19

    const/4 v9, 0x0

    const/4 v2, 0x0

    const-string v3, "{"

    const-string v4, "}"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
