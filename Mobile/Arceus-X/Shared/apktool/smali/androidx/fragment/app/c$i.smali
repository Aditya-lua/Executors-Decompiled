.class public Landroidx/fragment/app/c$i;
.super Landroidx/fragment/app/c$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/c;->F1(Lh/a;Lt/a;Lg/a;)Lg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lt/a;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lh/a;

.field public final synthetic d:Lg/a;

.field public final synthetic e:Landroidx/fragment/app/c;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;Lt/a;Ljava/util/concurrent/atomic/AtomicReference;Lh/a;Lg/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/c$i;->e:Landroidx/fragment/app/c;

    iput-object p2, p0, Landroidx/fragment/app/c$i;->a:Lt/a;

    iput-object p3, p0, Landroidx/fragment/app/c$i;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Landroidx/fragment/app/c$i;->c:Lh/a;

    iput-object p5, p0, Landroidx/fragment/app/c$i;->d:Lg/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/c$l;-><init>(Landroidx/fragment/app/c$b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Landroidx/fragment/app/c$i;->e:Landroidx/fragment/app/c;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->o()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/c$i;->a:Lt/a;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/f;

    iget-object v2, p0, Landroidx/fragment/app/c$i;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Landroidx/fragment/app/c$i;->e:Landroidx/fragment/app/c;

    iget-object v4, p0, Landroidx/fragment/app/c$i;->c:Lh/a;

    iget-object v5, p0, Landroidx/fragment/app/c$i;->d:Lg/a;

    invoke-virtual {v1, v0, v3, v4, v5}, Lg/f;->n(Ljava/lang/String;Landroidx/lifecycle/s;Lh/a;Lg/a;)Lg/c;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
