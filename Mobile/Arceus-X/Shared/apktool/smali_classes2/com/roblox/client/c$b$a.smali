.class public Lcom/roblox/client/c$b$a;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/c$b;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/c$b;


# direct methods
.method public constructor <init>(Lcom/roblox/client/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c$b$a;->a:Lcom/roblox/client/c$b;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    iget-object p1, p0, Lcom/roblox/client/c$b$a;->a:Lcom/roblox/client/c$b;

    iget-object p1, p1, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    invoke-static {p1, p2}, Lcom/roblox/client/c;->T2(Lcom/roblox/client/c;Ljava/lang/String;)V

    return-void
.end method
