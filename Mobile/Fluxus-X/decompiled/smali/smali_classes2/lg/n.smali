.class public final Llg/n;
.super Llg/l;
.source "SourceFile"


# static fields
.field public static final a:Llg/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llg/n;

    invoke-direct {v0}, Llg/n;-><init>()V

    sput-object v0, Llg/n;->a:Llg/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Llg/l;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Llg/l;
    .locals 1

    invoke-virtual {p0}, Llg/n;->v()Llg/n;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Llg/n;

    return p1
.end method

.method public hashCode()I
    .locals 1

    const-class v0, Llg/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public v()Llg/n;
    .locals 1

    sget-object v0, Llg/n;->a:Llg/n;

    return-object v0
.end method
