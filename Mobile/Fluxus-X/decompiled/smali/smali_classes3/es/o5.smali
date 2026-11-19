.class public final synthetic Les/o5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/i4;


# direct methods
.method public synthetic constructor <init>(Les/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/o5;->a:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Les/o5;->a:Les/i4;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Les/s6;->I(Les/i4;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
