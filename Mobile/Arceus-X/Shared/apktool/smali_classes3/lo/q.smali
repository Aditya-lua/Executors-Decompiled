.class public final synthetic Llo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/q;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llo/q;->a:Ljava/lang/Throwable;

    check-cast p1, Lym/r$c;

    invoke-static {v0, p1}, Llo/t0;->y(Ljava/lang/Throwable;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
