package androidx.core.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class MimeTypeFilter {
    private MimeTypeFilter() {
    }

    private static boolean mimeTypeAgainstFilter(@NonNull String[] mimeTypeParts, @NonNull String[] filterParts) {
        if (filterParts.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (filterParts[0].isEmpty() || filterParts[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (mimeTypeParts.length != 2) {
            return false;
        }
        if ("*".equals(filterParts[0]) || filterParts[0].equals(mimeTypeParts[0])) {
            return "*".equals(filterParts[1]) || filterParts[1].equals(mimeTypeParts[1]);
        }
        return false;
    }

    public static boolean matches(@Nullable String mimeType, @NonNull String filter) {
        if (mimeType == null) {
            return false;
        }
        String[] mimeTypeParts = mimeType.split("/");
        String[] filterParts = filter.split("/");
        return mimeTypeAgainstFilter(mimeTypeParts, filterParts);
    }

    @Nullable
    public static String matches(@Nullable String mimeType, @NonNull String[] filters) {
        if (mimeType == null) {
            return null;
        }
        String[] mimeTypeParts = mimeType.split("/");
        for (String filter : filters) {
            String[] filterParts = filter.split("/");
            if (mimeTypeAgainstFilter(mimeTypeParts, filterParts)) {
                return filter;
            }
        }
        return null;
    }

    @Nullable
    public static String matches(@Nullable String[] mimeTypes, @NonNull String filter) {
        if (mimeTypes == null) {
            return null;
        }
        String[] filterParts = filter.split("/");
        for (String mimeType : mimeTypes) {
            String[] mimeTypeParts = mimeType.split("/");
            if (mimeTypeAgainstFilter(mimeTypeParts, filterParts)) {
                return mimeType;
            }
        }
        return null;
    }

    @NonNull
    public static String[] matchesMany(@Nullable String[] mimeTypes, @NonNull String filter) {
        if (mimeTypes == null) {
            return new String[0];
        }
        ArrayList<String> list = new ArrayList<>();
        String[] filterParts = filter.split("/");
        for (String mimeType : mimeTypes) {
            String[] mimeTypeParts = mimeType.split("/");
            if (mimeTypeAgainstFilter(mimeTypeParts, filterParts)) {
                list.add(mimeType);
            }
        }
        return (String[]) list.toArray(new String[list.size()]);
    }
}
