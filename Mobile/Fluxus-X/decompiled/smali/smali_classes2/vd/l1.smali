.class public final Lvd/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lge/d0;

.field public final b:Lge/d0;

.field public final c:Lge/d0;

.field public final d:Lge/d0;

.field public final e:Lge/d0;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lvd/k1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lge/a0;->b(Ljava/lang/Object;)Lge/z;

    move-result-object p1

    iput-object p1, p0, Lvd/l1;->a:Lge/d0;

    invoke-static {}, Lvd/g;->a()Lvd/h;

    move-result-object p2

    invoke-static {p2}, Lge/y;->b(Lge/d0;)Lge/d0;

    move-result-object p2

    iput-object p2, p0, Lvd/l1;->b:Lge/d0;

    invoke-static {}, Lvd/e1;->a()Lvd/f1;

    move-result-object v0

    new-instance v1, Lvd/u;

    invoke-direct {v1, p1, v0}, Lvd/u;-><init>(Lge/e0;Lge/e0;)V

    iput-object v1, p0, Lvd/l1;->c:Lge/d0;

    invoke-static {}, Lvd/e1;->a()Lvd/f1;

    move-result-object v0

    new-instance v2, Lvd/o;

    invoke-direct {v2, p1, p2, v1, v0}, Lvd/o;-><init>(Lge/e0;Lge/e0;Lge/e0;Lge/e0;)V

    invoke-static {v2}, Lge/y;->b(Lge/d0;)Lge/d0;

    move-result-object p1

    iput-object p1, p0, Lvd/l1;->d:Lge/d0;

    new-instance p2, Lvd/f;

    invoke-direct {p2, p1}, Lvd/f;-><init>(Lge/e0;)V

    invoke-static {p2}, Lge/y;->b(Lge/d0;)Lge/d0;

    move-result-object p1

    iput-object p1, p0, Lvd/l1;->e:Lge/d0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 1

    iget-object v0, p0, Lvd/l1;->e:Lge/d0;

    invoke-interface {v0}, Lge/e0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityManager;

    return-object v0
.end method
