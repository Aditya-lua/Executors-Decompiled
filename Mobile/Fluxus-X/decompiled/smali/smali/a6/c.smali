.class public final synthetic La6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La6/d;

.field public final synthetic b:Lz5/y;


# direct methods
.method public synthetic constructor <init>(La6/d;Lz5/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/c;->a:La6/d;

    iput-object p2, p0, La6/c;->b:Lz5/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La6/c;->a:La6/d;

    iget-object v1, p0, La6/c;->b:Lz5/y;

    invoke-static {v0, v1}, La6/d;->a(La6/d;Lz5/y;)V

    return-void
.end method
