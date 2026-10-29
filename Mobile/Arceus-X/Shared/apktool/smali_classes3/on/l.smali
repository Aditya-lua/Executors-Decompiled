.class public Lon/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/g;


# instance fields
.field public final a:Lqn/s;

.field public final b:Lsn/h;


# direct methods
.method public constructor <init>(Lqn/s;Lsn/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lon/l;->a:Lqn/s;

    iput-object p2, p0, Lon/l;->b:Lsn/h;

    return-void
.end method


# virtual methods
.method public c()Lqn/s;
    .locals 1

    iget-object v0, p0, Lon/l;->a:Lqn/s;

    return-object v0
.end method

.method public d()Lsn/h;
    .locals 1

    iget-object v0, p0, Lon/l;->b:Lsn/h;

    return-object v0
.end method
