package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import kg.AbstractC7596l;
import kg.C7597m;
import kg.C7598n;
import kg.C7605u;

/* JADX INFO: loaded from: classes2.dex */
public final class Streams {
    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static AbstractC7596l parse(JsonReader jsonReader) {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read(jsonReader);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return C7598n.f29112a;
                    }
                    throw new C7605u(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
        } catch (MalformedJsonException e12) {
            throw new C7605u(e12);
        } catch (IOException e13) {
            throw new C7597m(e13);
        } catch (NumberFormatException e14) {
            throw new C7605u(e14);
        }
    }

    public static void write(AbstractC7596l abstractC7596l, JsonWriter jsonWriter) {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, abstractC7596l);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    public static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite = new CurrentWrite();

        public static class CurrentWrite implements CharSequence {
            private String cachedString;
            private char[] chars;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            private CurrentWrite() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.chars[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.chars.length;
            }

            public void setChars(char[] cArr) {
                this.chars = cArr;
                this.cachedString = null;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.chars, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.cachedString == null) {
                    this.cachedString = new String(this.chars);
                }
                return this.cachedString;
            }
        }

        public AppendableWriter(Appendable appendable) {
            this.appendable = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.currentWrite.setChars(cArr);
            this.appendable.append(this.currentWrite, i10, i11 + i10);
        }

        /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Ljava/lang/Appendable; */
        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.appendable.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.appendable.append((char) i10);
        }

        /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable; */
        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.appendable.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.appendable.append(str, i10, i11 + i10);
        }
    }
}
