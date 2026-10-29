.class public final Leb/a4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Leb/e4;

.field public final b:Leb/e4;


# direct methods
.method public constructor <init>(Leb/e4;Leb/e4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/a4;->a:Leb/e4;

    iput-object p2, p0, Leb/a4;->b:Leb/e4;

    return-void
.end method


# virtual methods
.method public final a()Leb/e4;
    .locals 1

    iget-object v0, p0, Leb/a4;->a:Leb/e4;

    return-object v0
.end method

.method public final b()Leb/e4;
    .locals 1

    iget-object v0, p0, Leb/a4;->b:Leb/e4;

    return-object v0
.end method
