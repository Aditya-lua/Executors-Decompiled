; tls1_set_server_sigalgs @ 009c2e44
009c2e44	str x23,[sp, #-0x40]!
009c2e48	stp x22,x21,[sp, #0x10]
009c2e4c	stp x20,x19,[sp, #0x20]
009c2e50	stp x29,x30,[sp, #0x30]
009c2e54	mov x19,x0
009c2e58	ldr x0,[x0, #0x1da8]
009c2e5c	adrp x1,0x2c3000
009c2e60	mov w8,#0x1da8
009c2e64	add x1,x1,#0x5d8
009c2e68	mov w2,#0x6a6
009c2e6c	add x29,sp,#0x30
009c2e70	add x20,x19,x8
009c2e74	bl 0x00c32310
009c2e78	add x8,x19,#0x3b8
009c2e7c	add x9,x19,#0x3c8
009c2e80	movi v0.2D,#0x0
009c2e84	str wzr,[x19, #0x3d8]
009c2e88	str q0,[x9]
009c2e8c	str q0,[x8]
009c2e90	str q0,[x20]
009c2e94	ldr x8,[x19, #0x398]
009c2e98	cbnz x8,0x009c2ea4
009c2e9c	ldr x8,[x19, #0x390]
009c2ea0	cbz x8,0x009c2f1c
009c2ea4	mov x0,x19
009c2ea8	bl 0x009c3010
009c2eac	cbz w0,0x009c2ee0
009c2eb0	ldr x8,[x20]
009c2eb4	cbnz x8,0x009c2ff8
009c2eb8	bl 0x00c342a0
009c2ebc	adrp x0,0x2c3000
009c2ec0	adrp x2,0x2af000
009c2ec4	add x0,x0,#0x5d8
009c2ec8	add x2,x2,#0xb46
009c2ecc	mov w1,#0x6cf
009c2ed0	bl 0x00c342b0
009c2ed4	mov w1,#0x28
009c2ed8	mov w2,#0x178
009c2edc	b 0x009c2f08
009c2ee0	bl 0x00c342a0
009c2ee4	adrp x0,0x2c3000
009c2ee8	adrp x2,0x2af000
009c2eec	add x0,x0,#0x5d8
009c2ef0	add x2,x2,#0xb46
009c2ef4	mov w1,#0x6c7
009c2ef8	bl 0x00c342b0
009c2efc	mov w2,#0x103
009c2f00	mov w1,#0x50
009c2f04	movk w2,#0xc, LSL #16
009c2f08	mov x0,x19
009c2f0c	mov x3,xzr
009c2f10	bl 0x00c34410
009c2f14	mov w0,wzr
009c2f18	b 0x009c2ffc
009c2f1c	ldr x8,[x19, #0x898]
009c2f20	adrp x22,0x74c000
009c2f24	add x22,x22,#0xd8c
009c2f28	mov w21,#0x2
009c2f2c	ldr w9,[x8, #0x1c]
009c2f30	and w9,w9,#0x30000
009c2f34	cmp w9,#0x30, LSL #12
009c2f38	b.eq 0x009c2f5c
009c2f3c	cmp w9,#0x20, LSL #12
009c2f40	b.eq 0x009c2f64
009c2f44	cmp w9,#0x10, LSL #12
009c2f48	b.ne 0x009c2f70
009c2f4c	adrp x22,0x74c000
009c2f50	add x22,x22,#0xd8c
009c2f54	mov w23,#0x1
009c2f58	b 0x009c2fa8
009c2f5c	mov w23,#0x2
009c2f60	b 0x009c2fa8
009c2f64	add x22,x22,#0x2
009c2f68	mov w23,#0x1
009c2f6c	b 0x009c2fa8
009c2f70	ldr w9,[x19, #0x38]
009c2f74	cmp w9,#0x1
009c2f78	b.ne 0x009c2f8c
009c2f7c	ldr x22,[x8, #0x1a8]
009c2f80	cbz x22,0x009c2f8c
009c2f84	ldr x23,[x8, #0x1b0]
009c2f88	b 0x009c2fa8
009c2f8c	ldr x22,[x8, #0x198]
009c2f90	cbz x22,0x009c2f9c
009c2f94	ldr x23,[x8, #0x1a0]
009c2f98	b 0x009c2fa8
009c2f9c	adrp x22,0x74c000
009c2fa0	add x22,x22,#0xd90
009c2fa4	orr w23,wzr,#0x1c
009c2fa8	mov x20,xzr
009c2fac	mov x0,x19
009c2fb0	mov w1,w20
009c2fb4	bl 0x009c1dc4
009c2fb8	cbz x0,0x009c2fec
009c2fbc	cbz x23,0x009c2fec
009c2fc0	ldrh w8,[x0, #0x8]
009c2fc4	mov x9,xzr
009c2fc8	ldrh w10,[x22, x9, LSL #0x1]
009c2fcc	cmp w8,w10
009c2fd0	b.eq 0x009c2fe4
009c2fd4	add x9,x9,#0x1
009c2fd8	cmp x9,x23
009c2fdc	b.cc 0x009c2fc8
009c2fe0	b 0x009c2fec
009c2fe4	add x8,x19,x20, LSL #0x2
009c2fe8	str w21,[x8, #0x3b8]
009c2fec	add x20,x20,#0x1
009c2ff0	cmp x20,#0x9
009c2ff4	b.ne 0x009c2fac
009c2ff8	mov w0,#0x1
009c2ffc	ldp x29,x30,[sp, #0x30]
009c3000	ldp x20,x19,[sp, #0x20]
009c3004	ldp x22,x21,[sp, #0x10]
009c3008	ldr x23,[sp], #0x40
009c300c	ret
