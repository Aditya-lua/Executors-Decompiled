.class public final synthetic Lbm/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lbm/r;


# direct methods
.method public synthetic constructor <init>(Lbm/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm/o;->a:Lbm/r;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lbm/o;->a:Lbm/r;

    invoke-static {v0, p1}, Lbm/r;->b(Lbm/r;Lorg/json/JSONObject;)V

    return-void
.end method
