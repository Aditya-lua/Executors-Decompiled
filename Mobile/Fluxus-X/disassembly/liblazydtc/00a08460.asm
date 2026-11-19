; BN_mod_inverse @ 00a08460
00a08460	sub sp,sp,#0x40
00a08464	stp x22,x21,[sp, #0x10]
00a08468	stp x20,x19,[sp, #0x20]
00a0846c	mov x20,x2
00a08470	mov x21,x1
00a08474	mov x22,x0
00a08478	mov x19,xzr
00a0847c	stp x29,x30,[sp, #0x30]
00a08480	add x29,sp,#0x30
00a08484	str wzr,[sp, #0xc]
00a08488	cbnz x3,0x00a084a0
00a0848c	mov x0,xzr
00a08490	bl 0x00c38a60
00a08494	mov x3,x0
00a08498	mov x19,x0
00a0849c	cbz x0,0x00a0850c
00a084a0	add x4,sp,#0xc
00a084a4	mov x0,x22
00a084a8	mov x1,x21
00a084ac	mov x2,x20
00a084b0	bl 0x00a07bbc
00a084b4	ldr w8,[sp, #0xc]
00a084b8	mov x20,x0
00a084bc	cbz w8,0x00a084ec
00a084c0	bl 0x00c342a0
00a084c4	adrp x0,0x2b5000
00a084c8	adrp x2,0x2b4000
00a084cc	add x0,x0,#0xa80
00a084d0	add x2,x2,#0x38
00a084d4	mov w1,#0x214
00a084d8	bl 0x00c342b0
00a084dc	orr w0,wzr,#0x3
00a084e0	mov w1,#0x6c
00a084e4	mov x2,xzr
00a084e8	bl 0x00c342c0
00a084ec	mov x0,x19
00a084f0	bl 0x00c38a30
00a084f4	mov x0,x20
00a084f8	ldp x29,x30,[sp, #0x30]
00a084fc	ldp x20,x19,[sp, #0x20]
00a08500	ldp x22,x21,[sp, #0x10]
00a08504	add sp,sp,#0x40
00a08508	ret
00a0850c	bl 0x00c342a0
00a08510	adrp x0,0x2b5000
00a08514	adrp x2,0x2b4000
00a08518	add x0,x0,#0xa80
00a0851c	add x2,x2,#0x38
00a08520	mov w1,#0x20d
00a08524	bl 0x00c342b0
00a08528	mov w1,#0x100
00a0852c	orr w0,wzr,#0x3
00a08530	movk w1,#0xc, LSL #16
00a08534	mov x2,xzr
00a08538	bl 0x00c342c0
00a0853c	mov x20,xzr
00a08540	b 0x00a084f4
