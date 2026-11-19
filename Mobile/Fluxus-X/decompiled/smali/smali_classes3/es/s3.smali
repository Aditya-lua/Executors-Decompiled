.class public final synthetic Les/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Les/h4;Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/s3;->a:Les/h4;

    iput-object p2, p0, Les/s3;->b:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Les/s3;->a:Les/h4;

    iget-object v1, p0, Les/s3;->b:Lqr/x5;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p1, p2}, Les/h4;->R(Les/h4;Lqr/x5;ZLandroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
