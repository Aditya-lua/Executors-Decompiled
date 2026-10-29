.class public final enum Lw3/h$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw3/h$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lw3/h$b;

.field public static final enum c:Lw3/h$b;

.field public static final enum d:Lw3/h$b;

.field public static final enum e:Lw3/h$b;

.field public static final enum f:Lw3/h$b;

.field public static final enum g:Lw3/h$b;

.field public static final enum h:Lw3/h$b;

.field public static final enum i:Lw3/h$b;

.field public static final enum j:Lw3/h$b;

.field public static final synthetic k:[Lw3/h$b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lw3/h$b;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->b:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "FLOAT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->c:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "INTEGER"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v4, v3}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->d:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "LONG"

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v4}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->e:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "STRING"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v4, v3}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->f:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "STRING_SET"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v3, v4}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->g:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "DOUBLE"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v4, v3}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->h:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "BYTES"

    const/16 v4, 0x8

    invoke-direct {v0, v1, v3, v4}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->i:Lw3/h$b;

    new-instance v0, Lw3/h$b;

    const-string v1, "VALUE_NOT_SET"

    invoke-direct {v0, v1, v4, v2}, Lw3/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw3/h$b;->j:Lw3/h$b;

    invoke-static {}, Lw3/h$b;->a()[Lw3/h$b;

    move-result-object v0

    sput-object v0, Lw3/h$b;->k:[Lw3/h$b;

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

    iput p3, p0, Lw3/h$b;->a:I

    return-void
.end method

.method public static synthetic a()[Lw3/h$b;
    .locals 9

    sget-object v0, Lw3/h$b;->b:Lw3/h$b;

    sget-object v1, Lw3/h$b;->c:Lw3/h$b;

    sget-object v2, Lw3/h$b;->d:Lw3/h$b;

    sget-object v3, Lw3/h$b;->e:Lw3/h$b;

    sget-object v4, Lw3/h$b;->f:Lw3/h$b;

    sget-object v5, Lw3/h$b;->g:Lw3/h$b;

    sget-object v6, Lw3/h$b;->h:Lw3/h$b;

    sget-object v7, Lw3/h$b;->i:Lw3/h$b;

    sget-object v8, Lw3/h$b;->j:Lw3/h$b;

    filled-new-array/range {v0 .. v8}, [Lw3/h$b;

    move-result-object v0

    return-object v0
.end method

.method public static b(I)Lw3/h$b;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lw3/h$b;->i:Lw3/h$b;

    return-object p0

    :pswitch_1
    sget-object p0, Lw3/h$b;->h:Lw3/h$b;

    return-object p0

    :pswitch_2
    sget-object p0, Lw3/h$b;->g:Lw3/h$b;

    return-object p0

    :pswitch_3
    sget-object p0, Lw3/h$b;->f:Lw3/h$b;

    return-object p0

    :pswitch_4
    sget-object p0, Lw3/h$b;->e:Lw3/h$b;

    return-object p0

    :pswitch_5
    sget-object p0, Lw3/h$b;->d:Lw3/h$b;

    return-object p0

    :pswitch_6
    sget-object p0, Lw3/h$b;->c:Lw3/h$b;

    return-object p0

    :pswitch_7
    sget-object p0, Lw3/h$b;->b:Lw3/h$b;

    return-object p0

    :pswitch_8
    sget-object p0, Lw3/h$b;->j:Lw3/h$b;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lw3/h$b;
    .locals 1

    const-class v0, Lw3/h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw3/h$b;

    return-object p0
.end method

.method public static values()[Lw3/h$b;
    .locals 1

    sget-object v0, Lw3/h$b;->k:[Lw3/h$b;

    invoke-virtual {v0}, [Lw3/h$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw3/h$b;

    return-object v0
.end method
