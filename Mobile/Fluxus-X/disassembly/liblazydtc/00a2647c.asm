; ECDSA_SIG_new @ 00a2647c
00a2647c	str x19,[sp, #-0x20]!
00a26480	adrp x1,0x2af000
00a26484	add x1,x1,#0xe09
00a26488	mov w0,#0x10
00a2648c	mov w2,#0x4b4
00a26490	stp x29,x30,[sp, #0x10]
00a26494	add x29,sp,#0x10
00a26498	bl 0x00c34250
00a2649c	mov x19,x0
00a264a0	cbnz x0,0x00a264d4
00a264a4	bl 0x00c342a0
00a264a8	adrp x0,0x2af000
00a264ac	adrp x2,0x2aa000
00a264b0	add x0,x0,#0xe09
00a264b4	add x2,x2,#0x42
00a264b8	mov w1,#0x4b6
00a264bc	bl 0x00c342b0
00a264c0	mov w1,#0x100
00a264c4	mov w0,#0x10
00a264c8	movk w1,#0xc, LSL #16
00a264cc	mov x2,xzr
00a264d0	bl 0x00c342c0
00a264d4	ldp x29,x30,[sp, #0x10]
00a264d8	mov x0,x19
00a264dc	ldr x19,[sp], #0x20
00a264e0	ret
