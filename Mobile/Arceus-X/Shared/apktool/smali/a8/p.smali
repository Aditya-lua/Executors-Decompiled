.class public final enum La8/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La8/p;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:La8/p;

.field public static final enum c:La8/p;

.field public static final enum d:La8/p;

.field public static final enum e:La8/p;

.field public static final enum f:La8/p;

.field public static final enum g:La8/p;

.field public static final h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "La8/p;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic i:[La8/p;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, La8/p;

    const-string v1, "DEFAULT"

    const/4 v6, 0x0

    invoke-direct {v0, v1, v6, v6}, La8/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, La8/p;->b:La8/p;

    new-instance v1, La8/p;

    const-string v2, "UNMETERED_ONLY"

    const/4 v7, 0x1

    invoke-direct {v1, v2, v7, v7}, La8/p;-><init>(Ljava/lang/String;II)V

    sput-object v1, La8/p;->c:La8/p;

    new-instance v2, La8/p;

    const-string v3, "UNMETERED_OR_DAILY"

    const/4 v8, 0x2

    invoke-direct {v2, v3, v8, v8}, La8/p;-><init>(Ljava/lang/String;II)V

    sput-object v2, La8/p;->d:La8/p;

    new-instance v3, La8/p;

    const-string v4, "FAST_IF_RADIO_AWAKE"

    const/4 v9, 0x3

    invoke-direct {v3, v4, v9, v9}, La8/p;-><init>(Ljava/lang/String;II)V

    sput-object v3, La8/p;->e:La8/p;

    new-instance v4, La8/p;

    const-string v5, "NEVER"

    const/4 v10, 0x4

    invoke-direct {v4, v5, v10, v10}, La8/p;-><init>(Ljava/lang/String;II)V

    sput-object v4, La8/p;->f:La8/p;

    new-instance v5, La8/p;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v5, v11, v12, v13}, La8/p;-><init>(Ljava/lang/String;II)V

    sput-object v5, La8/p;->g:La8/p;

    filled-new-array/range {v0 .. v5}, [La8/p;

    move-result-object v11

    sput-object v11, La8/p;->i:[La8/p;

    new-instance v11, Landroid/util/SparseArray;

    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    sput-object v11, La8/p;->h:Landroid/util/SparseArray;

    invoke-virtual {v11, v6, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v7, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v8, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v9, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v10, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v11, v13, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, La8/p;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La8/p;
    .locals 1

    const-class v0, La8/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La8/p;

    return-object p0
.end method

.method public static values()[La8/p;
    .locals 1

    sget-object v0, La8/p;->i:[La8/p;

    invoke-virtual {v0}, [La8/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La8/p;

    return-object v0
.end method
