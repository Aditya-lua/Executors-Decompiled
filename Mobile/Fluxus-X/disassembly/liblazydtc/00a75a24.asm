; EVP_PKEY_meth_add0 @ 00a75a24
00a75a24	stp x20,x19,[sp, #-0x20]!
00a75a28	adrp x20,0xd21000
00a75a2c	ldr x8,[x20, #0xb48]
00a75a30	mov x19,x0
00a75a34	stp x29,x30,[sp, #0x10]
00a75a38	add x29,sp,#0x10
00a75a3c	cbnz x8,0x00a75a58
00a75a40	adrp x0,0xa75000
00a75a44	add x0,x0,#0xad4
00a75a48	bl 0x00c35340
00a75a4c	mov x8,x0
00a75a50	str x0,[x20, #0xb48]
00a75a54	cbz x0,0x00a75a94
00a75a58	mov x0,x8
00a75a5c	mov x1,x19
00a75a60	bl 0x00c347a0
00a75a64	cbz w0,0x00a75a78
00a75a68	ldr x0,[x20, #0xb48]
00a75a6c	bl 0x00c35350
00a75a70	mov w0,#0x1
00a75a74	b 0x00a75ac8
00a75a78	bl 0x00c342a0
00a75a7c	adrp x0,0x2c3000
00a75a80	adrp x2,0x2d7000
00a75a84	add x0,x0,#0xa9f
00a75a88	add x2,x2,#0xf6c
00a75a8c	mov w1,#0x27c
00a75a90	b 0x00a75aac
00a75a94	bl 0x00c342a0
00a75a98	adrp x0,0x2c3000
00a75a9c	adrp x2,0x2d7000
00a75aa0	add x0,x0,#0xa9f
00a75aa4	add x2,x2,#0xf6c
00a75aa8	mov w1,#0x277
00a75aac	bl 0x00c342b0
00a75ab0	mov w1,#0x100
00a75ab4	orr w0,wzr,#0x6
00a75ab8	movk w1,#0xc, LSL #16
00a75abc	mov x2,xzr
00a75ac0	bl 0x00c342c0
00a75ac4	mov w0,wzr
00a75ac8	ldp x29,x30,[sp, #0x10]
00a75acc	ldp x20,x19,[sp], #0x20
00a75ad0	ret
