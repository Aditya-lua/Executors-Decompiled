.class public final synthetic Ljl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ZLandroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ljl/b;->a:Z

    iput-object p2, p0, Ljl/b;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, Ljl/b;->a:Z

    iget-object v1, p0, Ljl/b;->b:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->b(ZLandroid/app/Activity;)V

    return-void
.end method
