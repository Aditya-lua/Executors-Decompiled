.class public final synthetic Lfp/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0$n;

.field public final synthetic b:Lls/g;


# direct methods
.method public synthetic constructor <init>(Lvo/j0$n;Lls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/o;->a:Lvo/j0$n;

    iput-object p2, p0, Lfp/o;->b:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfp/o;->a:Lvo/j0$n;

    iget-object v1, p0, Lfp/o;->b:Lls/g;

    check-cast p1, Lkotlin/Unit;

    invoke-static {v0, v1, p1}, Lfp/m0;->t(Lvo/j0$n;Lls/g;Lkotlin/Unit;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
