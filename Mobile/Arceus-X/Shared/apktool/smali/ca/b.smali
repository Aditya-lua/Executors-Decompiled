.class public final enum Lca/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/fido/fido2/api/common/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lca/b;",
        ">;",
        "Lcom/google/android/gms/fido/fido2/api/common/a;"
    }
.end annotation


# static fields
.field public static final enum b:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum c:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum d:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum e:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum f:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum g:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum h:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum i:Lca/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final synthetic j:[Lca/b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lca/b;

    const/4 v1, 0x0

    const/16 v2, -0x101

    const-string v3, "RS256"

    invoke-direct {v0, v3, v1, v2}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lca/b;->b:Lca/b;

    new-instance v1, Lca/b;

    const/4 v2, 0x1

    const/16 v3, -0x102

    const-string v4, "RS384"

    invoke-direct {v1, v4, v2, v3}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lca/b;->c:Lca/b;

    new-instance v2, Lca/b;

    const/4 v3, 0x2

    const/16 v4, -0x103

    const-string v5, "RS512"

    invoke-direct {v2, v5, v3, v4}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lca/b;->d:Lca/b;

    new-instance v3, Lca/b;

    const/4 v4, 0x3

    const/16 v5, -0x106

    const-string v6, "LEGACY_RS1"

    invoke-direct {v3, v6, v4, v5}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lca/b;->e:Lca/b;

    new-instance v4, Lca/b;

    const/4 v5, 0x4

    const/16 v6, -0x25

    const-string v7, "PS256"

    invoke-direct {v4, v7, v5, v6}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lca/b;->f:Lca/b;

    new-instance v5, Lca/b;

    const/4 v6, 0x5

    const/16 v7, -0x26

    const-string v8, "PS384"

    invoke-direct {v5, v8, v6, v7}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lca/b;->g:Lca/b;

    new-instance v6, Lca/b;

    const/4 v7, 0x6

    const/16 v8, -0x27

    const-string v9, "PS512"

    invoke-direct {v6, v9, v7, v8}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lca/b;->h:Lca/b;

    new-instance v7, Lca/b;

    const/4 v8, 0x7

    const v9, -0xffff

    const-string v10, "RS1"

    invoke-direct {v7, v10, v8, v9}, Lca/b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lca/b;->i:Lca/b;

    filled-new-array/range {v0 .. v7}, [Lca/b;

    move-result-object v0

    sput-object v0, Lca/b;->j:[Lca/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lca/b;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lca/b;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lca/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lca/b;

    return-object p0
.end method

.method public static values()[Lca/b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lca/b;->j:[Lca/b;

    invoke-virtual {v0}, [Lca/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lca/b;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lca/b;->a:I

    return v0
.end method
