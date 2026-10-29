.class public Lnn/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ltn/d;

.field public b:I


# direct methods
.method public constructor <init>(Ltn/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnn/k$b;->a:Ltn/d;

    iput p2, p0, Lnn/k$b;->b:I

    return-void
.end method

.method public static bridge synthetic a(Lnn/k$b;)Ltn/d;
    .locals 0

    iget-object p0, p0, Lnn/k$b;->a:Ltn/d;

    return-object p0
.end method

.method public static bridge synthetic b(Lnn/k$b;)I
    .locals 0

    iget p0, p0, Lnn/k$b;->b:I

    return p0
.end method

.method public static bridge synthetic c(Lnn/k$b;I)V
    .locals 0

    iput p1, p0, Lnn/k$b;->b:I

    return-void
.end method
