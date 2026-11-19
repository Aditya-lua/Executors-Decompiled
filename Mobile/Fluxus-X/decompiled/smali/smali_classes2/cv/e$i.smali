.class public final Lcv/e$i;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcv/e;->a1(Lcv/e;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lgu/d;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "kotlinx.coroutines.channels.BufferedChannel"
    f = "BufferedChannel.kt"
    l = {
        0x2f7
    }
    m = "receiveCatching-JP2dKIU$suspendImpl"
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

.field public final synthetic u:Lcv/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcv/e<",
            "TE;>;"
        }
    .end annotation
.end field

.field public v:I


# direct methods
.method public constructor <init>(Lcv/e;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcv/e<",
            "TE;>;",
            "Leu/b<",
            "-",
            "Lcv/e$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcv/e$i;->u:Lcv/e;

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

    iput-object p1, p0, Lcv/e$i;->t:Ljava/lang/Object;

    iget p1, p0, Lcv/e$i;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcv/e$i;->v:I

    iget-object p1, p0, Lcv/e$i;->u:Lcv/e;

    invoke-static {p1, p0}, Lcv/e;->a1(Lcv/e;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lcv/k;->b(Ljava/lang/Object;)Lcv/k;

    move-result-object p1

    return-object p1
.end method
