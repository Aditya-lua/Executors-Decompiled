.class public final synthetic Lip/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lip/v;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lks/a;

.field public final synthetic d:Lvo/j0$f;

.field public final synthetic e:Lln/k$a;

.field public final synthetic f:Lip/l;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lln/k$a;Lip/l;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/t;->a:Lip/v;

    iput-object p2, p0, Lip/t;->b:Lvo/d2$a;

    iput-object p3, p0, Lip/t;->c:Lks/a;

    iput-object p4, p0, Lip/t;->d:Lvo/j0$f;

    iput-object p5, p0, Lip/t;->e:Lln/k$a;

    iput-object p6, p0, Lip/t;->f:Lip/l;

    iput-object p7, p0, Lip/t;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lip/t;->a:Lip/v;

    iget-object v1, p0, Lip/t;->b:Lvo/d2$a;

    iget-object v2, p0, Lip/t;->c:Lks/a;

    iget-object v3, p0, Lip/t;->d:Lvo/j0$f;

    iget-object v4, p0, Lip/t;->e:Lln/k$a;

    iget-object v5, p0, Lip/t;->f:Lip/l;

    iget-object v6, p0, Lip/t;->g:Ljava/lang/String;

    move-object v7, p1

    check-cast v7, Lln/r$c;

    invoke-static/range {v0 .. v7}, Lip/v;->e(Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lln/k$a;Lip/l;Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
