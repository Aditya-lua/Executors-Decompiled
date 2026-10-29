.class public Lak/k0$c;
.super Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lak/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lak/k0;


# direct methods
.method public constructor <init>(Lak/k0;)V
    .locals 0

    iput-object p1, p0, Lak/k0$c;->a:Lak/k0;

    invoke-direct {p0}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lak/k0$c;->a:Lak/k0;

    invoke-static {v0, p1, p2}, Lak/k0;->k(Lak/k0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
