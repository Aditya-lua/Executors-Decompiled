.class public final Lnu/v$a$a;
.super Lpt/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/v$a;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1"
    f = "Errors.kt"
    l = {
        0x6d,
        0x6e
    }
    m = "collect"
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Lnu/v$a;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnu/v$a;Lnt/b;)V
    .locals 0

    iput-object p1, p0, Lnu/v$a$a;->v:Lnu/v$a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnu/v$a$a;->t:Ljava/lang/Object;

    iget p1, p0, Lnu/v$a$a;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnu/v$a$a;->u:I

    iget-object p1, p0, Lnu/v$a$a;->v:Lnu/v$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lnu/v$a;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
