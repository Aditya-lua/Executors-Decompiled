.class public final synthetic Lhs/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lav/p0;

.field public final synthetic b:Lhs/g1;


# direct methods
.method public synthetic constructor <init>(Lav/p0;Lhs/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/g0;->a:Lav/p0;

    iput-object p2, p0, Lhs/g0;->b:Lhs/g1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhs/g0;->a:Lav/p0;

    iget-object v1, p0, Lhs/g0;->b:Lhs/g1;

    check-cast p1, Les/i4;

    invoke-static {v0, v1, p1}, Lhs/g1;->p(Lav/p0;Lhs/g1;Les/i4;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
