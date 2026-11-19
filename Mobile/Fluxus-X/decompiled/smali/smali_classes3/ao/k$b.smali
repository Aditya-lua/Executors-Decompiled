.class public Lao/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lho/d;

.field public b:I


# direct methods
.method public constructor <init>(Lho/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lao/k$b;->a:Lho/d;

    iput p2, p0, Lao/k$b;->b:I

    return-void
.end method

.method public static bridge synthetic a(Lao/k$b;)Lho/d;
    .locals 0

    iget-object p0, p0, Lao/k$b;->a:Lho/d;

    return-object p0
.end method

.method public static bridge synthetic b(Lao/k$b;)I
    .locals 0

    iget p0, p0, Lao/k$b;->b:I

    return p0
.end method

.method public static bridge synthetic c(Lao/k$b;I)V
    .locals 0

    iput p1, p0, Lao/k$b;->b:I

    return-void
.end method
