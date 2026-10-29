.class public final synthetic Lmm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/m;


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/messagebus/MessageBus$c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmm/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus$c;

    iput-object p2, p0, Lmm/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lmm/d;->c:Ljava/lang/String;

    iput-object p4, p0, Lmm/d;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lmm/l;)V
    .locals 4

    iget-object v0, p0, Lmm/d;->a:Lcom/roblox/universalapp/messagebus/MessageBus$c;

    iget-object v1, p0, Lmm/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lmm/d;->c:Ljava/lang/String;

    iget-object v3, p0, Lmm/d;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/roblox/universalapp/messagebus/MessageBus$c;->a(Lcom/roblox/universalapp/messagebus/MessageBus$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmm/l;)V

    return-void
.end method
