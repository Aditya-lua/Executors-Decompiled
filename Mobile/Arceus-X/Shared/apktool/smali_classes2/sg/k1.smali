.class public final synthetic Lsg/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;

.field public final synthetic b:Le4/q;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c;Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/k1;->a:Lcom/roblox/client/c;

    iput-object p2, p0, Lsg/k1;->b:Le4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lsg/k1;->a:Lcom/roblox/client/c;

    iget-object v1, p0, Lsg/k1;->b:Le4/q;

    invoke-static {v0, v1}, Lcom/roblox/client/c;->B2(Lcom/roblox/client/c;Le4/q;)V

    return-void
.end method
