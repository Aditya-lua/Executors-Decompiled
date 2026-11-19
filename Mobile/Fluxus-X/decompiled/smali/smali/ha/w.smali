.class public final Lha/w;
.super Lha/a;
.source "SourceFile"


# instance fields
.field public final a:Ltb/k;


# direct methods
.method public constructor <init>(Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Lha/a;-><init>()V

    iput-object p1, p0, Lha/w;->a:Ltb/k;

    return-void
.end method


# virtual methods
.method public final P1(ILjava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    const/16 p2, 0xbbb

    if-eq p1, p2, :cond_0

    iget-object p2, p0, Lha/w;->a:Ltb/k;

    invoke-static {p2, p1}, Lea/h;->b(Ltb/k;I)V

    return-void

    :cond_0
    iget-object p1, p0, Lha/w;->a:Ltb/k;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void
.end method
