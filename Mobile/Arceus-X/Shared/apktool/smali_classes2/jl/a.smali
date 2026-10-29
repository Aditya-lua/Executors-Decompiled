.class public final synthetic Ljl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/z;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/z;Landroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljl/a;->a:Lkotlin/jvm/internal/z;

    iput-object p2, p0, Ljl/a;->b:Landroid/app/Activity;

    iput-object p3, p0, Ljl/a;->c:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ljl/a;->a:Lkotlin/jvm/internal/z;

    iget-object v1, p0, Ljl/a;->b:Landroid/app/Activity;

    iget-object v2, p0, Ljl/a;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1, v2}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->d(Lkotlin/jvm/internal/z;Landroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
