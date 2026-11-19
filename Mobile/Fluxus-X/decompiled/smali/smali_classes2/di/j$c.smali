.class public Ldi/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llk/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lbh/j0;->k:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Ldi/j$c;->a:I

    return-void
.end method


# virtual methods
.method public a(Lcm/a;)I
    .locals 1

    sget-object v0, Ldi/j$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    iget p1, p0, Ldi/j$c;->a:I

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
