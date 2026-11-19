; LZ4_setStreamDecode @ 008da350
008da350	sxtw x9,w2
008da354	mov x8,x0
008da358	str xzr,[x8, #0x10]
008da35c	add x10,x1,x9
008da360	str x9,[x0, #0x18]
008da364	stp xzr,x10,[x0]
008da368	mov w0,#0x1
008da36c	ret
