.class public Lei/i$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/i;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lei/i;


# direct methods
.method public constructor <init>(Lei/i;)V
    .locals 0

    iput-object p1, p0, Lei/i$a;->a:Lei/i;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Lei/i$a;->a:Lei/i;

    invoke-static {p1}, Lei/i;->c(Lei/i;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {}, Lei/i;->f()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    iget-object p1, p0, Lei/i$a;->a:Lei/i;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lei/i;->d(Lei/i;J)V

    iget-object p1, p0, Lei/i$a;->a:Lei/i;

    invoke-static {p1, p2}, Lei/i;->e(Lei/i;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
