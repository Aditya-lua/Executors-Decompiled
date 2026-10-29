.class public final Lx4/l0$c$b$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx4/l0$c$b;->b([ILnt/b;)Ljava/lang/Object;
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
    c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2"
    f = "InvalidationTracker.kt"
    l = {
        0xf7,
        0x100
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lx4/l0$c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx4/l0$c$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lx4/l0$c$b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/l0$c$b<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lx4/l0$c$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx4/l0$c$b$a;->v:Lx4/l0$c$b;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx4/l0$c$b$a;->u:Ljava/lang/Object;

    iget p1, p0, Lx4/l0$c$b$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx4/l0$c$b$a;->w:I

    iget-object p1, p0, Lx4/l0$c$b$a;->v:Lx4/l0$c$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lx4/l0$c$b;->b([ILnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
