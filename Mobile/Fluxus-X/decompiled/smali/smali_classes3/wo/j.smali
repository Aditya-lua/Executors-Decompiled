.class public final synthetic Lwo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/d3;

.field public final synthetic b:Lvo/j0$b;

.field public final synthetic c:Lln/k$a;

.field public final synthetic d:Lvo/d2$a;

.field public final synthetic e:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lvo/d3;Lvo/j0$b;Lln/k$a;Lvo/d2$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo/j;->a:Lvo/d3;

    iput-object p2, p0, Lwo/j;->b:Lvo/j0$b;

    iput-object p3, p0, Lwo/j;->c:Lln/k$a;

    iput-object p4, p0, Lwo/j;->d:Lvo/d2$a;

    iput-object p5, p0, Lwo/j;->e:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lwo/j;->a:Lvo/d3;

    iget-object v1, p0, Lwo/j;->b:Lvo/j0$b;

    iget-object v2, p0, Lwo/j;->c:Lln/k$a;

    iget-object v3, p0, Lwo/j;->d:Lvo/d2$a;

    iget-object v4, p0, Lwo/j;->e:Lip/l;

    invoke-static {v0, v1, v2, v3, v4}, Lwo/o;->l(Lvo/d3;Lvo/j0$b;Lln/k$a;Lvo/d2$a;Lip/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
