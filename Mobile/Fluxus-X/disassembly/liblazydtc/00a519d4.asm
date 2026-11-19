; ENGINE_get_last @ 00a519d4
00a519d4	stp x20,x19,[sp, #-0x20]!
00a519d8	stp x29,x30,[sp, #0x10]
00a519dc	adrp x0,0xcb5000
00a519e0	adrp x1,0xcb5000
00a519e4	ldr x0,[x0, #0x5f0]
00a519e8	ldr x1,[x1, #0x5e0]
00a519ec	add x29,sp,#0x10
00a519f0	bl 0x00c34d60
00a519f4	cbz w0,0x00a51a48
00a519f8	adrp x8,0xcb5000
00a519fc	ldr x8,[x8, #0x5e8]
00a51a00	ldr w8,[x8]
00a51a04	cbz w8,0x00a51a48
00a51a08	adrp x20,0xcb5000
00a51a0c	ldr x20,[x20, #0x5d8]
00a51a10	ldr x0,[x20]
00a51a14	bl 0x00c356a0
00a51a18	cbz w0,0x00a51a78
00a51a1c	adrp x8,0xd21000
00a51a20	ldr x19,[x8, #0x9c0]
00a51a24	cbz x19,0x00a51a3c
00a51a28	add x8,x19,#0x9c
00a51a2c	ldaxr w9,[x8]
00a51a30	add w9,w9,#0x1
00a51a34	stlxr w10,w9,[x8]
00a51a38	cbnz w10,0x00a51a2c
00a51a3c	ldr x0,[x20]
00a51a40	bl 0x00c35690
00a51a44	b 0x00a51a7c
00a51a48	bl 0x00c342a0
00a51a4c	adrp x0,0x2cd000
00a51a50	adrp x2,0x29e000
00a51a54	add x0,x0,#0x9e1
00a51a58	add x2,x2,#0xf4
00a51a5c	mov w1,#0xf5
00a51a60	bl 0x00c342b0
00a51a64	mov w1,#0x100
00a51a68	mov w0,#0x26
00a51a6c	movk w1,#0xc, LSL #16
00a51a70	mov x2,xzr
00a51a74	bl 0x00c342c0
00a51a78	mov x19,xzr
00a51a7c	ldp x29,x30,[sp, #0x10]
00a51a80	mov x0,x19
00a51a84	ldp x20,x19,[sp], #0x20
00a51a88	ret
