.class public final synthetic Lhs/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lhs/g1;

.field public final synthetic b:Z

.field public final synthetic c:Les/i4;


# direct methods
.method public synthetic constructor <init>(Lhs/g1;ZLes/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/e1;->a:Lhs/g1;

    iput-boolean p2, p0, Lhs/e1;->b:Z

    iput-object p3, p0, Lhs/e1;->c:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhs/e1;->a:Lhs/g1;

    iget-boolean v1, p0, Lhs/e1;->b:Z

    iget-object v2, p0, Lhs/e1;->c:Les/i4;

    check-cast p1, Lhq/i$b;

    invoke-static {v0, v1, v2, p1}, Lhs/g1;->m(Lhs/g1;ZLes/i4;Lhq/i$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
