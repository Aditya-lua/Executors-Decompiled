.class public final synthetic Lyo/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/k0;->a:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyo/k0;->a:Lip/l;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lyo/t0;->j(Lip/l;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
