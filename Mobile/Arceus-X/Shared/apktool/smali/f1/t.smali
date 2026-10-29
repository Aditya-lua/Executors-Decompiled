.class public final Lf1/t;
.super Lf1/u;
.source "SourceFile"


# static fields
.field public static final b:Landroid/content/ContentValues;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    sput-object v0, Lf1/t;->b:Landroid/content/ContentValues;

    return-void
.end method


# virtual methods
.method public d()Landroid/net/Uri;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public e()Landroid/content/ContentResolver;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of p1, p1, Lf1/t;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x0

    throw p1
.end method

.method public f()Landroid/content/ContentValues;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
