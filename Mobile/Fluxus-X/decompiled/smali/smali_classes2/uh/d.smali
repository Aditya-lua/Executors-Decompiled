.class public final synthetic Luh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Luh/g;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Luh/g;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/d;->a:Luh/g;

    iput-object p2, p0, Luh/d;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luh/d;->a:Luh/g;

    iget-object v1, p0, Luh/d;->b:Ljava/util/List;

    check-cast p1, Lg5/b;

    invoke-static {v0, v1, p1}, Luh/g;->p(Luh/g;Ljava/util/List;Lg5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
