.class public final Lln/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lln/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0014B-\u0008\u0000\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00050\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00058@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lln/m;",
        "",
        "Lln/i;",
        "workflowSnapshot",
        "Lkotlin/Function0;",
        "",
        "Lmn/k;",
        "childTreeSnapshots",
        "<init>",
        "(Lln/i;Lkotlin/jvm/functions/Function0;)V",
        "Lew/h;",
        "c",
        "()Lew/h;",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "a",
        "Lzt/h;",
        "b",
        "()Lln/i;",
        "()Ljava/util/Map;",
        "wf1-workflow-runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lln/m$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lln/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lln/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lln/m;->c:Lln/m$a;

    return-void
.end method

.method public constructor <init>(Lln/i;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p1    # Lln/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/i;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/util/Map<",
            "Lmn/k;",
            "Lln/m;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "childTreeSnapshots"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lzt/k;->c:Lzt/k;

    new-instance v1, Lln/m$b;

    invoke-direct {v1, p1}, Lln/m$b;-><init>(Lln/i;)V

    invoke-static {v0, v1}, Lzt/i;->b(Lzt/k;Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object p1

    iput-object p1, p0, Lln/m;->a:Lzt/h;

    invoke-static {v0, p2}, Lzt/i;->b(Lzt/k;Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object p1

    iput-object p1, p0, Lln/m;->b:Lzt/h;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lmn/k;",
            "Lln/m;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lln/m;->b:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final b()Lln/i;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lln/m;->a:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lln/i;

    return-object v0
.end method

.method public final c()Lew/h;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    invoke-virtual {p0}, Lln/m;->b()Lln/i;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lln/i;->b()Lew/h;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_1

    sget-object v1, Lew/h;->e:Lew/h;

    :cond_1
    invoke-static {v0, v1}, Lln/j;->c(Lew/f;Lew/h;)Lew/f;

    invoke-virtual {p0}, Lln/m;->a()Ljava/util/Map;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmn/k;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lln/m;

    invoke-virtual {v5}, Lmn/k;->d()Lew/h;

    move-result-object v5

    if-nez v5, :cond_2

    :goto_2
    move-object v6, v2

    goto :goto_3

    :cond_2
    invoke-virtual {v4}, Lln/m;->c()Lew/h;

    move-result-object v4

    invoke-virtual {v4}, Lew/h;->I()I

    move-result v6

    if-nez v6, :cond_3

    move-object v4, v2

    :cond_3
    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    new-instance v6, Lkotlin/Pair;

    invoke-direct {v6, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lew/e;->x0(I)Lew/e;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_7

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    check-cast v4, Lkotlin/Pair;

    invoke-virtual {v4}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lew/h;

    invoke-virtual {v4}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lew/h;

    invoke-static {v0, v5}, Lln/j;->c(Lew/f;Lew/h;)Lew/f;

    invoke-static {v0, v4}, Lln/j;->c(Lew/f;Lew/h;)Lew/f;

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lew/e;->J2()Lew/h;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lln/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lln/m;

    invoke-virtual {p1}, Lln/m;->b()Lln/i;

    move-result-object v1

    invoke-virtual {p0}, Lln/m;->b()Lln/i;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lln/m;->a()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0}, Lln/m;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lln/m;->b()Lln/i;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lln/m;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
