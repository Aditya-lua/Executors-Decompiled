.class public final Ltd/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lee/d0;

.field public final b:Lee/d0;

.field public final c:Lee/d0;

.field public final d:Lee/d0;

.field public final e:Lee/d0;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ltd/k1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lee/a0;->b(Ljava/lang/Object;)Lee/z;

    move-result-object p1

    iput-object p1, p0, Ltd/l1;->a:Lee/d0;

    invoke-static {}, Ltd/g;->a()Ltd/h;

    move-result-object p2

    invoke-static {p2}, Lee/y;->b(Lee/d0;)Lee/d0;

    move-result-object p2

    iput-object p2, p0, Ltd/l1;->b:Lee/d0;

    invoke-static {}, Ltd/e1;->a()Ltd/f1;

    move-result-object v0

    new-instance v1, Ltd/u;

    invoke-direct {v1, p1, v0}, Ltd/u;-><init>(Lee/e0;Lee/e0;)V

    iput-object v1, p0, Ltd/l1;->c:Lee/d0;

    invoke-static {}, Ltd/e1;->a()Ltd/f1;

    move-result-object v0

    new-instance v2, Ltd/o;

    invoke-direct {v2, p1, p2, v1, v0}, Ltd/o;-><init>(Lee/e0;Lee/e0;Lee/e0;Lee/e0;)V

    invoke-static {v2}, Lee/y;->b(Lee/d0;)Lee/d0;

    move-result-object p1

    iput-object p1, p0, Ltd/l1;->d:Lee/d0;

    new-instance p2, Ltd/f;

    invoke-direct {p2, p1}, Ltd/f;-><init>(Lee/e0;)V

    invoke-static {p2}, Lee/y;->b(Lee/d0;)Lee/d0;

    move-result-object p1

    iput-object p1, p0, Ltd/l1;->e:Lee/d0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 1

    iget-object v0, p0, Ltd/l1;->e:Lee/d0;

    invoke-interface {v0}, Lee/e0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityManager;

    return-object v0
.end method
