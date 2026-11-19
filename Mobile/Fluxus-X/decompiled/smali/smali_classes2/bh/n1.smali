.class public final synthetic Lbh/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c$k;

.field public final synthetic b:Lf4/v;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c$k;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/n1;->a:Lcom/roblox/client/c$k;

    iput-object p2, p0, Lbh/n1;->b:Lf4/v;

    iput-object p3, p0, Lbh/n1;->c:Ljava/lang/String;

    iput-object p4, p0, Lbh/n1;->d:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lbh/n1;->a:Lcom/roblox/client/c$k;

    iget-object v1, p0, Lbh/n1;->b:Lf4/v;

    iget-object v2, p0, Lbh/n1;->c:Ljava/lang/String;

    iget-object v3, p0, Lbh/n1;->d:Landroid/webkit/WebView;

    invoke-static {v0, v1, v2, v3}, Lcom/roblox/client/c$k;->c(Lcom/roblox/client/c$k;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method
