.class public final synthetic Lvo/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lvo/d2;

.field public final synthetic c:Lvo/j0;

.field public final synthetic d:Lvo/d2$a;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lvo/d2;Lvo/j0;Lvo/d2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/x0;->a:Lln/k$a;

    iput-object p2, p0, Lvo/x0;->b:Lvo/d2;

    iput-object p3, p0, Lvo/x0;->c:Lvo/j0;

    iput-object p4, p0, Lvo/x0;->d:Lvo/d2$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvo/x0;->a:Lln/k$a;

    iget-object v1, p0, Lvo/x0;->b:Lvo/d2;

    iget-object v2, p0, Lvo/x0;->c:Lvo/j0;

    iget-object v3, p0, Lvo/x0;->d:Lvo/d2$a;

    invoke-static {v0, v1, v2, v3}, Lvo/d2;->l(Lln/k$a;Lvo/d2;Lvo/j0;Lvo/d2$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
