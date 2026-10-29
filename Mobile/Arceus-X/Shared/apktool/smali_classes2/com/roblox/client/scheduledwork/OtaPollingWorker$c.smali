.class public final Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/scheduledwork/OtaPollingWorker;->doWork(Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.scheduledwork.OtaPollingWorker"
    f = "OtaPollingWorker.kt"
    l = {
        0x11c
    }
    m = "doWork"
    v = 0x1
.end annotation


# instance fields
.field public A:J

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic C:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

.field public D:I

.field public t:Z

.field public u:Z

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->C:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

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

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->B:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->D:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->D:I

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;->C:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    invoke-virtual {p1, p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->doWork(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
