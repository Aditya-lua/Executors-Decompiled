.class public final Lgm/w$b$c$a$a;
.super Lgu/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgm/w$b$c$a;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$1$2"
    f = "Replicator.kt"
    l = {
        0x32
    }
    m = "emit"
    v = 0x1
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


# instance fields
.field public A:I

.field public synthetic t:Ljava/lang/Object;

.field public u:I

.field public v:Ljava/lang/Object;

.field public final synthetic w:Lgm/w$b$c$a;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgm/w$b$c$a;Leu/b;)V
    .locals 0

    iput-object p1, p0, Lgm/w$b$c$a$a;->w:Lgm/w$b$c$a;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgm/w$b$c$a$a;->t:Ljava/lang/Object;

    iget p1, p0, Lgm/w$b$c$a$a;->u:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgm/w$b$c$a$a;->u:I

    iget-object p1, p0, Lgm/w$b$c$a$a;->w:Lgm/w$b$c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lgm/w$b$c$a;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
