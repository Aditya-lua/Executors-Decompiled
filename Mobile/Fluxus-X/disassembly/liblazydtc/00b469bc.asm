; FUN_00b469bc @ 00b469bc
00b469bc	sub sp,sp,#0xb0
00b469c0	str x21,[sp, #0x80]
00b469c4	stp x20,x19,[sp, #0x90]
00b469c8	stp x29,x30,[sp, #0xa0]
00b469cc	add x29,sp,#0xa0
00b469d0	mov x20,x0
00b469d4	bl 0x00c41000
00b469d8	cbz w0,0x00b46a84
00b469dc	adrp x1,0x2d8000
00b469e0	add x1,x1,#0xc50
00b469e4	mov w0,#0x50
00b469e8	mov w2,#0x49
00b469ec	bl 0x00c34250
00b469f0	mov x19,x0
00b469f4	cbz x0,0x00b46a8c
00b469f8	add x0,sp,#0x30
00b469fc	mov w2,#0x50
00b46a00	mov w1,wzr
00b46a04	str x20,[x19]
00b46a08	bl 0x00c301c0
00b46a0c	mov x20,x19
00b46a10	ldr x0,[x20], #0x30
00b46a14	bl 0x00c41210
00b46a18	mov x21,x0
00b46a1c	adrp x0,0x29d000
00b46a20	adrp x1,0x2d1000
00b46a24	add x0,x0,#0xe2e
00b46a28	add x1,x1,#0x42e
00b46a2c	add x8,sp,#0x8
00b46a30	mov x2,xzr
00b46a34	bl 0x00c36280
00b46a38	ldr x8,[sp, #0x28]
00b46a3c	ldur q0,[sp, #0x18]
00b46a40	ldur q1,[sp, #0x8]
00b46a44	add x1,sp,#0x30
00b46a48	mov x0,x20
00b46a4c	mov x2,x21
00b46a50	str x8,[sp, #0x50]
00b46a54	stp q1,q0,[sp, #0x30]
00b46a58	bl 0x00c41150
00b46a5c	cbnz w0,0x00b46a68
00b46a60	mov x0,x20
00b46a64	bl 0x00c41170
00b46a68	adrp x8,0xcb5000
00b46a6c	ldr x8,[x8, #0x8f0]
00b46a70	mov w9,#0x800
00b46a74	ldr w8,[x8]
00b46a78	str x9,[x19, #0x28]
00b46a7c	str w8,[x19, #0x48]
00b46a80	b 0x00b46abc
00b46a84	mov x19,xzr
00b46a88	b 0x00b46abc
00b46a8c	bl 0x00c342a0
00b46a90	adrp x0,0x2d8000
00b46a94	adrp x2,0x2c0000
00b46a98	add x0,x0,#0xc50
00b46a9c	add x2,x2,#0x945
00b46aa0	mov w1,#0x4b
00b46aa4	bl 0x00c342b0
00b46aa8	mov w1,#0x100
00b46aac	mov w0,#0x39
00b46ab0	movk w1,#0xc, LSL #16
00b46ab4	mov x2,xzr
00b46ab8	bl 0x00c342c0
00b46abc	mov x0,x19
00b46ac0	ldp x29,x30,[sp, #0xa0]
00b46ac4	ldp x20,x19,[sp, #0x90]
00b46ac8	ldr x21,[sp, #0x80]
00b46acc	add sp,sp,#0xb0
00b46ad0	ret
