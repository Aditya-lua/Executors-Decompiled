.class public final Lbe/n1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lbe/o1;


# direct methods
.method public synthetic constructor <init>(Lbe/o1;Lbe/m1;)V
    .locals 0

    iput-object p1, p0, Lbe/n1;->a:Lbe/o1;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lbe/n1;->a:Lbe/o1;

    invoke-virtual {v0, p1, p2}, Lbe/o1;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
