.class public Lje/p$b$a;
.super Lje/p$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/p$b;->b(Lje/p;Ljava/lang/CharSequence;)Lje/p$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lje/p$b;


# direct methods
.method public constructor <init>(Lje/p$b;Lje/p;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lje/p$b$a;->h:Lje/p$b;

    invoke-direct {p0, p2, p3}, Lje/p$d;-><init>(Lje/p;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public g(I)I
    .locals 0

    return p1
.end method

.method public h(I)I
    .locals 1

    iget-object v0, p0, Lje/p$b$a;->h:Lje/p$b;

    iget v0, v0, Lje/p$b;->a:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lje/p$d;->c:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
