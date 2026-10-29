.class public final synthetic Lro/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lro/m0;


# direct methods
.method public synthetic constructor <init>(Lro/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/d0;->a:Lro/m0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lro/d0;->a:Lro/m0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lro/m0;->y(Lro/m0;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
