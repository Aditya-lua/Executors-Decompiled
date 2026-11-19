.class public final synthetic Ltp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnp/a0$a;


# direct methods
.method public synthetic constructor <init>(Lnp/a0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/e;->a:Lnp/a0$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltp/e;->a:Lnp/a0$a;

    invoke-static {v0}, Ltp/f;->i2(Lnp/a0$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
