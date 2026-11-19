.class public final synthetic Lcom/google/mlkit/common/sdkinternal/zzo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/j;


# instance fields
.field public final synthetic zza:[Lk9/d;


# direct methods
.method public synthetic constructor <init>([Lk9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/zzo;->zza:[Lk9/d;

    return-void
.end method


# virtual methods
.method public final getOptionalFeatures()[Lk9/d;
    .locals 1

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->EMPTY_FEATURES:[Lk9/d;

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzo;->zza:[Lk9/d;

    return-object v0
.end method
