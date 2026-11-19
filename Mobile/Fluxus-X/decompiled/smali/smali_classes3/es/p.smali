.class public final synthetic Les/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a;

.field public final synthetic b:Lqr/x5;

.field public final synthetic c:Les/k1;


# direct methods
.method public synthetic constructor <init>(Les/i4$a;Lqr/x5;Les/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/p;->a:Les/i4$a;

    iput-object p2, p0, Les/p;->b:Lqr/x5;

    iput-object p3, p0, Les/p;->c:Les/k1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/p;->a:Les/i4$a;

    iget-object v1, p0, Les/p;->b:Lqr/x5;

    iget-object v2, p0, Les/p;->c:Les/k1;

    check-cast p1, Ljava/util/Set;

    invoke-static {v0, v1, v2, p1}, Les/k1;->h(Les/i4$a;Lqr/x5;Les/k1;Ljava/util/Set;)Lln/r;

    move-result-object p1

    return-object p1
.end method
