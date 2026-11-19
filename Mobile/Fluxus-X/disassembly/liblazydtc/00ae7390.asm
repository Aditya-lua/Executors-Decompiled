; SRP_user_pwd_set1_ids @ 00ae7390
00ae7390	stp x22,x21,[sp, #-0x30]!
00ae7394	stp x20,x19,[sp, #0x10]
00ae7398	stp x29,x30,[sp, #0x20]
00ae739c	mov x19,x0
00ae73a0	ldr x0,[x0]
00ae73a4	adrp x22,0x2ce000
00ae73a8	add x22,x22,#0x365
00ae73ac	mov x20,x2
00ae73b0	mov x21,x1
00ae73b4	mov w2,#0xd9
00ae73b8	mov x1,x22
00ae73bc	add x29,sp,#0x20
00ae73c0	bl 0x00c32310
00ae73c4	ldr x0,[x19, #0x28]
00ae73c8	mov w2,#0xda
00ae73cc	mov x1,x22
00ae73d0	bl 0x00c32310
00ae73d4	cbz x21,0x00ae73f4
00ae73d8	adrp x1,0x2ce000
00ae73dc	add x1,x1,#0x365
00ae73e0	mov w2,#0xdb
00ae73e4	mov x0,x21
00ae73e8	bl 0x00c34600
00ae73ec	str x0,[x19]
00ae73f0	cbz x0,0x00ae7420
00ae73f4	cbz x20,0x00ae741c
00ae73f8	adrp x1,0x2ce000
00ae73fc	add x1,x1,#0x365
00ae7400	mov w2,#0xdd
00ae7404	mov x0,x20
00ae7408	bl 0x00c34600
00ae740c	cmp x0,#0x0
00ae7410	str x0,[x19, #0x28]
00ae7414	cset w0,ne
00ae7418	b 0x00ae7420
00ae741c	mov w0,#0x1
00ae7420	ldp x29,x30,[sp, #0x20]
00ae7424	ldp x20,x19,[sp, #0x10]
00ae7428	ldp x22,x21,[sp], #0x30
00ae742c	ret
