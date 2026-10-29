.class public final Lnu/v$c$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/v$c;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2"
    f = "Errors.kt"
    l = {
        0x9a
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lnu/v$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/v$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lnu/v$c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/v$c<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lnu/v$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/v$c$a;->v:Lnu/v$c;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnu/v$c$a;->u:Ljava/lang/Object;

    iget p1, p0, Lnu/v$c$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnu/v$c$a;->w:I

    iget-object p1, p0, Lnu/v$c$a;->v:Lnu/v$c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnu/v$c;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
