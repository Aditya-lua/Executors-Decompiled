; i2d_PrivateKey @ 00ab99c4
00ab99c4	stp x20,x19,[sp, #-0x20]!
00ab99c8	stp x29,x30,[sp, #0x10]
00ab99cc	ldr x8,[x0, #0x60]
00ab99d0	mov x19,x1
00ab99d4	add x29,sp,#0x10
00ab99d8	cbz x8,0x00ab99f8
00ab99dc	ldp x29,x30,[sp, #0x10]
00ab99e0	adrp x2,0xc7b000
00ab99e4	add x2,x2,#0x28
00ab99e8	mov w1,#0x87
00ab99ec	mov x3,x19
00ab99f0	ldp x20,x19,[sp], #0x20
00ab99f4	b 0x00ab98b4
00ab99f8	ldr x8,[x0, #0x8]
00ab99fc	cbz x8,0x00ab9a48
00ab9a00	ldr x2,[x8, #0xc0]
00ab9a04	cbz x2,0x00ab9a18
00ab9a08	ldp x29,x30,[sp, #0x10]
00ab9a0c	mov x1,x19
00ab9a10	ldp x20,x19,[sp], #0x20
00ab9a14	br x2
00ab9a18	ldr x8,[x8, #0x48]
00ab9a1c	cbz x8,0x00ab9a48
00ab9a20	bl 0x00c3d0c0
00ab9a24	cbz x0,0x00ab9a78
00ab9a28	mov x1,x19
00ab9a2c	mov x20,x0
00ab9a30	bl 0x00c37f20
00ab9a34	mov w19,w0
00ab9a38	mov x0,x20
00ab9a3c	bl 0x00c37d00
00ab9a40	mov w0,w19
00ab9a44	b 0x00ab9a78
00ab9a48	bl 0x00c342a0
00ab9a4c	adrp x0,0x2dc000
00ab9a50	adrp x2,0x2a0000
00ab9a54	add x0,x0,#0x823
00ab9a58	add x2,x2,#0xae6
00ab9a5c	mov w1,#0x77
00ab9a60	bl 0x00c342b0
00ab9a64	mov w0,#0xd
00ab9a68	mov w1,#0xa7
00ab9a6c	mov x2,xzr
00ab9a70	bl 0x00c342c0
00ab9a74	mov w0,#0xffffffff
00ab9a78	ldp x29,x30,[sp, #0x10]
00ab9a7c	ldp x20,x19,[sp], #0x20
00ab9a80	ret
