.class public final synthetic Lfp/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfp/j1;

.field public final synthetic b:Lvo/d2$a;

.field public final synthetic c:Lks/a;

.field public final synthetic d:Lvo/j0$f;

.field public final synthetic e:Lls/g;

.field public final synthetic f:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lfp/j1;Lvo/d2$a;Lks/a;Lvo/j0$f;Lls/g;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/x0;->a:Lfp/j1;

    iput-object p2, p0, Lfp/x0;->b:Lvo/d2$a;

    iput-object p3, p0, Lfp/x0;->c:Lks/a;

    iput-object p4, p0, Lfp/x0;->d:Lvo/j0$f;

    iput-object p5, p0, Lfp/x0;->e:Lls/g;

    iput-object p6, p0, Lfp/x0;->f:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lfp/x0;->a:Lfp/j1;

    iget-object v1, p0, Lfp/x0;->b:Lvo/d2$a;

    iget-object v2, p0, Lfp/x0;->c:Lks/a;

    iget-object v3, p0, Lfp/x0;->d:Lvo/j0$f;

    iget-object v4, p0, Lfp/x0;->e:Lls/g;

    iget-object v5, p0, Lfp/x0;->f:Lip/l;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lfp/j1;->l(Lfp/j1;Lvo/d2$a;Lks/a;Lvo/j0$f;Lls/g;Lip/l;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
