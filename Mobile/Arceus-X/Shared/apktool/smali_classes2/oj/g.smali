.class public final synthetic Loj/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lk2/k$c;

.field public final synthetic b:Lpj/f;


# direct methods
.method public synthetic constructor <init>(Lk2/k$c;Lpj/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loj/g;->a:Lk2/k$c;

    iput-object p2, p0, Loj/g;->b:Lpj/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Loj/g;->a:Lk2/k$c;

    iget-object v1, p0, Loj/g;->b:Lpj/f;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p1}, Loj/i;->e(Lk2/k$c;Lpj/f;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
