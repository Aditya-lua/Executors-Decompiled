.class public Lpe/p$b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/p$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final b:Lpe/p$b$b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpe/p$b$b;

    invoke-direct {v0}, Lpe/p$b$b;-><init>()V

    sput-object v0, Lpe/p$b$b;->b:Lpe/p$b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lpe/p$b$b;->a:I

    return-void
.end method

.method public static synthetic a()Lpe/p$b$b;
    .locals 1

    invoke-static {}, Lpe/p$b$b;->e()Lpe/p$b$b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Lpe/p$b$b;
    .locals 1

    sget-object v0, Lpe/p$b$b;->b:Lpe/p$b$b;

    return-object v0
.end method

.method public static synthetic c(Lpe/p$b$b;)I
    .locals 0

    invoke-virtual {p0}, Lpe/p$b$b;->d()I

    move-result p0

    return p0
.end method

.method public static e()Lpe/p$b$b;
    .locals 1

    sget-object v0, Lpe/p$b$b;->b:Lpe/p$b$b;

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lpe/p$b$b;->a:I

    return v0
.end method
