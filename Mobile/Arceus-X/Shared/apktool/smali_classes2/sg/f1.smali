.class public final synthetic Lsg/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;

.field public final synthetic b:Le4/q;

.field public final synthetic c:Lej/k;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c;Le4/q;Lej/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/f1;->a:Lcom/roblox/client/c;

    iput-object p2, p0, Lsg/f1;->b:Le4/q;

    iput-object p3, p0, Lsg/f1;->c:Lej/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lsg/f1;->a:Lcom/roblox/client/c;

    iget-object v1, p0, Lsg/f1;->b:Le4/q;

    iget-object v2, p0, Lsg/f1;->c:Lej/k;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/c;->A2(Lcom/roblox/client/c;Le4/q;Lej/k;)V

    return-void
.end method
