.class public final Ldv/a0$d$a;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/a0$d;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1"
    f = "Transform.kt"
    l = {
        0x69,
        0x6a
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

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ldv/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/a0$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public x:I


# direct methods
.method public constructor <init>(Ldv/a0$d;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/a0$d<",
            "-TT;>;",
            "Leu/b<",
            "-",
            "Ldv/a0$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldv/a0$d$a;->w:Ldv/a0$d;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldv/a0$d$a;->v:Ljava/lang/Object;

    iget p1, p0, Ldv/a0$d$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldv/a0$d$a;->x:I

    iget-object p1, p0, Ldv/a0$d$a;->w:Ldv/a0$d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldv/a0$d;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
