.class public final synthetic Lip/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;

.field public final synthetic b:Lip/v;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lks/a;

.field public final synthetic e:Lvo/j0$f;

.field public final synthetic f:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/m;->a:Lln/k$a;

    iput-object p2, p0, Lip/m;->b:Lip/v;

    iput-object p3, p0, Lip/m;->c:Lvo/d2$a;

    iput-object p4, p0, Lip/m;->d:Lks/a;

    iput-object p5, p0, Lip/m;->e:Lvo/j0$f;

    iput-object p6, p0, Lip/m;->f:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lip/m;->a:Lln/k$a;

    iget-object v1, p0, Lip/m;->b:Lip/v;

    iget-object v2, p0, Lip/m;->c:Lvo/d2$a;

    iget-object v3, p0, Lip/m;->d:Lks/a;

    iget-object v4, p0, Lip/m;->e:Lvo/j0$f;

    iget-object v5, p0, Lip/m;->f:Lip/l;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lip/v;->i(Lln/k$a;Lip/v;Lvo/d2$a;Lks/a;Lvo/j0$f;Lip/l;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
