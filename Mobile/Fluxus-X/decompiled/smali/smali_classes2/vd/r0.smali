.class public final Lvd/r0;
.super Lvd/c$b;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lvd/r1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvd/r1;)V
    .locals 0

    invoke-direct {p0}, Lvd/c$b;-><init>()V

    iput-object p1, p0, Lvd/r0;->a:Ljava/lang/String;

    iput-object p2, p0, Lvd/r0;->b:Lvd/r1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvd/r0;->a:Ljava/lang/String;

    return-object v0
.end method
