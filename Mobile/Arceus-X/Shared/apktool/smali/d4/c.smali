.class public final Ld4/c;
.super Ljava/lang/Object;


# static fields
.field public static final a:[I

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field public static final e:[I

.field public static final f:I = 0x0

.field public static final g:I = 0x1


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const v0, 0x1010003

    const v1, 0x10100d0

    const v2, 0x10100d1

    filled-new-array {v0, v1, v2}, [I

    move-result-object v1

    sput-object v1, Ld4/c;->a:[I

    filled-new-array {v0, v2}, [I

    move-result-object v0

    sput-object v0, Ld4/c;->e:[I

    return-void
.end method
