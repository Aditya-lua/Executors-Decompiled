.class public final synthetic Llm/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# instance fields
.field public final synthetic a:Llm/g;


# direct methods
.method public synthetic constructor <init>(Llm/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llm/c;->a:Llm/g;

    return-void
.end method


# virtual methods
.method public final run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Llm/c;->a:Llm/g;

    invoke-static {v0, p1}, Llm/g;->c(Llm/g;Lorg/json/JSONObject;)V

    return-void
.end method
