.class public final synthetic Lnb/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/bd;

.field public final synthetic b:I

.field public final synthetic c:Lnb/w5;

.field public final synthetic d:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lnb/bd;ILnb/w5;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/ad;->a:Lnb/bd;

    iput p2, p0, Lnb/ad;->b:I

    iput-object p3, p0, Lnb/ad;->c:Lnb/w5;

    iput-object p4, p0, Lnb/ad;->d:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lnb/ad;->a:Lnb/bd;

    iget v1, p0, Lnb/ad;->b:I

    iget-object v2, p0, Lnb/ad;->c:Lnb/w5;

    iget-object v3, p0, Lnb/ad;->d:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Lnb/bd;->f(ILnb/w5;Landroid/content/Intent;)V

    return-void
.end method
