; o2i_SCT_signature @ 00a12d0c
00a12d0c	stp x24,x23,[sp, #-0x40]!
00a12d10	stp x22,x21,[sp, #0x10]
00a12d14	stp x20,x19,[sp, #0x20]
00a12d18	stp x29,x30,[sp, #0x30]
00a12d1c	ldr w8,[x0]
00a12d20	add x29,sp,#0x30
00a12d24	cbz w8,0x00a12d50
00a12d28	bl 0x00c342a0
00a12d2c	adrp x0,0x2d9000
00a12d30	adrp x2,0x2d5000
00a12d34	add x0,x0,#0xa3f
00a12d38	add x2,x2,#0xb40
00a12d3c	orr w1,wzr,#0x1f
00a12d40	bl 0x00c342b0
00a12d44	mov w0,#0x32
00a12d48	mov w1,#0x67
00a12d4c	b 0x00a12e00
00a12d50	mov x19,x2
00a12d54	cmp x2,#0x4
00a12d58	b.hi 0x00a12d78
00a12d5c	bl 0x00c342a0
00a12d60	adrp x0,0x2d9000
00a12d64	adrp x2,0x2d5000
00a12d68	add x0,x0,#0xa3f
00a12d6c	add x2,x2,#0xb40
00a12d70	mov w1,#0x2a
00a12d74	b 0x00a12df4
00a12d78	ldr x23,[x1]
00a12d7c	mov x21,x0
00a12d80	mov x20,x1
00a12d84	ldrb w8,[x23]
00a12d88	strb w8,[x0, #0x40]
00a12d8c	ldrb w8,[x23, #0x1]
00a12d90	strb w8,[x0, #0x41]
00a12d94	bl 0x00c39840
00a12d98	cbz w0,0x00a12ddc
00a12d9c	ldrb w8,[x23, #0x2]
00a12da0	ldrb w22,[x23, #0x3]
00a12da4	ldr x9,[x20]
00a12da8	add x23,x23,#0x4
00a12dac	bfm x22,x8,#0x38,#0x7
00a12db0	sub x8,x9,x23
00a12db4	add x24,x8,x19
00a12db8	cmp x22,x24
00a12dbc	b.ls 0x00a12e20
00a12dc0	bl 0x00c342a0
00a12dc4	adrp x0,0x2d9000
00a12dc8	adrp x2,0x2d5000
00a12dcc	add x0,x0,#0xa3f
00a12dd0	add x2,x2,#0xb40
00a12dd4	mov w1,#0x3a
00a12dd8	b 0x00a12df4
00a12ddc	bl 0x00c342a0
00a12de0	adrp x0,0x2d9000
00a12de4	adrp x2,0x2d5000
00a12de8	add x0,x0,#0xa3f
00a12dec	add x2,x2,#0xb40
00a12df0	mov w1,#0x33
00a12df4	bl 0x00c342b0
00a12df8	mov w0,#0x32
00a12dfc	mov w1,#0x6b
00a12e00	mov x2,xzr
00a12e04	bl 0x00c342c0
00a12e08	mov w0,#0xffffffff
00a12e0c	ldp x29,x30,[sp, #0x30]
00a12e10	ldp x20,x19,[sp, #0x20]
00a12e14	ldp x22,x21,[sp, #0x10]
00a12e18	ldp x24,x23,[sp], #0x40
00a12e1c	ret
00a12e20	mov x0,x21
00a12e24	mov x1,x23
00a12e28	mov x2,x22
00a12e2c	bl 0x00c39860
00a12e30	cmp w0,#0x1
00a12e34	b.ne 0x00a12e08
00a12e38	add w9,w22,w19
00a12e3c	add x8,x23,x22
00a12e40	sub w0,w9,w24
00a12e44	str x8,[x20]
00a12e48	b 0x00a12e0c
