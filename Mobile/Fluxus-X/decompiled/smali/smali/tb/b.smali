.class public Ltb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ltb/s;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ltb/s;

    invoke-direct {v0}, Ltb/s;-><init>()V

    iput-object v0, p0, Ltb/b;->a:Ltb/s;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltb/b;->a:Ltb/s;

    invoke-virtual {v0}, Ltb/s;->c()V

    return-void
.end method

.method public b()Ltb/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ltb/b;->a:Ltb/s;

    return-object v0
.end method
