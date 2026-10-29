.class public final Lsl/w$b$b$a$a;
.super Lpt/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl/w$b$b$a;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$filter$1$2"
    f = "Replicator.kt"
    l = {
        0x32
    }
    m = "emit"
    v = 0x1
.end annotation


# instance fields
.field public A:I

.field public synthetic t:Ljava/lang/Object;

.field public u:I

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public final synthetic x:Lsl/w$b$b$a;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsl/w$b$b$a;Lnt/b;)V
    .locals 0

    iput-object p1, p0, Lsl/w$b$b$a$a;->x:Lsl/w$b$b$a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsl/w$b$b$a$a;->t:Ljava/lang/Object;

    iget p1, p0, Lsl/w$b$b$a$a;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsl/w$b$b$a$a;->u:I

    iget-object p1, p0, Lsl/w$b$b$a$a;->x:Lsl/w$b$b$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lsl/w$b$b$a;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
