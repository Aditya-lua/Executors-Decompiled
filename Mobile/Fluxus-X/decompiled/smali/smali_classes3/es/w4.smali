.class public final synthetic Les/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/n1$a;

.field public final synthetic b:Lln/k$a;

.field public final synthetic c:Les/s6;

.field public final synthetic d:Z

.field public final synthetic e:Les/i4;


# direct methods
.method public synthetic constructor <init>(Lfq/n1$a;Lln/k$a;Les/s6;ZLes/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/w4;->a:Lfq/n1$a;

    iput-object p2, p0, Les/w4;->b:Lln/k$a;

    iput-object p3, p0, Les/w4;->c:Les/s6;

    iput-boolean p4, p0, Les/w4;->d:Z

    iput-object p5, p0, Les/w4;->e:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Les/w4;->a:Lfq/n1$a;

    iget-object v1, p0, Les/w4;->b:Lln/k$a;

    iget-object v2, p0, Les/w4;->c:Les/s6;

    iget-boolean v3, p0, Les/w4;->d:Z

    iget-object v4, p0, Les/w4;->e:Les/i4;

    move-object v5, p1

    check-cast v5, Lln/r$c;

    invoke-static/range {v0 .. v5}, Les/s6;->i(Lfq/n1$a;Lln/k$a;Les/s6;ZLes/i4;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
