.class public Lw/c$a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c$a;->p0(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lw/c$a;


# direct methods
.method public constructor <init>(Lw/c$a;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw/c$a$h;->b:Lw/c$a;

    iput-object p2, p0, Lw/c$a$h;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lw/c$a$h;->b:Lw/c$a;

    iget-object v0, v0, Lw/c$a;->b:Lw/b;

    iget-object v1, p0, Lw/c$a$h;->a:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lw/b;->onWarmupCompleted(Landroid/os/Bundle;)V

    return-void
.end method
