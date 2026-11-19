.class public final Lde/n1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lde/o1;


# direct methods
.method public synthetic constructor <init>(Lde/o1;Lde/m1;)V
    .locals 0

    iput-object p1, p0, Lde/n1;->a:Lde/o1;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lde/n1;->a:Lde/o1;

    invoke-virtual {v0, p1, p2}, Lde/o1;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
