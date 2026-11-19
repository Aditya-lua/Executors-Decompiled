; mbedtls_entropy_add_source @ 00b76248
00b76248	ldrsw x9,[x0, #0x1c]
00b7624c	mov x8,x0
00b76250	cmp w9,#0x13
00b76254	b.le 0x00b76260
00b76258	mov w0,#0xffffffc2
00b7625c	ret
00b76260	mov w10,#0x28
00b76264	mov w0,wzr
00b76268	add w11,w9,#0x1
00b7626c	madd x9,x9,x10,x8
00b76270	stp x1,x2,[x9, #0x20]
00b76274	str x3,[x9, #0x38]
00b76278	str w4,[x9, #0x40]
00b7627c	str w11,[x8, #0x1c]
00b76280	ret
