.class public final synthetic Lep/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lep/f1;

.field public final synthetic b:Lvo/j0;

.field public final synthetic c:Lvo/i3$a;


# direct methods
.method public synthetic constructor <init>(Lep/f1;Lvo/j0;Lvo/i3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/n0;->a:Lep/f1;

    iput-object p2, p0, Lep/n0;->b:Lvo/j0;

    iput-object p3, p0, Lep/n0;->c:Lvo/i3$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lep/n0;->a:Lep/f1;

    iget-object v1, p0, Lep/n0;->b:Lvo/j0;

    iget-object v2, p0, Lep/n0;->c:Lvo/i3$a;

    check-cast p1, Lvo/j$a;

    invoke-static {v0, v1, v2, p1}, Lep/f1;->B(Lep/f1;Lvo/j0;Lvo/i3$a;Lvo/j$a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
