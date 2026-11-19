.class public final synthetic Lvo/p2;
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

    iput-object p1, p0, Lvo/p2;->a:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/p2;->a:Lip/l;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lvo/b3;->l(Lip/l;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
