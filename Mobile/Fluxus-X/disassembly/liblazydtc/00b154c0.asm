; X509_NAME_ENTRY_set_object @ 00b154c0
00b154c0	stp x20,x19,[sp, #-0x20]!
00b154c4	stp x29,x30,[sp, #0x10]
00b154c8	add x29,sp,#0x10
00b154cc	cbz x0,0x00b154fc
00b154d0	mov x20,x1
00b154d4	cbz x1,0x00b154fc
00b154d8	mov x19,x0
00b154dc	ldr x0,[x0]
00b154e0	bl 0x00c37660
00b154e4	mov x0,x20
00b154e8	bl 0x00c37730
00b154ec	cmp x0,#0x0
00b154f0	str x0,[x19]
00b154f4	cset w0,ne
00b154f8	b 0x00b15530
00b154fc	bl 0x00c342a0
00b15500	adrp x0,0x2a0000
00b15504	adrp x2,0x2cc000
00b15508	add x0,x0,#0xe2d
00b1550c	add x2,x2,#0x2ed
00b15510	mov w1,#0x135
00b15514	bl 0x00c342b0
00b15518	mov w1,#0x102
00b1551c	mov w0,#0xb
00b15520	movk w1,#0xc, LSL #16
00b15524	mov x2,xzr
00b15528	bl 0x00c342c0
00b1552c	mov w0,wzr
00b15530	ldp x29,x30,[sp, #0x10]
00b15534	ldp x20,x19,[sp], #0x20
00b15538	ret
