.class public final synthetic Lob/h8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/n8;

.field public final synthetic b:Lob/hf;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lob/l5;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lob/n8;Lob/hf;Landroid/os/Bundle;Lob/l5;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/h8;->a:Lob/n8;

    iput-object p2, p0, Lob/h8;->b:Lob/hf;

    iput-object p3, p0, Lob/h8;->c:Landroid/os/Bundle;

    iput-object p4, p0, Lob/h8;->d:Lob/l5;

    iput-object p5, p0, Lob/h8;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 5

    iget-object v0, p0, Lob/h8;->a:Lob/n8;

    iget-object v1, p0, Lob/h8;->b:Lob/hf;

    iget-object v2, p0, Lob/h8;->c:Landroid/os/Bundle;

    iget-object v3, p0, Lob/h8;->d:Lob/l5;

    iget-object v4, p0, Lob/h8;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lob/n8;->v2(Lob/hf;Landroid/os/Bundle;Lob/l5;Ljava/lang/String;)V

    return-void
.end method
