.class public abstract Lhk/a;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/content/Context;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput-object p2, p0, Lhk/a;->b:Landroid/content/Context;

    iput-object p1, p0, Lhk/a;->a:Ljava/lang/String;

    iput-object p3, p0, Lhk/a;->c:Ljava/lang/String;

    iput p4, p0, Lhk/a;->d:I

    iput p5, p0, Lhk/a;->e:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhk/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lhk/a;->e:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lhk/a;->d:I

    return v0
.end method
