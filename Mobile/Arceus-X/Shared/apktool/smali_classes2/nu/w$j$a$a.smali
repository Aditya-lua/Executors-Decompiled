.class public final Lnu/w$j$a$a;
.super Lpt/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/w$j$a;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1"
    f = "Limit.kt"
    l = {
        0x84
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lnu/w$j$a;


# direct methods
.method public constructor <init>(Lnu/w$j$a;Lnt/b;)V
    .locals 0

    iput-object p1, p0, Lnu/w$j$a$a;->w:Lnu/w$j$a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnu/w$j$a$a;->u:Ljava/lang/Object;

    iget p1, p0, Lnu/w$j$a$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnu/w$j$a$a;->v:I

    iget-object p1, p0, Lnu/w$j$a$a;->w:Lnu/w$j$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnu/w$j$a;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
