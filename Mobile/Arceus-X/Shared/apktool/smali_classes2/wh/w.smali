.class public final synthetic Lwh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/w;->a:Lcom/roblox/client/game/ExperienceSession;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lwh/w;->a:Lcom/roblox/client/game/ExperienceSession;

    invoke-static {v0, p1, p2}, Lcom/roblox/client/game/ExperienceSession;->t(Lcom/roblox/client/game/ExperienceSession;Landroid/content/DialogInterface;I)V

    return-void
.end method
