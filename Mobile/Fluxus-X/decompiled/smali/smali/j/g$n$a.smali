.class public Lj/g$n$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/g$n;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/g$n;


# direct methods
.method public constructor <init>(Lj/g$n;)V
    .locals 0

    iput-object p1, p0, Lj/g$n$a;->a:Lj/g$n;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lj/g$n$a;->a:Lj/g$n;

    invoke-virtual {p1}, Lj/g$n;->d()V

    return-void
.end method
