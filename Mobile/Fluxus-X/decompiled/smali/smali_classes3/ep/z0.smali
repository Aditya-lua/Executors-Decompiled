.class public final synthetic Lep/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lep/f1;

.field public final synthetic b:Lvo/j0;

.field public final synthetic c:Lvo/d2$a;

.field public final synthetic d:Lvo/f;


# direct methods
.method public synthetic constructor <init>(Lep/f1;Lvo/j0;Lvo/d2$a;Lvo/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/z0;->a:Lep/f1;

    iput-object p2, p0, Lep/z0;->b:Lvo/j0;

    iput-object p3, p0, Lep/z0;->c:Lvo/d2$a;

    iput-object p4, p0, Lep/z0;->d:Lvo/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lep/z0;->a:Lep/f1;

    iget-object v1, p0, Lep/z0;->b:Lvo/j0;

    iget-object v2, p0, Lep/z0;->c:Lvo/d2$a;

    iget-object v3, p0, Lep/z0;->d:Lvo/f;

    invoke-static {v0, v1, v2, v3}, Lep/f1;->z(Lep/f1;Lvo/j0;Lvo/d2$a;Lvo/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
