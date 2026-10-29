.class public final synthetic Lz5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz5/d;

.field public final synthetic b:Ly5/y;


# direct methods
.method public synthetic constructor <init>(Lz5/d;Ly5/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/c;->a:Lz5/d;

    iput-object p2, p0, Lz5/c;->b:Ly5/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz5/c;->a:Lz5/d;

    iget-object v1, p0, Lz5/c;->b:Ly5/y;

    invoke-static {v0, v1}, Lz5/d;->a(Lz5/d;Ly5/y;)V

    return-void
.end method
