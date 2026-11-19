.class public Lre/p$b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lre/p$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final b:Lre/p$b$b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/p$b$b;

    invoke-direct {v0}, Lre/p$b$b;-><init>()V

    sput-object v0, Lre/p$b$b;->b:Lre/p$b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lre/p$b$b;->a:I

    return-void
.end method

.method public static synthetic a()Lre/p$b$b;
    .locals 1

    invoke-static {}, Lre/p$b$b;->e()Lre/p$b$b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Lre/p$b$b;
    .locals 1

    sget-object v0, Lre/p$b$b;->b:Lre/p$b$b;

    return-object v0
.end method

.method public static synthetic c(Lre/p$b$b;)I
    .locals 0

    invoke-virtual {p0}, Lre/p$b$b;->d()I

    move-result p0

    return p0
.end method

.method public static e()Lre/p$b$b;
    .locals 1

    sget-object v0, Lre/p$b$b;->b:Lre/p$b$b;

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lre/p$b$b;->a:I

    return v0
.end method
