.class public Lcom/roblox/client/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/d$d;

.field public final synthetic b:Lcom/roblox/client/d;


# direct methods
.method public constructor <init>(Lcom/roblox/client/d;Lcom/roblox/client/d$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/d$a;->b:Lcom/roblox/client/d;

    iput-object p2, p0, Lcom/roblox/client/d$a;->a:Lcom/roblox/client/d$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lei/j;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/d$a;->b:Lcom/roblox/client/d;

    invoke-static {v0, p1}, Lcom/roblox/client/d;->a(Lcom/roblox/client/d;Lei/j;)V

    iget-object p1, p0, Lcom/roblox/client/d$a;->a:Lcom/roblox/client/d$d;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/d$a;->b:Lcom/roblox/client/d;

    iget-object v0, v0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    invoke-interface {p1, v0}, Lcom/roblox/client/d$d;->a(Lcom/roblox/client/d$e;)V

    :cond_0
    return-void
.end method

.method public b(Lei/j;)V
    .locals 0

    return-void
.end method
