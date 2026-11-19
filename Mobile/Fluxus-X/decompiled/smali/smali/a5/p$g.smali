.class public final La5/p$g;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La5/p;->o(Ly4/g0$a;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lgu/d;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.room.coroutines.PooledConnectionImpl"
    f = "ConnectionPoolImpl.kt"
    l = {
        0x1d0,
        0x1d4,
        0x1e2,
        0x1e2,
        0x1e2
    }
    m = "transaction"
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


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:La5/p;

.field public y:I


# direct methods
.method public constructor <init>(La5/p;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/p;",
            "Leu/b<",
            "-",
            "La5/p$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La5/p$g;->x:La5/p;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

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

    iput-object p1, p0, La5/p$g;->w:Ljava/lang/Object;

    iget p1, p0, La5/p$g;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La5/p$g;->y:I

    iget-object p1, p0, La5/p$g;->x:La5/p;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, La5/p;->h(La5/p;Ly4/g0$a;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
