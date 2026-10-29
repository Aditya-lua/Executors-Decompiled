.class public final Lsh/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh/g;->h(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lku/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/n<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lku/n;Ljava/util/concurrent/atomic/AtomicBoolean;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lku/n<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "Z)V"
        }
    .end annotation

    iput-object p1, p0, Lsh/g$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lsh/g$b;->b:Lku/n;

    iput-object p3, p0, Lsh/g$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p4, p0, Lsh/g$b;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lae/e;

    invoke-virtual {p0, p1}, Lsh/g$b;->b(Lae/e;)V

    return-void
.end method

.method public final b(Lae/e;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lae/e;->i()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lae/e;->f()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lsh/g$b;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsh/g$b;->b:Lku/n;

    iget-object v0, p0, Lsh/g$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v1, p0, Lsh/g$b;->d:Z

    iget-object v2, p0, Lsh/g$b;->a:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lsh/g;->f(Lku/n;Ljava/util/concurrent/atomic/AtomicBoolean;ZLjava/lang/String;)V

    :cond_0
    return-void
.end method
