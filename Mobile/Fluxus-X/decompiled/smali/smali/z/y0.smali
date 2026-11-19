.class public final synthetic Lz/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/u0$j$b;


# direct methods
.method public synthetic constructor <init>(Lz/u0$j$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/y0;->a:Lz/u0$j$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/y0;->a:Lz/u0$j$b;

    invoke-static {v0}, Lz/u0$j$b;->a(Lz/u0$j$b;)V

    return-void
.end method
