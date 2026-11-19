.class public final synthetic Lpm/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lpm/r;


# direct methods
.method public synthetic constructor <init>(Lpm/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpm/p;->a:Lpm/r;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lpm/p;->a:Lpm/r;

    invoke-static {v0, p1}, Lpm/r;->d(Lpm/r;Lorg/json/JSONObject;)V

    return-void
.end method
