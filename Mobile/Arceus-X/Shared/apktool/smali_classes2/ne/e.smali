.class public final synthetic Lne/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lne/g;

.field public final synthetic b:Lne/x;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lne/g;Lne/x;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne/e;->a:Lne/g;

    iput-object p2, p0, Lne/e;->b:Lne/x;

    iput p3, p0, Lne/e;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lne/e;->a:Lne/g;

    iget-object v1, p0, Lne/e;->b:Lne/x;

    iget v2, p0, Lne/e;->c:I

    invoke-static {v0, v1, v2}, Lne/g;->P(Lne/g;Lne/x;I)V

    return-void
.end method
