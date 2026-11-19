.class public final synthetic Lc6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lav/d2;

.field public final synthetic b:Lcv/v;


# direct methods
.method public synthetic constructor <init>(Lav/d2;Lcv/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc6/e;->a:Lav/d2;

    iput-object p2, p0, Lc6/e;->b:Lcv/v;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lc6/e;->a:Lav/d2;

    iget-object v1, p0, Lc6/e;->b:Lcv/v;

    check-cast p1, Lc6/b;

    invoke-static {v0, v1, p1}, Lc6/g$a;->p(Lav/d2;Lcv/v;Lc6/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
