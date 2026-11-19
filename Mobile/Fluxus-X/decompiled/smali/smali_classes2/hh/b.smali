.class public final synthetic Lhh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BooleanSupplier;


# instance fields
.field public final synthetic a:Lcom/roblox/client/appsflyer/a;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/appsflyer/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhh/b;->a:Lcom/roblox/client/appsflyer/a;

    return-void
.end method


# virtual methods
.method public final getAsBoolean()Z
    .locals 1

    iget-object v0, p0, Lhh/b;->a:Lcom/roblox/client/appsflyer/a;

    invoke-static {v0}, Lcom/roblox/client/appsflyer/a;->k(Lcom/roblox/client/appsflyer/a;)Z

    move-result v0

    return v0
.end method
