.class public final Lcom/roblox/client/scheduledwork/OtaPollingWorker$f;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/scheduledwork/OtaPollingWorker;->v(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.scheduledwork.OtaPollingWorker"
    f = "OtaPollingWorker.kt"
    l = {
        0x1a3,
        0x1ec
    }
    m = "pollBehavior"
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
.field public A:Ljava/lang/Object;

.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:Ljava/lang/Object;

.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Ljava/lang/Object;

.field public H:Ljava/lang/Object;

.field public I:J

.field public J:J

.field public K:Z

.field public L:Z

.field public synthetic M:Ljava/lang/Object;

.field public final synthetic N:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

.field public O:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker;",
            "Leu/b<",
            "-",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$f;->N:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

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

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$f;->M:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$f;->O:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$f;->O:I

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$f;->N:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->j(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
