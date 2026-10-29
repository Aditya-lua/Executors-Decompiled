.class public final synthetic Lsg/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain$e;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/ActivityNativeMain$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/p;->a:Lcom/roblox/client/ActivityNativeMain$e;

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 1

    iget-object v0, p0, Lsg/p;->a:Lcom/roblox/client/ActivityNativeMain$e;

    invoke-static {v0, p1}, Lcom/roblox/client/ActivityNativeMain$e;->a(Lcom/roblox/client/ActivityNativeMain$e;I)V

    return-void
.end method
