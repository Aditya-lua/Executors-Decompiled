.class public final Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/scheduledwork/OtaPollingWorker;->r(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;
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
        0x177,
        0x1c0
    }
    m = "pollBehavior"
    v = 0x1
.end annotation


# instance fields
.field public A:Ljava/lang/Object;

.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:Ljava/lang/Object;

.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Ljava/lang/Object;

.field public H:J

.field public I:J

.field public J:Z

.field public K:Z

.field public synthetic L:Ljava/lang/Object;

.field public final synthetic M:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

.field public N:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->M:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

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

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->L:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->N:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->N:I

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$e;->M:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->h(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
