.class public final synthetic Lkg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lof/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lof/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkg/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lkg/a;->b:Lof/c;

    return-void
.end method


# virtual methods
.method public final create(Lof/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkg/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lkg/a;->b:Lof/c;

    invoke-static {v0, v1, p1}, Lkg/b;->b(Ljava/lang/String;Lof/c;Lof/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
