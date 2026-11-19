; FUN_00b59430 @ 00b59430
00b59430	sub sp,sp,#0xa0
00b59434	stp x20,x19,[sp, #0x80]
00b59438	mov x19,x0
00b5943c	add x0,sp,#0x30
00b59440	mov w2,#0x50
00b59444	mov w1,wzr
00b59448	stp x29,x30,[sp, #0x90]
00b5944c	add x29,sp,#0x90
00b59450	bl 0x00c301c0
00b59454	ldr x20,[x19, #0x30]
00b59458	adrp x0,0x2a4000
00b5945c	add x0,x0,#0xf8a
00b59460	mov x8,sp
00b59464	add x1,sp,#0x2c
00b59468	str wzr,[sp, #0x2c]
00b5946c	bl 0x00c37340
00b59470	ldr x8,[sp, #0x20]
00b59474	ldp q1,q0,[sp]
00b59478	str x8,[sp, #0x50]
00b5947c	stp q1,q0,[sp, #0x30]
00b59480	ldr x0,[x19, #0x30]
00b59484	cbz x0,0x00b59498
00b59488	ldr x8,[x19, #0x40]
00b5948c	cbz x8,0x00b59498
00b59490	blr x8
00b59494	cbz w0,0x00b594d8
00b59498	ldr x8,[x19, #0x50]
00b5949c	add x1,sp,#0x30
00b594a0	mov x0,x20
00b594a4	blr x8
00b594a8	cbnz w0,0x00b594b0
00b594ac	str wzr,[sp, #0x2c]
00b594b0	ldr x0,[x19, #0x30]
00b594b4	cbz x0,0x00b594c4
00b594b8	ldr x8,[x19, #0x48]
00b594bc	cbz x8,0x00b594c4
00b594c0	blr x8
00b594c4	ldr w0,[sp, #0x2c]
00b594c8	ldp x29,x30,[sp, #0x90]
00b594cc	ldp x20,x19,[sp, #0x80]
00b594d0	add sp,sp,#0xa0
00b594d4	ret
00b594d8	bl 0x00c342a0
00b594dc	adrp x20,0x2be000
00b594e0	add x20,x20,#0xab1
00b594e4	adrp x2,0x2be000
00b594e8	add x2,x2,#0xad8
00b594ec	mov w1,#0x46
00b594f0	mov x0,x20
00b594f4	bl 0x00c342b0
00b594f8	mov w0,#0x39
00b594fc	mov w1,#0xb6
00b59500	mov x2,xzr
00b59504	bl 0x00c342c0
00b59508	bl 0x00c342a0
00b5950c	adrp x2,0x2b8000
00b59510	add x2,x2,#0xb0c
00b59514	mov w1,#0x75
00b59518	mov x0,x20
00b5951c	bl 0x00c342b0
00b59520	mov w0,#0x39
00b59524	mov w1,#0xc9
00b59528	mov x2,xzr
00b5952c	bl 0x00c342c0
00b59530	ldr w8,[x19, #0xd8]
00b59534	subs w8,w8,#0x2
00b59538	csinv w0,w8,wzr,ne
00b5953c	str w0,[sp, #0x2c]
00b59540	b 0x00b594c8
