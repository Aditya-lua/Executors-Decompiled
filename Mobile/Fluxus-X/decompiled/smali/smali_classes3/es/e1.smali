.class public final synthetic Les/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a;

.field public final synthetic b:Lqr/x5;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Les/i4$a;Lqr/x5;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/e1;->a:Les/i4$a;

    iput-object p2, p0, Les/e1;->b:Lqr/x5;

    iput-boolean p3, p0, Les/e1;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/e1;->a:Les/i4$a;

    iget-object v1, p0, Les/e1;->b:Lqr/x5;

    iget-boolean v2, p0, Les/e1;->c:Z

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/k1;->G(Les/i4$a;Lqr/x5;ZLln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
