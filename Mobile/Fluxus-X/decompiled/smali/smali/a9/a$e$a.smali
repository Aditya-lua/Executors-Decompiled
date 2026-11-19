.class public final La9/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La9/a$e$a;->a:Z

    return-void
.end method


# virtual methods
.method public a()La9/a$e;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, La9/a$e;

    iget-boolean v1, p0, La9/a$e$a;->a:Z

    invoke-direct {v0, v1}, La9/a$e;-><init>(Z)V

    return-object v0
.end method

.method public b(Z)La9/a$e$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, La9/a$e$a;->a:Z

    return-object p0
.end method
