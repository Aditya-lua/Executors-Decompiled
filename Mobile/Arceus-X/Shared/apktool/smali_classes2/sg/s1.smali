.class public final synthetic Lsg/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;


# instance fields
.field public final synthetic a:Lsg/y1;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsg/y1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/s1;->a:Lsg/y1;

    iput-object p2, p0, Lsg/s1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onResult(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 2

    iget-object v0, p0, Lsg/s1;->a:Lsg/y1;

    iget-object v1, p0, Lsg/s1;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lsg/y1;->j2(Lsg/y1;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V

    return-void
.end method
