.class public Lcom/roblox/client/a$e;
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

    iput-object p1, p0, Lcom/roblox/client/a$e;->c:Lcom/roblox/client/a;

    iput-object p2, p0, Lcom/roblox/client/a$e;->a:Lcom/roblox/client/d$e;

    iput-object p3, p0, Lcom/roblox/client/a$e;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/roblox/client/a$e;->b:Landroid/app/Activity;

    invoke-static {p1}, Lgk/a0;->d(Landroid/content/Context;)Z

    return-void
.end method
