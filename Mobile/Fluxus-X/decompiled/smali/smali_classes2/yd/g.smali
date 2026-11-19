.class public final Lyd/g;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltb/k;


# direct methods
.method public constructor <init>(Lyd/h;Landroid/os/Handler;Ltb/k;)V
    .locals 0

    iput-object p3, p0, Lyd/g;->a:Ltb/k;

    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lyd/g;->a:Ltb/k;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
