.class public final synthetic Lvo/i2;
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

    iput-object p1, p0, Lvo/i2;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/i2;->a:Ljava/lang/Throwable;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lvo/b3;->u(Ljava/lang/Throwable;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
