.class public final synthetic Les/u6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4$a$a;

.field public final synthetic b:Les/i4;


# direct methods
.method public synthetic constructor <init>(Les/i4$a$a;Les/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/u6;->a:Les/i4$a$a;

    iput-object p2, p0, Les/u6;->b:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/u6;->a:Les/i4$a$a;

    iget-object v1, p0, Les/u6;->b:Les/i4;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, p1}, Les/s6$h;->m(Les/i4$a$a;Les/i4;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
