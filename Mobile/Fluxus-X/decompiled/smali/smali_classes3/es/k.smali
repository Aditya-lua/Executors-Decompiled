.class public final synthetic Les/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqr/x5;

.field public final synthetic b:Les/i4$a;


# direct methods
.method public synthetic constructor <init>(Lqr/x5;Les/i4$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/k;->a:Lqr/x5;

    iput-object p2, p0, Les/k;->b:Les/i4$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/k;->a:Lqr/x5;

    iget-object v1, p0, Les/k;->b:Les/i4$a;

    check-cast p1, Lnr/d$b;

    invoke-static {v0, v1, p1}, Les/k1;->T(Lqr/x5;Les/i4$a;Lnr/d$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
