; tls_construct_cert_status_body @ 009ebe7c
009ebe7c	stp x20,x19,[sp, #-0x20]!
009ebe80	stp x29,x30,[sp, #0x10]
009ebe84	ldrsw x8,[x0, #0xa60]
009ebe88	mov x19,x0
009ebe8c	mov x20,x1
009ebe90	mov w2,#0x1
009ebe94	mov x0,x1
009ebe98	mov x1,x8
009ebe9c	add x29,sp,#0x10
009ebea0	bl 0x00c343a0
009ebea4	cbz w0,0x009ebec8
009ebea8	ldr x1,[x19, #0xa88]
009ebeac	ldr x2,[x19, #0xa90]
009ebeb0	orr w3,wzr,#0x3
009ebeb4	mov x0,x20
009ebeb8	bl 0x00c36f70
009ebebc	cbz w0,0x009ebec8
009ebec0	mov w0,#0x1
009ebec4	b 0x009ebf00
009ebec8	bl 0x00c342a0
009ebecc	adrp x0,0x2bd000
009ebed0	adrp x2,0x2d5000
009ebed4	add x0,x0,#0x74c
009ebed8	add x2,x2,#0xa76
009ebedc	mov w1,#0xfcb
009ebee0	bl 0x00c342b0
009ebee4	mov w2,#0x103
009ebee8	mov w1,#0x50
009ebeec	movk w2,#0xc, LSL #16
009ebef0	mov x0,x19
009ebef4	mov x3,xzr
009ebef8	bl 0x00c34410
009ebefc	mov w0,wzr
009ebf00	ldp x29,x30,[sp, #0x10]
009ebf04	ldp x20,x19,[sp], #0x20
009ebf08	ret
