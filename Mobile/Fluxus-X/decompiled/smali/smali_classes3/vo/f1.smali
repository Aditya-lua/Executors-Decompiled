.class public final synthetic Lvo/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lln/k$a;

.field public final synthetic d:Lvo/d2;


# direct methods
.method public synthetic constructor <init>(Lvo/j0;Lvo/d2$a;Lln/k$a;Lvo/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/f1;->a:Lvo/j0;

    iput-object p2, p0, Lvo/f1;->b:Lvo/d2$a;

    iput-object p3, p0, Lvo/f1;->c:Lln/k$a;

    iput-object p4, p0, Lvo/f1;->d:Lvo/d2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lvo/f1;->a:Lvo/j0;

    iget-object v1, p0, Lvo/f1;->b:Lvo/d2$a;

    iget-object v2, p0, Lvo/f1;->c:Lln/k$a;

    iget-object v3, p0, Lvo/f1;->d:Lvo/d2;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lvo/d2;->w(Lvo/j0;Lvo/d2$a;Lln/k$a;Lvo/d2;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
