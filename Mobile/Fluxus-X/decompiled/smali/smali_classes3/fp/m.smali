.class public final synthetic Lfp/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lls/g;Lvo/d2$a;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/m;->a:Lls/g;

    iput-object p2, p0, Lfp/m;->b:Lvo/d2$a;

    iput-object p3, p0, Lfp/m;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfp/m;->a:Lls/g;

    iget-object v1, p0, Lfp/m;->b:Lvo/d2$a;

    iget-object v2, p0, Lfp/m;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lhq/i$b;

    invoke-static {v0, v1, v2, p1}, Lfp/m0;->x(Lls/g;Lvo/d2$a;Lkotlin/jvm/functions/Function1;Lhq/i$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
