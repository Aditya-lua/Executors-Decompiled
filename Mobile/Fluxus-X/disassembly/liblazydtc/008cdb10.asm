; LZ4_compressBound @ 008cdb10
008cdb10	mov w8,#0x7e000000
008cdb14	cmp w0,w8
008cdb18	b.ls 0x008cdb24
008cdb1c	mov w0,wzr
008cdb20	ret
008cdb24	mov w8,#0x8081
008cdb28	movk w8,#0x8080, LSL #16
008cdb2c	umull x8,w0,w8
008cdb30	lsr x8,x8,#0x27
008cdb34	add w8,w0,w8
008cdb38	add w0,w8,#0x10
008cdb3c	ret
