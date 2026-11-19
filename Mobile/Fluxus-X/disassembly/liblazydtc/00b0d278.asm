; X509v3_get_ext_by_NID @ 00b0d278
00b0d278	stp x22,x21,[sp, #-0x30]!
00b0d27c	stp x20,x19,[sp, #0x10]
00b0d280	mov x20,x0
00b0d284	mov w0,w1
00b0d288	stp x29,x30,[sp, #0x20]
00b0d28c	add x29,sp,#0x20
00b0d290	mov w19,w2
00b0d294	bl 0x00c37740
00b0d298	cbz x0,0x00b0d2f0
00b0d29c	cbz x20,0x00b0d2e8
00b0d2a0	mov x21,x0
00b0d2a4	add w8,w19,#0x1
00b0d2a8	mov x0,x20
00b0d2ac	bic w19,w8,w8, ASR #0x1f
00b0d2b0	bl 0x00c325e0
00b0d2b4	cmp w19,w0
00b0d2b8	b.ge 0x00b0d2e8
00b0d2bc	mov w22,w0
00b0d2c0	mov x0,x20
00b0d2c4	mov w1,w19
00b0d2c8	bl 0x00c32610
00b0d2cc	ldr x0,[x0]
00b0d2d0	mov x1,x21
00b0d2d4	bl 0x00c37ab0
00b0d2d8	cbz w0,0x00b0d2f4
00b0d2dc	add w19,w19,#0x1
00b0d2e0	cmp w19,w22
00b0d2e4	b.lt 0x00b0d2c0
00b0d2e8	mov w19,#0xffffffff
00b0d2ec	b 0x00b0d2f4
00b0d2f0	orr w19,wzr,#0xfffffffe
00b0d2f4	mov w0,w19
00b0d2f8	ldp x29,x30,[sp, #0x20]
00b0d2fc	ldp x20,x19,[sp, #0x10]
00b0d300	ldp x22,x21,[sp], #0x30
00b0d304	ret
