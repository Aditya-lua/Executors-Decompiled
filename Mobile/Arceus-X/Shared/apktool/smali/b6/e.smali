.class public final synthetic Lb6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lku/d2;

.field public final synthetic b:Lmu/v;


# direct methods
.method public synthetic constructor <init>(Lku/d2;Lmu/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/e;->a:Lku/d2;

    iput-object p2, p0, Lb6/e;->b:Lmu/v;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb6/e;->a:Lku/d2;

    iget-object v1, p0, Lb6/e;->b:Lmu/v;

    check-cast p1, Lb6/b;

    invoke-static {v0, v1, p1}, Lb6/g$a;->r(Lku/d2;Lmu/v;Lb6/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
