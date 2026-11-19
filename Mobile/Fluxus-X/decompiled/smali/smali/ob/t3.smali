.class public final synthetic Lob/t3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/p0;


# static fields
.field public static final synthetic a:Lob/t3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/t3;

    invoke-direct {v0}, Lob/t3;-><init>()V

    sput-object v0, Lob/t3;->a:Lob/t3;

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

    sget-object v0, Lob/e5;->a:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ke;->a0()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
