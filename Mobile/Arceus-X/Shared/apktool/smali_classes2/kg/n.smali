.class public final Lkg/n;
.super Lkg/l;
.source "SourceFile"


# static fields
.field public static final a:Lkg/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkg/n;

    invoke-direct {v0}, Lkg/n;-><init>()V

    sput-object v0, Lkg/n;->a:Lkg/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Lkg/l;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lkg/l;
    .locals 1

    invoke-virtual {p0}, Lkg/n;->x()Lkg/n;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lkg/n;

    return p1
.end method

.method public hashCode()I
    .locals 1

    const-class v0, Lkg/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public x()Lkg/n;
    .locals 1

    sget-object v0, Lkg/n;->a:Lkg/n;

    return-object v0
.end method
