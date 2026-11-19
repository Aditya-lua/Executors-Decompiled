.class public Lcom/roblox/protocols/webview/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/webview/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/webview/a;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/webview/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/webview/a$c;->a:Lcom/roblox/protocols/webview/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/webview/a$c;->a:Lcom/roblox/protocols/webview/a;

    invoke-static {v0}, Lcom/roblox/protocols/webview/a;->d(Lcom/roblox/protocols/webview/a;)Lcom/roblox/protocols/webview/a$d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/protocols/webview/a$d;->e()V

    return-void
.end method
