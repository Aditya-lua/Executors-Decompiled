.class public Lcom/roblox/protocols/webview/a$e;
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

    iput-object p1, p0, Lcom/roblox/protocols/webview/a$e;->a:Lcom/roblox/protocols/webview/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/webview/a$e;->a:Lcom/roblox/protocols/webview/a;

    invoke-static {v0}, Lcom/roblox/protocols/webview/a;->f(Lcom/roblox/protocols/webview/a;)Lcom/roblox/protocols/webview/a$f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roblox/protocols/webview/a$f;->e()V

    return-void
.end method
