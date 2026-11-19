; tls_parse_stoc_alpn @ 009d4e10
009d4e10	stp x22,x21,[sp, #-0x30]!
009d4e14	stp x20,x19,[sp, #0x10]
009d4e18	stp x29,x30,[sp, #0x20]
009d4e1c	ldr w8,[x0, #0x4a8]
009d4e20	mov x19,x0
009d4e24	add x29,sp,#0x20
009d4e28	cbz w8,0x009d4e60
009d4e2c	ldr x8,[x1, #0x8]
009d4e30	mov x21,x1
009d4e34	cmp x8,#0x2
009d4e38	b.cs 0x009d4ea4
009d4e3c	bl 0x00c342a0
009d4e40	adrp x0,0x2bf000
009d4e44	adrp x2,0x2c9000
009d4e48	add x0,x0,#0x967
009d4e4c	add x2,x2,#0x4e6
009d4e50	mov w1,#0x62f
009d4e54	bl 0x00c342b0
009d4e58	mov w1,#0x32
009d4e5c	b 0x009d4e80
009d4e60	bl 0x00c342a0
009d4e64	adrp x0,0x2bf000
009d4e68	adrp x2,0x2c9000
009d4e6c	add x0,x0,#0x967
009d4e70	add x2,x2,#0x4e6
009d4e74	mov w1,#0x623
009d4e78	bl 0x00c342b0
009d4e7c	mov w1,#0x6e
009d4e80	mov w2,#0x6e
009d4e84	mov x0,x19
009d4e88	mov x3,xzr
009d4e8c	bl 0x00c34410
009d4e90	mov w0,wzr
009d4e94	ldp x29,x30,[sp, #0x20]
009d4e98	ldp x20,x19,[sp, #0x10]
009d4e9c	ldp x22,x21,[sp], #0x30
009d4ea0	ret
009d4ea4	ldr x9,[x21]
009d4ea8	subs x12,x8,#0x2
009d4eac	ldrb w10,[x9]
009d4eb0	ldrb w11,[x9, #0x1]
009d4eb4	add x13,x9,#0x2
009d4eb8	stp x13,x12,[x21]
009d4ebc	b.eq 0x009d4e3c
009d4ec0	bfm x11,x10,#0x38,#0x7
009d4ec4	cmp x12,x11
009d4ec8	b.ne 0x009d4e3c
009d4ecc	ldrb w10,[x9, #0x2]
009d4ed0	sub x20,x8,#0x3
009d4ed4	add x9,x9,#0x3
009d4ed8	stp x9,x20,[x21]
009d4edc	cmp x20,x10
009d4ee0	b.ne 0x009d4e3c
009d4ee4	ldr x0,[x19, #0x488]
009d4ee8	adrp x22,0x2bf000
009d4eec	add x22,x22,#0x967
009d4ef0	mov w2,#0x632
009d4ef4	mov x1,x22
009d4ef8	bl 0x00c32310
009d4efc	mov w2,#0x633
009d4f00	mov x0,x20
009d4f04	mov x1,x22
009d4f08	bl 0x00c32320
009d4f0c	str x0,[x19, #0x488]
009d4f10	cbz x0,0x009d4f3c
009d4f14	ldr x8,[x21, #0x8]
009d4f18	cmp x8,x20
009d4f1c	b.cs 0x009d4f6c
009d4f20	bl 0x00c342a0
009d4f24	adrp x0,0x2bf000
009d4f28	adrp x2,0x2c9000
009d4f2c	add x0,x0,#0x967
009d4f30	add x2,x2,#0x4e6
009d4f34	mov w1,#0x63a
009d4f38	b 0x009d4e54
009d4f3c	str xzr,[x19, #0x490]
009d4f40	bl 0x00c342a0
009d4f44	adrp x0,0x2bf000
009d4f48	adrp x2,0x2c9000
009d4f4c	add x0,x0,#0x967
009d4f50	add x2,x2,#0x4e6
009d4f54	mov w1,#0x636
009d4f58	bl 0x00c342b0
009d4f5c	mov w2,#0x103
009d4f60	mov w1,#0x50
009d4f64	movk w2,#0xc, LSL #16
009d4f68	b 0x009d4e84
009d4f6c	ldr x1,[x21]
009d4f70	mov x2,x20
009d4f74	bl 0x00c2ffd0
009d4f78	ldp x8,x9,[x21]
009d4f7c	add x8,x8,x20
009d4f80	sub x9,x9,x20
009d4f84	stp x8,x9,[x21]
009d4f88	ldr x8,[x19, #0x918]
009d4f8c	str x20,[x19, #0x490]
009d4f90	ldr x21,[x8, #0x358]
009d4f94	cbz x21,0x009d4fb8
009d4f98	ldr x8,[x8, #0x360]
009d4f9c	cmp x8,x20
009d4fa0	b.ne 0x009d4fb8
009d4fa4	ldr x1,[x19, #0x488]
009d4fa8	mov x0,x21
009d4fac	mov x2,x20
009d4fb0	bl 0x00c300b0
009d4fb4	cbz w0,0x009d4fbc
009d4fb8	str wzr,[x19, #0xb34]
009d4fbc	ldr w8,[x19, #0x4d0]
009d4fc0	cbz w8,0x009d4fcc
009d4fc4	mov w0,#0x1
009d4fc8	b 0x009d4e94
009d4fcc	cbz x21,0x009d4fec
009d4fd0	bl 0x00c342a0
009d4fd4	adrp x0,0x2bf000
009d4fd8	adrp x2,0x2c9000
009d4fdc	add x0,x0,#0x967
009d4fe0	add x2,x2,#0x4e6
009d4fe4	mov w1,#0x64c
009d4fe8	b 0x009d4f58
009d4fec	ldr x0,[x19, #0x488]
009d4ff0	adrp x2,0x2bf000
009d4ff4	add x2,x2,#0x967
009d4ff8	mov w3,#0x650
009d4ffc	mov x1,x20
009d5000	bl 0x00c345f0
009d5004	ldr x8,[x19, #0x918]
009d5008	str x0,[x8, #0x358]
009d500c	cbz x0,0x009d501c
009d5010	ldr x9,[x19, #0x490]
009d5014	str x9,[x8, #0x360]
009d5018	b 0x009d4fc4
009d501c	str xzr,[x8, #0x360]
009d5020	bl 0x00c342a0
009d5024	adrp x0,0x2bf000
009d5028	adrp x2,0x2c9000
009d502c	add x0,x0,#0x967
009d5030	add x2,x2,#0x4e6
009d5034	mov w1,#0x653
009d5038	b 0x009d4f58
