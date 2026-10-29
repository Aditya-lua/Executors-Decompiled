package com.appsflyer.sdk_base.util;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;", "", "isOptionalFeaturePresent", "", "feature", "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;", "Companion", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OptionalFeaturesValidator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;", "", "<init>", "()V", "registeredFeatures", "", "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;", "addOptionalFeature", "", "feature", "getRegisteredFeatures", "", "clearRegisteredFeatures", "", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Set<SupportedOptionalFeatures> registeredFeatures = new LinkedHashSet();

        private Companion() {
        }

        public final boolean addOptionalFeature(@NotNull SupportedOptionalFeatures feature) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            return registeredFeatures.add(feature);
        }

        public final void clearRegisteredFeatures() {
            registeredFeatures.clear();
        }

        @NotNull
        public final Set<SupportedOptionalFeatures> getRegisteredFeatures() {
            return registeredFeatures;
        }
    }

    static boolean addOptionalFeature(@NotNull SupportedOptionalFeatures supportedOptionalFeatures) {
        return INSTANCE.addOptionalFeature(supportedOptionalFeatures);
    }

    static void clearRegisteredFeatures() {
        INSTANCE.clearRegisteredFeatures();
    }

    @NotNull
    static Set<SupportedOptionalFeatures> getRegisteredFeatures() {
        return INSTANCE.getRegisteredFeatures();
    }

    boolean isOptionalFeaturePresent(@NotNull SupportedOptionalFeatures feature);
}
