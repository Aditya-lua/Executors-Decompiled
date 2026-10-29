.class public final synthetic Ltl/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Ltl/d0;


# direct methods
.method public synthetic constructor <init>(Ltl/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/w;->a:Ltl/d0;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Ltl/w;->a:Ltl/d0;

    invoke-static {v0, p1}, Ltl/d0;->m(Ltl/d0;Lorg/json/JSONObject;)V

    return-void
.end method
