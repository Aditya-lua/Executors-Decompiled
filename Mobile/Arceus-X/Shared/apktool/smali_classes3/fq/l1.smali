.class public final synthetic Lfq/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/k2;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lfq/k2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/l1;->a:Lfq/k2;

    iput-boolean p2, p0, Lfq/l1;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/l1;->a:Lfq/k2;

    iget-boolean v1, p0, Lfq/l1;->b:Z

    check-cast p1, Lcq/b$d;

    invoke-static {v0, v1, p1}, Lfq/k2;->b0(Lfq/k2;ZLcq/b$d;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
