.class public final Lmu/e$j;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu/e;->b1(Lmu/m;IJLnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.channels.BufferedChannel"
    f = "BufferedChannel.kt"
    l = {
        0xc2d
    }
    m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:J

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lmu/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/e<",
            "TE;>;"
        }
    .end annotation
.end field

.field public z:I


# direct methods
.method public constructor <init>(Lmu/e;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/e<",
            "TE;>;",
            "Lnt/b<",
            "-",
            "Lmu/e$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmu/e$j;->y:Lmu/e;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lmu/e$j;->x:Ljava/lang/Object;

    iget p1, p0, Lmu/e$j;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmu/e$j;->z:I

    iget-object v0, p0, Lmu/e$j;->y:Lmu/e;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lmu/e;->K(Lmu/e;Lmu/m;IJLnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lmu/k;->b(Ljava/lang/Object;)Lmu/k;

    move-result-object p1

    return-object p1
.end method
