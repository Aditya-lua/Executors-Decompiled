package com.google.gson.internal.bind;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kg.AbstractC7596l;
import kg.C7593i;
import kg.C7598n;
import kg.C7599o;
import kg.C7602r;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonTreeWriter extends JsonWriter {
    private String pendingName;
    private AbstractC7596l product;
    private final List<AbstractC7596l> stack;
    private static final Writer UNWRITABLE_WRITER = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };
    private static final C7602r SENTINEL_CLOSED = new C7602r("closed");

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
        this.stack = new ArrayList();
        this.product = C7598n.f29112a;
    }

    private AbstractC7596l peek() {
        List<AbstractC7596l> list = this.stack;
        return list.get(list.size() - 1);
    }

    private void put(AbstractC7596l abstractC7596l) {
        if (this.pendingName != null) {
            if (!abstractC7596l.m31460p() || getSerializeNulls()) {
                ((C7599o) peek()).m31474x(this.pendingName, abstractC7596l);
            }
            this.pendingName = null;
            return;
        }
        if (this.stack.isEmpty()) {
            this.product = abstractC7596l;
            return;
        }
        AbstractC7596l abstractC7596lPeek = peek();
        if (!(abstractC7596lPeek instanceof C7593i)) {
            throw new IllegalStateException();
        }
        ((C7593i) abstractC7596lPeek).m31453y(abstractC7596l);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() {
        C7593i c7593i = new C7593i();
        put(c7593i);
        this.stack.add(c7593i);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() {
        C7599o c7599o = new C7599o();
        put(c7599o);
        this.stack.add(c7599o);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.stack.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.stack.add(SENTINEL_CLOSED);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        if (!(peek() instanceof C7593i)) {
            throw new IllegalStateException();
        }
        List<AbstractC7596l> list = this.stack;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        }
        if (!(peek() instanceof C7599o)) {
            throw new IllegalStateException();
        }
        List<AbstractC7596l> list = this.stack;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() {
    }

    public AbstractC7596l get() {
        if (this.stack.isEmpty()) {
            return this.product;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.stack);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(peek() instanceof C7599o)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.pendingName = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() {
        put(C7598n.f29112a);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        put(new C7602r(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) {
        put(new C7602r(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        put(new C7602r(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f10) {
        if (!isLenient() && (Float.isNaN(f10) || Float.isInfinite(f10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f10);
        }
        put(new C7602r(Float.valueOf(f10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        put(new C7602r(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) {
        put(new C7602r(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        put(new C7602r(number));
        return this;
    }
}
