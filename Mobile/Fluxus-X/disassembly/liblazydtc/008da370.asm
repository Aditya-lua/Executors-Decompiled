; LZ4_decoderRingBufferSize @ 008da370
008da370	mov w8,#0x10
008da374	cmp w0,#0x10
008da378	mov w9,#0x7e000000
008da37c	csel w8,w0,w8,hi
008da380	cmp w0,w9
008da384	add w8,w8,#0x10, LSL #12
008da388	add w8,w8,#0xe
008da38c	csel w0,wzr,w8,hi
008da390	ret
