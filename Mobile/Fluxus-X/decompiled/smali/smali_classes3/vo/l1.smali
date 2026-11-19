.class public final synthetic Lvo/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/d2;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Lvo/j0;

.field public final synthetic d:Lvo/d2$a;

.field public final synthetic e:Lvo/f;


# direct methods
.method public synthetic constructor <init>(Lvo/d2;Lln/k$a;Lvo/j0;Lvo/d2$a;Lvo/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/l1;->a:Lvo/d2;

    iput-object p2, p0, Lvo/l1;->b:Lln/k$a;

    iput-object p3, p0, Lvo/l1;->c:Lvo/j0;

    iput-object p4, p0, Lvo/l1;->d:Lvo/d2$a;

    iput-object p5, p0, Lvo/l1;->e:Lvo/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lvo/l1;->a:Lvo/d2;

    iget-object v1, p0, Lvo/l1;->b:Lln/k$a;

    iget-object v2, p0, Lvo/l1;->c:Lvo/j0;

    iget-object v3, p0, Lvo/l1;->d:Lvo/d2$a;

    iget-object v4, p0, Lvo/l1;->e:Lvo/f;

    invoke-static {v0, v1, v2, v3, v4}, Lvo/d2;->j(Lvo/d2;Lln/k$a;Lvo/j0;Lvo/d2$a;Lvo/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
