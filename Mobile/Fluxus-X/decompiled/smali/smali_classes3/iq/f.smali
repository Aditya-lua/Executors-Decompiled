.class public final synthetic Liq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Liq/l;

.field public final synthetic b:Lfq/n1$c;


# direct methods
.method public synthetic constructor <init>(Liq/l;Lfq/n1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq/f;->a:Liq/l;

    iput-object p2, p0, Liq/f;->b:Lfq/n1$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Liq/f;->a:Liq/l;

    iget-object v1, p0, Liq/f;->b:Lfq/n1$c;

    check-cast p1, Lfq/o0$b;

    invoke-static {v0, v1, p1}, Liq/l;->j(Liq/l;Lfq/n1$c;Lfq/o0$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
