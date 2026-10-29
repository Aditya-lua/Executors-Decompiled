.class public Lsb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lsb/s;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsb/s;

    invoke-direct {v0}, Lsb/s;-><init>()V

    iput-object v0, p0, Lsb/b;->a:Lsb/s;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lsb/b;->a:Lsb/s;

    invoke-virtual {v0}, Lsb/s;->c()V

    return-void
.end method

.method public b()Lsb/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lsb/b;->a:Lsb/s;

    return-object v0
.end method
