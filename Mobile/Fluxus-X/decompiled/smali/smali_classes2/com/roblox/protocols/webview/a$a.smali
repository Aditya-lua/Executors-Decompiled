.class public Lcom/roblox/protocols/webview/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/webview/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbm/a;

.field public final synthetic b:Lcom/roblox/protocols/webview/a;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/webview/a;Lbm/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/webview/a$a;->b:Lcom/roblox/protocols/webview/a;

    iput-object p2, p0, Lcom/roblox/protocols/webview/a$a;->a:Lbm/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/protocols/webview/a$a;->b:Lcom/roblox/protocols/webview/a;

    invoke-static {v0}, Lcom/roblox/protocols/webview/a;->d(Lcom/roblox/protocols/webview/a;)Lcom/roblox/protocols/webview/a$d;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/protocols/webview/a$a;->a:Lbm/a;

    invoke-interface {v0, v1}, Lcom/roblox/protocols/webview/a$d;->g(Lbm/a;)V

    return-void
.end method
