.class public Lb1/k$a;
.super Ln0/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lb1/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb1/k;)V
    .locals 1

    invoke-direct {p0}, Ln0/u;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb1/k$a;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public b(ILn0/e0;)V
    .locals 2

    iget-object v0, p0, Lb1/k$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb1/k;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->z()Ln0/o3;

    move-result-object v1

    invoke-static {p2, v1, p1}, Lb1/k;->S(Ln0/e0;Ln0/o3;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
