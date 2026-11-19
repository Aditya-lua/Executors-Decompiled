.class public final synthetic Les/g6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(ZLqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Les/g6;->a:Z

    iput-object p2, p0, Les/g6;->b:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Les/g6;->a:Z

    iget-object v1, p0, Les/g6;->b:Lqr/x5;

    check-cast p1, Lqr/x5;

    invoke-static {v0, v1, p1}, Les/s6;->j0(ZLqr/x5;Lqr/x5;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
