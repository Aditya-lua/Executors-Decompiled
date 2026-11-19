; ossl_asn1_item_embed_free @ 009f6e3c
009f6e3c	str x25,[sp, #-0x50]!
009f6e40	stp x24,x23,[sp, #0x10]
009f6e44	stp x22,x21,[sp, #0x20]
009f6e48	stp x20,x19,[sp, #0x30]
009f6e4c	stp x29,x30,[sp, #0x40]
009f6e50	add x29,sp,#0x40
009f6e54	cbz x0,0x009f7080
009f6e58	ldrb w9,[x1]
009f6e5c	ldr x8,[x1, #0x20]
009f6e60	mov w20,w2
009f6e64	mov x21,x1
009f6e68	mov x19,x0
009f6e6c	cbz w9,0x009f6e78
009f6e70	ldr x10,[x19]
009f6e74	cbz x10,0x009f7080
009f6e78	cbz x8,0x009f6e84
009f6e7c	ldr x24,[x8, #0x18]
009f6e80	cbnz x24,0x009f6e88
009f6e84	mov x24,xzr
009f6e88	cmp w9,#0x6
009f6e8c	b.hi 0x009f7080
009f6e90	adrp x10,0x74e000
009f6e94	add x10,x10,#0x204
009f6e98	ldrsw x9,[x10, x9, LSL #0x2]
009f6e9c	add x9,x9,x10
009f6ea0	br x9
009f6ea4	mov w1,#0xffffffff
009f6ea8	mov x0,x19
009f6eac	mov x2,x21
009f6eb0	bl 0x00c380c0
009f6eb4	cbnz w0,0x009f7080
009f6eb8	cbz x24,0x009f6ed8
009f6ebc	mov w0,#0x2
009f6ec0	mov x1,x19
009f6ec4	mov x2,x21
009f6ec8	mov x3,xzr
009f6ecc	blr x24
009f6ed0	cmp w0,#0x2
009f6ed4	b.eq 0x009f7080
009f6ed8	mov x0,x19
009f6edc	mov x1,x21
009f6ee0	bl 0x00c380d0
009f6ee4	ldr x8,[x21, #0x18]
009f6ee8	cmp x8,#0x1
009f6eec	b.lt 0x009f6f44
009f6ef0	ldr x9,[x21, #0x10]
009f6ef4	mov w10,#0x28
009f6ef8	mov x25,xzr
009f6efc	madd x8,x8,x10,x9
009f6f00	sub x22,x8,#0x28
009f6f04	ldr x0,[x19]
009f6f08	mov x1,x22
009f6f0c	mov w2,wzr
009f6f10	bl 0x00c37fc0
009f6f14	cbz x0,0x009f6f30
009f6f18	mov x23,x0
009f6f1c	mov x0,x19
009f6f20	mov x1,x23
009f6f24	bl 0x00c37ff0
009f6f28	mov x1,x23
009f6f2c	bl 0x009f70a0
009f6f30	ldr x8,[x21, #0x18]
009f6f34	add x25,x25,#0x1
009f6f38	sub x22,x22,#0x28
009f6f3c	cmp x8,x25
009f6f40	b.gt 0x009f6f04
009f6f44	cbz x24,0x009f6f5c
009f6f48	orr w0,wzr,#0x3
009f6f4c	mov x1,x19
009f6f50	mov x2,x21
009f6f54	mov x3,xzr
009f6f58	blr x24
009f6f5c	cbnz w20,0x009f7080
009f6f60	ldr x0,[x19]
009f6f64	adrp x1,0x2af000
009f6f68	add x1,x1,#0xca5
009f6f6c	mov w2,#0x73
009f6f70	b 0x009f7048
009f6f74	ldr x1,[x21, #0x10]
009f6f78	cbz x1,0x009f6f98
009f6f7c	mov x0,x19
009f6f80	ldp x29,x30,[sp, #0x40]
009f6f84	ldp x20,x19,[sp, #0x30]
009f6f88	ldp x22,x21,[sp, #0x20]
009f6f8c	ldp x24,x23,[sp, #0x10]
009f6f90	ldr x25,[sp], #0x50
009f6f94	b 0x009f70a0
009f6f98	mov x0,x19
009f6f9c	mov x1,x21
009f6fa0	mov w2,w20
009f6fa4	ldp x29,x30,[sp, #0x40]
009f6fa8	ldp x20,x19,[sp, #0x30]
009f6fac	ldp x22,x21,[sp, #0x20]
009f6fb0	ldp x24,x23,[sp, #0x10]
009f6fb4	ldr x25,[sp], #0x50
009f6fb8	b 0x009f7170
009f6fbc	cbz x24,0x009f6fdc
009f6fc0	mov w0,#0x2
009f6fc4	mov x1,x19
009f6fc8	mov x2,x21
009f6fcc	mov x3,xzr
009f6fd0	blr x24
009f6fd4	cmp w0,#0x2
009f6fd8	b.eq 0x009f7080
009f6fdc	mov x0,x19
009f6fe0	mov x1,x21
009f6fe4	bl 0x00c37fe0
009f6fe8	tbnz w0,#0x1f,0x009f701c
009f6fec	ldr x9,[x21, #0x18]
009f6ff0	sxtw x8,w0
009f6ff4	cmp x9,x8
009f6ff8	b.le 0x009f701c
009f6ffc	ldr x9,[x21, #0x10]
009f7000	mov w10,#0x28
009f7004	mov x0,x19
009f7008	madd x22,x8,x10,x9
009f700c	mov x1,x22
009f7010	bl 0x00c37ff0
009f7014	mov x1,x22
009f7018	bl 0x009f70a0
009f701c	cbz x24,0x009f7034
009f7020	orr w0,wzr,#0x3
009f7024	mov x1,x19
009f7028	mov x2,x21
009f702c	mov x3,xzr
009f7030	blr x24
009f7034	cbnz w20,0x009f7080
009f7038	ldr x0,[x19]
009f703c	adrp x1,0x2af000
009f7040	add x1,x1,#0xca5
009f7044	mov w2,#0x4b
009f7048	bl 0x00c32310
009f704c	str xzr,[x19]
009f7050	b 0x009f7080
009f7054	cbz x8,0x009f7080
009f7058	ldr x2,[x8, #0x10]
009f705c	cbz x2,0x009f7080
009f7060	mov x0,x19
009f7064	mov x1,x21
009f7068	ldp x29,x30,[sp, #0x40]
009f706c	ldp x20,x19,[sp, #0x30]
009f7070	ldp x22,x21,[sp, #0x20]
009f7074	ldp x24,x23,[sp, #0x10]
009f7078	ldr x25,[sp], #0x50
009f707c	br x2
009f7080	ldp x29,x30,[sp, #0x40]
009f7084	ldp x20,x19,[sp, #0x30]
009f7088	ldp x22,x21,[sp, #0x20]
009f708c	ldp x24,x23,[sp, #0x10]
009f7090	ldr x25,[sp], #0x50
009f7094	ret
