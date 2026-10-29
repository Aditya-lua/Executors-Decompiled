.class public final Lou/l$a$a$a$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lou/l$a$a$a;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1"
    f = "Combine.kt"
    l = {
        0x1d,
        0x1e
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lou/l$a$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lou/l$a$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public v:I


# direct methods
.method public constructor <init>(Lou/l$a$a$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lou/l$a$a$a<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lou/l$a$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lou/l$a$a$a$a;->u:Lou/l$a$a$a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lou/l$a$a$a$a;->t:Ljava/lang/Object;

    iget p1, p0, Lou/l$a$a$a$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lou/l$a$a$a$a;->v:I

    iget-object p1, p0, Lou/l$a$a$a$a;->u:Lou/l$a$a$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lou/l$a$a$a;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
