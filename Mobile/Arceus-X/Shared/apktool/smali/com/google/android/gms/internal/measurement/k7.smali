.class public final enum Lcom/google/android/gms/internal/measurement/k7;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/kb;


# static fields
.field public static final enum b:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum c:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum d:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum e:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum f:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum g:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum h:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum i:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum j:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum k:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum l:Lcom/google/android/gms/internal/measurement/k7;

.field public static final enum m:Lcom/google/android/gms/internal/measurement/k7;

.field public static final synthetic n:[Lcom/google/android/gms/internal/measurement/k7;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/google/android/gms/internal/measurement/k7;

    const-string v1, "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/k7;->b:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v1, Lcom/google/android/gms/internal/measurement/k7;

    const-string v2, "CLIENT_UPLOAD_ELIGIBLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/k7;->c:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v2, Lcom/google/android/gms/internal/measurement/k7;

    const-string v3, "MEASUREMENT_SERVICE_NOT_ENABLED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/k7;->d:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v3, Lcom/google/android/gms/internal/measurement/k7;

    const-string v4, "ANDROID_TOO_OLD"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/k7;->e:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v4, Lcom/google/android/gms/internal/measurement/k7;

    const-string v5, "NON_PLAY_MODE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/measurement/k7;->f:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v5, Lcom/google/android/gms/internal/measurement/k7;

    const-string v6, "SDK_TOO_OLD"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/measurement/k7;->g:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v6, Lcom/google/android/gms/internal/measurement/k7;

    const-string v7, "MISSING_JOB_SCHEDULER"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/measurement/k7;->h:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v7, Lcom/google/android/gms/internal/measurement/k7;

    const-string v8, "NOT_ENABLED_IN_MANIFEST"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/measurement/k7;->i:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v8, Lcom/google/android/gms/internal/measurement/k7;

    const-string v9, "CLIENT_FLAG_OFF"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10, v10}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/measurement/k7;->j:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v9, Lcom/google/android/gms/internal/measurement/k7;

    const/16 v10, 0x9

    const/16 v11, 0x14

    const-string v12, "SERVICE_FLAG_OFF"

    invoke-direct {v9, v12, v10, v11}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/measurement/k7;->k:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v10, Lcom/google/android/gms/internal/measurement/k7;

    const/16 v11, 0xa

    const/16 v12, 0x15

    const-string v13, "PINNED_TO_SERVICE_UPLOAD"

    invoke-direct {v10, v13, v11, v12}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/measurement/k7;->l:Lcom/google/android/gms/internal/measurement/k7;

    new-instance v11, Lcom/google/android/gms/internal/measurement/k7;

    const/16 v12, 0xb

    const/16 v13, 0x16

    const-string v14, "MISSING_SGTM_SERVER_URL"

    invoke-direct {v11, v14, v12, v13}, Lcom/google/android/gms/internal/measurement/k7;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/measurement/k7;->m:Lcom/google/android/gms/internal/measurement/k7;

    filled-new-array/range {v0 .. v11}, [Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/k7;->n:[Lcom/google/android/gms/internal/measurement/k7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/measurement/k7;->a:I

    return-void
.end method

.method public static a(I)Lcom/google/android/gms/internal/measurement/k7;
    .locals 0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->m:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->l:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->k:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->j:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->i:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->h:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->g:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->f:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->e:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->d:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_a
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->c:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_b
    sget-object p0, Lcom/google/android/gms/internal/measurement/k7;->b:Lcom/google/android/gms/internal/measurement/k7;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/k7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/k7;->n:[Lcom/google/android/gms/internal/measurement/k7;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/k7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/k7;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/k7;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/k7;->a:I

    return v0
.end method
