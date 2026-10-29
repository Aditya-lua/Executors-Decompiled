.class public final synthetic Lfq/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Lvr/f;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Lvr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/e1;->a:Lfq/k2;

    iput-object p2, p0, Lfq/e1;->b:Lvr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/e1;->a:Lfq/k2;

    iget-object v1, p0, Lfq/e1;->b:Lvr/f;

    invoke-static {v0, v1}, Lfq/k2;->I0(Lfq/k2;Lvr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
