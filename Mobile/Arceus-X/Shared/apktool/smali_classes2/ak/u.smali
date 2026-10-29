.class public final synthetic Lak/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/u;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lak/u;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lak/u;->a:Ljava/lang/Runnable;

    iget-object v1, p0, Lak/u;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lak/x;->a(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method
