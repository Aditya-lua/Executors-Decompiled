.class public final synthetic Lvo/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvo/j0;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lvo/f;

.field public final synthetic d:Lln/k$a;

.field public final synthetic e:Lvo/d2;


# direct methods
.method public synthetic constructor <init>(Lvo/j0;Lvo/d2$a;Lvo/f;Lln/k$a;Lvo/d2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/d1;->a:Lvo/j0;

    iput-object p2, p0, Lvo/d1;->b:Lvo/d2$a;

    iput-object p3, p0, Lvo/d1;->c:Lvo/f;

    iput-object p4, p0, Lvo/d1;->d:Lln/k$a;

    iput-object p5, p0, Lvo/d1;->e:Lvo/d2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lvo/d1;->a:Lvo/j0;

    iget-object v1, p0, Lvo/d1;->b:Lvo/d2$a;

    iget-object v2, p0, Lvo/d1;->c:Lvo/f;

    iget-object v3, p0, Lvo/d1;->d:Lln/k$a;

    iget-object v4, p0, Lvo/d1;->e:Lvo/d2;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Lvo/d2;->q(Lvo/j0;Lvo/d2$a;Lvo/f;Lln/k$a;Lvo/d2;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
