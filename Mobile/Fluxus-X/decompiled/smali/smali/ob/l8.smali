.class public final synthetic Lob/l8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/n8;

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lob/hf;


# direct methods
.method public synthetic constructor <init>(Lob/n8;Landroid/os/Bundle;Ljava/lang/String;Lob/hf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/l8;->a:Lob/n8;

    iput-object p2, p0, Lob/l8;->b:Landroid/os/Bundle;

    iput-object p3, p0, Lob/l8;->c:Ljava/lang/String;

    iput-object p4, p0, Lob/l8;->d:Lob/hf;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lob/l8;->a:Lob/n8;

    iget-object v1, p0, Lob/l8;->b:Landroid/os/Bundle;

    iget-object v2, p0, Lob/l8;->c:Ljava/lang/String;

    iget-object v3, p0, Lob/l8;->d:Lob/hf;

    invoke-virtual {v0, v1, v2, v3}, Lob/n8;->y2(Landroid/os/Bundle;Ljava/lang/String;Lob/hf;)V

    return-void
.end method
