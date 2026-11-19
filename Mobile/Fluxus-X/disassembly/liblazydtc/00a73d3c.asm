; EVP_PBE_scrypt_ex @ 00a73d3c
00a73d3c	sub sp,sp,#0x1d0
00a73d40	orr x8,x6,x5
00a73d44	stp x29,x30,[sp, #0x1c0]
00a73d48	add x29,sp,#0x1c0
00a73d4c	lsr x8,x8,#0x20
00a73d50	str x28,[sp, #0x170]
00a73d54	stp x26,x25,[sp, #0x180]
00a73d58	stp x24,x23,[sp, #0x190]
00a73d5c	stp x22,x21,[sp, #0x1a0]
00a73d60	stp x20,x19,[sp, #0x1b0]
00a73d64	stp x5,x4,[x29, #-0x60]
00a73d68	stp x7,x6,[x29, #-0x70]
00a73d6c	cbz x8,0x00a73da0
00a73d70	bl 0x00c342a0
00a73d74	adrp x0,0x2a6000
00a73d78	adrp x2,0x2b9000
00a73d7c	add x0,x0,#0x37
00a73d80	add x2,x2,#0xf23
00a73d84	mov w1,#0x32
00a73d88	bl 0x00c342b0
00a73d8c	orr w0,wzr,#0x6
00a73d90	mov w1,#0xbb
00a73d94	mov x2,xzr
00a73d98	bl 0x00c342c0
00a73d9c	b 0x00a73f50
00a73da0	mov x9,x0
00a73da4	ldp x0,x8,[x29, #0x20]
00a73da8	adrp x10,0x2ab000
00a73dac	cmp x9,#0x0
00a73db0	add x10,x10,#0x32c
00a73db4	csel x24,xzr,x1,eq
00a73db8	csel x25,x10,x9,eq
00a73dbc	cmp x2,#0x0
00a73dc0	csel x22,xzr,x3,eq
00a73dc4	csel x23,x10,x2,eq
00a73dc8	cbnz x7,0x00a73dd4
00a73dcc	mov w9,#0x2000000
00a73dd0	stur x9,[x29, #-0x70]
00a73dd4	adrp x1,0x2b0000
00a73dd8	add x1,x1,#0x8d
00a73ddc	mov x2,x8
00a73de0	bl 0x00c36210
00a73de4	mov x20,x0
00a73de8	bl 0x00c361f0
00a73dec	mov x19,x0
00a73df0	mov x0,x20
00a73df4	bl 0x00c36220
00a73df8	cbz x19,0x00a73f50
00a73dfc	ldp x21,x20,[x29, #0x10]
00a73e00	adrp x0,0x2c3000
00a73e04	add x0,x0,#0xa6a
00a73e08	add x8,sp,#0x8
00a73e0c	mov x1,x25
00a73e10	mov x2,x24
00a73e14	add x26,sp,#0x30
00a73e18	bl 0x00c34c50
00a73e1c	ldr x8,[sp, #0x28]
00a73e20	ldur q0,[sp, #0x18]
00a73e24	ldur q1,[sp, #0x8]
00a73e28	adrp x0,0x2a7000
00a73e2c	str x8,[sp, #0x50]
00a73e30	add x0,x0,#0xb6c
00a73e34	add x8,sp,#0x8
00a73e38	mov x1,x23
00a73e3c	mov x2,x22
00a73e40	stp q1,q0,[sp, #0x30]
00a73e44	bl 0x00c34c50
00a73e48	ldr x8,[sp, #0x28]
00a73e4c	ldur q0,[sp, #0x18]
00a73e50	ldur q1,[sp, #0x8]
00a73e54	adrp x0,0x2a5000
00a73e58	str x8,[sp, #0x78]
00a73e5c	add x0,x0,#0x623
00a73e60	add x8,sp,#0x8
00a73e64	sub x1,x29,#0x58
00a73e68	stur q0,[sp, #0x68]
00a73e6c	stur q1,[sp, #0x58]
00a73e70	bl 0x00c3dbe0
00a73e74	ldr x8,[sp, #0x28]
00a73e78	ldur q0,[sp, #0x18]
00a73e7c	ldur q1,[sp, #0x8]
00a73e80	adrp x0,0x2c8000
00a73e84	str x8,[sp, #0xa0]
00a73e88	add x0,x0,#0xcc8
00a73e8c	add x8,sp,#0x8
00a73e90	sub x1,x29,#0x60
00a73e94	str q0,[x26, #0x60]
00a73e98	str q1,[sp, #0x80]
00a73e9c	bl 0x00c3dbe0
00a73ea0	ldr x8,[sp, #0x28]
00a73ea4	ldur q0,[sp, #0x18]
00a73ea8	ldur q1,[sp, #0x8]
00a73eac	adrp x0,0x2a3000
00a73eb0	str x8,[sp, #0xc8]
00a73eb4	add x0,x0,#0x8e7
00a73eb8	add x8,sp,#0x8
00a73ebc	sub x1,x29,#0x68
00a73ec0	stur q0,[x26, #0x88]
00a73ec4	stur q1,[x26, #0x78]
00a73ec8	bl 0x00c3dbe0
00a73ecc	ldr x8,[sp, #0x28]
00a73ed0	ldur q0,[sp, #0x8]
00a73ed4	ldur q1,[sp, #0x18]
00a73ed8	adrp x0,0x2c7000
00a73edc	str x8,[sp, #0xf0]
00a73ee0	add x0,x0,#0xa22
00a73ee4	add x8,sp,#0x8
00a73ee8	sub x1,x29,#0x70
00a73eec	stp q0,q1,[x26, #0xa0]
00a73ef0	bl 0x00c3dbe0
00a73ef4	ldr x8,[sp, #0x28]
00a73ef8	ldur q0,[sp, #0x18]
00a73efc	ldur q1,[sp, #0x8]
00a73f00	str x8,[sp, #0x118]
00a73f04	add x8,sp,#0x8
00a73f08	stur q0,[x26, #0xd8]
00a73f0c	stur q1,[x26, #0xc8]
00a73f10	bl 0x00c34c40
00a73f14	ldr x8,[sp, #0x28]
00a73f18	ldur q0,[sp, #0x8]
00a73f1c	ldur q1,[sp, #0x18]
00a73f20	add x3,sp,#0x30
00a73f24	mov x0,x19
00a73f28	mov x1,x21
00a73f2c	mov x2,x20
00a73f30	str x8,[sp, #0x140]
00a73f34	stp q0,q1,[x26, #0xf0]
00a73f38	bl 0x00c36200
00a73f3c	cmp w0,#0x1
00a73f40	mov x0,x19
00a73f44	cset w20,eq
00a73f48	bl 0x00c361e0
00a73f4c	b 0x00a73f54
00a73f50	mov w20,wzr
00a73f54	mov w0,w20
00a73f58	ldp x29,x30,[sp, #0x1c0]
00a73f5c	ldp x20,x19,[sp, #0x1b0]
00a73f60	ldp x22,x21,[sp, #0x1a0]
00a73f64	ldp x24,x23,[sp, #0x190]
00a73f68	ldp x26,x25,[sp, #0x180]
00a73f6c	ldr x28,[sp, #0x170]
00a73f70	add sp,sp,#0x1d0
00a73f74	ret
