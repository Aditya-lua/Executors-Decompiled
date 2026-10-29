.class public final Lz4/o$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz4/o;->a(Lnt/b;)Ljava/lang/Object;
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
    c = "androidx.room.coroutines.Pool"
    f = "ConnectionPoolImpl.kt"
    l = {
        0xfd
    }
    m = "acquire"
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lz4/o;

.field public v:I


# direct methods
.method public constructor <init>(Lz4/o;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz4/o;",
            "Lnt/b<",
            "-",
            "Lz4/o$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz4/o$a;->u:Lz4/o;

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

    iput-object p1, p0, Lz4/o$a;->t:Ljava/lang/Object;

    iget p1, p0, Lz4/o$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz4/o$a;->v:I

    iget-object p1, p0, Lz4/o$a;->u:Lz4/o;

    invoke-virtual {p1, p0}, Lz4/o;->a(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
