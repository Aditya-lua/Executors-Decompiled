.class public final Lde/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lce/i0;

.field public final synthetic c:Lde/l;


# direct methods
.method public constructor <init>(Lde/l;Ljava/util/List;Lce/i0;)V
    .locals 0

    iput-object p1, p0, Lde/k;->c:Lde/l;

    iput-object p2, p0, Lde/k;->a:Ljava/util/List;

    iput-object p3, p0, Lde/k;->b:Lce/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lde/k;->c:Lde/l;

    invoke-static {v0}, Lde/l;->b(Lde/l;)Lde/n;

    move-result-object v0

    iget-object v1, p0, Lde/k;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lde/n;->b(Ljava/util/List;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lde/k;->c:Lde/l;

    iget-object v1, p0, Lde/k;->b:Lce/i0;

    invoke-static {v0, v1}, Lde/l;->d(Lde/l;Lce/i0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lde/k;->c:Lde/l;

    iget-object v1, p0, Lde/k;->a:Ljava/util/List;

    iget-object v2, p0, Lde/k;->b:Lce/i0;

    invoke-static {v0, v1, v2}, Lde/l;->c(Lde/l;Ljava/util/List;Lce/i0;)V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "SplitCompat"

    const-string v2, "Error checking verified files."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lde/k;->b:Lce/i0;

    const/16 v1, -0xb

    invoke-interface {v0, v1}, Lce/i0;->a(I)V

    return-void
.end method
