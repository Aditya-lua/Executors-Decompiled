.class public final synthetic Lep/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lep/f1;

.field public final synthetic b:Lvo/j0;

.field public final synthetic c:Lvo/d2$a;


# direct methods
.method public synthetic constructor <init>(Lep/f1;Lvo/j0;Lvo/d2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/p0;->a:Lep/f1;

    iput-object p2, p0, Lep/p0;->b:Lvo/j0;

    iput-object p3, p0, Lep/p0;->c:Lvo/d2$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lep/p0;->a:Lep/f1;

    iget-object v1, p0, Lep/p0;->b:Lvo/j0;

    iget-object v2, p0, Lep/p0;->c:Lvo/d2$a;

    invoke-static {v0, v1, v2}, Lep/f1;->j(Lep/f1;Lvo/j0;Lvo/d2$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
