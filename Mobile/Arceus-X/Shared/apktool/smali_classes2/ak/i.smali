.class public final synthetic Lak/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lne/e0;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lne/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lak/i;->b:Lne/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lak/i;->a:Landroid/content/Context;

    iget-object v1, p0, Lak/i;->b:Lne/e0;

    invoke-static {v0, v1}, Lcom/roblox/client/startup/a;->a(Landroid/content/Context;Lne/e0;)V

    return-void
.end method
