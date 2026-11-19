; ossl_ec_key_simple_oct2priv @ 00a2f9f8
00a2f9f8	str x21,[sp, #-0x30]!
00a2f9fc	stp x20,x19,[sp, #0x10]
00a2fa00	stp x29,x30,[sp, #0x20]
00a2fa04	mov x20,x2
00a2fa08	ldr x2,[x0, #0x28]
00a2fa0c	mov x19,x0
00a2fa10	mov x21,x1
00a2fa14	add x29,sp,#0x20
00a2fa18	cbnz x2,0x00a2fa2c
00a2fa1c	bl 0x00c38d90
00a2fa20	mov x2,x0
00a2fa24	str x0,[x19, #0x28]
00a2fa28	cbz x0,0x00a2fa7c
00a2fa2c	mov x0,x21
00a2fa30	mov w1,w20
00a2fa34	bl 0x00c36970
00a2fa38	cbz x0,0x00a2fa50
00a2fa3c	ldr x8,[x19, #0x68]
00a2fa40	mov w0,#0x1
00a2fa44	add x8,x8,#0x1
00a2fa48	str x8,[x19, #0x68]
00a2fa4c	b 0x00a2fab0
00a2fa50	bl 0x00c342a0
00a2fa54	adrp x0,0x2b4000
00a2fa58	adrp x2,0x2cf000
00a2fa5c	add x0,x0,#0x15e
00a2fa60	add x2,x2,#0xa73
00a2fa64	mov w1,#0x3c1
00a2fa68	bl 0x00c342b0
00a2fa6c	mov w1,#0x3
00a2fa70	mov w0,#0x10
00a2fa74	movk w1,#0x8, LSL #16
00a2fa78	b 0x00a2faa4
00a2fa7c	bl 0x00c342a0
00a2fa80	adrp x0,0x2b4000
00a2fa84	adrp x2,0x2cf000
00a2fa88	add x0,x0,#0x15e
00a2fa8c	add x2,x2,#0xa73
00a2fa90	mov w1,#0x3bd
00a2fa94	bl 0x00c342b0
00a2fa98	mov w1,#0x100
00a2fa9c	mov w0,#0x10
00a2faa0	movk w1,#0xc, LSL #16
00a2faa4	mov x2,xzr
00a2faa8	bl 0x00c342c0
00a2faac	mov w0,wzr
00a2fab0	ldp x29,x30,[sp, #0x20]
00a2fab4	ldp x20,x19,[sp, #0x10]
00a2fab8	ldr x21,[sp], #0x30
00a2fabc	ret
