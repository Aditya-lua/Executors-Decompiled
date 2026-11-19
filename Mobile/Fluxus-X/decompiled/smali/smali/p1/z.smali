.class public Lp1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/y;


# instance fields
.field public final a:Ld1/k;


# direct methods
.method public constructor <init>(Ld1/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/z;->a:Ld1/k;

    return-void
.end method


# virtual methods
.method public a(Lg0/v;)Lg0/t;
    .locals 1

    iget-object v0, p0, Lp1/z;->a:Ld1/k;

    invoke-virtual {v0, p1}, Ld1/k;->d(Lg0/v;)Lg0/t;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;
    .locals 1

    iget-object v0, p0, Lp1/z;->a:Ld1/k;

    invoke-virtual {v0, p1, p2, p3}, Ld1/k;->c(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;

    move-result-object p1

    return-object p1
.end method

.method public varargs c([Lg0/w2;)V
    .locals 1

    iget-object v0, p0, Lp1/z;->a:Ld1/k;

    invoke-virtual {v0, p1}, Ld1/k;->g([Lg0/w2;)V

    return-void
.end method
