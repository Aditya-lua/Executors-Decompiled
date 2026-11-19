.class public final Ldv/u$b$a;
.super Lgu/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/u$b;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1"
    f = "Emitters.kt"
    l = {
        0x6e,
        0x75,
        0x7c
    }
    m = "collect"
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
.field public synthetic t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Ldv/u$b;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldv/u$b;Leu/b;)V
    .locals 0

    iput-object p1, p0, Ldv/u$b$a;->v:Ldv/u$b;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldv/u$b$a;->t:Ljava/lang/Object;

    iget p1, p0, Ldv/u$b$a;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldv/u$b$a;->u:I

    iget-object p1, p0, Ldv/u$b$a;->v:Ldv/u$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldv/u$b;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
