.class public final synthetic Lob/qa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/va;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lob/va;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/qa;->a:Lob/va;

    iput-object p2, p0, Lob/qa;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lob/qa;->a:Lob/va;

    iget-object v1, p0, Lob/qa;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lob/va;->U(Landroid/os/Bundle;)V

    return-void
.end method
