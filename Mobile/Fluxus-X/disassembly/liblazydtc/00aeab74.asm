; OSSL_STORE_SEARCH_by_issuer_serial @ 00aeab74
00aeab74	stp x20,x19,[sp, #-0x20]!
00aeab78	mov x19,x1
00aeab7c	adrp x1,0x2c2000
00aeab80	mov x20,x0
00aeab84	add x1,x1,#0x3bd
00aeab88	orr w0,wzr,#0x30
00aeab8c	mov w2,#0x364
00aeab90	stp x29,x30,[sp, #0x10]
00aeab94	add x29,sp,#0x10
00aeab98	bl 0x00c34250
00aeab9c	cbz x0,0x00aeabb0
00aeaba0	mov w8,#0x2
00aeaba4	str w8,[x0]
00aeaba8	stp x20,x19,[x0, #0x8]
00aeabac	b 0x00aeabe4
00aeabb0	bl 0x00c342a0
00aeabb4	adrp x0,0x2c2000
00aeabb8	adrp x2,0x2d2000
00aeabbc	add x0,x0,#0x3bd
00aeabc0	add x2,x2,#0x333
00aeabc4	mov w1,#0x367
00aeabc8	bl 0x00c342b0
00aeabcc	mov w1,#0x100
00aeabd0	mov w0,#0x2c
00aeabd4	movk w1,#0xc, LSL #16
00aeabd8	mov x2,xzr
00aeabdc	bl 0x00c342c0
00aeabe0	mov x0,xzr
00aeabe4	ldp x29,x30,[sp, #0x10]
00aeabe8	ldp x20,x19,[sp], #0x20
00aeabec	ret
