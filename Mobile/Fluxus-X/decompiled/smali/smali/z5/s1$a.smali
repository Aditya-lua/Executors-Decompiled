.class public final Lz5/s1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz5/s1;->d(Lpe/x;Landroidx/work/c;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Landroidx/work/c;

.field public final synthetic b:Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/x<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/work/c;Lpe/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/c;",
            "Lpe/x<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lz5/s1$a;->a:Landroidx/work/c;

    iput-object p2, p0, Lz5/s1$a;->b:Lpe/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    instance-of v0, p1, Lz5/h1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz5/s1$a;->a:Landroidx/work/c;

    check-cast p1, Lz5/h1;

    invoke-virtual {p1}, Lz5/h1;->a()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/work/c;->stop(I)V

    :cond_0
    iget-object p1, p0, Lz5/s1$a;->b:Lpe/x;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lz5/s1$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
