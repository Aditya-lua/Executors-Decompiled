.class public final Le8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Le8/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le8/b$a;->a:Le8/e;

    return-void
.end method


# virtual methods
.method public a()Le8/b;
    .locals 2

    new-instance v0, Le8/b;

    iget-object v1, p0, Le8/b$a;->a:Le8/e;

    invoke-direct {v0, v1}, Le8/b;-><init>(Le8/e;)V

    return-object v0
.end method

.method public b(Le8/e;)Le8/b$a;
    .locals 0

    iput-object p1, p0, Le8/b$a;->a:Le8/e;

    return-object p0
.end method
