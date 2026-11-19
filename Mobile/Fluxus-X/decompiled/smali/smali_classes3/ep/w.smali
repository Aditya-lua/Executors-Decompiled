.class public final synthetic Lep/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lep/f1;

.field public final synthetic b:Lvo/j0;


# direct methods
.method public synthetic constructor <init>(Lep/f1;Lvo/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/w;->a:Lep/f1;

    iput-object p2, p0, Lep/w;->b:Lvo/j0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lep/w;->a:Lep/f1;

    iget-object v1, p0, Lep/w;->b:Lvo/j0;

    check-cast p1, Ldp/f$b;

    invoke-static {v0, v1, p1}, Lep/f1;->F(Lep/f1;Lvo/j0;Ldp/f$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
