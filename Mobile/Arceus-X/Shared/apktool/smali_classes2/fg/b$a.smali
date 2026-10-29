.class public final Lfg/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lfg/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lfg/b$a;->a:Lfg/a;

    return-void
.end method


# virtual methods
.method public a()Lfg/b;
    .locals 2

    new-instance v0, Lfg/b;

    iget-object v1, p0, Lfg/b$a;->a:Lfg/a;

    invoke-direct {v0, v1}, Lfg/b;-><init>(Lfg/a;)V

    return-object v0
.end method

.method public b(Lfg/a;)Lfg/b$a;
    .locals 0

    iput-object p1, p0, Lfg/b$a;->a:Lfg/a;

    return-object p0
.end method
