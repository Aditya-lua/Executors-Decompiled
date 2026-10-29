.class public final synthetic Lcr/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/g;


# direct methods
.method public synthetic constructor <init>(Lnq/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/l2;->a:Lnq/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcr/l2;->a:Lnq/g;

    invoke-static {v0}, Lcr/p3;->B(Lnq/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
