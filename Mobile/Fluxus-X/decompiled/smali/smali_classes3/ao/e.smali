.class public Lao/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Leo/b0;

.field public final b:Lgo/h;

.field public final c:Leo/b0;

.field public final d:Lgo/h;

.field public final e:Lgo/h;

.field public final f:Lao/e;

.field public final g:Lao/g;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Leo/b0;Lgo/h;Leo/b0;Lgo/h;Lgo/h;Lao/e;Lao/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lao/e;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lao/e;->i:Z

    iput-object p1, p0, Lao/e;->a:Leo/b0;

    iput-object p2, p0, Lao/e;->b:Lgo/h;

    iput-object p3, p0, Lao/e;->c:Leo/b0;

    iput-object p4, p0, Lao/e;->d:Lgo/h;

    iput-object p5, p0, Lao/e;->e:Lgo/h;

    iput-object p6, p0, Lao/e;->f:Lao/e;

    iput-object p7, p0, Lao/e;->g:Lao/g;

    return-void
.end method

.method public static a(Leo/b0;Lgo/h;Lgo/h;Lao/e;Lao/g;)Lao/e;
    .locals 8

    new-instance v0, Lao/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lao/e;-><init>(Leo/b0;Lgo/h;Leo/b0;Lgo/h;Lgo/h;Lao/e;Lao/g;)V

    return-object v0
.end method

.method public static b(Leo/b0;Lgo/h;Leo/b0;Lgo/h;Lgo/h;Lao/e;Lao/g;)Lao/e;
    .locals 8

    new-instance v0, Lao/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lao/e;-><init>(Leo/b0;Lgo/h;Leo/b0;Lgo/h;Lgo/h;Lao/e;Lao/g;)V

    return-object v0
.end method
