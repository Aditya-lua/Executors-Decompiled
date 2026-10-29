.class public Lcom/roblox/client/appsflyer/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/share/deeplink/DeepLinkListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/appsflyer/a;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/appsflyer/a;


# direct methods
.method public constructor <init>(Lcom/roblox/client/appsflyer/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/appsflyer/a$b;->a:Lcom/roblox/client/appsflyer/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeepLinking(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a$b;->a:Lcom/roblox/client/appsflyer/a;

    invoke-virtual {v0, p1}, Lcom/roblox/client/appsflyer/a;->P(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    return-void
.end method
