; FUN_00813d80 @ 00813d80
00813d80	sub sp,sp,#0x60
00813d84	stp x29,x30,[sp, #0x10]
00813d88	str x25,[sp, #0x20]
00813d8c	stp x24,x23,[sp, #0x30]
00813d90	stp x22,x21,[sp, #0x40]
00813d94	stp x20,x19,[sp, #0x50]
00813d98	add x29,sp,#0x10
00813d9c	mrs x25,tpidr_el0
00813da0	mov x19,x3
00813da4	mov x22,x2
00813da8	ldr x8,[x25, #0x28]
00813dac	mov x20,x1
00813db0	mov x21,x0
00813db4	adrp x9,0x29b000
00813db8	str x8,[sp, #0x8]
00813dbc	ldrb w8,[x2, #0xd]
00813dc0	cmp w8,#0x1
00813dc4	adrp x8,0x29a000
00813dc8	b.ne 0x00813e08
00813dcc	ldr s0,[x22, #0x8]
00813dd0	ldr d1,[x9, #0x280]
00813dd4	mov w11,#0x9b
00813dd8	ldr d2,[x8, #0x8d0]
00813ddc	ldrb w10,[x22, #0xc]
00813de0	strb wzr,[x22, #0xd]
00813de4	uxtl v0.8H,v0.8B
00813de8	eor w10,w10,w11
00813dec	strb w10,[x22, #0xc]
00813df0	eor v0.8B,v0.8B,v1.8B
00813df4	ldr d1,[x22]
00813df8	eor v1.8B,v1.8B,v2.8B
00813dfc	uzp1 v0.8B,v0.8B,v0.8B
00813e00	str d1,[x22]
00813e04	str s0,[x22, #0x8]
00813e08	ldrb w10,[x19, #0xe]
00813e0c	cmp w10,#0x1
00813e10	b.ne 0x00813e60
00813e14	ldr s0,[x19, #0x8]
00813e18	ldr d1,[x9, #0x280]
00813e1c	mov w9,#0x9b
00813e20	ldr d2,[x19]
00813e24	ldrb w10,[x19, #0xd]
00813e28	strb wzr,[x19, #0xe]
00813e2c	uxtl v0.8H,v0.8B
00813e30	eor v0.8B,v0.8B,v1.8B
00813e34	ldr d1,[x8, #0x8d0]
00813e38	ldrb w8,[x19, #0xc]
00813e3c	eor v1.8B,v2.8B,v1.8B
00813e40	eor w8,w8,w9
00813e44	mov w9,#0xa1
00813e48	uzp1 v0.8B,v0.8B,v0.8B
00813e4c	eor w9,w10,w9
00813e50	strb w8,[x19, #0xc]
00813e54	strb w9,[x19, #0xd]
00813e58	str d1,[x19]
00813e5c	str s0,[x19, #0x8]
00813e60	mov x0,x21
00813e64	mov x1,x20
00813e68	mov x2,x22
00813e6c	mov w3,wzr
00813e70	mov x4,xzr
00813e74	bl 0x008ac76c
00813e78	mov x0,x21
00813e7c	mov w1,#0xffffffff
00813e80	bl 0x008aa2e4
00813e84	ldr x8,[x0]
00813e88	adrp x23,0xd1b000
00813e8c	add x23,x23,#0x9f8
00813e90	mov x1,sp
00813e94	mov x2,sp
00813e98	mov x0,x23
00813e9c	str x8,[sp]
00813ea0	bl 0x00807f14
00813ea4	adrp x24,0xcca000
00813ea8	add x24,x24,#0x848
00813eac	mov x1,sp
00813eb0	mov x2,sp
00813eb4	mov x0,x24
00813eb8	str x20,[sp]
00813ebc	bl 0x0080837c
00813ec0	mov x0,x21
00813ec4	mov w1,#0xffffd8ee
00813ec8	mov x2,x22
00813ecc	bl 0x008ad800
00813ed0	mov x0,x21
00813ed4	mov x1,x20
00813ed8	mov x2,x19
00813edc	mov w3,wzr
00813ee0	mov x4,xzr
00813ee4	bl 0x008ac76c
00813ee8	mov x0,x21
00813eec	mov w1,#0xffffffff
00813ef0	bl 0x008aa2e4
00813ef4	ldr x8,[x0]
00813ef8	mov x1,sp
00813efc	mov x2,sp
00813f00	mov x0,x23
00813f04	str x8,[sp]
00813f08	bl 0x00807f14
00813f0c	mov x1,sp
00813f10	mov x2,sp
00813f14	mov x0,x24
00813f18	str x20,[sp]
00813f1c	bl 0x0080837c
00813f20	mov x0,x21
00813f24	mov w1,#0xffffd8ee
00813f28	mov x2,x19
00813f2c	bl 0x008ad800
00813f30	ldr x8,[x25, #0x28]
00813f34	ldr x9,[sp, #0x8]
00813f38	cmp x8,x9
00813f3c	b.ne 0x00813f5c
00813f40	ldp x20,x19,[sp, #0x50]
00813f44	ldr x25,[sp, #0x20]
00813f48	ldp x22,x21,[sp, #0x40]
00813f4c	ldp x24,x23,[sp, #0x30]
00813f50	ldp x29,x30,[sp, #0x10]
00813f54	add sp,sp,#0x60
00813f58	ret
00813f5c	bl 0x00c2fec0
