; OSSL_STORE_SEARCH_by_name @ 00aeaafc
00aeaafc	str x19,[sp, #-0x20]!
00aeab00	adrp x1,0x2c2000
00aeab04	mov x19,x0
00aeab08	add x1,x1,#0x3bd
00aeab0c	orr w0,wzr,#0x30
00aeab10	mov w2,#0x355
00aeab14	stp x29,x30,[sp, #0x10]
00aeab18	add x29,sp,#0x10
00aeab1c	bl 0x00c34250
00aeab20	cbz x0,0x00aeab34
00aeab24	mov w8,#0x1
00aeab28	str w8,[x0]
00aeab2c	str x19,[x0, #0x8]
00aeab30	b 0x00aeab68
00aeab34	bl 0x00c342a0
00aeab38	adrp x0,0x2c2000
00aeab3c	adrp x2,0x2ac000
00aeab40	add x0,x0,#0x3bd
00aeab44	add x2,x2,#0x7e2
00aeab48	mov w1,#0x358
00aeab4c	bl 0x00c342b0
00aeab50	mov w1,#0x100
00aeab54	mov w0,#0x2c
00aeab58	movk w1,#0xc, LSL #16
00aeab5c	mov x2,xzr
00aeab60	bl 0x00c342c0
00aeab64	mov x0,xzr
00aeab68	ldp x29,x30,[sp, #0x10]
00aeab6c	ldr x19,[sp], #0x20
00aeab70	ret
