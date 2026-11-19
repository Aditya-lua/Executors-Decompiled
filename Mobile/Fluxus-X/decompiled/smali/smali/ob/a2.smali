.class public final synthetic Lob/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/p0;


# static fields
.field public static final synthetic a:Lob/a2;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/a2;

    invoke-direct {v0}, Lob/a2;-><init>()V

    sput-object v0, Lob/a2;->a:Lob/a2;

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

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ke;->w0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
