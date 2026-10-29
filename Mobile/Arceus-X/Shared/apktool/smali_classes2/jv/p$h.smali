.class public final Ljv/p$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljv/p;->e(Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;
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
.field public final synthetic a:Lnt/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnt/b<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lnt/b;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ljv/p$h;->a:Lnt/b;

    iput-object p2, p0, Ljv/p$h;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ljv/p$h;->a:Lnt/b;

    invoke-static {v0}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    iget-object v1, p0, Ljv/p$h;->b:Ljava/lang/Throwable;

    invoke-static {v1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
