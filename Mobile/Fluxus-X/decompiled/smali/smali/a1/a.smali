.class public final La1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La1/a;

.field public static final d:La1/a;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La1/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La1/a;-><init>(II)V

    sput-object v0, La1/a;->c:La1/a;

    new-instance v0, La1/a;

    invoke-direct {v0, v2, v2}, La1/a;-><init>(II)V

    sput-object v0, La1/a;->d:La1/a;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La1/a;->a:I

    iput p2, p0, La1/a;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, La1/a;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, La1/a;->a:I

    return v0
.end method
