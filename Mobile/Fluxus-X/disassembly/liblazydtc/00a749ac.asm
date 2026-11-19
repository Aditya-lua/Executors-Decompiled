; EVP_PKEY_fromdata_init @ 00a749ac
00a749ac	str x19,[sp, #-0x20]!
00a749b0	stp x29,x30,[sp, #0x10]
00a749b4	add x29,sp,#0x10
00a749b8	cbz x0,0x00a749ec
00a749bc	ldr x8,[x0, #0x18]
00a749c0	mov x19,x0
00a749c4	cbz x8,0x00a749e8
00a749c8	mov x0,x19
00a749cc	bl 0x00c3bfb0
00a749d0	ldr x8,[x19, #0x20]
00a749d4	cbz x8,0x00a749e8
00a749d8	mov w8,#0x8
00a749dc	str w8,[x19]
00a749e0	mov w0,#0x1
00a749e4	b 0x00a74a1c
00a749e8	str wzr,[x19]
00a749ec	bl 0x00c342a0
00a749f0	adrp x0,0x2d9000
00a749f4	adrp x2,0x2a2000
00a749f8	add x0,x0,#0xd3a
00a749fc	add x2,x2,#0x47f
00a74a00	mov w1,#0x162
00a74a04	bl 0x00c342b0
00a74a08	orr w0,wzr,#0x6
00a74a0c	mov w1,#0x96
00a74a10	mov x2,xzr
00a74a14	bl 0x00c342c0
00a74a18	orr w0,wzr,#0xfffffffe
00a74a1c	ldp x29,x30,[sp, #0x10]
00a74a20	ldr x19,[sp], #0x20
00a74a24	ret
