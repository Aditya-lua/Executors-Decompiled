.class public final Lcom/roblox/client/widgets/a$h;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/a;->o(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater"
    f = "RecentlyPlayedWidgetUpdater.kt"
    l = {
        0x93,
        0xa5
    }
    m = "updateRecentlyPlayedWidget"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lcom/roblox/client/widgets/a;

.field public B:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/roblox/client/widgets/a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/widgets/a;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/a$h;->A:Lcom/roblox/client/widgets/a;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/a$h;->z:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/widgets/a$h;->B:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/widgets/a$h;->B:I

    iget-object v0, p0, Lcom/roblox/client/widgets/a$h;->A:Lcom/roblox/client/widgets/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/widgets/a;->o(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
