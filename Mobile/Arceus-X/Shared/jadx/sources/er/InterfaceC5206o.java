package er;

import android.text.Spanned;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: er.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Ler/o;", "", "b", "a", "Ler/o$a;", "Ler/o$b;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC5206o {

    /* JADX INFO: renamed from: er.o$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Ler/o$a;", "Ler/o;", "", "textBlocks", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Ler/o$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ListTextBlock implements InterfaceC5206o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<InterfaceC5206o> textBlocks;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends er.o> */
        /* JADX WARN: Multi-variable type inference failed */
        public ListTextBlock(@NotNull List<? extends InterfaceC5206o> textBlocks) {
            Intrinsics.checkNotNullParameter(textBlocks, "textBlocks");
            this.textBlocks = textBlocks;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ListTextBlock m24151a(@NotNull List<? extends InterfaceC5206o> textBlocks) {
            Intrinsics.checkNotNullParameter(textBlocks, "textBlocks");
            return new ListTextBlock(textBlocks);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<InterfaceC5206o> m24152b() {
            return this.textBlocks;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ListTextBlock) && Intrinsics.m31980c(this.textBlocks, ((ListTextBlock) other).textBlocks);
        }

        public int hashCode() {
            return this.textBlocks.hashCode();
        }

        @NotNull
        public String toString() {
            return "ListTextBlock(textBlocks=" + this.textBlocks + ")";
        }
    }

    /* JADX INFO: renamed from: er.o$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Ler/o$b;", "Ler/o;", "Landroid/text/Spanned;", "spanned", "<init>", "(Landroid/text/Spanned;)V", "a", "Landroid/text/Spanned;", "()Landroid/text/Spanned;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC5206o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Spanned spanned;

        public b(@NotNull Spanned spanned) {
            Intrinsics.checkNotNullParameter(spanned, "spanned");
            this.spanned = spanned;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Spanned getSpanned() {
            return this.spanned;
        }
    }
}
