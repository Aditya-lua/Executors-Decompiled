.class public final Lz4/p$f;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz4/p;->j(ZLnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.room.coroutines.PooledConnectionImpl"
    f = "ConnectionPoolImpl.kt"
    l = {
        0x275
    }
    m = "endTransaction"
.end annotation


# instance fields
.field public t:Z

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lz4/p;

.field public x:I


# direct methods
.method public constructor <init>(Lz4/p;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz4/p;",
            "Lnt/b<",
            "-",
            "Lz4/p$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz4/p$f;->w:Lz4/p;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lz4/p$f;->v:Ljava/lang/Object;

    iget p1, p0, Lz4/p$f;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz4/p$f;->x:I

    iget-object p1, p0, Lz4/p$f;->w:Lz4/p;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lz4/p;->f(Lz4/p;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
