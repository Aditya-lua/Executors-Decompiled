.class public final synthetic Lhg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmf/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lhg/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lhg/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhg/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lhg/g;->b:Lhg/h$a;

    return-void
.end method


# virtual methods
.method public final create(Lmf/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhg/g;->a:Ljava/lang/String;

    iget-object v1, p0, Lhg/g;->b:Lhg/h$a;

    invoke-static {v0, v1, p1}, Lhg/h;->a(Ljava/lang/String;Lhg/h$a;Lmf/d;)Lhg/f;

    move-result-object p1

    return-object p1
.end method
