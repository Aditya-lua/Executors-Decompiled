package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1056g;
import androidx.recyclerview.widget.RecyclerView;
import ao.C1128b;
import ao.C1130d;
import com.withpersona.sdk2.inquiry.document.C3443f;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4850c;
import p121f7.C5452i;
import p121f7.C5467p0;
import p121f7.C5468q;
import p226jq.C7265j;
import p226jq.C7266j0;
import p226jq.C7268k0;
import p226jq.C7281s;
import p227jr.C7301g;
import p227jr.C7304h0;
import p229jt.C7345l;
import p239k6.InterfaceC7479s;
import p402r5.InterfaceC10784a;
import p477ut.C11966k;
import p537x6.C12748i;
import p537x6.C12749j;
import p537x6.ImageRequest;
import p609zn.C13913o2;
import p609zn.C13917p2;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010'\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010;\u001a\n 9*\u0004\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020#0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", "context", "Lk6/s;", "imageLoader", "Lkotlin/Function0;", "", "onClickAddButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Landroid/content/Context;Lk6/s;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "", "position", "g", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "holder", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "e", "()I", "", "addButtonEnabled", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "K", "(ZLjava/util/List;)V", "Lcom/withpersona/sdk2/inquiry/document/f$a;", "G", "(ZLjava/util/List;)Ljava/util/List;", "Lao/d;", "binding", "F", "(Lao/d;)V", "Lao/b;", "E", "(Lao/b;)V", "d", "Lk6/s;", "getImageLoader", "()Lk6/s;", "Lkotlin/jvm/functions/Function0;", "getOnClickAddButton", "()Lkotlin/jvm/functions/Function0;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "inflater", "h", "Ljava/util/List;", "items", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getRemoveDocument", "()Lkotlin/jvm/functions/Function1;", "J", "(Lkotlin/jvm/functions/Function1;)V", "removeDocument", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3443f extends RecyclerView.AbstractC1025h<RecyclerView.AbstractC1023f0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onClickAddButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.DocumentStepStyle styles;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final LayoutInflater inflater;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<? extends a> items;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Function1<? super DocumentFile, Unit> removeDocument;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/f$a$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a;", "<init>", "()V", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14115a extends a {
            public C14115a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$a$b */
        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "Lcom/withpersona/sdk2/inquiry/document/f$a;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "a", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "document", "b", "Lcom/withpersona/sdk2/inquiry/document/f$a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b$b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static abstract class b extends a {

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "document", "", "mimeType", "<init>", "(Ljava/io/File;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "c", "()Ljava/io/File;", "b", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Ljava/lang/String;", "getMimeType", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class Local extends b {

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @NotNull
                public final File file;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @NotNull
                public final DocumentFile.Local document;

                /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
                @Nullable
                public final String mimeType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Local(@NotNull File file, @NotNull DocumentFile.Local document, @Nullable String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(document, "document");
                    this.file = file;
                    this.document = document;
                    this.mimeType = str;
                }

                /* JADX DEBUG: Method merged with bridge method: a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile; */
                @Override // com.withpersona.sdk2.inquiry.document.C3443f.a.b
                @NotNull
                /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
                public DocumentFile.Local mo16616a() {
                    return this.document;
                }

                @NotNull
                /* JADX INFO: renamed from: c, reason: from getter */
                public final File getFile() {
                    return this.file;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Local)) {
                        return false;
                    }
                    Local local = (Local) other;
                    return Intrinsics.m31980c(this.file, local.file) && Intrinsics.m31980c(this.document, local.document) && Intrinsics.m31980c(this.mimeType, local.mimeType);
                }

                public int hashCode() {
                    int iHashCode = ((this.file.hashCode() * 31) + this.document.hashCode()) * 31;
                    String str = this.mimeType;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @NotNull
                public String toString() {
                    return "Local(file=" + this.file + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "", "remoteUrl", "filename", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "d", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class Remote extends b {

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @NotNull
                public final String remoteUrl;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final String filename;

                /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
                @NotNull
                public final DocumentFile.Remote document;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
                @Nullable
                public final String mimeType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Remote(@NotNull String remoteUrl, @Nullable String str, @NotNull DocumentFile.Remote document, @Nullable String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
                    Intrinsics.checkNotNullParameter(document, "document");
                    this.remoteUrl = remoteUrl;
                    this.filename = str;
                    this.document = document;
                    this.mimeType = str2;
                }

                /* JADX DEBUG: Method merged with bridge method: a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile; */
                @Override // com.withpersona.sdk2.inquiry.document.C3443f.a.b
                @NotNull
                /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
                public DocumentFile.Remote mo16616a() {
                    return this.document;
                }

                @Nullable
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getFilename() {
                    return this.filename;
                }

                @Nullable
                /* JADX INFO: renamed from: d, reason: from getter */
                public String getMimeType() {
                    return this.mimeType;
                }

                @NotNull
                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getRemoteUrl() {
                    return this.remoteUrl;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Remote)) {
                        return false;
                    }
                    Remote remote = (Remote) other;
                    return Intrinsics.m31980c(this.remoteUrl, remote.remoteUrl) && Intrinsics.m31980c(this.filename, remote.filename) && Intrinsics.m31980c(this.document, remote.document) && Intrinsics.m31980c(this.mimeType, remote.mimeType);
                }

                public int hashCode() {
                    int iHashCode = this.remoteUrl.hashCode() * 31;
                    String str = this.filename;
                    int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.document.hashCode()) * 31;
                    String str2 = this.mimeType;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Remote(remoteUrl=" + this.remoteUrl + ", filename=" + this.filename + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.f.a.b.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public abstract DocumentFile mo16616a();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public b() {
                super(null);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$b */
    @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m31665d2 = {"com/withpersona/sdk2/inquiry/document/f$b", "Landroidx/recyclerview/widget/g$b;", "", "e", "()I", "d", "oldItemPosition", "newItemPosition", "", "b", "(II)Z", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends C1056g.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<a> f13222a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<a> f13223b;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.f$a> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.document.f$a> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends a> list, List<? extends a> list2) {
            this.f13222a = list;
            this.f13223b = list2;
        }

        @Override // androidx.recyclerview.widget.C1056g.b
        /* JADX INFO: renamed from: a */
        public boolean mo5869a(int oldItemPosition, int newItemPosition) {
            boolean zM31980c;
            a aVar = this.f13222a.get(oldItemPosition);
            a aVar2 = this.f13223b.get(newItemPosition);
            if (!mo5870b(oldItemPosition, newItemPosition)) {
                return false;
            }
            if (aVar instanceof a.C14115a) {
                zM31980c = Intrinsics.m31980c(aVar, aVar2);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new C7345l();
                }
                zM31980c = true;
            }
            return zM31980c;
        }

        @Override // androidx.recyclerview.widget.C1056g.b
        /* JADX INFO: renamed from: b */
        public boolean mo5870b(int oldItemPosition, int newItemPosition) {
            a aVar = this.f13222a.get(oldItemPosition);
            a aVar2 = this.f13223b.get(newItemPosition);
            if (aVar.getClass() != aVar2.getClass()) {
                return false;
            }
            if (aVar instanceof a.C14115a) {
                return true;
            }
            if (aVar instanceof a.b.Local) {
                String absolutePath = ((a.b.Local) aVar).getFile().getAbsolutePath();
                Intrinsics.m31981d(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Local");
                return Intrinsics.m31980c(absolutePath, ((a.b.Local) aVar2).getFile().getAbsolutePath());
            }
            if (!(aVar instanceof a.b.Remote)) {
                throw new C7345l();
            }
            String remoteUrl = ((a.b.Remote) aVar).getRemoteUrl();
            Intrinsics.m31981d(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Remote");
            return Intrinsics.m31980c(remoteUrl, ((a.b.Remote) aVar2).getRemoteUrl());
        }

        @Override // androidx.recyclerview.widget.C1056g.b
        /* JADX INFO: renamed from: d */
        public int mo5872d() {
            return this.f13223b.size();
        }

        @Override // androidx.recyclerview.widget.C1056g.b
        /* JADX INFO: renamed from: e */
        public int mo5873e() {
            return this.f13222a.size();
        }
    }

    public C3443f(@NotNull Context context, @NotNull InterfaceC7479s imageLoader, @NotNull Function0<Unit> onClickAddButton, @Nullable StepStyles.DocumentStepStyle documentStepStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onClickAddButton, "onClickAddButton");
        this.imageLoader = imageLoader;
        this.onClickAddButton = onClickAddButton;
        this.styles = documentStepStyle;
        this.inflater = LayoutInflater.from(context);
        this.items = C7699p.m31892k();
    }

    /* JADX INFO: renamed from: H */
    public static final void m16609H(C3443f c3443f, View view) {
        c3443f.onClickAddButton.invoke();
    }

    /* JADX INFO: renamed from: I */
    public static final void m16610I(C3443f c3443f, a aVar, View view) {
        Function1<? super DocumentFile, Unit> function1 = c3443f.removeDocument;
        if (function1 != null) {
            function1.invoke(((a.b) aVar).mo16616a());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m16611E(C1128b binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Double imagePreviewBorderRadius = documentStepStyle.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.f4638c.setRadius((float) C7265j.m30285a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.f4638c.setStrokeWidth((int) Math.ceil(C7265j.m30285a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.f4638c.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.f4637b.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView addButton = binding.f4637b;
        Intrinsics.checkNotNullExpressionValue(addButton, "addButton");
        C7301g.m30380m(addButton, this.styles.getImagePreviewPlusIconStrokeColor(), this.styles.getImagePreviewPlusIconFillColor(), null, null, new String[]{"#FFFFFF"}, new String[]{"#5B3FD3"}, null, new String[0], 68, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m16612F(C1130d binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
        if (strokeColorValue != null) {
            binding.f4654f.setIndicatorColor(strokeColorValue.intValue());
        }
        Integer fillColorValue = this.styles.getFillColorValue();
        if (fillColorValue != null) {
            binding.f4654f.setTrackColor(fillColorValue.intValue());
        }
        Integer imagePreviewCropAreaFillColor = this.styles.getImagePreviewCropAreaFillColor();
        if (imagePreviewCropAreaFillColor != null) {
            binding.f4652d.setBackgroundColor(imagePreviewCropAreaFillColor.intValue());
        }
        Double imagePreviewBorderRadius = this.styles.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.f4650b.setRadius((float) C7265j.m30285a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.f4650b.setStrokeWidth((int) Math.ceil(C7265j.m30285a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.f4650b.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        TextBasedComponentStyle imageNameStyleValue = this.styles.getImageNameStyleValue();
        if (imageNameStyleValue != null) {
            TextView filenameView = binding.f4651c;
            Intrinsics.checkNotNullExpressionValue(filenameView, "filenameView");
            C7304h0.m30392l(filenameView, imageNameStyleValue, null, 2, null);
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.f4653e.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView removeButton = binding.f4655g;
        Intrinsics.checkNotNullExpressionValue(removeButton, "removeButton");
        C7301g.m30380m(removeButton, this.styles.getImagePreviewXIconStrokeColor(), this.styles.getImagePreviewXIconFillColor(), null, null, new String[]{"#6B6D82"}, new String[]{"#FFFFFF"}, null, new String[0], 68, null);
    }

    /* JADX INFO: renamed from: G */
    public final List<a> m16613G(boolean addButtonEnabled, List<? extends DocumentFile> documents) {
        a.b remote;
        ArrayList arrayList = new ArrayList();
        for (DocumentFile documentFile : documents) {
            if (documentFile instanceof DocumentFile.Local) {
                DocumentFile.Local local = (DocumentFile.Local) documentFile;
                File file = new File(local.getAbsoluteFilePath());
                remote = new a.b.Local(file, local, MimeTypeMap.getSingleton().getMimeTypeFromExtension(C11966k.m44658p(file)));
            } else {
                if (!(documentFile instanceof DocumentFile.Remote)) {
                    throw new C7345l();
                }
                DocumentFile.Remote remote2 = (DocumentFile.Remote) documentFile;
                remote = new a.b.Remote(remote2.getRemoteUrl(), remote2.getFilename(), remote2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(remote2.getRemoteUrl())));
            }
            arrayList.add(remote);
        }
        if (addButtonEnabled) {
            arrayList.add(new a.C14115a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final void m16614J(@Nullable Function1<? super DocumentFile, Unit> function1) {
        this.removeDocument = function1;
    }

    /* JADX INFO: renamed from: K */
    public final void m16615K(boolean addButtonEnabled, @NotNull List<? extends DocumentFile> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        List<a> listM16613G = m16613G(addButtonEnabled, documents);
        List<? extends a> list = this.items;
        C1056g.e eVarM5918b = C1056g.m5918b(new b(list, listM16613G));
        Intrinsics.checkNotNullExpressionValue(eVarM5918b, "calculateDiff(...)");
        this.items = listM16613G;
        eVarM5918b.m5930b(this);
        List<? extends a> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(obj, (a) obj);
        }
        for (IndexedValue indexedValue : CollectionsKt.m31693S0(listM16613G)) {
            int index = indexedValue.getIndex();
            a aVar = (a) indexedValue.m31730b();
            a aVar2 = (a) linkedHashMap.get(aVar);
            if ((aVar2 instanceof a.b.Local) && (aVar instanceof a.b.Local)) {
                a.b.Local local = (a.b.Local) aVar;
                if (((a.b.Local) aVar2).mo16616a().getUploadProgress() != local.mo16616a().getUploadProgress()) {
                    if (local.mo16616a().getUploadProgress() == 100) {
                        m5479k(index);
                    } else {
                        m5480l(index, Unit.f29331a);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: e */
    public int mo5473e() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: g */
    public int mo5475g(int position) {
        a aVar = this.items.get(position);
        if (aVar instanceof a.C14115a) {
            return C13913o2.f48653c;
        }
        if (aVar instanceof a.b) {
            return C13913o2.f48654d;
        }
        throw new C7345l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: r */
    public void mo5486r(@NotNull RecyclerView.AbstractC1023f0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final a aVar = this.items.get(position);
        if (aVar instanceof a.C14115a) {
            ((C1128b) C7268k0.m30294a(holder)).f4637b.setOnClickListener(new View.OnClickListener() { // from class: zn.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3443f.m16609H(this.f48648a, view);
                }
            });
            return;
        }
        if (!(aVar instanceof a.b)) {
            throw new C7345l();
        }
        C1130d c1130d = (C1130d) C7268k0.m30294a(holder);
        c1130d.f4655g.setOnClickListener(new View.OnClickListener() { // from class: zn.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3443f.m16610I(this.f48656a, aVar, view);
            }
        });
        ImageView imageView = c1130d.f4652d;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        C4850c.m23414a(imageView);
        c1130d.f4652d.setImageDrawable(null);
        a.b bVar = (a.b) aVar;
        if (bVar instanceof a.b.Local) {
            a.b.Local local = (a.b.Local) aVar;
            c1130d.f4652d.setVisibility(local.mo16616a().getUploadProgress() < 100 ? 4 : 0);
            c1130d.f4655g.setVisibility(8);
            c1130d.f4651c.setText(local.getFile().getName());
            c1130d.f4654f.setVisibility(local.mo16616a().getUploadProgress() < 100 ? 0 : 8);
            c1130d.f4654f.setProgress(local.mo16616a().getUploadProgress());
            return;
        }
        if (!(bVar instanceof a.b.Remote)) {
            throw new C7345l();
        }
        c1130d.f4652d.setVisibility(0);
        a.b.Remote remote = (a.b.Remote) aVar;
        if (Intrinsics.m31980c(remote.getMimeType(), "application/pdf")) {
            ImageView imageView2 = c1130d.f4652d;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            Integer numValueOf = Integer.valueOf(C7281s.f28052m);
            InterfaceC7479s interfaceC7479s = this.imageLoader;
            ImageRequest.a aVarM47600q = C12749j.m47600q(new ImageRequest.a(imageView2.getContext()).m47525c(numValueOf), imageView2);
            aVarM47600q.m47540s(100, 100);
            interfaceC7479s.mo31067c(aVarM47600q.m47524b());
        } else {
            ImageView imageView3 = c1130d.f4652d;
            Intrinsics.checkNotNullExpressionValue(imageView3, "imageView");
            String remoteUrl = remote.getRemoteUrl();
            InterfaceC7479s interfaceC7479s2 = this.imageLoader;
            ImageRequest.a aVarM47600q2 = C12749j.m47600q(new ImageRequest.a(imageView3.getContext()).m47525c(remoteUrl), imageView3);
            C12748i.m47575c(aVarM47600q2, true);
            C12749j.m47587d(aVarM47600q2, 100);
            aVarM47600q2.m47540s(500, 500);
            interfaceC7479s2.mo31067c(aVarM47600q2.m47524b());
        }
        c1130d.f4654f.setVisibility(8);
        c1130d.f4655g.setVisibility(0);
        c1130d.f4651c.setText(remote.getFilename());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    @NotNull
    /* JADX INFO: renamed from: t */
    public RecyclerView.AbstractC1023f0 mo5488t(@NotNull ViewGroup parent, int viewType) {
        C5452i c5452iM25072b;
        C5452i c5452iM25072b2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(viewType, parent, false);
        if (viewType == C13913o2.f48653c) {
            C1128b c1128bM6435a = C1128b.m6435a(viewInflate);
            Intrinsics.checkNotNullExpressionValue(c1128bM6435a, "bind(...)");
            C7266j0 c7266j0 = new C7266j0(c1128bM6435a);
            C5467p0<C5452i> c5467p0M25106x = C5468q.m25106x(((C1128b) c7266j0.m30292N()).getRoot().getContext(), C13917p2.f48661a);
            if (c5467p0M25106x != null && (c5452iM25072b2 = c5467p0M25106x.m25072b()) != null) {
                ((C1128b) c7266j0.m30292N()).f4637b.setComposition(c5452iM25072b2);
            }
            InterfaceC10784a interfaceC10784aM30292N = c7266j0.m30292N();
            Intrinsics.checkNotNullExpressionValue(interfaceC10784aM30292N, "<get-binding>(...)");
            m16611E((C1128b) interfaceC10784aM30292N);
            return c7266j0;
        }
        if (viewType != C13913o2.f48654d) {
            throw new IllegalStateException(("Unknown view type " + viewType).toString());
        }
        C1130d c1130dM6440a = C1130d.m6440a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(c1130dM6440a, "bind(...)");
        C7266j0 c7266j1 = new C7266j0(c1130dM6440a);
        C5467p0<C5452i> c5467p0M25106x2 = C5468q.m25106x(((C1130d) c7266j1.m30292N()).getRoot().getContext(), C13917p2.f48662b);
        if (c5467p0M25106x2 != null && (c5452iM25072b = c5467p0M25106x2.m25072b()) != null) {
            ((C1130d) c7266j1.m30292N()).f4655g.setComposition(c5452iM25072b);
        }
        InterfaceC10784a interfaceC10784aM30292N2 = c7266j1.m30292N();
        Intrinsics.checkNotNullExpressionValue(interfaceC10784aM30292N2, "<get-binding>(...)");
        m16612F((C1130d) interfaceC10784aM30292N2);
        return c7266j1;
    }
}
