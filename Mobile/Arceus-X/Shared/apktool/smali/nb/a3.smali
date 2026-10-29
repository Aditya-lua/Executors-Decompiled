.class public final synthetic Lnb/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/k0;


# static fields
.field public static final synthetic a:Lnb/a3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/a3;

    invoke-direct {v0}, Lnb/a3;-><init>()V

    sput-object v0, Lnb/a3;->a:Lnb/a3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lnb/z4;->a:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ge;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
