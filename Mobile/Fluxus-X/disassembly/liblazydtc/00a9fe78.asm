; OSSL_PARAM_free @ 00a9fe78
00a9fe78	cbz x0,0x00a9fed8
00a9fe7c	str x19,[sp, #-0x20]!
00a9fe80	mov x19,x0
00a9fe84	sub x8,x0,#0x10
00a9fe88	stp x29,x30,[sp, #0x10]
00a9fe8c	add x29,sp,#0x10
00a9fe90	ldr x9,[x8, #0x10]
00a9fe94	add x8,x8,#0x28
00a9fe98	cbnz x9,0x00a9fe90
00a9fe9c	ldur w9,[x8, #-0x10]
00a9fea0	cmp w9,#0x7f
00a9fea4	b.ne 0x00a9febc
00a9fea8	ldp x0,x1,[x8, #-0x8]
00a9feac	adrp x2,0x2b2000
00a9feb0	add x2,x2,#0x53b
00a9feb4	mov w3,#0xe8
00a9feb8	bl 0x00c38e10
00a9febc	ldp x29,x30,[sp, #0x10]
00a9fec0	adrp x1,0x2b2000
00a9fec4	add x1,x1,#0x53b
00a9fec8	mov w2,#0xe9
00a9fecc	mov x0,x19
00a9fed0	ldr x19,[sp], #0x20
00a9fed4	b 0x00c32310
00a9fed8	ret
