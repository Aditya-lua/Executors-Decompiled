.class public final synthetic Llu/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lku/n;

.field public final synthetic b:Llu/f;


# direct methods
.method public synthetic constructor <init>(Lku/n;Llu/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llu/c;->a:Lku/n;

    iput-object p2, p0, Llu/c;->b:Llu/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Llu/c;->a:Lku/n;

    iget-object v1, p0, Llu/c;->b:Llu/f;

    invoke-static {v0, v1}, Llu/f;->Z(Lku/n;Llu/f;)V

    return-void
.end method
