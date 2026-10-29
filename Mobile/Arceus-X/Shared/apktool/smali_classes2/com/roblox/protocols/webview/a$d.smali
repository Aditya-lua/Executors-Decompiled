.class public Lcom/roblox/protocols/webview/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/webview/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnl/a;

.field public final synthetic b:Lcom/roblox/protocols/webview/a;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/webview/a;Lnl/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/webview/a$d;->b:Lcom/roblox/protocols/webview/a;

    iput-object p2, p0, Lcom/roblox/protocols/webview/a$d;->a:Lnl/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/protocols/webview/a$d;->b:Lcom/roblox/protocols/webview/a;

    invoke-static {v0}, Lcom/roblox/protocols/webview/a;->f(Lcom/roblox/protocols/webview/a;)Lcom/roblox/protocols/webview/a$f;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/protocols/webview/a$d;->a:Lnl/a;

    invoke-interface {v0, v1}, Lcom/roblox/protocols/webview/a$f;->g(Lnl/a;)V

    return-void
.end method
