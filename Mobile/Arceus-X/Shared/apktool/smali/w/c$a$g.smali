.class public Lw/c$a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c$a;->w1(IILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lw/c$a;


# direct methods
.method public constructor <init>(Lw/c$a;IILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw/c$a$g;->d:Lw/c$a;

    iput p2, p0, Lw/c$a$g;->a:I

    iput p3, p0, Lw/c$a$g;->b:I

    iput-object p4, p0, Lw/c$a$g;->c:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lw/c$a$g;->d:Lw/c$a;

    iget-object v0, v0, Lw/c$a;->b:Lw/b;

    iget v1, p0, Lw/c$a$g;->a:I

    iget v2, p0, Lw/c$a$g;->b:I

    iget-object v3, p0, Lw/c$a$g;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lw/b;->onActivityResized(IILandroid/os/Bundle;)V

    return-void
.end method
