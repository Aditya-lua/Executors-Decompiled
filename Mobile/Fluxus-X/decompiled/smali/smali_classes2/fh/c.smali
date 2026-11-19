.class public Lfh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llk/d;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lbh/j0;->n:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lfh/c;->a:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lbh/j0;->i:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lfh/c;->b:I

    return-void
.end method


# virtual methods
.method public a(Lcm/a;)I
    .locals 1

    sget-object v0, Lfh/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget p1, p0, Lfh/c;->b:I

    return p1

    :cond_1
    iget p1, p0, Lfh/c;->a:I

    return p1
.end method
