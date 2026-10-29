.class public final synthetic Lnb/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/k0;


# static fields
.field public static final synthetic a:Lnb/w4;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/w4;

    invoke-direct {v0}, Lnb/w4;-><init>()V

    sput-object v0, Lnb/w4;->a:Lnb/w4;

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

    invoke-static {}, Lcom/google/android/gms/internal/measurement/yf;->a()Z

    move-result v0

    new-instance v1, Ljava/lang/Boolean;

    invoke-direct {v1, v0}, Ljava/lang/Boolean;-><init>(Z)V

    return-object v1
.end method
