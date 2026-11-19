.class public final synthetic Les/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/h4;


# direct methods
.method public synthetic constructor <init>(Les/h4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/q2;->a:Les/h4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Les/q2;->a:Les/h4;

    check-cast p1, Lqr/x5;

    invoke-static {v0, p1}, Les/h4;->N(Les/h4;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
