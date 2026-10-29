.class public final synthetic Lwh/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/r;->a:Lcom/roblox/client/game/ExperienceSession;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lwh/r;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-static {v0}, Lcom/roblox/client/game/ExperienceSession;->w(Lcom/roblox/client/game/ExperienceSession;)V

    return-void
.end method
