.class public final synthetic Lsg/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/b1;->a:Lcom/roblox/client/c;

    iput-boolean p2, p0, Lsg/b1;->b:Z

    iput-object p3, p0, Lsg/b1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onResult(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 3

    iget-object v0, p0, Lsg/b1;->a:Lcom/roblox/client/c;

    iget-boolean v1, p0, Lsg/b1;->b:Z

    iget-object v2, p0, Lsg/b1;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/roblox/client/c;->G2(Lcom/roblox/client/c;ZLjava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V

    return-void
.end method
