.class public Lb0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/e$a;


# static fields
.field public static final a:Lb0/e;

.field public static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb0/e;

    new-instance v1, Lb0/g;

    invoke-direct {v1}, Lb0/g;-><init>()V

    invoke-direct {v0, v1}, Lb0/e;-><init>(Lb0/e$a;)V

    sput-object v0, Lb0/g;->a:Lb0/e;

    sget-object v0, Lg0/k0;->d:Lg0/k0;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lb0/g;->b:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/hardware/camera2/params/DynamicRangeProfiles;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lb0/g;->b:Ljava/util/Set;

    return-object v0
.end method

.method public d(Lg0/k0;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            ")",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lg0/k0;->d:Lg0/k0;

    invoke-virtual {v0, p1}, Lg0/k0;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DynamicRange is not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lx2/g;->b(ZLjava/lang/Object;)V

    sget-object p1, Lb0/g;->b:Ljava/util/Set;

    return-object p1
.end method
