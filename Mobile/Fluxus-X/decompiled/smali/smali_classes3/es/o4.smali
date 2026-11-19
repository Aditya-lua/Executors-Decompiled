.class public final synthetic Les/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Les/i4;

.field public final synthetic c:Lln/k$a;

.field public final synthetic d:Les/s6$b;


# direct methods
.method public synthetic constructor <init>(Les/s6;Les/i4;Lln/k$a;Les/s6$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/o4;->a:Les/s6;

    iput-object p2, p0, Les/o4;->b:Les/i4;

    iput-object p3, p0, Les/o4;->c:Lln/k$a;

    iput-object p4, p0, Les/o4;->d:Les/s6$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Les/o4;->a:Les/s6;

    iget-object v1, p0, Les/o4;->b:Les/i4;

    iget-object v2, p0, Les/o4;->c:Lln/k$a;

    iget-object v3, p0, Les/o4;->d:Les/s6$b;

    invoke-static {v0, v1, v2, v3}, Les/s6;->r(Les/s6;Les/i4;Lln/k$a;Les/s6$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
