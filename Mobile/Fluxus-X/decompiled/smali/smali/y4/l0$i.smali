.class public final Ly4/l0$i;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/l0;->x(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.room.TriggerBasedInvalidationTracker"
    f = "InvalidationTracker.kt"
    l = {
        0x132
    }
    m = "syncTriggers$room_runtime"
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

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ly4/l0;

.field public w:I


# direct methods
.method public constructor <init>(Ly4/l0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/l0;",
            "Leu/b<",
            "-",
            "Ly4/l0$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly4/l0$i;->v:Ly4/l0;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

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

    iput-object p1, p0, Ly4/l0$i;->u:Ljava/lang/Object;

    iget p1, p0, Ly4/l0$i;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly4/l0$i;->w:I

    iget-object p1, p0, Ly4/l0$i;->v:Ly4/l0;

    invoke-virtual {p1, p0}, Ly4/l0;->x(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
