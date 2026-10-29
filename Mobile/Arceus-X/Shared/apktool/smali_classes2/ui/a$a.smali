.class public Lui/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leh/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lui/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lui/a;


# direct methods
.method public constructor <init>(Lui/a;)V
    .locals 0

    iput-object p1, p0, Lui/a$a;->a:Lui/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 2

    new-instance v0, Ldk/b;

    invoke-direct {v0}, Ldk/b;-><init>()V

    new-instance v1, Lui/a$a$a;

    invoke-direct {v1, p0}, Lui/a$a$a;-><init>(Lui/a$a;)V

    invoke-virtual {v0, v1}, Ldk/b;->b(Ldk/b$b;)V

    return-void
.end method
