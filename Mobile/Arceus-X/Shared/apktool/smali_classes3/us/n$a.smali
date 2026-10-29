.class public Lus/n$a;
.super Lus/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lus/n;->b(Lus/m$b;Lus/g;)Lus/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lus/m$b;

.field public final synthetic b:Lus/g;


# direct methods
.method public constructor <init>(Lus/m$b;Lus/g;)V
    .locals 0

    iput-object p1, p0, Lus/n$a;->a:Lus/m$b;

    iput-object p2, p0, Lus/n$a;->b:Lus/g;

    invoke-direct {p0}, Lus/n;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lus/m;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/n$a;->a:Lus/m$b;

    iget-object v1, p0, Lus/n$a;->b:Lus/g;

    new-instance v2, Lus/s;

    invoke-direct {v2}, Lus/s;-><init>()V

    invoke-interface {v0, v1, v2}, Lus/m$b;->b(Lus/g;Lus/r;)Lus/m;

    move-result-object v0

    return-object v0
.end method
