.class public Llt/n$a;
.super Llt/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llt/n;->b(Llt/m$b;Llt/g;)Llt/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Llt/m$b;

.field public final synthetic b:Llt/g;


# direct methods
.method public constructor <init>(Llt/m$b;Llt/g;)V
    .locals 0

    iput-object p1, p0, Llt/n$a;->a:Llt/m$b;

    iput-object p2, p0, Llt/n$a;->b:Llt/g;

    invoke-direct {p0}, Llt/n;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Llt/m;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/n$a;->a:Llt/m$b;

    iget-object v1, p0, Llt/n$a;->b:Llt/g;

    new-instance v2, Llt/s;

    invoke-direct {v2}, Llt/s;-><init>()V

    invoke-interface {v0, v1, v2}, Llt/m$b;->a(Llt/g;Llt/r;)Llt/m;

    move-result-object v0

    return-object v0
.end method
