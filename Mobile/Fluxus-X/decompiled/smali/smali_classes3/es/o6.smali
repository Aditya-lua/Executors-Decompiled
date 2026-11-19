.class public final synthetic Les/o6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/s6;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Z

.field public final synthetic d:Les/i4;


# direct methods
.method public synthetic constructor <init>(Les/s6;Lln/k$a;ZLes/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/o6;->a:Les/s6;

    iput-object p2, p0, Les/o6;->b:Lln/k$a;

    iput-boolean p3, p0, Les/o6;->c:Z

    iput-object p4, p0, Les/o6;->d:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Les/o6;->a:Les/s6;

    iget-object v1, p0, Les/o6;->b:Lln/k$a;

    iget-boolean v2, p0, Les/o6;->c:Z

    iget-object v3, p0, Les/o6;->d:Les/i4;

    check-cast p1, Lfq/n1$a;

    invoke-static {v0, v1, v2, v3, p1}, Les/s6;->W(Les/s6;Lln/k$a;ZLes/i4;Lfq/n1$a;)Lln/r;

    move-result-object p1

    return-object p1
.end method
