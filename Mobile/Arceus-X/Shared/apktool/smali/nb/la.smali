.class public final synthetic Lnb/la;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/qa;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lnb/qa;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/la;->a:Lnb/qa;

    iput-object p2, p0, Lnb/la;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lnb/la;->a:Lnb/qa;

    iget-object v1, p0, Lnb/la;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lnb/qa;->U(Landroid/os/Bundle;)V

    return-void
.end method
