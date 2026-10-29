.class public final synthetic Lnb/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/k0;


# static fields
.field public static final synthetic a:Lnb/e2;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/e2;

    invoke-direct {v0}, Lnb/e2;-><init>()V

    sput-object v0, Lnb/e2;->a:Lnb/e2;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lnb/z4;->a:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ge;->k0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
