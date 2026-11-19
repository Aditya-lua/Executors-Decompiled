.class public final synthetic Lfp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/d3;

.field public final synthetic b:Lvo/j0$b;

.field public final synthetic c:Lls/g;

.field public final synthetic d:Lvo/d2$a;

.field public final synthetic e:Lip/l;


# direct methods
.method public synthetic constructor <init>(Lvo/d3;Lvo/j0$b;Lls/g;Lvo/d2$a;Lip/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/c;->a:Lvo/d3;

    iput-object p2, p0, Lfp/c;->b:Lvo/j0$b;

    iput-object p3, p0, Lfp/c;->c:Lls/g;

    iput-object p4, p0, Lfp/c;->d:Lvo/d2$a;

    iput-object p5, p0, Lfp/c;->e:Lip/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lfp/c;->a:Lvo/d3;

    iget-object v1, p0, Lfp/c;->b:Lvo/j0$b;

    iget-object v2, p0, Lfp/c;->c:Lls/g;

    iget-object v3, p0, Lfp/c;->d:Lvo/d2$a;

    iget-object v4, p0, Lfp/c;->e:Lip/l;

    invoke-static {v0, v1, v2, v3, v4}, Lfp/i;->e(Lvo/d3;Lvo/j0$b;Lls/g;Lvo/d2$a;Lip/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
