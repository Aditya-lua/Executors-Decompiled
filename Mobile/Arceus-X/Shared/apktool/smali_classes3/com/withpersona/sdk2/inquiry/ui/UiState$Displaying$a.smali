.class public final Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;
    .locals 21

    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    const-class v5, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    if-eq v4, v1, :cond_0

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    move-object v6, v5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    :goto_1
    if-eq v7, v1, :cond_1

    sget-object v8, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v8, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_2

    move-object v8, v9

    goto :goto_2

    :cond_2
    sget-object v8, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v8, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :goto_2
    check-cast v8, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-nez v10, :cond_3

    move-object v10, v9

    goto :goto_3

    :cond_3
    sget-object v10, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v10, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    :goto_3
    check-cast v10, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v11

    if-nez v11, :cond_4

    move-object v11, v9

    goto :goto_4

    :cond_4
    sget-object v11, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v11, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v11

    :goto_4
    check-cast v11, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    invoke-virtual {v0, v12}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v12

    check-cast v12, Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_5

    move-object v13, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    const/4 v12, 0x1

    goto :goto_5

    :cond_5
    move-object v13, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    const/4 v12, 0x0

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-eqz v15, :cond_6

    move-object v15, v13

    const/4 v13, 0x1

    goto :goto_6

    :cond_6
    move-object v15, v13

    const/4 v13, 0x0

    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_7

    move-object v14, v15

    :goto_7
    move-object/from16 v18, v1

    move-object/from16 v19, v3

    goto :goto_9

    :cond_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v15}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v14, 0x0

    :goto_8
    if-eq v14, v15, :cond_8

    move-object/from16 v18, v1

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v19, v3

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v18

    move-object/from16 v3, v19

    goto :goto_8

    :cond_8
    move-object v14, v2

    goto :goto_7

    :goto_9
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    const/4 v1, 0x0

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_9

    const/16 v17, 0x1

    :goto_a
    move-object/from16 v6, v18

    goto :goto_b

    :cond_9
    move/from16 v17, v1

    goto :goto_a

    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    move-object/from16 v3, v19

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v20

    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    invoke-direct/range {v2 .. v20}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;I)V

    return-object v2
.end method

.method public final b(I)[Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$a;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$a;->b(I)[Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-result-object p1

    return-object p1
.end method
