; FUN_00835ec8 @ 00835ec8
00835ec8	sub sp,sp,#0x60
00835ecc	stp x29,x30,[sp, #0x10]
00835ed0	str x25,[sp, #0x20]
00835ed4	stp x24,x23,[sp, #0x30]
00835ed8	stp x22,x21,[sp, #0x40]
00835edc	stp x20,x19,[sp, #0x50]
00835ee0	add x29,sp,#0x10
00835ee4	mrs x25,tpidr_el0
00835ee8	mov x19,x3
00835eec	mov x22,x2
00835ef0	ldr x8,[x25, #0x28]
00835ef4	mov x20,x1
00835ef8	mov x21,x0
00835efc	adrp x9,0x29b000
00835f00	str x8,[sp, #0x8]
00835f04	ldrb w8,[x2, #0xd]
00835f08	cmp w8,#0x1
00835f0c	adrp x8,0x29b000
00835f10	b.ne 0x00835f50
00835f14	ldr s0,[x22, #0x8]
00835f18	ldr d1,[x9, #0x1f0]
00835f1c	mov w11,#0x45
00835f20	ldr d2,[x8, #0x510]
00835f24	ldrb w10,[x22, #0xc]
00835f28	strb wzr,[x22, #0xd]
00835f2c	uxtl v0.8H,v0.8B
00835f30	eor w10,w10,w11
00835f34	strb w10,[x22, #0xc]
00835f38	eor v0.8B,v0.8B,v1.8B
00835f3c	ldr d1,[x22]
00835f40	eor v1.8B,v1.8B,v2.8B
00835f44	uzp1 v0.8B,v0.8B,v0.8B
00835f48	str d1,[x22]
00835f4c	str s0,[x22, #0x8]
00835f50	ldrb w10,[x19, #0xf]
00835f54	cmp w10,#0x1
00835f58	b.ne 0x00835fb8
00835f5c	ldr s0,[x19, #0x8]
00835f60	ldr d1,[x9, #0x1f0]
00835f64	mov w10,#0x45
00835f68	ldr d2,[x19]
00835f6c	ldr d3,[x8, #0x510]
00835f70	mov w11,#0xcb
00835f74	uxtl v0.8H,v0.8B
00835f78	ldrb w8,[x19, #0xc]
00835f7c	ldrb w9,[x19, #0xd]
00835f80	strb wzr,[x19, #0xf]
00835f84	eor w8,w8,w10
00835f88	ldrb w10,[x19, #0xe]
00835f8c	eor w9,w9,w11
00835f90	eor v0.8B,v0.8B,v1.8B
00835f94	eor v1.8B,v2.8B,v3.8B
00835f98	strb w8,[x19, #0xc]
00835f9c	mov w8,#0x21
00835fa0	strb w9,[x19, #0xd]
00835fa4	eor w8,w10,w8
00835fa8	uzp1 v0.8B,v0.8B,v0.8B
00835fac	strb w8,[x19, #0xe]
00835fb0	str d1,[x19]
00835fb4	str s0,[x19, #0x8]
00835fb8	mov x0,x21
00835fbc	mov x1,x20
00835fc0	mov x2,x22
00835fc4	mov w3,wzr
00835fc8	mov x4,xzr
00835fcc	bl 0x008ac76c
00835fd0	mov x0,x21
00835fd4	mov w1,#0xffffffff
00835fd8	bl 0x008aa2e4
00835fdc	ldr x8,[x0]
00835fe0	adrp x23,0xd1d000
00835fe4	add x23,x23,#0x9c0
00835fe8	mov x1,sp
00835fec	mov x2,sp
00835ff0	mov x0,x23
00835ff4	str x8,[sp]
00835ff8	bl 0x00807f14
00835ffc	adrp x24,0xcca000
00836000	add x24,x24,#0x848
00836004	mov x1,sp
00836008	mov x2,sp
0083600c	mov x0,x24
00836010	str x20,[sp]
00836014	bl 0x0080837c
00836018	mov x0,x21
0083601c	mov w1,#0xffffd8ee
00836020	mov x2,x22
00836024	bl 0x008ad800
00836028	mov x0,x21
0083602c	mov x1,x20
00836030	mov x2,x19
00836034	mov w3,wzr
00836038	mov x4,xzr
0083603c	bl 0x008ac76c
00836040	mov x0,x21
00836044	mov w1,#0xffffffff
00836048	bl 0x008aa2e4
0083604c	ldr x8,[x0]
00836050	mov x1,sp
00836054	mov x2,sp
00836058	mov x0,x23
0083605c	str x8,[sp]
00836060	bl 0x00807f14
00836064	mov x1,sp
00836068	mov x2,sp
0083606c	mov x0,x24
00836070	str x20,[sp]
00836074	bl 0x0080837c
00836078	mov x0,x21
0083607c	mov w1,#0xffffd8ee
00836080	mov x2,x19
00836084	bl 0x008ad800
00836088	ldr x8,[x25, #0x28]
0083608c	ldr x9,[sp, #0x8]
00836090	cmp x8,x9
00836094	b.ne 0x008360b4
00836098	ldp x20,x19,[sp, #0x50]
0083609c	ldr x25,[sp, #0x20]
008360a0	ldp x22,x21,[sp, #0x40]
008360a4	ldp x24,x23,[sp, #0x30]
008360a8	ldp x29,x30,[sp, #0x10]
008360ac	add sp,sp,#0x60
008360b0	ret
008360b4	bl 0x00c2fec0
