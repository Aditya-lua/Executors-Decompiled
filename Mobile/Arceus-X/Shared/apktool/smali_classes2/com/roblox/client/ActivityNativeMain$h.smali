.class public Lcom/roblox/client/ActivityNativeMain$h;
.super Lcom/roblox/client/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->H2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$h;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Lcom/roblox/client/d$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/d$e;)V
    .locals 2

    invoke-virtual {p1}, Lcom/roblox/client/d$e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$h;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roblox/client/a;->f2(Z)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/roblox/client/d$e;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$h;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roblox/client/a;->f2(Z)V

    return-void

    :cond_1
    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/roblox/client/d$e;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$h;->a:Lcom/roblox/client/ActivityNativeMain;

    sget-object v1, Lvi/b$d;->a:Lvi/b$d;

    invoke-virtual {p1, v0, v1}, Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V

    :cond_2
    return-void
.end method

.method public b(Lcom/roblox/client/d$e;)V
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/roblox/client/d$e;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$h;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roblox/client/a;->f2(Z)V

    :cond_0
    return-void
.end method
