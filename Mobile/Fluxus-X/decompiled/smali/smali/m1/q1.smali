.class public abstract Lm1/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm1/q1;

.field public static final b:Lm1/q1;

.field public static final c:Lm1/q1;

.field public static final d:Lm1/q1;

.field public static final e:Lm1/q1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, v0, v0}, Lm1/q1;->a(III)Lm1/q1;

    move-result-object v0

    sput-object v0, Lm1/q1;->a:Lm1/q1;

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-static {v1, v2, v0}, Lm1/q1;->a(III)Lm1/q1;

    move-result-object v0

    sput-object v0, Lm1/q1;->b:Lm1/q1;

    invoke-static {v1, v2, v1}, Lm1/q1;->a(III)Lm1/q1;

    move-result-object v0

    sput-object v0, Lm1/q1;->c:Lm1/q1;

    const/4 v0, 0x7

    const/4 v2, 0x6

    invoke-static {v2, v0, v1}, Lm1/q1;->a(III)Lm1/q1;

    move-result-object v0

    sput-object v0, Lm1/q1;->d:Lm1/q1;

    invoke-static {v2, v2, v1}, Lm1/q1;->a(III)Lm1/q1;

    move-result-object v0

    sput-object v0, Lm1/q1;->e:Lm1/q1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(III)Lm1/q1;
    .locals 1

    new-instance v0, Lm1/e;

    invoke-direct {v0, p0, p1, p2}, Lm1/e;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method
