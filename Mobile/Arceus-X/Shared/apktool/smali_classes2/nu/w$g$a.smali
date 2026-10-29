.class public final Lnu/w$g$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/w$g;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1"
    f = "Limit.kt"
    l = {
        0x3b,
        0x3d
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lnu/w$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/w$g<",
            "TT;>;"
        }
    .end annotation
.end field

.field public v:I


# direct methods
.method public constructor <init>(Lnu/w$g;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/w$g<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lnu/w$g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/w$g$a;->u:Lnu/w$g;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnu/w$g$a;->t:Ljava/lang/Object;

    iget p1, p0, Lnu/w$g$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnu/w$g$a;->v:I

    iget-object p1, p0, Lnu/w$g$a;->u:Lnu/w$g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnu/w$g;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
