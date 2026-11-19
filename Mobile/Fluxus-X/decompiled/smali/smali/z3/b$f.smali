.class public Lz3/b$f;
.super Lz3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz3/b;-><init>(Lz3/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lz3/d;

.field public final synthetic c:Lz3/b;


# direct methods
.method public constructor <init>(Lz3/b;Ljava/lang/String;Lz3/d;)V
    .locals 0

    iput-object p1, p0, Lz3/b$f;->c:Lz3/b;

    iput-object p3, p0, Lz3/b$f;->b:Lz3/d;

    invoke-direct {p0, p2}, Lz3/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)F
    .locals 0

    iget-object p1, p0, Lz3/b$f;->b:Lz3/d;

    invoke-virtual {p1}, Lz3/d;->a()F

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;F)V
    .locals 0

    iget-object p1, p0, Lz3/b$f;->b:Lz3/d;

    invoke-virtual {p1, p2}, Lz3/d;->b(F)V

    return-void
.end method
