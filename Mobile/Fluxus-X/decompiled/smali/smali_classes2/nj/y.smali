.class public final synthetic Lnj/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnj/a0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lnj/a0;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/y;->a:Lnj/a0;

    iput-object p2, p0, Lnj/y;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lnj/y;->c:Z

    iput-object p4, p0, Lnj/y;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnj/y;->a:Lnj/a0;

    iget-object v1, p0, Lnj/y;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lnj/y;->c:Z

    iget-object v3, p0, Lnj/y;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lnj/a0;->u(Lnj/a0;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method
