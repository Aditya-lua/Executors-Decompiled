.class public final synthetic Les/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/u3;->a:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Les/u3;->a:Lqr/x5;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Les/h4;->T(Lqr/x5;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
