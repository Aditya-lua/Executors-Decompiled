.class public final synthetic Lsg/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/k;->a:Lcom/roblox/client/ActivityNativeMain;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lsg/k;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->i2(Lcom/roblox/client/ActivityNativeMain;)V

    return-void
.end method
