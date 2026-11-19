.class public final synthetic Lfq/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/n1;

.field public final synthetic b:Lfq/n1$c;


# direct methods
.method public synthetic constructor <init>(Lfq/n1;Lfq/n1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/m1;->a:Lfq/n1;

    iput-object p2, p0, Lfq/m1;->b:Lfq/n1$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/m1;->a:Lfq/n1;

    iget-object v1, p0, Lfq/m1;->b:Lfq/n1$c;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Lfq/n1;->o(Lfq/n1;Lfq/n1$c;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
