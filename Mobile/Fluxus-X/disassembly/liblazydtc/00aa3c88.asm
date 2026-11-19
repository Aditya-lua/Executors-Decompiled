; FUN_00aa3c88 @ 00aa3c88
00aa3c88	stp x24,x23,[sp, #-0x40]!
00aa3c8c	stp x22,x21,[sp, #0x10]
00aa3c90	stp x20,x19,[sp, #0x20]
00aa3c94	stp x29,x30,[sp, #0x30]
00aa3c98	add x29,sp,#0x30
00aa3c9c	cbz x0,0x00aa3de4
00aa3ca0	mov x19,x0
00aa3ca4	ldr x0,[x0, #0x50]
00aa3ca8	mov w22,w2
00aa3cac	adrp x2,0xc6d000
00aa3cb0	mov w21,w1
00aa3cb4	add x2,x2,#0x4c8
00aa3cb8	mov w1,#0x1
00aa3cbc	bl 0x00c3b520
00aa3cc0	mov x20,x0
00aa3cc4	cbz x0,0x00aa3ce8
00aa3cc8	ldr x0,[x20, #0x20]
00aa3ccc	bl 0x00c35680
00aa3cd0	cbz w0,0x00aa3de4
00aa3cd4	ldr x0,[x19, #0x8]
00aa3cd8	bl 0x00c356a0
00aa3cdc	cbz w0,0x00aa3ddc
00aa3ce0	mov w24,#0x1
00aa3ce4	b 0x00aa3d1c
00aa3ce8	bl 0x00c342a0
00aa3cec	adrp x0,0x2aa000
00aa3cf0	adrp x2,0x2bb000
00aa3cf4	add x0,x0,#0x4b5
00aa3cf8	add x2,x2,#0xf7d
00aa3cfc	mov w1,#0x156
00aa3d00	bl 0x00c342b0
00aa3d04	mov w1,#0x103
00aa3d08	orr w0,wzr,#0xf
00aa3d0c	movk w1,#0xc, LSL #16
00aa3d10	mov x2,xzr
00aa3d14	bl 0x00c342c0
00aa3d18	mov w24,wzr
00aa3d1c	ldr w8,[x19, #0x20]
00aa3d20	cmp w8,#0x2
00aa3d24	b.lt 0x00aa3d48
00aa3d28	ldrb w9,[x19, #0xc8]
00aa3d2c	cmp w21,#0x0
00aa3d30	sub w21,w8,#0x1
00aa3d34	cset w8,ne
00aa3d38	and w22,w8,w9
00aa3d3c	str w21,[x19, #0x20]
00aa3d40	cbnz w24,0x00aa3db8
00aa3d44	b 0x00aa3dc8
00aa3d48	sub w21,w8,#0x1
00aa3d4c	ldrb w8,[x19]
00aa3d50	cmp w22,#0x0
00aa3d54	eor w9,w24,#0x1
00aa3d58	cset w10,eq
00aa3d5c	and w8,w8,#0xfffffffd
00aa3d60	orr w9,w10,w9
00aa3d64	str w21,[x19, #0x20]
00aa3d68	strb w8,[x19]
00aa3d6c	tbnz w9,#0x0,0x00aa3db0
00aa3d70	ldr x0,[x20, #0x10]
00aa3d74	bl 0x00c325e0
00aa3d78	cmp w0,#0x1
00aa3d7c	b.lt 0x00aa3db0
00aa3d80	mov w22,w0
00aa3d84	mov w23,wzr
00aa3d88	ldr x0,[x20, #0x10]
00aa3d8c	mov w1,w23
00aa3d90	bl 0x00c32610
00aa3d94	ldr x8,[x0, #0x10]
00aa3d98	ldr x1,[x0, #0x20]
00aa3d9c	mov x0,x19
00aa3da0	blr x8
00aa3da4	add w23,w23,#0x1
00aa3da8	cmp w22,w23
00aa3dac	b.ne 0x00aa3d88
00aa3db0	mov w22,wzr
00aa3db4	cbz w24,0x00aa3dc8
00aa3db8	ldr x0,[x19, #0x8]
00aa3dbc	bl 0x00c35690
00aa3dc0	ldr x0,[x20, #0x20]
00aa3dc4	bl 0x00c35690
00aa3dc8	cbz w22,0x00aa3de8
00aa3dcc	mov w1,#0x1
00aa3dd0	mov x0,x19
00aa3dd4	bl 0x00c3eb50
00aa3dd8	b 0x00aa3de8
00aa3ddc	ldr x0,[x20, #0x20]
00aa3de0	bl 0x00c35690
00aa3de4	mov w21,#0xffffffff
00aa3de8	mov w0,w21
00aa3dec	ldp x29,x30,[sp, #0x30]
00aa3df0	ldp x20,x19,[sp, #0x20]
00aa3df4	ldp x22,x21,[sp, #0x10]
00aa3df8	ldp x24,x23,[sp], #0x40
00aa3dfc	ret
