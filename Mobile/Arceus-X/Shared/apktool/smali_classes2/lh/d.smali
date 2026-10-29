.class public final synthetic Llh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llh/g;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Llh/g;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh/d;->a:Llh/g;

    iput-object p2, p0, Llh/d;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llh/d;->a:Llh/g;

    iget-object v1, p0, Llh/d;->b:Ljava/util/List;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Llh/g;->p(Llh/g;Ljava/util/List;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
