package kr;

import android.graphics.Typeface;
import android.os.Bundle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u00150\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lkr/a;", "", "Landroid/os/Bundle;", "outState", "", "e", "(Landroid/os/Bundle;)V", "inState", "b", "", "fontUrl", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onSuccess", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "Lkr/f;", "remoteFonts", "c", "(Ljava/util/List;)V", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "d", "()Ljava/util/Map;", "fontDownloaderMapping", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f22708a;

    /* JADX INFO: renamed from: kr.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkr/a$a;", "", "<init>", "()V", "Lkr/a;", "instance", "", "b", "(Lkr/a;)V", "Lkr/a;", "_instance", "a", "()Lkr/a;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f22708a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public static a _instance;

        @NotNull
        public final a a() {
            a aVar = _instance;
            Intrinsics.checkNotNull(aVar);
            return aVar;
        }

        public final void b(@NotNull a instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            _instance = instance;
        }
    }

    void a(@NotNull String fontUrl, @NotNull Function1<? super Typeface, Unit> onSuccess);

    void b(@Nullable Bundle inState);

    void c(@Nullable List<f> remoteFonts);

    @NotNull
    Map<String, Map<StyleElements.FontWeight, String>> d();

    void e(@NotNull Bundle outState);
}
