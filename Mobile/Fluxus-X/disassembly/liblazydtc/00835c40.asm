; FUN_00835c40 @ 00835c40
00835c40	sub sp,sp,#0x60
00835c44	stp x29,x30,[sp, #0x10]
00835c48	str x25,[sp, #0x20]
00835c4c	stp x24,x23,[sp, #0x30]
00835c50	stp x22,x21,[sp, #0x40]
00835c54	stp x20,x19,[sp, #0x50]
00835c58	add x29,sp,#0x10
00835c5c	mrs x25,tpidr_el0
00835c60	mov x19,x3
00835c64	mov x22,x2
00835c68	ldr x8,[x25, #0x28]
00835c6c	mov x20,x1
00835c70	mov x21,x0
00835c74	str x8,[sp, #0x8]
00835c78	ldrb w8,[x2, #0x10]
00835c7c	cmp w8,#0x1
00835c80	b.ne 0x00835c9c
00835c84	adrp x8,0x29d000
00835c88	ldr q0,[x22]
00835c8c	strb wzr,[x22, #0x10]
00835c90	ldr q1,[x8, #0x30]
00835c94	eor v0.16B,v0.16B,v1.16B
00835c98	str q0,[x22]
00835c9c	ldrb w8,[x19, #0xd]
00835ca0	cmp w8,#0x1
00835ca4	b.ne 0x00835ce8
00835ca8	ldr s0,[x19, #0x8]
00835cac	adrp x8,0x29a000
00835cb0	strb wzr,[x19, #0xd]
00835cb4	ldr d1,[x8, #0x350]
00835cb8	adrp x8,0x29b000
00835cbc	uxtl v0.8H,v0.8B
00835cc0	ldr d2,[x8, #0x748]
00835cc4	ldrb w8,[x19, #0xc]
00835cc8	eor w8,w8,#0xffffff9f
00835ccc	eor v0.8B,v0.8B,v1.8B
00835cd0	ldr d1,[x19]
00835cd4	strb w8,[x19, #0xc]
00835cd8	eor v1.8B,v1.8B,v2.8B
00835cdc	uzp1 v0.8B,v0.8B,v0.8B
00835ce0	str d1,[x19]
00835ce4	str s0,[x19, #0x8]
00835ce8	mov x0,x21
00835cec	mov x1,x20
00835cf0	mov x2,x22
00835cf4	mov w3,wzr
00835cf8	mov x4,xzr
00835cfc	bl 0x008ac76c
00835d00	mov x0,x21
00835d04	mov w1,#0xffffffff
00835d08	bl 0x008aa2e4
00835d0c	ldr x8,[x0]
00835d10	adrp x23,0xd1d000
00835d14	add x23,x23,#0x9c0
00835d18	mov x1,sp
00835d1c	mov x2,sp
00835d20	mov x0,x23
00835d24	str x8,[sp]
00835d28	bl 0x00807f14
00835d2c	adrp x24,0xcca000
00835d30	add x24,x24,#0x848
00835d34	mov x1,sp
00835d38	mov x2,sp
00835d3c	mov x0,x24
00835d40	str x20,[sp]
00835d44	bl 0x0080837c
00835d48	mov x0,x21
00835d4c	mov w1,#0xffffd8ee
00835d50	mov x2,x22
00835d54	bl 0x008ad800
00835d58	mov x0,x21
00835d5c	mov x1,x20
00835d60	mov x2,x19
00835d64	mov w3,wzr
00835d68	mov x4,xzr
00835d6c	bl 0x008ac76c
00835d70	mov x0,x21
00835d74	mov w1,#0xffffffff
00835d78	bl 0x008aa2e4
00835d7c	ldr x8,[x0]
00835d80	mov x1,sp
00835d84	mov x2,sp
00835d88	mov x0,x23
00835d8c	str x8,[sp]
00835d90	bl 0x00807f14
00835d94	mov x1,sp
00835d98	mov x2,sp
00835d9c	mov x0,x24
00835da0	str x20,[sp]
00835da4	bl 0x0080837c
00835da8	mov x0,x21
00835dac	mov w1,#0xffffd8ee
00835db0	mov x2,x19
00835db4	bl 0x008ad800
00835db8	ldr x8,[x25, #0x28]
00835dbc	ldr x9,[sp, #0x8]
00835dc0	cmp x8,x9
00835dc4	b.ne 0x00835de4
00835dc8	ldp x20,x19,[sp, #0x50]
00835dcc	ldr x25,[sp, #0x20]
00835dd0	ldp x22,x21,[sp, #0x40]
00835dd4	ldp x24,x23,[sp, #0x30]
00835dd8	ldp x29,x30,[sp, #0x10]
00835ddc	add sp,sp,#0x60
00835de0	ret
00835de4	bl 0x00c2fec0
