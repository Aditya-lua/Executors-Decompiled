.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->f(Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker"
    f = "RecentlyPlayedWidgetUpdateWorker.kt"
    l = {
        0x41
    }
    m = "requestWidgetUpdate"
    v = 0x1
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

.field public I:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->H:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

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

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->G:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->I:I

    iget-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->H:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    invoke-static {p1, p0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->c(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
