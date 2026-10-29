.class public Lw2/g$f;
.super Lw2/g$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final b:Lw2/g$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/g$f;

    invoke-direct {v0}, Lw2/g$f;-><init>()V

    sput-object v0, Lw2/g$f;->b:Lw2/g$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw2/g$d;-><init>(Lw2/g$c;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lw2/h;->a(Ljava/util/Locale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
