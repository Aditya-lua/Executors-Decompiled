.class public final synthetic Lob/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/p0;


# static fields
.field public static final synthetic a:Lob/y1;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/y1;

    invoke-direct {v0}, Lob/y1;-><init>()V

    sput-object v0, Lob/y1;->a:Lob/y1;

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

    sget-object v0, Lob/e5;->a:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ke;->g0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
