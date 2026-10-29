.class public final synthetic Lsg/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Le4/q;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Le4/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/i1;->a:Le4/q;

    iput-object p2, p0, Lsg/i1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lsg/i1;->a:Le4/q;

    iget-object v1, p0, Lsg/i1;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/roblox/client/c;->C2(Le4/q;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method
