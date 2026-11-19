.class public final synthetic Luv/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Luv/o;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/h;->a:Luv/o;

    iput p2, p0, Luv/h;->b:I

    iput-wide p3, p0, Luv/h;->c:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Luv/h;->a:Luv/o;

    iget v1, p0, Luv/h;->b:I

    iget-wide v2, p0, Luv/h;->c:J

    invoke-static {v0, v1, v2, v3}, Luv/o;->c(Luv/o;IJ)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
