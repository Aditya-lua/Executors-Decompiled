.class public final synthetic Lfp/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;


# direct methods
.method public synthetic constructor <init>(Lls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/n;->a:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfp/n;->a:Lls/g;

    check-cast p1, Lcp/d;

    invoke-static {v0, p1}, Lfp/m0;->i(Lls/g;Lcp/d;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
