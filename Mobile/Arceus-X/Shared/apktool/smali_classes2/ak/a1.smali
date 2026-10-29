.class public final synthetic Lak/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/MainGameActivity;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/a1;->a:Lcom/roblox/client/startup/MainGameActivity;

    iput-object p2, p0, Lak/a1;->b:Ljava/lang/String;

    iput-object p3, p0, Lak/a1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lak/a1;->a:Lcom/roblox/client/startup/MainGameActivity;

    iget-object v1, p0, Lak/a1;->b:Ljava/lang/String;

    iget-object v2, p0, Lak/a1;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/startup/MainGameActivity;->R1(Lcom/roblox/client/startup/MainGameActivity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
