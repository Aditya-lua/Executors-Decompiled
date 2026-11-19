.class public final Ldv/h0$c;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/h0;->A(Ldv/h0;Ldv/i;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lgu/d;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "kotlinx.coroutines.flow.SharedFlowImpl"
    f = "SharedFlow.kt"
    l = {
        0x183,
        0x18a,
        0x18d
    }
    m = "collect$suspendImpl"
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

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ldv/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/h0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public z:I


# direct methods
.method public constructor <init>(Ldv/h0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/h0<",
            "TT;>;",
            "Leu/b<",
            "-",
            "Ldv/h0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldv/h0$c;->y:Ldv/h0;

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

    iput-object p1, p0, Ldv/h0$c;->x:Ljava/lang/Object;

    iget p1, p0, Ldv/h0$c;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldv/h0$c;->z:I

    iget-object p1, p0, Ldv/h0$c;->y:Ldv/h0;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ldv/h0;->A(Ldv/h0;Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
