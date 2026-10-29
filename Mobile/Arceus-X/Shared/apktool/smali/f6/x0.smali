.class public final synthetic Lf6/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/x0;->a:Ljava/lang/String;

    iput-wide p2, p0, Lf6/x0;->b:J

    iput-object p4, p0, Lf6/x0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lf6/x0;->a:Ljava/lang/String;

    iget-wide v1, p0, Lf6/x0;->b:J

    iget-object v3, p0, Lf6/x0;->c:Ljava/lang/String;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, v2, v3, p1}, Lf6/n1;->R(Ljava/lang/String;JLjava/lang/String;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
