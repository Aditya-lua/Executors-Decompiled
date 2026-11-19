; LZ4_compress_continue @ 008dd680
008dd680	mov w8,#0x7e000000
008dd684	cmp w3,w8
008dd688	b.ls 0x008dd698
008dd68c	mov w4,wzr
008dd690	mov w5,#0x1
008dd694	b 0x00c309e0
008dd698	mov w8,#0x8081
008dd69c	mov w5,#0x1
008dd6a0	movk w8,#0x8080, LSL #16
008dd6a4	umull x8,w3,w8
008dd6a8	lsr x8,x8,#0x27
008dd6ac	add w8,w3,w8
008dd6b0	add w4,w8,#0x10
008dd6b4	b 0x00c309e0
