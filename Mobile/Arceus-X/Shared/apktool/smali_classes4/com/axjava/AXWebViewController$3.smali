.class Lcom/axjava/AXWebViewController$3;
.super Ljava/lang/Object;
.source "AXWebViewController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/axjava/AXWebViewController;->openControlledWebView(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    const-string v0, "console.log(\'Auto button clicked\');"

    invoke-static {v0}, Lcom/axjava/AXWebViewController;->evalJs(Ljava/lang/String;)V

    invoke-static {}, Lcom/axjava/AXWebViewController;->nativeOnButtonClicked()V

    return-void
.end method
