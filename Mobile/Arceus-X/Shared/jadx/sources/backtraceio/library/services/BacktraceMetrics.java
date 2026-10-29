package backtraceio.library.services;

import android.content.Context;
import backtraceio.library.common.ApplicationMetadataCache;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.common.serialization.DebugHelper;
import backtraceio.library.events.EventsOnServerResponseEventListener;
import backtraceio.library.events.EventsRequestHandler;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Metrics;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceMetricsSettings;
import backtraceio.library.models.attributes.ReportDataBuilder;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.metrics.SummedEvent;
import backtraceio.library.models.metrics.UniqueEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.jetbrains.annotations.NotNull;
import p210j6.C7033b;

/* JADX INFO: loaded from: classes.dex */
public final class BacktraceMetrics implements Metrics {
    private static final transient String LOG_TAG = "BacktraceMetrics";
    public static final String defaultBaseUrl = "https://events.backtrace.io/api";
    public static final int defaultTimeBetweenRetriesMs = 10000;
    public static final int defaultTimeIntervalInMin = 30;
    public static final long defaultTimeIntervalMs = 1800000;
    public static final int maxNumberOfAttempts = 3;
    public static final int maxTimeBetweenRetriesMs = 300000;
    private String applicationName;
    private String applicationVersion;
    private final Api backtraceApi;
    private final Context context;
    private final C7033b credentials;
    Map<String, Object> customReportAttributes;
    private boolean enabled;
    public SummedEventsHandler summedEventsHandler;
    public UniqueEventsHandler uniqueEventsHandler;
    public final String defaultUniqueEventName = "guid";
    private final String startupSummedEventName = "Application Launches";
    BacktraceMetricsSettings settings = null;
    private String startupUniqueEventName = "guid";
    private int maximumNumberOfEvents = 350;

    public BacktraceMetrics(Context context, @NotNull Map<String, Object> map, Api api, C7033b c7033b) {
        this.context = context;
        this.customReportAttributes = map;
        this.backtraceApi = api;
        this.credentials = c7033b;
    }

    private Map<String, String> getClientMetricsAttributes() {
        return ReportDataBuilder.getReportAttributes(this.customReportAttributes, true).getAttributes();
    }

    private boolean shouldProcessEvent(String str) {
        if (BacktraceStringHelper.isNullOrEmpty(str)) {
            BacktraceLogger.m7081e(LOG_TAG, "Cannot process event, attribute name is null or empty");
            return false;
        }
        if (this.maximumNumberOfEvents <= 0 || count() + 1 <= this.maximumNumberOfEvents) {
            return true;
        }
        BacktraceLogger.m7081e(LOG_TAG, "Cannot process event, reached maximum number of events: " + this.maximumNumberOfEvents + " events count: " + count());
        return false;
    }

    private void startMetricsEventHandlers(Api api) {
        verifyIfMetricsAvailable();
        this.uniqueEventsHandler = api.enableUniqueEvents(this);
        this.summedEventsHandler = api.enableSummedEvents(this);
    }

