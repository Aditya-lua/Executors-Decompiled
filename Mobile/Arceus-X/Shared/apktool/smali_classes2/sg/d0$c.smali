.class public Lsg/d0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsg/d0;->k2(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsg/d0;


# direct methods
.method public constructor <init>(Lsg/d0;)V
    .locals 0

    iput-object p1, p0, Lsg/d0$c;->a:Lsg/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    const-string p2, "logout"

    const-string v0, "yes"

    invoke-static {p2, v0}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object p1, p0, Lsg/d0$c;->a:Lsg/d0;

    invoke-static {p1}, Lsg/d0;->A2(Lsg/d0;)Lsg/d0$d;

    move-result-object p1

    invoke-interface {p1}, Lsg/d0$d;->a()V

    return-void
.end method
