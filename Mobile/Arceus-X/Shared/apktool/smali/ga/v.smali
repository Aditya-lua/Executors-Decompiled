.class public final Lga/v;
.super Lga/a;
.source "SourceFile"


# instance fields
.field public final a:Lsb/k;


# direct methods
.method public constructor <init>(Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Lga/a;-><init>()V

    iput-object p1, p0, Lga/v;->a:Lsb/k;

    return-void
.end method


# virtual methods
.method public final J1(ILjava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    const/16 p2, 0xbbb

    if-eq p1, p2, :cond_0

    iget-object p2, p0, Lga/v;->a:Lsb/k;

    invoke-static {p2, p1}, Lda/f;->b(Lsb/k;I)V

    return-void

    :cond_0
    iget-object p1, p0, Lga/v;->a:Lsb/k;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lsb/k;->c(Ljava/lang/Object;)V

    return-void
.end method
