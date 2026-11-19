.class public final Ldv/w$i$a;
.super Lgu/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/w$i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1"
    f = "Limit.kt"
    l = {
        0x84,
        0x85
    }
    m = "emit"
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

.field public synthetic u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Ldv/w$i;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldv/w$i;Leu/b;)V
    .locals 0

    iput-object p1, p0, Ldv/w$i$a;->w:Ldv/w$i;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldv/w$i$a;->u:Ljava/lang/Object;

    iget p1, p0, Ldv/w$i$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldv/w$i$a;->v:I

    iget-object p1, p0, Ldv/w$i$a;->w:Ldv/w$i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldv/w$i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
