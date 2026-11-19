.class public Lym/g$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


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

    iput-object p1, p0, Lym/g$f;->a:Lym/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lym/g$f;->a:Lym/g;

    invoke-static {v0, p1}, Lym/g;->d(Lym/g;Lorg/json/JSONObject;)V

    return-void
.end method
