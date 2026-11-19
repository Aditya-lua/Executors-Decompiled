.class public final synthetic Lep/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/d2$a;

.field public final synthetic b:Lvo/j0;

.field public final synthetic c:Lep/f1;


# direct methods
.method public synthetic constructor <init>(Lvo/d2$a;Lvo/j0;Lep/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/y0;->a:Lvo/d2$a;

    iput-object p2, p0, Lep/y0;->b:Lvo/j0;

    iput-object p3, p0, Lep/y0;->c:Lep/f1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lep/y0;->a:Lvo/d2$a;

    iget-object v1, p0, Lep/y0;->b:Lvo/j0;

    iget-object v2, p0, Lep/y0;->c:Lep/f1;

    invoke-static {v0, v1, v2}, Lep/f1;->o(Lvo/d2$a;Lvo/j0;Lep/f1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
