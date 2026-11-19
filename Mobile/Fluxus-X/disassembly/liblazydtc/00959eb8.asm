; FUN_00959eb8 @ 00959eb8
00959eb8	sub sp,sp,#0xf0
00959ebc	str x25,[sp, #0xa0]
00959ec0	stp x24,x23,[sp, #0xb0]
00959ec4	stp x22,x21,[sp, #0xc0]
00959ec8	stp x20,x19,[sp, #0xd0]
00959ecc	stp x29,x30,[sp, #0xe0]
00959ed0	add x29,sp,#0xe0
00959ed4	mrs x23,tpidr_el0
00959ed8	adrp x8,0x29c000
00959edc	ldr x9,[x23, #0x28]
00959ee0	ldr q0,[x8, #0x2e0]
00959ee4	mov x19,x0
00959ee8	mov x0,x2
00959eec	mov x21,x1
00959ef0	stur x9,[x29, #-0x48]
00959ef4	stur q0,[sp, #0x8]
00959ef8	bl 0x00963a64
00959efc	mov w22,w0
00959f00	and w24,w0,#0x1fffffff
00959f04	lsr w8,w0,#0x1d
00959f08	cmp w0,#0x40
00959f0c	stp w24,w8,[sp]
00959f10	b.cc 0x00959f30
00959f14	and x2,x22,#0xffffffc0
00959f18	mov x0,sp
00959f1c	mov x1,x21
00959f20	bl 0x0095a12c
00959f24	ldr w24,[sp]
00959f28	mov x21,x0
00959f2c	and x22,x22,#0x3f
00959f30	mov x25,sp
00959f34	add x20,x25,#0x18
00959f38	mov x0,x20
00959f3c	mov x1,x21
00959f40	mov x2,x22
00959f44	bl 0x00c2ffd0
00959f48	and w10,w24,#0x3f
00959f4c	eor x8,x10,#0x3f
00959f50	mov w11,#0x80
00959f54	add x9,x10,#0x1
00959f58	subs x2,x8,#0x8
00959f5c	strb w11,[x20, x10]
00959f60	b.cs 0x00959f94
00959f64	add x9,x25,x9
00959f68	add x0,x9,#0x18
00959f6c	mov w1,wzr
00959f70	mov x2,x8
00959f74	bl 0x00c301c0
00959f78	mov x0,sp
00959f7c	mov w2,#0x40
00959f80	mov x1,x20
00959f84	bl 0x0095a12c
00959f88	ldr w24,[sp]
00959f8c	mov x9,xzr
00959f90	orr w2,wzr,#0x38
00959f94	mov x8,sp
00959f98	add x8,x8,x9
00959f9c	add x0,x8,#0x18
00959fa0	mov w1,wzr
00959fa4	bl 0x00c301c0
00959fa8	lsl w8,w24,#0x3
00959fac	and w0,w8,#0xf8
00959fb0	str w8,[sp]
00959fb4	bl 0x00963a58
00959fb8	ldr w8,[sp]
00959fbc	strb w0,[sp, #0x50]
00959fc0	ubfx w0,w8,#0x8,#0x8
00959fc4	bl 0x00963a58
00959fc8	strb w0,[sp, #0x51]
00959fcc	ldrb w0,[sp, #0x2]
00959fd0	bl 0x00963a58
00959fd4	strb w0,[sp, #0x52]
00959fd8	ldrb w0,[sp, #0x3]
00959fdc	bl 0x00963a58
00959fe0	strb w0,[sp, #0x53]
00959fe4	ldrb w0,[sp, #0x4]
00959fe8	bl 0x00963a58
00959fec	ldr w8,[sp, #0x4]
00959ff0	strb w0,[sp, #0x54]
00959ff4	ubfx w0,w8,#0x8,#0x8
00959ff8	bl 0x00963a58
00959ffc	strb w0,[sp, #0x55]
0095a000	ldrb w0,[sp, #0x6]
0095a004	bl 0x00963a58
0095a008	strb w0,[sp, #0x56]
0095a00c	ldrb w0,[sp, #0x7]
0095a010	bl 0x00963a58
0095a014	strb w0,[sp, #0x57]
0095a018	mov x0,sp
0095a01c	mov w2,#0x40
0095a020	mov x1,x20
0095a024	bl 0x0095a12c
0095a028	ldrb w0,[sp, #0x8]
0095a02c	bl 0x00963a58
0095a030	strb w0,[x19]
0095a034	ldr w8,[sp, #0x8]
0095a038	ubfx w0,w8,#0x8,#0x8
0095a03c	bl 0x00963a58
0095a040	strb w0,[x19, #0x1]
0095a044	ldrb w0,[sp, #0xa]
0095a048	bl 0x00963a58
0095a04c	strb w0,[x19, #0x2]
0095a050	ldrb w0,[sp, #0xb]
0095a054	bl 0x00963a58
0095a058	strb w0,[x19, #0x3]
0095a05c	ldrb w0,[sp, #0xc]
0095a060	bl 0x00963a58
0095a064	strb w0,[x19, #0x4]
0095a068	ldr w8,[sp, #0xc]
0095a06c	ubfx w0,w8,#0x8,#0x8
0095a070	bl 0x00963a58
0095a074	strb w0,[x19, #0x5]
0095a078	ldrb w0,[sp, #0xe]
0095a07c	bl 0x00963a58
0095a080	strb w0,[x19, #0x6]
0095a084	ldrb w0,[sp, #0xf]
0095a088	bl 0x00963a58
0095a08c	strb w0,[x19, #0x7]
0095a090	ldrb w0,[sp, #0x10]
0095a094	bl 0x00963a58
0095a098	strb w0,[x19, #0x8]
0095a09c	ldr w8,[sp, #0x10]
0095a0a0	ubfx w0,w8,#0x8,#0x8
0095a0a4	bl 0x00963a58
0095a0a8	strb w0,[x19, #0x9]
0095a0ac	ldrb w0,[sp, #0x12]
0095a0b0	bl 0x00963a58
0095a0b4	strb w0,[x19, #0xa]
0095a0b8	ldrb w0,[sp, #0x13]
0095a0bc	bl 0x00963a58
0095a0c0	strb w0,[x19, #0xb]
0095a0c4	ldrb w0,[sp, #0x14]
0095a0c8	bl 0x00963a58
0095a0cc	strb w0,[x19, #0xc]
0095a0d0	ldr w8,[sp, #0x14]
0095a0d4	ubfx w0,w8,#0x8,#0x8
0095a0d8	bl 0x00963a58
0095a0dc	strb w0,[x19, #0xd]
0095a0e0	ldrb w0,[sp, #0x16]
0095a0e4	bl 0x00963a58
0095a0e8	strb w0,[x19, #0xe]
0095a0ec	ldrb w0,[sp, #0x17]
0095a0f0	bl 0x00963a58
0095a0f4	strb w0,[x19, #0xf]
0095a0f8	ldr x8,[x23, #0x28]
0095a0fc	ldur x9,[x29, #-0x48]
0095a100	cmp x8,x9
0095a104	b.ne 0x0095a128
0095a108	ldp x29,x30,[sp, #0xe0]
0095a10c	ldp x20,x19,[sp, #0xd0]
0095a110	ldp x22,x21,[sp, #0xc0]
0095a114	ldp x24,x23,[sp, #0xb0]
0095a118	ldr x25,[sp, #0xa0]
0095a11c	mov w0,wzr
0095a120	add sp,sp,#0xf0
0095a124	ret
0095a128	bl 0x00c2fec0
