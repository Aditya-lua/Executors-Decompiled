.class public Lkm/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkm/f;->E(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkm/f;


# direct methods
.method public constructor <init>(Lkm/f;)V
    .locals 0

    iput-object p1, p0, Lkm/f$e;->a:Lkm/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lkm/f$e;->a:Lkm/f;

    invoke-virtual {v0, p1}, Lkm/f;->B(Lorg/json/JSONObject;)V

    return-void
.end method
