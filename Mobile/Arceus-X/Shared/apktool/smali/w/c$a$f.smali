.class public Lw/c$a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c$a;->j2(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/os/Bundle;

.field public final synthetic e:Lw/c$a;


# direct methods
.method public constructor <init>(Lw/c$a;ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw/c$a$f;->e:Lw/c$a;

    iput p2, p0, Lw/c$a$f;->a:I

    iput-object p3, p0, Lw/c$a$f;->b:Landroid/net/Uri;

    iput-boolean p4, p0, Lw/c$a$f;->c:Z

    iput-object p5, p0, Lw/c$a$f;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lw/c$a$f;->e:Lw/c$a;

    iget-object v0, v0, Lw/c$a;->b:Lw/b;

    iget v1, p0, Lw/c$a$f;->a:I

    iget-object v2, p0, Lw/c$a$f;->b:Landroid/net/Uri;

    iget-boolean v3, p0, Lw/c$a$f;->c:Z

    iget-object v4, p0, Lw/c$a$f;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3, v4}, Lw/b;->onRelationshipValidationResult(ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    return-void
.end method
