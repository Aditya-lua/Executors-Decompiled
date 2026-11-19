.class public final synthetic Lyo/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lks/a;

.field public final synthetic b:Lyo/t0;

.field public final synthetic c:Lun/k0;

.field public final synthetic d:Ljs/b$b;

.field public final synthetic e:Lvo/j0$n;

.field public final synthetic f:Lvo/d2$a;

.field public final synthetic g:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lks/a;Lyo/t0;Lun/k0;Ljs/b$b;Lvo/j0$n;Lvo/d2$a;Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyo/a0;->a:Lks/a;

    iput-object p2, p0, Lyo/a0;->b:Lyo/t0;

    iput-object p3, p0, Lyo/a0;->c:Lun/k0;

    iput-object p4, p0, Lyo/a0;->d:Ljs/b$b;

    iput-object p5, p0, Lyo/a0;->e:Lvo/j0$n;

    iput-object p6, p0, Lyo/a0;->f:Lvo/d2$a;

    iput-object p7, p0, Lyo/a0;->g:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lyo/a0;->a:Lks/a;

    iget-object v1, p0, Lyo/a0;->b:Lyo/t0;

    iget-object v2, p0, Lyo/a0;->c:Lun/k0;

    iget-object v3, p0, Lyo/a0;->d:Ljs/b$b;

    iget-object v4, p0, Lyo/a0;->e:Lvo/j0$n;

    iget-object v5, p0, Lyo/a0;->f:Lvo/d2$a;

    iget-object v6, p0, Lyo/a0;->g:Lln/k$a;

    move-object v7, p1

    check-cast v7, Lln/r$c;

    invoke-static/range {v0 .. v7}, Lyo/t0;->H(Lks/a;Lyo/t0;Lun/k0;Ljs/b$b;Lvo/j0$n;Lvo/d2$a;Lln/k$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
