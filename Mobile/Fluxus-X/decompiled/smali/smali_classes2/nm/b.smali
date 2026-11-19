.class public final synthetic Lnm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Lnm/e;


# direct methods
.method public synthetic constructor <init>(Lnm/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm/b;->a:Lnm/e;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lnm/b;->a:Lnm/e;

    invoke-static {v0, p1}, Lnm/e;->a(Lnm/e;Lorg/json/JSONObject;)V

    return-void
.end method
