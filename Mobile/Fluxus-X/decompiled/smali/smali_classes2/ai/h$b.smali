.class public final Lai/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lai/h;->i(Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;
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

.field public final synthetic b:Lav/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav/n<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lav/n;Ljava/util/concurrent/atomic/AtomicBoolean;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lav/n<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "Z)V"
        }
    .end annotation

    iput-object p1, p0, Lai/h$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lai/h$b;->b:Lav/n;

    iput-object p3, p0, Lai/h$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p4, p0, Lai/h$b;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lce/e;

    invoke-virtual {p0, p1}, Lai/h$b;->b(Lce/e;)V

    return-void
.end method

.method public final b(Lce/e;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lce/e;->i()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lce/e;->f()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lai/h$b;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lai/h$b;->b:Lav/n;

    iget-object v0, p0, Lai/h$b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v1, p0, Lai/h$b;->d:Z

    iget-object v2, p0, Lai/h$b;->a:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lai/h;->g(Lav/n;Ljava/util/concurrent/atomic/AtomicBoolean;ZLjava/lang/String;)V

    :cond_0
    return-void
.end method
