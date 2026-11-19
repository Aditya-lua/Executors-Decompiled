.class public final synthetic Lz/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/o3$d;

.field public final synthetic b:Ln0/o3;


# direct methods
.method public synthetic constructor <init>(Ln0/o3$d;Ln0/o3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/g0;->a:Ln0/o3$d;

    iput-object p2, p0, Lz/g0;->b:Ln0/o3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/g0;->a:Ln0/o3$d;

    iget-object v1, p0, Lz/g0;->b:Ln0/o3;

    invoke-static {v0, v1}, Lz/u0;->C(Ln0/o3$d;Ln0/o3;)V

    return-void
.end method
