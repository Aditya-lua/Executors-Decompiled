.class public final synthetic La0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La0/p0$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La0/p0$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/o0;->a:La0/p0$a;

    iput-object p2, p0, La0/o0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La0/o0;->a:La0/p0$a;

    iget-object v1, p0, La0/o0;->b:Ljava/lang/String;

    invoke-static {v0, v1}, La0/p0$a;->c(La0/p0$a;Ljava/lang/String;)V

    return-void
.end method
