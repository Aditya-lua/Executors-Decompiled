.class public Lw2/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/text/TextPaint;

.field public b:Landroid/text/TextDirectionHeuristic;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Landroid/text/TextPaint;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/e$a$a;->a:Landroid/text/TextPaint;

    const/4 p1, 0x1

    iput p1, p0, Lw2/e$a$a;->c:I

    iput p1, p0, Lw2/e$a$a;->d:I

    sget-object p1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    iput-object p1, p0, Lw2/e$a$a;->b:Landroid/text/TextDirectionHeuristic;

    return-void
.end method


# virtual methods
.method public a()Lw2/e$a;
    .locals 5

    new-instance v0, Lw2/e$a;

    iget-object v1, p0, Lw2/e$a$a;->a:Landroid/text/TextPaint;

    iget-object v2, p0, Lw2/e$a$a;->b:Landroid/text/TextDirectionHeuristic;

    iget v3, p0, Lw2/e$a$a;->c:I

    iget v4, p0, Lw2/e$a$a;->d:I

    invoke-direct {v0, v1, v2, v3, v4}, Lw2/e$a;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V

    return-object v0
.end method

.method public b(I)Lw2/e$a$a;
    .locals 0

    iput p1, p0, Lw2/e$a$a;->c:I

    return-object p0
.end method

.method public c(I)Lw2/e$a$a;
    .locals 0

    iput p1, p0, Lw2/e$a$a;->d:I

    return-object p0
.end method

.method public d(Landroid/text/TextDirectionHeuristic;)Lw2/e$a$a;
    .locals 0

    iput-object p1, p0, Lw2/e$a$a;->b:Landroid/text/TextDirectionHeuristic;

    return-object p0
.end method
