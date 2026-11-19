.class public final synthetic Ltq/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;

.field public final synthetic b:Ltq/k2;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lls/g;Ltq/k2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltq/d2;->a:Lls/g;

    iput-object p2, p0, Ltq/d2;->b:Ltq/k2;

    iput-boolean p3, p0, Ltq/d2;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ltq/d2;->a:Lls/g;

    iget-object v1, p0, Ltq/d2;->b:Ltq/k2;

    iget-boolean v2, p0, Ltq/d2;->c:Z

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Ltq/k2;->L0(Lls/g;Ltq/k2;ZLjava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
