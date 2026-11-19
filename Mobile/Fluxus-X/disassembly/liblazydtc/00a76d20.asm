; FUN_00a76d20 @ 00a76d20
00a76d20	sub sp,sp,#0xa0
00a76d24	stp x29,x30,[sp, #0x90]
00a76d28	add x29,sp,#0x90
00a76d2c	str x19,[sp, #0x80]
00a76d30	stur x3,[x29, #-0x8]
00a76d34	cbz x0,0x00a76da8
00a76d38	ldr w10,[x0]
00a76d3c	mov x19,x0
00a76d40	cmp w10,#0x800
00a76d44	b.ne 0x00a76da8
00a76d48	ldr x10,[x19, #0x30]
00a76d4c	cbz x10,0x00a76de8
00a76d50	mov x9,x1
00a76d54	add x8,sp,#0x8
00a76d58	sub x1,x29,#0x8
00a76d5c	mov x0,x9
00a76d60	bl 0x00c3dbe0
00a76d64	ldr x8,[sp, #0x28]
00a76d68	ldur q0,[sp, #0x18]
00a76d6c	ldur q1,[sp, #0x8]
00a76d70	str x8,[sp, #0x50]
00a76d74	add x8,sp,#0x8
00a76d78	stp q1,q0,[sp, #0x30]
00a76d7c	bl 0x00c34c40
00a76d80	ldr x8,[sp, #0x28]
00a76d84	ldur q0,[sp, #0x18]
00a76d88	ldur q1,[sp, #0x8]
00a76d8c	add x1,sp,#0x30
00a76d90	mov x0,x19
00a76d94	str x8,[sp, #0x78]
00a76d98	stur q0,[sp, #0x68]
00a76d9c	stur q1,[sp, #0x58]
00a76da0	bl 0x00a75c0c
00a76da4	b 0x00a76dd8
00a76da8	bl 0x00c342a0
00a76dac	adrp x0,0x2c3000
00a76db0	adrp x2,0x2a2000
00a76db4	add x0,x0,#0xa9f
00a76db8	add x2,x2,#0x48d
00a76dbc	mov w1,#0x4b6
00a76dc0	bl 0x00c342b0
00a76dc4	orr w0,wzr,#0x6
00a76dc8	mov w1,#0x93
00a76dcc	mov x2,xzr
00a76dd0	bl 0x00c342c0
00a76dd4	orr w0,wzr,#0xfffffffe
00a76dd8	ldp x29,x30,[sp, #0x90]
00a76ddc	ldr x19,[sp, #0x80]
00a76de0	add sp,sp,#0xa0
00a76de4	ret
00a76de8	mov w8,w2
00a76dec	str x3,[sp, #0x30]
00a76df0	mov w1,#0xffffffff
00a76df4	mov w2,#0x800
00a76df8	add x5,sp,#0x30
00a76dfc	mov x0,x19
00a76e00	mov w3,w8
00a76e04	mov w4,wzr
00a76e08	bl 0x00a763fc
00a76e0c	b 0x00a76dd8
