.class public final Lnu/w$e;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/w;->d(Lnu/i;Ljava/lang/Object;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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
        "Lpt/d;"
    }
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
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt"
    f = "Limit.kt"
    l = {
        0x47
    }
    m = "emitAbort$FlowKt__LimitKt"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public v:I


# direct methods
.method public constructor <init>(Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lnu/w$e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpt/d;-><init>(Lnt/b;)V

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

    iput-object p1, p0, Lnu/w$e;->u:Ljava/lang/Object;

    iget p1, p0, Lnu/w$e;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnu/w$e;->v:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Lnu/w;->a(Lnu/i;Ljava/lang/Object;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
