.class public final synthetic Lfp/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfp/m0;

.field public final synthetic b:Lls/g;

.field public final synthetic c:Lks/a;

.field public final synthetic d:Lvo/j0$n;

.field public final synthetic e:Lvo/d2$a;


# direct methods
.method public synthetic constructor <init>(Lfp/m0;Lls/g;Lks/a;Lvo/j0$n;Lvo/d2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/y;->a:Lfp/m0;

    iput-object p2, p0, Lfp/y;->b:Lls/g;

    iput-object p3, p0, Lfp/y;->c:Lks/a;

    iput-object p4, p0, Lfp/y;->d:Lvo/j0$n;

    iput-object p5, p0, Lfp/y;->e:Lvo/d2$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lfp/y;->a:Lfp/m0;

    iget-object v1, p0, Lfp/y;->b:Lls/g;

    iget-object v2, p0, Lfp/y;->c:Lks/a;

    iget-object v3, p0, Lfp/y;->d:Lvo/j0$n;

    iget-object v4, p0, Lfp/y;->e:Lvo/d2$a;

    move-object v5, p1

    check-cast v5, Ljs/b$b;

    invoke-static/range {v0 .. v5}, Lfp/m0;->h(Lfp/m0;Lls/g;Lks/a;Lvo/j0$n;Lvo/d2$a;Ljs/b$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
