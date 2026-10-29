.class public final synthetic Lfn/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/media/Image;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Landroid/media/Image;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/b0;->a:Landroid/media/Image;

    iput p2, p0, Lfn/b0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfn/b0;->a:Landroid/media/Image;

    iget v1, p0, Lfn/b0;->b:I

    invoke-static {v0, v1}, Lfn/c0$a;->b(Landroid/media/Image;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
