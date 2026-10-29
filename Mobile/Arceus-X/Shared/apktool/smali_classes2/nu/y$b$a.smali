.class public final Lnu/y$b$a;
.super Lpt/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/y$b;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2"
    f = "Reduce.kt"
    l = {
        0x84
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lnu/y$b;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnu/y$b;Lnt/b;)V
    .locals 0

    iput-object p1, p0, Lnu/y$b$a;->w:Lnu/y$b;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnu/y$b$a;->u:Ljava/lang/Object;

    iget p1, p0, Lnu/y$b$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnu/y$b$a;->v:I

    iget-object p1, p0, Lnu/y$b$a;->w:Lnu/y$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnu/y$b;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
