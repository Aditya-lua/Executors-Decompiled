.class public final Loo/a$d$a$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo/a$d$a;->b(Loo/a$c;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1"
    f = "GovernmentIdHintWorker.kt"
    l = {
        0x63,
        0x64
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Loo/a$d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loo/a$d$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Loo/a$d$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo/a$d$a<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Loo/a$d$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo/a$d$a$a;->v:Loo/a$d$a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Loo/a$d$a$a;->u:Ljava/lang/Object;

    iget p1, p0, Loo/a$d$a$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Loo/a$d$a$a;->w:I

    iget-object p1, p0, Loo/a$d$a$a;->v:Loo/a$d$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Loo/a$d$a;->b(Loo/a$c;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
