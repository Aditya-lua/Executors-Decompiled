.class public Lo7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/i$a;
    }
.end annotation


# instance fields
.field public final a:Lo7/i$a;

.field public final b:Ln7/h;

.field public final c:Ln7/d;

.field public final d:Z


# direct methods
.method public constructor <init>(Lo7/i$a;Ln7/h;Ln7/d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/i;->a:Lo7/i$a;

    iput-object p2, p0, Lo7/i;->b:Ln7/h;

    iput-object p3, p0, Lo7/i;->c:Ln7/d;

    iput-boolean p4, p0, Lo7/i;->d:Z

    return-void
.end method


# virtual methods
.method public a()Lo7/i$a;
    .locals 1

    iget-object v0, p0, Lo7/i;->a:Lo7/i$a;

    return-object v0
.end method

.method public b()Ln7/h;
    .locals 1

    iget-object v0, p0, Lo7/i;->b:Ln7/h;

    return-object v0
.end method

.method public c()Ln7/d;
    .locals 1

    iget-object v0, p0, Lo7/i;->c:Ln7/d;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lo7/i;->d:Z

    return v0
.end method
