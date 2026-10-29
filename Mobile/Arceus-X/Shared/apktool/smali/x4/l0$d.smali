.class public final Lx4/l0$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx4/l0;->n(Lnt/b;)Ljava/lang/Object;
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
    c = "androidx.room.TriggerBasedInvalidationTracker"
    f = "InvalidationTracker.kt"
    l = {
        0x1a1
    }
    m = "notifyInvalidation"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lx4/l0;

.field public w:I


# direct methods
.method public constructor <init>(Lx4/l0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/l0;",
            "Lnt/b<",
            "-",
            "Lx4/l0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx4/l0$d;->v:Lx4/l0;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lx4/l0$d;->u:Ljava/lang/Object;

    iget p1, p0, Lx4/l0$d;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx4/l0$d;->w:I

    iget-object p1, p0, Lx4/l0$d;->v:Lx4/l0;

    invoke-static {p1, p0}, Lx4/l0;->g(Lx4/l0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
