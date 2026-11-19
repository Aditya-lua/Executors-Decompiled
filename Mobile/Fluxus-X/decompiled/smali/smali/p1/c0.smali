.class public final synthetic Lp1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp1/b0$c;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lp1/b0$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/c0;->a:Lp1/b0$c;

    iput p2, p0, Lp1/c0;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/c0;->a:Lp1/b0$c;

    iget v1, p0, Lp1/c0;->b:I

    invoke-static {v0, v1}, Lp1/b0$c;->a(Lp1/b0$c;I)V

    return-void
.end method
