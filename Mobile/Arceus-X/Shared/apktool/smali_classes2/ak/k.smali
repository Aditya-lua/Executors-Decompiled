.class public final synthetic Lak/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/a$a;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/k;->a:Lcom/roblox/client/startup/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lak/k;->a:Lcom/roblox/client/startup/a$a;

    invoke-virtual {v0}, Lcom/roblox/client/startup/a$a;->a()V

    return-void
.end method
