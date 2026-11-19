.class public final Lob/sb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/hf;

.field public final synthetic b:Z

.field public final synthetic c:Lob/bf;

.field public final synthetic d:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;Lob/hf;ZLob/bf;)V
    .locals 0

    iput-object p2, p0, Lob/sb;->a:Lob/hf;

    iput-boolean p3, p0, Lob/sb;->b:Z

    iput-object p4, p0, Lob/sb;->c:Lob/bf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/sb;->d:Lob/yc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lob/sb;->d:Lob/yc;

    invoke-virtual {v0}, Lob/yc;->N()Lob/i5;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user property"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lob/sb;->a:Lob/hf;

    invoke-static {v2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v3, p0, Lob/sb;->b:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lob/sb;->c:Lob/bf;

    :goto_0
    invoke-virtual {v0, v1, v3, v2}, Lob/yc;->b0(Lob/i5;Lp9/a;Lob/hf;)V

    invoke-virtual {v0}, Lob/yc;->J()V

    return-void
.end method
