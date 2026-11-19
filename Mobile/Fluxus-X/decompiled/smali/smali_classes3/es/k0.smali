.class public final synthetic Les/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a;

.field public final synthetic b:Lqr/x5;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Les/k1;


# direct methods
.method public synthetic constructor <init>(Les/i4$a;Lqr/x5;Ljava/lang/String;Les/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/k0;->a:Les/i4$a;

    iput-object p2, p0, Les/k0;->b:Lqr/x5;

    iput-object p3, p0, Les/k0;->c:Ljava/lang/String;

    iput-object p4, p0, Les/k0;->d:Les/k1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Les/k0;->a:Les/i4$a;

    iget-object v1, p0, Les/k0;->b:Lqr/x5;

    iget-object v2, p0, Les/k0;->c:Ljava/lang/String;

    iget-object v3, p0, Les/k0;->d:Les/k1;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Les/k1;->o(Les/i4$a;Lqr/x5;Ljava/lang/String;Les/k1;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
