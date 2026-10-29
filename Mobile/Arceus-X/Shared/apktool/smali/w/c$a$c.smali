.class public Lw/c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/c$a;->m0(Ljava/lang/String;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Lw/c$a;


# direct methods
.method public constructor <init>(Lw/c$a;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw/c$a$c;->c:Lw/c$a;

    iput-object p2, p0, Lw/c$a$c;->a:Ljava/lang/String;

    iput-object p3, p0, Lw/c$a$c;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lw/c$a$c;->c:Lw/c$a;

    iget-object v0, v0, Lw/c$a;->b:Lw/b;

    iget-object v1, p0, Lw/c$a$c;->a:Ljava/lang/String;

    iget-object v2, p0, Lw/c$a$c;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lw/b;->extraCallback(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
