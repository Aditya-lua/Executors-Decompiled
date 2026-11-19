.class public final synthetic Les/e6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/x6$b;

.field public final synthetic b:Les/s6;

.field public final synthetic c:Les/i4$a;


# direct methods
.method public synthetic constructor <init>(Les/x6$b;Les/s6;Les/i4$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/e6;->a:Les/x6$b;

    iput-object p2, p0, Les/e6;->b:Les/s6;

    iput-object p3, p0, Les/e6;->c:Les/i4$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/e6;->a:Les/x6$b;

    iget-object v1, p0, Les/e6;->b:Les/s6;

    iget-object v2, p0, Les/e6;->c:Les/i4$a;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/s6;->E(Les/x6$b;Les/s6;Les/i4$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
