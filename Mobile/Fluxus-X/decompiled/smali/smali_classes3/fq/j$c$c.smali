.class public final Lfq/j$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/j$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lav/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav/n<",
            "Lzt/n<",
            "+",
            "Lmb/g;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lav/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/n<",
            "-",
            "Lzt/n<",
            "+",
            "Lmb/g;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lfq/j$c$c;->a:Lav/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfq/j$c$c;->a:Lav/n;

    sget-object v1, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Leu/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
