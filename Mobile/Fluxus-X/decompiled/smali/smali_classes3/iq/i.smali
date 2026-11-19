.class public final synthetic Liq/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Liq/l;

.field public final synthetic b:Lfq/n1$c;


# direct methods
.method public synthetic constructor <init>(Liq/l;Lfq/n1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq/i;->a:Liq/l;

    iput-object p2, p0, Liq/i;->b:Lfq/n1$c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Liq/i;->a:Liq/l;

    iget-object v1, p0, Liq/i;->b:Lfq/n1$c;

    invoke-static {v0, v1}, Liq/l;->i(Liq/l;Lfq/n1$c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