    private void verifyIfMetricsAvailable() {
        if (!this.enabled) {
            throw new IllegalArgumentException("Metrics are not available!");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.Metrics
    public boolean addSummedEvent(String str) {
        return addSummedEvent(str, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.Metrics
    public boolean addUniqueEvent(String str) {
        return addUniqueEvent(str, null);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public int count() {
        return getUniqueEvents().size() + getSummedEvents().size();
    }

    public Map<String, String> createLocalAttributes(Map<String, String> map) {
        Map<String, String> map2 = new BacktraceAttributes(this.context, null, null, Boolean.TRUE).attributes;
        map2.putAll(getClientMetricsAttributes());
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        return map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.Metrics
    public void enable() {
        enable(new BacktraceMetricsSettings(this.credentials), "guid");
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public String getBaseUrl() {
        return this.settings.getBaseUrl();
    }

    public Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.concurrent.ConcurrentLinkedDeque<T extends backtraceio.library.models.metrics.Event>, java.util.concurrent.ConcurrentLinkedDeque<backtraceio.library.models.metrics.SummedEvent> */
    @Override // backtraceio.library.interfaces.Metrics
    public ConcurrentLinkedDeque<SummedEvent> getSummedEvents() {
        return this.summedEventsHandler.events;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.concurrent.ConcurrentLinkedDeque<T extends backtraceio.library.models.metrics.Event>, java.util.concurrent.ConcurrentLinkedDeque<backtraceio.library.models.metrics.UniqueEvent> */
    @Override // backtraceio.library.interfaces.Metrics
    public ConcurrentLinkedDeque<UniqueEvent> getUniqueEvents() {
        return this.uniqueEventsHandler.events;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void send() {
        verifyIfMetricsAvailable();
        this.uniqueEventsHandler.send();
        this.summedEventsHandler.send();
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void sendStartupEvent() {
        verifyIfMetricsAvailable();
        addUniqueEvent(this.startupUniqueEventName);
        addSummedEvent("Application Launches");
        this.uniqueEventsHandler.send();
        this.summedEventsHandler.send();
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setMaximumNumberOfEvents(int i10) {
        this.maximumNumberOfEvents = i10;
        this.uniqueEventsHandler.setMaximumNumberOfEvents(i10);
        this.summedEventsHandler.setMaximumNumberOfEvents(i10);
    }

    public void setStartupUniqueEventName(String str) {
        this.startupUniqueEventName = str;
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setSummedEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.backtraceApi.setSummedEventsOnServerResponse(eventsOnServerResponseEventListener);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setSummedEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.backtraceApi.setSummedEventsRequestHandler(eventsRequestHandler);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setUniqueEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.backtraceApi.setUniqueEventsOnServerResponse(eventsOnServerResponseEventListener);
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void setUniqueEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.backtraceApi.setUniqueEventsRequestHandler(eventsRequestHandler);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // backtraceio.library.interfaces.Metrics
    public boolean addSummedEvent(String str, Map<String, Object> map) {
        verifyIfMetricsAvailable();
        if (!shouldProcessEvent(str)) {
            BacktraceLogger.m7083w(LOG_TAG, "Skipping report");
            return false;
        }
        Map<String, String> attributes = ReportDataBuilder.getReportAttributes(map, true).getAttributes();
        SummedEvent summedEvent = new SummedEvent(str);
        summedEvent.addAttributes(attributes);
        this.summedEventsHandler.events.addLast(summedEvent);
        if (count() == this.maximumNumberOfEvents) {
            this.uniqueEventsHandler.send();
            this.summedEventsHandler.send();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // backtraceio.library.interfaces.Metrics
    public boolean addUniqueEvent(String str, Map<String, Object> map) {
        verifyIfMetricsAvailable();
        if (!shouldProcessEvent(str)) {
            BacktraceLogger.m7083w(LOG_TAG, "Skipping report");
            return false;
        }
        Map<String, String> mapCreateLocalAttributes = createLocalAttributes(ReportDataBuilder.getReportAttributes(map, true).getAttributes());
        if (!BacktraceStringHelper.isObjectNotNullOrNotEmptyString(mapCreateLocalAttributes.get(str))) {
            BacktraceLogger.m7083w(LOG_TAG, "Attribute name for Unique Event is not available in attribute scope");
            return false;
        }
        Iterator it = this.uniqueEventsHandler.events.iterator();
        while (it.hasNext()) {
            if (((UniqueEvent) it.next()).getName().equals(str)) {
                BacktraceLogger.m7083w(LOG_TAG, "Already defined unique event with this attribute name, skipping");
                return false;
            }
        }
        this.uniqueEventsHandler.events.addLast(new UniqueEvent(str, BacktraceTimeHelper.getTimestampSeconds(), mapCreateLocalAttributes));
        if (count() == this.maximumNumberOfEvents) {
            this.uniqueEventsHandler.send();
            this.summedEventsHandler.send();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // backtraceio.library.interfaces.Metrics
    public void enable(String str) {
        enable(new BacktraceMetricsSettings(this.credentials, str));
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void enable(BacktraceMetricsSettings backtraceMetricsSettings) {
        enable(backtraceMetricsSettings, "guid");
    }

    @Override // backtraceio.library.interfaces.Metrics
    public void enable(BacktraceMetricsSettings backtraceMetricsSettings, String str) {
        if (!this.enabled) {
            if (backtraceMetricsSettings.isBacktraceServer()) {
                if (str != null && str.length() != 0) {
                    ApplicationMetadataCache applicationMetadataCache = ApplicationMetadataCache.getInstance(getContext());
                    this.applicationName = applicationMetadataCache.getApplicationName();
                    this.applicationVersion = applicationMetadataCache.getApplicationVersion();
                    long currentTimeMillis = DebugHelper.getCurrentTimeMillis();
                    setStartupUniqueEventName(str);
                    this.settings = backtraceMetricsSettings;
                    this.enabled = true;
                    try {
                        startMetricsEventHandlers(this.backtraceApi);
                        sendStartupEvent();
                        BacktraceLogger.m7080d(LOG_TAG, "Metrics enabled");
                    } catch (Exception e10) {
                        BacktraceLogger.m7081e(LOG_TAG, "Could not enable metrics, exception " + e10.getMessage());
                    }
                    long currentTimeMillis2 = DebugHelper.getCurrentTimeMillis();
                    BacktraceLogger.m7080d(LOG_TAG, "Setup metrics integration took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
                    return;
                }
                throw new IllegalArgumentException("Unique event name must be defined!");
            }
            throw new IllegalArgumentException("Unsupported metrics server");
        }
        throw new IllegalStateException("Metrics already enabled");
    }
}
