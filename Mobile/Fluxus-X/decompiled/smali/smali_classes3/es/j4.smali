.class public final synthetic Les/j4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Les/k4$a;

.field public final synthetic c:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILes/k4$a;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Les/j4;->a:I

    iput-object p2, p0, Les/j4;->b:Les/k4$a;

    iput-object p3, p0, Les/j4;->c:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Les/j4;->a:I

    iget-object v1, p0, Les/j4;->b:Les/k4$a;

    iget-object v2, p0, Les/j4;->c:[Ljava/lang/String;

    invoke-static {v0, v1, v2}, Les/k4$a;->a(ILes/k4$a;[Ljava/lang/String;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
