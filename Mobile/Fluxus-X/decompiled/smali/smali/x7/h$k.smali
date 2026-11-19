.class public Lx7/h$k;
.super Lx7/h$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public b:F

.field public final synthetic c:Lx7/h;


# direct methods
.method public constructor <init>(Lx7/h;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lx7/h$k;->c:Lx7/h;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx7/h$j;-><init>(Lx7/h;Lx7/h$a;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lx7/h$k;->b:F

    return-void
.end method

.method public synthetic constructor <init>(Lx7/h;Lx7/h$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lx7/h$k;-><init>(Lx7/h;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lx7/h$k;->b:F

    iget-object v1, p0, Lx7/h$k;->c:Lx7/h;

    invoke-static {v1}, Lx7/h;->c(Lx7/h;)Lx7/h$h;

    move-result-object v1

    iget-object v1, v1, Lx7/h$h;->d:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr v0, p1

    iput v0, p0, Lx7/h$k;->b:F

    return-void
.end method
