.class public final Lyp/d$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyp/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldv/i;"
    }
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
.field public final synthetic a:Lvp/e0;

.field public final synthetic b:Lyp/d;


# direct methods
.method public constructor <init>(Lvp/e0;Lyp/d;)V
    .locals 0

    iput-object p1, p0, Lyp/d$d$a;->a:Lvp/e0;

    iput-object p2, p0, Lyp/d$d$a;->b:Lyp/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/internal/l;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/l;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    iget-object p2, p0, Lyp/d$d$a;->a:Lvp/e0;

    invoke-virtual {p2}, Lls/d;->a()Ldv/c0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lyp/d$d$a;->b:Lyp/d;

    invoke-static {p2}, Lyp/d;->h2(Lyp/d;)Lcom/withpersona/sdk2/inquiry/internal/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->o2(Lcom/withpersona/sdk2/inquiry/internal/l;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/l;

    invoke-virtual {p0, p1, p2}, Lyp/d$d$a;->b(Lcom/withpersona/sdk2/inquiry/internal/l;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
