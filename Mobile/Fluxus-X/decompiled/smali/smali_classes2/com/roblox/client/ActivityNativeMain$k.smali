.class public Lcom/roblox/client/ActivityNativeMain$k;
.super Lcom/roblox/client/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->c(Ljava/lang/String;)V
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

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$k;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Lcom/roblox/client/d$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/d$e;)V
    .locals 1

    invoke-virtual {p1}, Lcom/roblox/client/d$e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$k;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roblox/client/a;->f2(Z)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/roblox/client/d$e;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain$k;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roblox/client/a;->f2(Z)V

    :cond_1
    return-void
.end method
