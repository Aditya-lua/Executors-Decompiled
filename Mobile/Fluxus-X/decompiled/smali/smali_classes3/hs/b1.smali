.class public final synthetic Lhs/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhs/g1;

.field public final synthetic b:Les/i4;


# direct methods
.method public synthetic constructor <init>(Lhs/g1;Les/i4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/b1;->a:Lhs/g1;

    iput-object p2, p0, Lhs/b1;->b:Les/i4;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhs/b1;->a:Lhs/g1;

    iget-object v1, p0, Lhs/b1;->b:Les/i4;

    invoke-static {v0, v1}, Lhs/g1;->o(Lhs/g1;Les/i4;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
