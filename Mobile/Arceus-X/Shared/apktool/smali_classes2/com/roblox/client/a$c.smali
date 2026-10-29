.class public Lcom/roblox/client/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/a;->g2(ZLcom/roblox/client/a$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/d$e;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lcom/roblox/client/a;


# direct methods
.method public constructor <init>(Lcom/roblox/client/a;Lcom/roblox/client/d$e;Landroid/app/Activity;Lcom/roblox/client/a$g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/a$c;->c:Lcom/roblox/client/a;

    iput-object p2, p0, Lcom/roblox/client/a$c;->a:Lcom/roblox/client/d$e;

    iput-object p3, p0, Lcom/roblox/client/a$c;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/roblox/client/a$c;->b:Landroid/app/Activity;

    invoke-static {p1}, Lgk/a0;->d(Landroid/content/Context;)Z

    iget-object p1, p0, Lcom/roblox/client/a$c;->c:Lcom/roblox/client/a;

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/roblox/client/a;->g2(ZLcom/roblox/client/a$g;)V

    return-void
.end method
