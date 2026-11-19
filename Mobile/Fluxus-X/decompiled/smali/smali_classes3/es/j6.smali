.class public final synthetic Les/j6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Les/o1$b;

.field public final synthetic b:Les/i4$a;

.field public final synthetic c:Les/s6;

.field public final synthetic d:Les/i4$b;


# direct methods
.method public synthetic constructor <init>(Les/o1$b;Les/i4$a;Les/s6;Les/i4$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/j6;->a:Les/o1$b;

    iput-object p2, p0, Les/j6;->b:Les/i4$a;

    iput-object p3, p0, Les/j6;->c:Les/s6;

    iput-object p4, p0, Les/j6;->d:Les/i4$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Les/j6;->a:Les/o1$b;

    iget-object v1, p0, Les/j6;->b:Les/i4$a;

    iget-object v2, p0, Les/j6;->c:Les/s6;

    iget-object v3, p0, Les/j6;->d:Les/i4$b;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Les/s6;->F(Les/o1$b;Les/i4$a;Les/s6;Les/i4$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
