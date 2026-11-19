.class public final synthetic Lvo/v2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/v2;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/v2;->a:Ljava/util/List;

    check-cast p1, Lln/r$c;

    invoke-static {v0, p1}, Lvo/b3;->e(Ljava/util/List;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
