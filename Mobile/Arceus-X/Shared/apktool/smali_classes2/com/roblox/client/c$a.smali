.class public Lcom/roblox/client/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lii/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/c;->a3()Lcom/roblox/client/hybrid/RBHybridWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c$a;->a:Lcom/roblox/client/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/c$a;->a:Lcom/roblox/client/c;

    invoke-static {v0}, Lcom/roblox/client/c;->N2(Lcom/roblox/client/c;)Lcom/roblox/client/c$i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/c$a;->a:Lcom/roblox/client/c;

    invoke-static {v0}, Lcom/roblox/client/c;->N2(Lcom/roblox/client/c;)Lcom/roblox/client/c$i;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/roblox/client/c$i;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
