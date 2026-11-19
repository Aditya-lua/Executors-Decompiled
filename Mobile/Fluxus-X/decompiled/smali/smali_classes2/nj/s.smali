.class public final synthetic Lnj/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmj/r$c;


# instance fields
.field public final synthetic a:Lnj/a0;

.field public final synthetic b:Lw7/k;


# direct methods
.method public synthetic constructor <init>(Lnj/a0;Lw7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/s;->a:Lnj/a0;

    iput-object p2, p0, Lnj/s;->b:Lw7/k;

    return-void
.end method


# virtual methods
.method public final a(Lmj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V
    .locals 2

    iget-object v0, p0, Lnj/s;->a:Lnj/a0;

    iget-object v1, p0, Lnj/s;->b:Lw7/k;

    invoke-static {v0, v1, p1, p2}, Lnj/a0;->z(Lnj/a0;Lw7/k;Lmj/r$b;Lcom/roblox/client/purchase/model/PurchaseVerificationResponse;)V

    return-void
.end method
