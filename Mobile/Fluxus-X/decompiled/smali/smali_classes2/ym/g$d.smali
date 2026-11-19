.class public Lym/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lym/g;->H(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lym/g;


# direct methods
.method public constructor <init>(Lym/g;)V
    .locals 0

    iput-object p1, p0, Lym/g$d;->a:Lym/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;
    .locals 1

    iget-object v0, p0, Lym/g$d;->a:Lym/g;

    invoke-virtual {v0, p1}, Lym/g;->u(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;

    move-result-object p1

    return-object p1
.end method
