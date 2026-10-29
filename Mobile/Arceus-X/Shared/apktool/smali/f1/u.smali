.class public abstract Lf1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/u$b;,
        Lf1/u$a;
    }
.end annotation


# instance fields
.field public final a:Lf1/u$b;


# direct methods
.method public constructor <init>(Lf1/u$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/u;->a:Lf1/u$b;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lf1/u;->a:Lf1/u$b;

    invoke-virtual {v0}, Lf1/u$b;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lf1/u;->a:Lf1/u$b;

    invoke-virtual {v0}, Lf1/u$b;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lf1/u;->a:Lf1/u$b;

    invoke-virtual {v0}, Lf1/u$b;->c()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method
