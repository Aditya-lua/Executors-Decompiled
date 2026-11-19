.class public Lje/p$a$a;
.super Lje/p$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/p$a;->b(Lje/p;Ljava/lang/CharSequence;)Lje/p$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lje/p$a;


# direct methods
.method public constructor <init>(Lje/p$a;Lje/p;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lje/p$a$a;->h:Lje/p$a;

    invoke-direct {p0, p2, p3}, Lje/p$d;-><init>(Lje/p;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public g(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public h(I)I
    .locals 2

    iget-object v0, p0, Lje/p$a$a;->h:Lje/p$a;

    iget-object v0, v0, Lje/p$a;->a:Lje/d;

    iget-object v1, p0, Lje/p$d;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lje/d;->b(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
