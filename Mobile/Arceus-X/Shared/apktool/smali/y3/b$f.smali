.class public Ly3/b$f;
.super Ly3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly3/b;-><init>(Ly3/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ly3/d;

.field public final synthetic c:Ly3/b;


# direct methods
.method public constructor <init>(Ly3/b;Ljava/lang/String;Ly3/d;)V
    .locals 0

    iput-object p1, p0, Ly3/b$f;->c:Ly3/b;

    iput-object p3, p0, Ly3/b$f;->b:Ly3/d;

    invoke-direct {p0, p2}, Ly3/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)F
    .locals 0

    iget-object p1, p0, Ly3/b$f;->b:Ly3/d;

    invoke-virtual {p1}, Ly3/d;->a()F

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;F)V
    .locals 0

    iget-object p1, p0, Ly3/b$f;->b:Ly3/d;

    invoke-virtual {p1, p2}, Ly3/d;->b(F)V

    return-void
.end method
