.class public final synthetic Les/i6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a;

.field public final synthetic b:Les/i4$b;


# direct methods
.method public synthetic constructor <init>(Les/i4$a;Les/i4$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/i6;->a:Les/i4$a;

    iput-object p2, p0, Les/i6;->b:Les/i4$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/i6;->a:Les/i4$a;

    iget-object v1, p0, Les/i6;->b:Les/i4$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Les/s6;->B(Les/i4$a;Les/i4$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
