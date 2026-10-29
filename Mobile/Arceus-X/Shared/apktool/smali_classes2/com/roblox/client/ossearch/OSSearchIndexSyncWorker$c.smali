.class public final Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->doWork(Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker"
    f = "OSSearchIndexSyncWorker.kt"
    l = {
        0x24,
        0x2c,
        0x2f
    }
    m = "doWork"
    v = 0x1
.end annotation


# instance fields
.field public t:J

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

.field public x:I


# direct methods
.method public constructor <init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

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

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->v:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {p1, p0}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->doWork(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
