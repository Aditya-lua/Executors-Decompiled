.class public final synthetic Ljl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljl/c;->a:Landroid/app/Activity;

    iput p2, p0, Ljl/c;->b:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ljl/c;->a:Landroid/app/Activity;

    iget v1, p0, Ljl/c;->b:F

    invoke-static {v0, v1}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->a(Landroid/app/Activity;F)V

    return-void
.end method
