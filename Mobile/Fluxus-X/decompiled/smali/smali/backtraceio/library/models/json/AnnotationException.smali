.class Lbacktraceio/library/models/json/AnnotationException;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final message:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/models/json/AnnotationException;->message:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/json/AnnotationException;->message:Ljava/lang/Object;

    return-object v0
.end method
