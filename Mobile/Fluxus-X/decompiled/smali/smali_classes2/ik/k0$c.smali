.class public Lik/k0$c;
.super Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lik/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lik/k0;


# direct methods
.method public constructor <init>(Lik/k0;)V
    .locals 0

    iput-object p1, p0, Lik/k0$c;->a:Lik/k0;

    invoke-direct {p0}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lik/k0$c;->a:Lik/k0;

    invoke-static {v0, p1, p2}, Lik/k0;->k(Lik/k0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
