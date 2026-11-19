.class public Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/barcode/common/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Phone"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/vision/barcode/common/Barcode$Phone$FormatType;
    }
.end annotation


# static fields
.field public static final TYPE_FAX:I = 0x3

.field public static final TYPE_HOME:I = 0x2

.field public static final TYPE_MOBILE:I = 0x4

.field public static final TYPE_UNKNOWN:I = 0x0

.field public static final TYPE_WORK:I = 0x1


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;->zza:Ljava/lang/String;

    iput p2, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;->zzb:I

    return-void
.end method


# virtual methods
.method public getNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1
    .annotation build Lcom/google/mlkit/vision/barcode/common/Barcode$Phone$FormatType;
    .end annotation

    iget v0, p0, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;->zzb:I

    return v0
.end method
