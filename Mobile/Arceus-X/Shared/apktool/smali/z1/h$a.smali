.class public Lz1/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/h;->F(Lz1/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lz1/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lz1/h;


# direct methods
.method public constructor <init>(Lz1/h;)V
    .locals 0

    iput-object p1, p0, Lz1/h$a;->a:Lz1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lz1/i;Lz1/i;)I
    .locals 0

    iget p1, p1, Lz1/i;->c:I

    iget p2, p2, Lz1/i;->c:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lz1/i;

    check-cast p2, Lz1/i;

    invoke-virtual {p0, p1, p2}, Lz1/h$a;->a(Lz1/i;Lz1/i;)I

    move-result p1

    return p1
.end method
