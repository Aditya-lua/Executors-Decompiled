.class public final synthetic Lvo/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/d2$a;

.field public final synthetic b:Lvo/j0;

.field public final synthetic c:Lln/k$a;

.field public final synthetic d:Lvo/d2;


# direct methods
.method public synthetic constructor <init>(Lvo/d2$a;Lvo/j0;Lln/k$a;Lvo/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/a1;->a:Lvo/d2$a;

    iput-object p2, p0, Lvo/a1;->b:Lvo/j0;

    iput-object p3, p0, Lvo/a1;->c:Lln/k$a;

    iput-object p4, p0, Lvo/a1;->d:Lvo/d2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvo/a1;->a:Lvo/d2$a;

    iget-object v1, p0, Lvo/a1;->b:Lvo/j0;

    iget-object v2, p0, Lvo/a1;->c:Lln/k$a;

    iget-object v3, p0, Lvo/a1;->d:Lvo/d2;

    invoke-static {v0, v1, v2, v3}, Lvo/d2;->A(Lvo/d2$a;Lvo/j0;Lln/k$a;Lvo/d2;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
