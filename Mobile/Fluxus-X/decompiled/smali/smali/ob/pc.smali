.class public final synthetic Lob/pc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/rc;


# direct methods
.method public synthetic constructor <init>(Lob/rc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/pc;->a:Lob/rc;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lob/pc;->a:Lob/rc;

    iget-object v0, v0, Lob/rc;->b:Lob/sc;

    iget-object v0, v0, Lob/sc;->c:Lob/yc;

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->b()Lob/h7;

    move-result-object v1

    new-instance v2, Lob/qc;

    invoke-direct {v2, v0}, Lob/qc;-><init>(Lob/yc;)V

    invoke-virtual {v1, v2}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
