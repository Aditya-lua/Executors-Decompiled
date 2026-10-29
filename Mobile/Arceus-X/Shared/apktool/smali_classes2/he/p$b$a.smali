.class public Lhe/p$b$a;
.super Lhe/p$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe/p$b;->b(Lhe/p;Ljava/lang/CharSequence;)Lhe/p$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lhe/p$b;


# direct methods
.method public constructor <init>(Lhe/p$b;Lhe/p;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lhe/p$b$a;->h:Lhe/p$b;

    invoke-direct {p0, p2, p3}, Lhe/p$d;-><init>(Lhe/p;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public g(I)I
    .locals 0

    return p1
.end method

.method public h(I)I
    .locals 1

    iget-object v0, p0, Lhe/p$b$a;->h:Lhe/p$b;

    iget v0, v0, Lhe/p$b;->a:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lhe/p$d;->c:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
