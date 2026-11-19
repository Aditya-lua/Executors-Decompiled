; ENGINE_set_default_ciphers @ 00a53264
00a53264	str x19,[sp, #-0x20]!
00a53268	stp x29,x30,[sp, #0x10]
00a5326c	ldr x8,[x0, #0x38]
00a53270	add x29,sp,#0x10
00a53274	cbz x8,0x00a532bc
00a53278	add x2,sp,#0x8
00a5327c	mov x1,xzr
00a53280	mov w3,wzr
00a53284	mov x19,x0
00a53288	blr x8
00a5328c	cmp w0,#0x0
00a53290	b.le 0x00a532bc
00a53294	ldr x3,[sp, #0x8]
00a53298	mov w4,w0
00a5329c	adrp x0,0xd21000
00a532a0	adrp x1,0xa53000
00a532a4	add x0,x0,#0x9d8
00a532a8	add x1,x1,#0x1cc
00a532ac	mov w5,#0x1
00a532b0	mov x2,x19
00a532b4	bl 0x00c3bce0
00a532b8	b 0x00a532c0
00a532bc	mov w0,#0x1
00a532c0	ldp x29,x30,[sp, #0x10]
00a532c4	ldr x19,[sp], #0x20
00a532c8	ret
