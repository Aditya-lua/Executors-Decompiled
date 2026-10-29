.class public final synthetic Lak/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne/i;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/e;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 1

    iget-object v0, p0, Lak/e;->a:Landroid/content/Context;

    check-cast p1, Lcom/roblox/client/startup/b$b;

    invoke-static {v0, p1}, Lcom/roblox/client/startup/a;->d(Landroid/content/Context;Lcom/roblox/client/startup/b$b;)Lne/x;

    move-result-object p1

    return-object p1
.end method
