.class public final synthetic Lpe/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpe/g;

.field public final synthetic b:Lpe/x;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lpe/g;Lpe/x;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe/e;->a:Lpe/g;

    iput-object p2, p0, Lpe/e;->b:Lpe/x;

    iput p3, p0, Lpe/e;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lpe/e;->a:Lpe/g;

    iget-object v1, p0, Lpe/e;->b:Lpe/x;

    iget v2, p0, Lpe/e;->c:I

    invoke-static {v0, v1, v2}, Lpe/g;->P(Lpe/g;Lpe/x;I)V

    return-void
.end method
