.class public Lg0/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:Landroid/util/Rational;


# direct methods
.method public constructor <init>(FFFLandroid/util/Rational;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg0/u1;->a:F

    iput p2, p0, Lg0/u1;->b:F

    iput p3, p0, Lg0/u1;->c:F

    iput-object p4, p0, Lg0/u1;->d:Landroid/util/Rational;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lg0/u1;->c:F

    return v0
.end method

.method public b()Landroid/util/Rational;
    .locals 1

    iget-object v0, p0, Lg0/u1;->d:Landroid/util/Rational;

    return-object v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lg0/u1;->a:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lg0/u1;->b:F

    return v0
.end method
