.class public final synthetic Lvp/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Lvp/n0;


# direct methods
.method public synthetic constructor <init>(Lvp/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/m0;->a:Lvp/n0;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lvp/m0;->a:Lvp/n0;

    invoke-static {v0, p1}, Lvp/n0;->b(Lvp/n0;Landroid/content/DialogInterface;)V

    return-void
.end method
