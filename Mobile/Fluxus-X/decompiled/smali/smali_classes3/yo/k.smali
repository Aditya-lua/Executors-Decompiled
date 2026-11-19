.class public final synthetic Lyo/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyo/t0;

.field public final synthetic b:Lks/a;

.field public final synthetic c:Lvo/j0$n;

.field public final synthetic d:Lvo/d2$a;

.field public final synthetic e:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lyo/t0;Lks/a;Lvo/j0$n;Lvo/d2$a;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/k;->a:Lyo/t0;

    iput-object p2, p0, Lyo/k;->b:Lks/a;

    iput-object p3, p0, Lyo/k;->c:Lvo/j0$n;

    iput-object p4, p0, Lyo/k;->d:Lvo/d2$a;

    iput-object p5, p0, Lyo/k;->e:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lyo/k;->a:Lyo/t0;

    iget-object v1, p0, Lyo/k;->b:Lks/a;

    iget-object v2, p0, Lyo/k;->c:Lvo/j0$n;

    iget-object v3, p0, Lyo/k;->d:Lvo/d2$a;

    iget-object v4, p0, Lyo/k;->e:Lln/k$a;

    move-object v5, p1

    check-cast v5, Ljs/b$b;

    invoke-static/range {v0 .. v5}, Lyo/t0;->i(Lyo/t0;Lks/a;Lvo/j0$n;Lvo/d2$a;Lln/k$a;Ljs/b$b;)Lln/r;

    move-result-object p1

    return-object p1
.end method
