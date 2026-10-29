.class public abstract Lxi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le4/q;


# direct methods
.method public constructor <init>(Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/a;->a:Le4/q;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    iget-object v0, p0, Lxi/a;->a:Le4/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, v0, Lcom/roblox/client/a;

    if-eqz v2, :cond_2

    check-cast v0, Lcom/roblox/client/a;

    invoke-virtual {v0}, Lcom/roblox/client/a;->N1()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public b()I
    .locals 4

    iget-object v0, p0, Lxi/a;->a:Le4/q;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lxi/a;->a:Le4/q;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    iget-object v3, p0, Lxi/a;->a:Le4/q;

    check-cast v3, Lcom/roblox/client/a;

    invoke-virtual {v3}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v3

    invoke-virtual {v3}, Lmi/a;->c()Landroid/graphics/Rect;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lnk/b;->a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Lnk/b;

    move-result-object v0

    iget v1, v0, Lnk/b;->b:I

    iget v2, v0, Lnk/b;->g:I

    sub-int/2addr v1, v2

    iget v0, v0, Lnk/b;->c:I

    sub-int/2addr v1, v0

    return v1
.end method
