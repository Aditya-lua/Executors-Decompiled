.class public final synthetic Lfp/b;
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

    iput-object p1, p0, Lfp/b;->a:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfp/b;->a:Lls/g;

    check-cast p1, Lqr/l4;

    invoke-static {v0, p1}, Lfp/i;->d(Lls/g;Lqr/l4;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
