.class public Lcj/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lcj/a;


# direct methods
.method public constructor <init>(Lcj/a;)V
    .locals 0

    iput-object p1, p0, Lcj/a$a;->a:Lcj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 2

    new-instance v0, Llk/b;

    invoke-direct {v0}, Llk/b;-><init>()V

    new-instance v1, Lcj/a$a$a;

    invoke-direct {v1, p0}, Lcj/a$a$a;-><init>(Lcj/a$a;)V

    invoke-virtual {v0, v1}, Llk/b;->b(Llk/b$b;)V

    return-void
.end method
