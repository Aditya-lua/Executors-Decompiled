.class public final synthetic Les/x5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Leq/l;

.field public final synthetic b:Les/i4$a;

.field public final synthetic c:Les/i4$a$d;


# direct methods
.method public synthetic constructor <init>(Leq/l;Les/i4$a;Les/i4$a$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/x5;->a:Leq/l;

    iput-object p2, p0, Les/x5;->b:Les/i4$a;

    iput-object p3, p0, Les/x5;->c:Les/i4$a$d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/x5;->a:Leq/l;

    iget-object v1, p0, Les/x5;->b:Les/i4$a;

    iget-object v2, p0, Les/x5;->c:Les/i4$a$d;

    check-cast p1, Lln/r$c;

    invoke-static {v0, v1, v2, p1}, Les/s6;->o(Leq/l;Les/i4$a;Les/i4$a$d;Lln/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
