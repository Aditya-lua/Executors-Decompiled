.class public final Lku/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lku/e$a;,
        Lku/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0002\u000f\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a8\u0006\u0010"
    }
    d2 = {
        "Lku/e;",
        "T",
        "",
        "",
        "Lku/w0;",
        "deferreds",
        "<init>",
        "([Lku/w0;)V",
        "",
        "c",
        "(Lnt/b;)Ljava/lang/Object;",
        "a",
        "[Lku/w0;",
        "Lkotlinx/atomicfu/AtomicInt;",
        "notCompletedCount",
        "b",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:[Lku/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lku/w0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic notCompletedCount$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lku/e;

    const-string v1, "notCompletedCount$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lku/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>([Lku/w0;)V
    .locals 0
    .param p1    # [Lku/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lku/w0<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lku/e;->a:[Lku/w0;

    array-length p1, p1

    iput p1, p0, Lku/e;->notCompletedCount$volatile:I

    return-void
.end method

.method public static final synthetic a(Lku/e;)[Lku/w0;
    .locals 0

    iget-object p0, p0, Lku/e;->a:[Lku/w0;

    return-object p0
.end method

.method public static final synthetic b()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    invoke-static {}, Lku/e;->d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic d()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, Lku/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public final c(Lnt/b;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lku/p;

    invoke-static {p1}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v0}, Lku/p;->H()V

    invoke-static {p0}, Lku/e;->a(Lku/e;)[Lku/w0;

    move-result-object v1

    array-length v1, v1

    new-array v3, v1, [Lku/e$a;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_0

    invoke-static {p0}, Lku/e;->a(Lku/e;)[Lku/w0;

    move-result-object v6

    aget-object v6, v6, v5

    invoke-interface {v6}, Lku/d2;->start()Z

    new-instance v7, Lku/e$a;

    invoke-direct {v7, p0, v0}, Lku/e$a;-><init>(Lku/e;Lku/n;)V

    check-cast v6, Lku/d2;

    const/4 v8, 0x0

    invoke-static {v6, v4, v7, v2, v8}, Lku/g2;->j(Lku/d2;ZLku/i2;ILjava/lang/Object;)Lku/i1;

    move-result-object v6

    invoke-virtual {v7, v6}, Lku/e$a;->D(Lku/i1;)V

    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    aput-object v7, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Lku/e$b;

    invoke-direct {v2, p0, v3}, Lku/e$b;-><init>(Lku/e;[Lku/e$a;)V

    :goto_1
    if-ge v4, v1, :cond_1

    aget-object v5, v3, v4

    invoke-virtual {v5, v2}, Lku/e$a;->C(Lku/e$b;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Lku/n;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Lku/e$b;->b()V

    goto :goto_2

    :cond_2
    invoke-static {v0, v2}, Lku/r;->c(Lku/n;Lku/m;)V

    :goto_2
    invoke-virtual {v0}, Lku/p;->A()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {p1}, Lpt/h;->c(Lnt/b;)V

    :cond_3
    return-object v0
.end method
