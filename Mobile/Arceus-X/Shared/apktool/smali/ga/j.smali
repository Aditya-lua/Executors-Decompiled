.class public final Lga/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lga/j;


# instance fields
.field public volatile a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lga/j;

    invoke-direct {v0}, Lga/j;-><init>()V

    sput-object v0, Lga/j;->b:Lga/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lga/j;->a:Z

    return-void
.end method

.method public static a()Lga/j;
    .locals 1

    sget-object v0, Lga/j;->b:Lga/j;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lga/j;->a:Z

    return v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lga/j;->a:Z

    return-void
.end method
