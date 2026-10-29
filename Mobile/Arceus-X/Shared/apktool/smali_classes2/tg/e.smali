.class public final synthetic Ltg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ltg/g;


# direct methods
.method public synthetic constructor <init>(Ltg/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/e;->a:Ltg/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltg/e;->a:Ltg/g;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Ltg/g;->b(Ltg/g;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
