.class public abstract Llt/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Llt/m$b;Llt/g;)Llt/n;
    .locals 1
    .param p0    # Llt/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Llt/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Llt/n$a;

    invoke-direct {v0, p0, p1}, Llt/n$a;-><init>(Llt/m$b;Llt/g;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Llt/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
