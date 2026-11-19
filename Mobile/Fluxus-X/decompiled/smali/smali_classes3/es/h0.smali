.class public final synthetic Les/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a;

.field public final synthetic b:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Les/i4$a;Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/h0;->a:Les/i4$a;

    iput-object p2, p0, Les/h0;->b:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/h0;->a:Les/i4$a;

    iget-object v1, p0, Les/h0;->b:Lqr/x5;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Les/k1;->E(Les/i4$a;Lqr/x5;Z)Lln/r;

    move-result-object p1

    return-object p1
.end method
