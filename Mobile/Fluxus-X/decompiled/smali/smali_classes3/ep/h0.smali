.class public final synthetic Lep/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lep/f1;

.field public final synthetic b:Lvo/j0;


# direct methods
.method public synthetic constructor <init>(Lep/f1;Lvo/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/h0;->a:Lep/f1;

    iput-object p2, p0, Lep/h0;->b:Lvo/j0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lep/h0;->a:Lep/f1;

    iget-object v1, p0, Lep/h0;->b:Lvo/j0;

    invoke-static {v0, v1}, Lep/f1;->m(Lep/f1;Lvo/j0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
