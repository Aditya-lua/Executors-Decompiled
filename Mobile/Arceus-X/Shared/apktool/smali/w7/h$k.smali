.class public Lw7/h$k;
.super Lw7/h$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public b:F

.field public final synthetic c:Lw7/h;


# direct methods
.method public constructor <init>(Lw7/h;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lw7/h$k;->c:Lw7/h;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lw7/h$j;-><init>(Lw7/h;Lw7/h$a;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lw7/h$k;->b:F

    return-void
.end method

.method public synthetic constructor <init>(Lw7/h;Lw7/h$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lw7/h$k;-><init>(Lw7/h;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lw7/h$k;->b:F

    iget-object v1, p0, Lw7/h$k;->c:Lw7/h;

    invoke-static {v1}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object v1

    iget-object v1, v1, Lw7/h$h;->d:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr v0, p1

    iput v0, p0, Lw7/h$k;->b:F

    return-void
.end method
