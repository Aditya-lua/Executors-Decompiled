.class public Lbo/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/k$a;
    }
.end annotation


# instance fields
.field public final a:Lbo/k$a;

.field public final b:Leo/s;

.field public final c:Lgo/h;

.field public d:Z


# direct methods
.method public constructor <init>(Lbo/k$a;Leo/s;Lgo/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbo/k;->d:Z

    iput-object p1, p0, Lbo/k;->a:Lbo/k$a;

    iput-object p2, p0, Lbo/k;->b:Leo/s;

    iput-object p3, p0, Lbo/k;->c:Lgo/h;

    return-void
.end method


# virtual methods
.method public c()Lgo/f;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbo/k;->d:Z

    return-object p0
.end method

.method public d()Leo/s;
    .locals 1

    iget-object v0, p0, Lbo/k;->b:Leo/s;

    return-object v0
.end method

.method public e()Lgo/h;
    .locals 1

    iget-object v0, p0, Lbo/k;->c:Lgo/h;

    return-object v0
.end method

.method public f()Lbo/k$a;
    .locals 1

    iget-object v0, p0, Lbo/k;->a:Lbo/k$a;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lbo/k;->d:Z

    return v0
.end method
