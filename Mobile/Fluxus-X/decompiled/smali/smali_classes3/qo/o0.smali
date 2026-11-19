.class public final synthetic Lqo/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqo/e1;


# direct methods
.method public synthetic constructor <init>(Lqo/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/o0;->a:Lqo/e1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo/o0;->a:Lqo/e1;

    check-cast p1, Lqr/x5;

    invoke-static {v0, p1}, Lqo/e1;->P(Lqo/e1;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
