.class public Lcom/roblox/client/ActivityNativeMain$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->B2()V
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

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$i;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$i;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->s2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lsg/e2;->i(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method
