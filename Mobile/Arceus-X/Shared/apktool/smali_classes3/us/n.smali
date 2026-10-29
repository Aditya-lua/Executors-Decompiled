.class public abstract Lus/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lus/m$b;Lus/g;)Lus/n;
    .locals 1
    .param p0    # Lus/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lus/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lus/n$a;

    invoke-direct {v0, p0, p1}, Lus/n$a;-><init>(Lus/m$b;Lus/g;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lus/m;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
