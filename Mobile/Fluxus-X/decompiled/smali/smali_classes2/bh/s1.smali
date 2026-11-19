.class public final synthetic Lbh/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;


# instance fields
.field public final synthetic a:Lbh/y1;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lbh/y1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/s1;->a:Lbh/y1;

    iput-object p2, p0, Lbh/s1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onResult(Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 2

    iget-object v0, p0, Lbh/s1;->a:Lbh/y1;

    iget-object v1, p0, Lbh/s1;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lbh/y1;->j2(Lbh/y1;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V

    return-void
.end method
