.class public final Lsw/p$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw/p;->e(Ljava/lang/Throwable;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
.field public final synthetic a:Leu/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leu/b<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Leu/b;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsw/p$h;->a:Leu/b;

    iput-object p2, p0, Lsw/p$h;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lsw/p$h;->a:Leu/b;

    invoke-static {v0}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v0

    sget-object v1, Lzt/n;->b:Lzt/n$a;

    iget-object v1, p0, Lsw/p$h;->b:Ljava/lang/Throwable;

    invoke-static {v1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Leu/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
