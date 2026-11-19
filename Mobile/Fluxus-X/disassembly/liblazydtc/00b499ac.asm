; FUN_00b499ac @ 00b499ac
00b499ac	stp x22,x21,[sp, #-0x30]!
00b499b0	stp x20,x19,[sp, #0x10]
00b499b4	stp x29,x30,[sp, #0x20]
00b499b8	add x29,sp,#0x20
00b499bc	mov x22,x3
00b499c0	mov x19,x2
00b499c4	mov x20,x1
00b499c8	mov x21,x0
00b499cc	bl 0x00c41000
00b499d0	cbz w0,0x00b49aa0
00b499d4	mov x0,x21
00b499d8	mov x1,x22
00b499dc	bl 0x00b496d8
00b499e0	cbz w0,0x00b49aa0
00b499e4	ldr x8,[x21, #0x28]
00b499e8	cbz x8,0x00b49a1c
00b499ec	ldr x8,[x21, #0x8]
00b499f0	cbz x8,0x00b49a44
00b499f4	bl 0x00c342a0
00b499f8	adrp x0,0x2aa000
00b499fc	adrp x2,0x2d2000
00b49a00	add x0,x0,#0xf63
00b49a04	add x2,x2,#0x84f
00b49a08	mov w1,#0x1b2
00b49a0c	bl 0x00c342b0
00b49a10	mov w0,#0x39
00b49a14	mov w1,#0x88
00b49a18	b 0x00b49a98
00b49a1c	bl 0x00c342a0
00b49a20	adrp x0,0x2aa000
00b49a24	adrp x2,0x2d2000
00b49a28	add x0,x0,#0xf63
00b49a2c	add x2,x2,#0x84f
00b49a30	mov w1,#0x1ad
00b49a34	bl 0x00c342b0
00b49a38	mov w0,#0x39
00b49a3c	mov w1,#0x84
00b49a40	b 0x00b49a98
00b49a44	add x0,x21,#0x10
00b49a48	bl 0x00c41160
00b49a4c	cbz x0,0x00b49a74
00b49a50	ldp x1,x2,[x21, #0x28]
00b49a54	ldp x3,x4,[x21, #0x38]
00b49a58	mov x6,x20
00b49a5c	mov x7,x19
00b49a60	ldp x29,x30,[sp, #0x20]
00b49a64	ldp x20,x19,[sp, #0x10]
00b49a68	mov w5,#0x1
00b49a6c	ldp x22,x21,[sp], #0x30
00b49a70	b 0x00b49ab4
00b49a74	bl 0x00c342a0
00b49a78	adrp x0,0x2aa000
00b49a7c	adrp x2,0x2d2000
00b49a80	add x0,x0,#0xf63
00b49a84	add x2,x2,#0x84f
00b49a88	mov w1,#0x1b9
00b49a8c	bl 0x00c342b0
00b49a90	mov w0,#0x39
00b49a94	mov w1,#0x81
00b49a98	mov x2,xzr
00b49a9c	bl 0x00c342c0
00b49aa0	ldp x29,x30,[sp, #0x20]
00b49aa4	ldp x20,x19,[sp, #0x10]
00b49aa8	mov w0,wzr
00b49aac	ldp x22,x21,[sp], #0x30
00b49ab0	ret
