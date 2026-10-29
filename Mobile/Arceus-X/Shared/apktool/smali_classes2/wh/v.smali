.class public final synthetic Lwh/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/game/ExperienceSession;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/v;->a:Lcom/roblox/client/game/ExperienceSession;

    iput p2, p0, Lwh/v;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lwh/v;->a:Lcom/roblox/client/game/ExperienceSession;

    iget v1, p0, Lwh/v;->b:I

    invoke-static {v0, v1}, Lcom/roblox/client/game/ExperienceSession;->r(Lcom/roblox/client/game/ExperienceSession;I)V

    return-void
.end method
