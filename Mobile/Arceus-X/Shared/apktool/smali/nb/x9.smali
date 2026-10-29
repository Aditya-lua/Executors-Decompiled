.class public final Lnb/x9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Boolean;

.field public final synthetic b:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p2, p0, Lnb/x9;->a:Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/x9;->b:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnb/x9;->b:Lnb/qa;

    iget-object v1, p0, Lnb/x9;->a:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lnb/qa;->W(Ljava/lang/Boolean;Z)V

    return-void
.end method
