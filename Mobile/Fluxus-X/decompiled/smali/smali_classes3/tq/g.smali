.class public final synthetic Ltq/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltq/k2;


# direct methods
.method public synthetic constructor <init>(Ltq/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/g;->a:Ltq/k2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltq/g;->a:Ltq/k2;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Ltq/k2;->D(Ltq/k2;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
