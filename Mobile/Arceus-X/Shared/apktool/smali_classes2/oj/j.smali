.class public final synthetic Loj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loi/f$a;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loj/j;->a:Landroid/content/Context;

    iput-object p2, p0, Loj/j;->b:Ljava/lang/String;

    iput-object p3, p0, Loj/j;->c:Ljava/lang/String;

    iput-object p4, p0, Loj/j;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 6

    iget-object v0, p0, Loj/j;->a:Landroid/content/Context;

    iget-object v1, p0, Loj/j;->b:Ljava/lang/String;

    iget-object v2, p0, Loj/j;->c:Ljava/lang/String;

    iget-object v3, p0, Loj/j;->d:Ljava/lang/String;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->k(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
