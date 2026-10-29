.class public Lcom/roblox/client/appsflyer/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/appsflyer/a;->C(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/roblox/client/appsflyer/a;


# direct methods
.method public constructor <init>(Lcom/roblox/client/appsflyer/a;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/appsflyer/a$c;->b:Lcom/roblox/client/appsflyer/a;

    iput-object p2, p0, Lcom/roblox/client/appsflyer/a$c;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 1
    .param p1    # Lokhttp3/Call;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/roblox/client/appsflyer/a$c;->b:Lcom/roblox/client/appsflyer/a;

    iget-object p2, p0, Lcom/roblox/client/appsflyer/a$c;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/roblox/client/appsflyer/a;->k(Lcom/roblox/client/appsflyer/a;Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 1
    .param p1    # Lokhttp3/Call;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Response;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/roblox/client/appsflyer/a$c;->b:Lcom/roblox/client/appsflyer/a;

    iget-object v0, p0, Lcom/roblox/client/appsflyer/a$c;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/roblox/client/appsflyer/a;->l(Lokhttp3/Response;)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/roblox/client/appsflyer/a;->k(Lcom/roblox/client/appsflyer/a;Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method
