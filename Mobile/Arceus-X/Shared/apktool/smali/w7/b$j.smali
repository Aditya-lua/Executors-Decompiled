.class public final enum Lw7/b$j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw7/b$j;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic A:[Lw7/b$j;

.field public static final enum a:Lw7/b$j;

.field public static final enum b:Lw7/b$j;

.field public static final enum c:Lw7/b$j;

.field public static final enum d:Lw7/b$j;

.field public static final enum e:Lw7/b$j;

.field public static final enum f:Lw7/b$j;

.field public static final enum g:Lw7/b$j;

.field public static final enum h:Lw7/b$j;

.field public static final enum i:Lw7/b$j;

.field public static final enum j:Lw7/b$j;

.field public static final enum k:Lw7/b$j;

.field public static final enum l:Lw7/b$j;

.field public static final enum m:Lw7/b$j;

.field public static final enum n:Lw7/b$j;

.field public static final enum o:Lw7/b$j;

.field public static final enum p:Lw7/b$j;

.field public static final enum q:Lw7/b$j;

.field public static final enum r:Lw7/b$j;

.field public static final enum s:Lw7/b$j;

.field public static final enum t:Lw7/b$j;

.field public static final enum u:Lw7/b$j;

.field public static final enum v:Lw7/b$j;

.field public static final enum w:Lw7/b$j;

.field public static final enum x:Lw7/b$j;

.field public static final enum y:Lw7/b$j;

.field public static final z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw7/b$j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 28

    new-instance v1, Lw7/b$j;

    const-string v0, "target"

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/b$j;->a:Lw7/b$j;

    move v0, v2

    new-instance v2, Lw7/b$j;

    const-string v3, "root"

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lw7/b$j;->b:Lw7/b$j;

    new-instance v3, Lw7/b$j;

    const-string v4, "nth_child"

    const/4 v5, 0x2

    invoke-direct {v3, v4, v5}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw7/b$j;->c:Lw7/b$j;

    new-instance v4, Lw7/b$j;

    const-string v5, "nth_last_child"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lw7/b$j;->d:Lw7/b$j;

    new-instance v5, Lw7/b$j;

    const-string v6, "nth_of_type"

    const/4 v7, 0x4

    invoke-direct {v5, v6, v7}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw7/b$j;->e:Lw7/b$j;

    new-instance v6, Lw7/b$j;

    const-string v7, "nth_last_of_type"

    const/4 v8, 0x5

    invoke-direct {v6, v7, v8}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lw7/b$j;->f:Lw7/b$j;

    new-instance v7, Lw7/b$j;

    const-string v8, "first_child"

    const/4 v9, 0x6

    invoke-direct {v7, v8, v9}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lw7/b$j;->g:Lw7/b$j;

    new-instance v8, Lw7/b$j;

    const-string v9, "last_child"

    const/4 v10, 0x7

    invoke-direct {v8, v9, v10}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lw7/b$j;->h:Lw7/b$j;

    new-instance v9, Lw7/b$j;

    const-string v10, "first_of_type"

    const/16 v11, 0x8

    invoke-direct {v9, v10, v11}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lw7/b$j;->i:Lw7/b$j;

    new-instance v10, Lw7/b$j;

    const-string v11, "last_of_type"

    const/16 v12, 0x9

    invoke-direct {v10, v11, v12}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lw7/b$j;->j:Lw7/b$j;

    new-instance v11, Lw7/b$j;

    const-string v12, "only_child"

    const/16 v13, 0xa

    invoke-direct {v11, v12, v13}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lw7/b$j;->k:Lw7/b$j;

    new-instance v12, Lw7/b$j;

    const-string v13, "only_of_type"

    const/16 v14, 0xb

    invoke-direct {v12, v13, v14}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lw7/b$j;->l:Lw7/b$j;

    new-instance v13, Lw7/b$j;

    const-string v14, "empty"

    const/16 v15, 0xc

    invoke-direct {v13, v14, v15}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lw7/b$j;->m:Lw7/b$j;

    new-instance v14, Lw7/b$j;

    const-string v15, "not"

    const/16 v0, 0xd

    invoke-direct {v14, v15, v0}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lw7/b$j;->n:Lw7/b$j;

    new-instance v15, Lw7/b$j;

    const-string v0, "lang"

    move-object/from16 v17, v1

    const/16 v1, 0xe

    invoke-direct {v15, v0, v1}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lw7/b$j;->o:Lw7/b$j;

    new-instance v0, Lw7/b$j;

    const-string v1, "link"

    move-object/from16 v18, v2

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/b$j;->p:Lw7/b$j;

    new-instance v1, Lw7/b$j;

    const-string v2, "visited"

    move-object/from16 v19, v0

    const/16 v0, 0x10

    invoke-direct {v1, v2, v0}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/b$j;->q:Lw7/b$j;

    new-instance v0, Lw7/b$j;

    const-string v2, "hover"

    move-object/from16 v20, v1

    const/16 v1, 0x11

    invoke-direct {v0, v2, v1}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/b$j;->r:Lw7/b$j;

    new-instance v1, Lw7/b$j;

    const-string v2, "active"

    move-object/from16 v21, v0

    const/16 v0, 0x12

    invoke-direct {v1, v2, v0}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/b$j;->s:Lw7/b$j;

    new-instance v0, Lw7/b$j;

    const-string v2, "focus"

    move-object/from16 v22, v1

    const/16 v1, 0x13

    invoke-direct {v0, v2, v1}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/b$j;->t:Lw7/b$j;

    new-instance v1, Lw7/b$j;

    const-string v2, "enabled"

    move-object/from16 v23, v0

    const/16 v0, 0x14

    invoke-direct {v1, v2, v0}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/b$j;->u:Lw7/b$j;

    new-instance v0, Lw7/b$j;

    const-string v2, "disabled"

    move-object/from16 v24, v1

    const/16 v1, 0x15

    invoke-direct {v0, v2, v1}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/b$j;->v:Lw7/b$j;

    new-instance v1, Lw7/b$j;

    const-string v2, "checked"

    move-object/from16 v25, v0

    const/16 v0, 0x16

    invoke-direct {v1, v2, v0}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/b$j;->w:Lw7/b$j;

    new-instance v0, Lw7/b$j;

    const-string v2, "indeterminate"

    move-object/from16 v26, v1

    const/16 v1, 0x17

    invoke-direct {v0, v2, v1}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw7/b$j;->x:Lw7/b$j;

    new-instance v1, Lw7/b$j;

    const-string v2, "UNSUPPORTED"

    move-object/from16 v27, v0

    const/16 v0, 0x18

    invoke-direct {v1, v2, v0}, Lw7/b$j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw7/b$j;->y:Lw7/b$j;

    move-object/from16 v2, v18

    move-object/from16 v16, v19

    move-object/from16 v18, v21

    move-object/from16 v19, v22

    move-object/from16 v21, v24

    move-object/from16 v22, v25

    move-object/from16 v24, v27

    const/4 v0, 0x0

    move-object/from16 v25, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v23

    move-object/from16 v23, v26

    filled-new-array/range {v1 .. v25}, [Lw7/b$j;

    move-result-object v1

    sput-object v1, Lw7/b$j;->A:[Lw7/b$j;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lw7/b$j;->z:Ljava/util/Map;

    invoke-static {}, Lw7/b$j;->values()[Lw7/b$j;

    move-result-object v1

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    sget-object v4, Lw7/b$j;->y:Lw7/b$j;

    if-eq v3, v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x5f

    const/16 v6, 0x2d

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lw7/b$j;->z:Ljava/util/Map;

    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lw7/b$j;
    .locals 1

    sget-object v0, Lw7/b$j;->z:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw7/b$j;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lw7/b$j;->y:Lw7/b$j;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lw7/b$j;
    .locals 1

    const-class v0, Lw7/b$j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw7/b$j;

    return-object p0
.end method

.method public static values()[Lw7/b$j;
    .locals 1

    sget-object v0, Lw7/b$j;->A:[Lw7/b$j;

    invoke-virtual {v0}, [Lw7/b$j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw7/b$j;

    return-object v0
.end method
