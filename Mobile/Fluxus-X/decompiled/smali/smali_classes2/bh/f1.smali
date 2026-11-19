.class public final synthetic Lbh/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;

.field public final synthetic b:Lf4/v;

.field public final synthetic c:Lmj/p;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c;Lf4/v;Lmj/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/f1;->a:Lcom/roblox/client/c;

    iput-object p2, p0, Lbh/f1;->b:Lf4/v;

    iput-object p3, p0, Lbh/f1;->c:Lmj/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lbh/f1;->a:Lcom/roblox/client/c;

    iget-object v1, p0, Lbh/f1;->b:Lf4/v;

    iget-object v2, p0, Lbh/f1;->c:Lmj/p;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/c;->A2(Lcom/roblox/client/c;Lf4/v;Lmj/p;)V

    return-void
.end method
