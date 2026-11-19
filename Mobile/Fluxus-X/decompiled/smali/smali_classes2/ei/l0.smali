.class public final synthetic Lei/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/c;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lei/k0;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/game/c;Landroid/app/Activity;Lei/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lei/l0;->a:Lcom/roblox/client/game/c;

    iput-object p2, p0, Lei/l0;->b:Landroid/app/Activity;

    iput-object p3, p0, Lei/l0;->c:Lei/k0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lei/l0;->a:Lcom/roblox/client/game/c;

    iget-object v1, p0, Lei/l0;->b:Landroid/app/Activity;

    iget-object v2, p0, Lei/l0;->c:Lei/k0;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/game/c;->a(Lcom/roblox/client/game/c;Landroid/app/Activity;Lei/k0;)V

    return-void
.end method
