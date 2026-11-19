.class public final synthetic Ljg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljg/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljg/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljg/g;->a:Ljava/lang/String;

    iput-object p2, p0, Ljg/g;->b:Ljg/h$a;

    return-void
.end method


# virtual methods
.method public final create(Lof/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljg/g;->a:Ljava/lang/String;

    iget-object v1, p0, Ljg/g;->b:Ljg/h$a;

    invoke-static {v0, v1, p1}, Ljg/h;->a(Ljava/lang/String;Ljg/h$a;Lof/d;)Ljg/f;

    move-result-object p1

    return-object p1
.end method
