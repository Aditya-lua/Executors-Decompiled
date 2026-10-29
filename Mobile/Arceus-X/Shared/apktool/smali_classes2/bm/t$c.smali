.class public Lbm/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbm/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbm/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lbm/t$d;


# direct methods
.method public constructor <init>(Lbm/t$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm/t$c;->a:Lbm/t$d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lbm/t$c;->a:Lbm/t$d;

    invoke-interface {v0, p1, p2}, Lbm/t$d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lbm/t$c;->a:Lbm/t$d;

    invoke-interface {v0, p1, p2}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method
