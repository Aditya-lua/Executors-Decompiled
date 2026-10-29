package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import f7.p0;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jq.k0;
import jr.h0;
import jt.l;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.j0;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ut.k;
import x6.ImageRequest;
import zn.o2;
import zn.p2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\b2\u0006\u0010'\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010;\u001a\n 9*\u0004\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020#0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", "context", "Lk6/s;", "imageLoader", "Lkotlin/Function0;", "", "onClickAddButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Landroid/content/Context;Lk6/s;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "", "position", "g", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "holder", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "e", "()I", "", "addButtonEnabled", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "K", "(ZLjava/util/List;)V", "Lcom/withpersona/sdk2/inquiry/document/f$a;", "G", "(ZLjava/util/List;)Ljava/util/List;", "Lao/d;", "binding", "F", "(Lao/d;)V", "Lao/b;", "E", "(Lao/b;)V", "d", "Lk6/s;", "getImageLoader", "()Lk6/s;", "Lkotlin/jvm/functions/Function0;", "getOnClickAddButton", "()Lkotlin/jvm/functions/Function0;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "inflater", "h", "Ljava/util/List;", "items", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "getRemoveDocument", "()Lkotlin/jvm/functions/Function1;", "J", "(Lkotlin/jvm/functions/Function1;)V", "removeDocument", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onClickAddButton;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final StepStyles.DocumentStepStyle styles;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final LayoutInflater inflater;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends a> items;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super DocumentFile, Unit> removeDocument;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/f$a$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0175a extends a {
            public C0175a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "Lcom/withpersona/sdk2/inquiry/document/f$a;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "a", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "document", "b", "Lcom/withpersona/sdk2/inquiry/document/f$a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class b extends a {

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.f$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "document", "", "mimeType", "<init>", "(Ljava/io/File;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "c", "()Ljava/io/File;", "b", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Ljava/lang/String;", "getMimeType", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Local extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final File file;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @NotNull
                public final DocumentFile.Local document;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
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

                @Override // com.withpersona.sdk2.inquiry.document.f.a.b
                @NotNull
                /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
                public DocumentFile.Local a() {
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
                    return Intrinsics.c(this.file, local.file) && Intrinsics.c(this.document, local.document) && Intrinsics.c(this.mimeType, local.mimeType);
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
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/f$a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/f$a$b;", "", "remoteUrl", "filename", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "d", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Remote extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String remoteUrl;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final String filename;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final DocumentFile.Remote document;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
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

                @Override // com.withpersona.sdk2.inquiry.document.f.a.b
                @NotNull
                /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
                public DocumentFile.Remote a() {
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
                    return Intrinsics.c(this.remoteUrl, remote.remoteUrl) && Intrinsics.c(this.filename, remote.filename) && Intrinsics.c(this.document, remote.document) && Intrinsics.c(this.mimeType, remote.mimeType);
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

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public abstract DocumentFile a();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"com/withpersona/sdk2/inquiry/document/f$b", "Landroidx/recyclerview/widget/g$b;", "", "e", "()I", "d", "oldItemPosition", "newItemPosition", "", "b", "(II)Z", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends androidx.recyclerview.widget.g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<a> f10196a;
        public final /* synthetic */ List<a> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends a> list, List<? extends a> list2) {
            this.f10196a = list;
            this.b = list2;
        }

        @Override // androidx.recyclerview.widget.g.b
        public boolean a(int oldItemPosition, int newItemPosition) {
            boolean zC;
            a aVar = this.f10196a.get(oldItemPosition);
            a aVar2 = this.b.get(newItemPosition);
            if (!b(oldItemPosition, newItemPosition)) {
                return false;
            }
            if (aVar instanceof a.C0175a) {
                zC = Intrinsics.c(aVar, aVar2);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new l();
                }
                zC = true;
            }
            return zC;
        }

        @Override // androidx.recyclerview.widget.g.b
        public boolean b(int oldItemPosition, int newItemPosition) {
            a aVar = this.f10196a.get(oldItemPosition);
            a aVar2 = this.b.get(newItemPosition);
            if (aVar.getClass() != aVar2.getClass()) {
                return false;
            }
            if (aVar instanceof a.C0175a) {
                return true;
            }
            if (aVar instanceof a.b.Local) {
                String absolutePath = ((a.b.Local) aVar).getFile().getAbsolutePath();
                Intrinsics.d(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Local");
                return Intrinsics.c(absolutePath, ((a.b.Local) aVar2).getFile().getAbsolutePath());
            }
            if (!(aVar instanceof a.b.Remote)) {
                throw new l();
            }
            String remoteUrl = ((a.b.Remote) aVar).getRemoteUrl();
            Intrinsics.d(aVar2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Remote");
            return Intrinsics.c(remoteUrl, ((a.b.Remote) aVar2).getRemoteUrl());
        }

        @Override // androidx.recyclerview.widget.g.b
        public int d() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.g.b
        public int e() {
            return this.f10196a.size();
        }
    }

    public f(@NotNull Context context, @NotNull s imageLoader, @NotNull Function0<Unit> onClickAddButton, @Nullable StepStyles.DocumentStepStyle documentStepStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onClickAddButton, "onClickAddButton");
        this.imageLoader = imageLoader;
        this.onClickAddButton = onClickAddButton;
        this.styles = documentStepStyle;
        this.inflater = LayoutInflater.from(context);
        this.items = p.k();
    }

    public static final void H(f fVar, View view) {
        fVar.onClickAddButton.invoke();
    }

    public static final void I(f fVar, a aVar, View view) {
        Function1<? super DocumentFile, Unit> function1 = fVar.removeDocument;
        if (function1 != null) {
            function1.invoke(((a.b) aVar).a());
        }
    }

    public final void E(ao.b binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Double imagePreviewBorderRadius = documentStepStyle.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.f3550c.setRadius((float) jq.j.a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.f3550c.setStrokeWidth((int) Math.ceil(jq.j.a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.f3550c.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.b.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView addButton = binding.b;
        Intrinsics.checkNotNullExpressionValue(addButton, "addButton");
        jr.g.m(addButton, this.styles.getImagePreviewPlusIconStrokeColor(), this.styles.getImagePreviewPlusIconFillColor(), null, null, new String[]{"#FFFFFF"}, new String[]{"#5B3FD3"}, null, new String[0], 68, null);
    }

    public final void F(ao.d binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
        if (strokeColorValue != null) {
            binding.f3564f.setIndicatorColor(strokeColorValue.intValue());
        }
        Integer fillColorValue = this.styles.getFillColorValue();
        if (fillColorValue != null) {
            binding.f3564f.setTrackColor(fillColorValue.intValue());
        }
        Integer imagePreviewCropAreaFillColor = this.styles.getImagePreviewCropAreaFillColor();
        if (imagePreviewCropAreaFillColor != null) {
            binding.f3562d.setBackgroundColor(imagePreviewCropAreaFillColor.intValue());
        }
        Double imagePreviewBorderRadius = this.styles.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.b.setRadius((float) jq.j.a(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.b.setStrokeWidth((int) Math.ceil(jq.j.a(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.b.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        TextBasedComponentStyle imageNameStyleValue = this.styles.getImageNameStyleValue();
        if (imageNameStyleValue != null) {
            TextView filenameView = binding.f3561c;
            Intrinsics.checkNotNullExpressionValue(filenameView, "filenameView");
            h0.l(filenameView, imageNameStyleValue, null, 2, null);
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.f3563e.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView removeButton = binding.f3565g;
        Intrinsics.checkNotNullExpressionValue(removeButton, "removeButton");
        jr.g.m(removeButton, this.styles.getImagePreviewXIconStrokeColor(), this.styles.getImagePreviewXIconFillColor(), null, null, new String[]{"#6B6D82"}, new String[]{"#FFFFFF"}, null, new String[0], 68, null);
    }

    public final List<a> G(boolean addButtonEnabled, List<? extends DocumentFile> documents) {
        a.b remote;
        ArrayList arrayList = new ArrayList();
        for (DocumentFile documentFile : documents) {
            if (documentFile instanceof DocumentFile.Local) {
                DocumentFile.Local local = (DocumentFile.Local) documentFile;
                File file = new File(local.getAbsoluteFilePath());
                remote = new a.b.Local(file, local, MimeTypeMap.getSingleton().getMimeTypeFromExtension(k.p(file)));
            } else {
                if (!(documentFile instanceof DocumentFile.Remote)) {
                    throw new l();
                }
                DocumentFile.Remote remote2 = (DocumentFile.Remote) documentFile;
                remote = new a.b.Remote(remote2.getRemoteUrl(), remote2.getFilename(), remote2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(remote2.getRemoteUrl())));
            }
            arrayList.add(remote);
        }
        if (addButtonEnabled) {
            arrayList.add(new a.C0175a());
        }
        return arrayList;
    }

    public final void J(@Nullable Function1<? super DocumentFile, Unit> function1) {
        this.removeDocument = function1;
    }

    public final void K(boolean addButtonEnabled, @NotNull List<? extends DocumentFile> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        List<a> listG = G(addButtonEnabled, documents);
        List<? extends a> list = this.items;
        androidx.recyclerview.widget.g.e eVarB = androidx.recyclerview.widget.g.b(new b(list, listG));
        Intrinsics.checkNotNullExpressionValue(eVarB, "calculateDiff(...)");
        this.items = listG;
        eVarB.b(this);
        List<? extends a> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(obj, (a) obj);
        }
        for (IndexedValue indexedValue : CollectionsKt.S0(listG)) {
            int index = indexedValue.getIndex();
            a aVar = (a) indexedValue.b();
            a aVar2 = (a) linkedHashMap.get(aVar);
            if ((aVar2 instanceof a.b.Local) && (aVar instanceof a.b.Local)) {
                a.b.Local local = (a.b.Local) aVar;
                if (((a.b.Local) aVar2).a().getUploadProgress() != local.a().getUploadProgress()) {
                    if (local.a().getUploadProgress() == 100) {
                        k(index);
                    } else {
                        l(index, Unit.f22483a);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int position) {
        a aVar = this.items.get(position);
        if (aVar instanceof a.C0175a) {
            return o2.f37795c;
        }
        if (aVar instanceof a.b) {
            return o2.f37796d;
        }
        throw new l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void r(@NotNull RecyclerView.f0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final a aVar = this.items.get(position);
        if (aVar instanceof a.C0175a) {
            ((ao.b) k0.a(holder)).b.setOnClickListener(new View.OnClickListener() { // from class: zn.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.withpersona.sdk2.inquiry.document.f.H(this.f37792a, view);
                }
            });
            return;
        }
        if (!(aVar instanceof a.b)) {
            throw new l();
        }
        ao.d dVar = (ao.d) k0.a(holder);
        dVar.f3565g.setOnClickListener(new View.OnClickListener() { // from class: zn.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.document.f.I(this.f37798a, aVar, view);
            }
        });
        ImageView imageView = dVar.f3562d;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        e7.c.a(imageView);
        dVar.f3562d.setImageDrawable(null);
        a.b bVar = (a.b) aVar;
        if (bVar instanceof a.b.Local) {
            a.b.Local local = (a.b.Local) aVar;
            dVar.f3562d.setVisibility(local.a().getUploadProgress() < 100 ? 4 : 0);
            dVar.f3565g.setVisibility(8);
            dVar.f3561c.setText(local.getFile().getName());
            dVar.f3564f.setVisibility(local.a().getUploadProgress() < 100 ? 0 : 8);
            dVar.f3564f.setProgress(local.a().getUploadProgress());
            return;
        }
        if (!(bVar instanceof a.b.Remote)) {
            throw new l();
        }
        dVar.f3562d.setVisibility(0);
        a.b.Remote remote = (a.b.Remote) aVar;
        if (Intrinsics.c(remote.getMimeType(), "application/pdf")) {
            ImageView imageView2 = dVar.f3562d;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            Integer numValueOf = Integer.valueOf(jq.s.f21644m);
            s sVar = this.imageLoader;
            ImageRequest.a aVarQ = x6.j.q(new ImageRequest.a(imageView2.getContext()).c(numValueOf), imageView2);
            aVarQ.s(100, 100);
            sVar.c(aVarQ.b());
        } else {
            ImageView imageView3 = dVar.f3562d;
            Intrinsics.checkNotNullExpressionValue(imageView3, "imageView");
            String remoteUrl = remote.getRemoteUrl();
            s sVar2 = this.imageLoader;
            ImageRequest.a aVarQ2 = x6.j.q(new ImageRequest.a(imageView3.getContext()).c(remoteUrl), imageView3);
            x6.i.c(aVarQ2, true);
            x6.j.d(aVarQ2, 100);
            aVarQ2.s(500, 500);
            sVar2.c(aVarQ2.b());
        }
        dVar.f3564f.setVisibility(8);
        dVar.f3565g.setVisibility(0);
        dVar.f3561c.setText(remote.getFilename());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.f0 t(@NotNull ViewGroup parent, int viewType) {
        f7.i iVarB;
        f7.i iVarB2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(viewType, parent, false);
        if (viewType == o2.f37795c) {
            ao.b bVarA = ao.b.a(viewInflate);
            Intrinsics.checkNotNullExpressionValue(bVarA, "bind(...)");
            jq.j0 j0Var = new jq.j0(bVarA);
            p0<f7.i> p0VarX = f7.q.x(((ao.b) j0Var.N()).getRoot().getContext(), p2.f37801a);
            if (p0VarX != null && (iVarB2 = p0VarX.b()) != null) {
                ((ao.b) j0Var.N()).b.setComposition(iVarB2);
            }
            r5.a aVarN = j0Var.N();
            Intrinsics.checkNotNullExpressionValue(aVarN, "<get-binding>(...)");
            E((ao.b) aVarN);
            return j0Var;
        }
        if (viewType != o2.f37796d) {
            throw new IllegalStateException(("Unknown view type " + viewType).toString());
        }
        ao.d dVarA = ao.d.a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(dVarA, "bind(...)");
        jq.j0 j0Var2 = new jq.j0(dVarA);
        p0<f7.i> p0VarX2 = f7.q.x(((ao.d) j0Var2.N()).getRoot().getContext(), p2.b);
        if (p0VarX2 != null && (iVarB = p0VarX2.b()) != null) {
            ((ao.d) j0Var2.N()).f3565g.setComposition(iVarB);
        }
        r5.a aVarN2 = j0Var2.N();
        Intrinsics.checkNotNullExpressionValue(aVarN2, "<get-binding>(...)");
        F((ao.d) aVarN2);
        return j0Var2;
    }
}
