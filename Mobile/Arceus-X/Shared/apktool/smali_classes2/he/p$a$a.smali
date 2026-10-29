.class public Lhe/p$a$a;
.super Lhe/p$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe/p$a;->b(Lhe/p;Ljava/lang/CharSequence;)Lhe/p$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lhe/p$a;


# direct methods
.method public constructor <init>(Lhe/p$a;Lhe/p;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lhe/p$a$a;->h:Lhe/p$a;

    invoke-direct {p0, p2, p3}, Lhe/p$d;-><init>(Lhe/p;Ljava/lang/CharSequence;)V

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

    iget-object v0, p0, Lhe/p$a$a;->h:Lhe/p$a;

    iget-object v0, v0, Lhe/p$a;->a:Lhe/d;

    iget-object v1, p0, Lhe/p$d;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lhe/d;->b(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
