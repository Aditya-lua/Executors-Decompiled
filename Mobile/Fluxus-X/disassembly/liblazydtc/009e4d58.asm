; ssl_version_supported @ 009e4d58
009e4d58	stp x28,x27,[sp, #-0x60]!
009e4d5c	stp x26,x25,[sp, #0x10]
009e4d60	stp x24,x23,[sp, #0x20]
009e4d64	stp x22,x21,[sp, #0x30]
009e4d68	stp x20,x19,[sp, #0x40]
009e4d6c	stp x29,x30,[sp, #0x50]
009e4d70	ldr x8,[x0, #0x8]
009e4d74	mov x19,x2
009e4d78	mov x20,x0
009e4d7c	mov w21,w1
009e4d80	ldr w8,[x8]
009e4d84	add x29,sp,#0x50
009e4d88	cmp w8,#0x10, LSL #12
009e4d8c	b.eq 0x009e4db0
009e4d90	orr w9,wzr,#0x1ffff
009e4d94	cmp w8,w9
009e4d98	b.ne 0x009e4ef8
009e4d9c	adrp x22,0xc58000
009e4da0	add x22,x22,#0x828
009e4da4	ldr w8,[x22]
009e4da8	cbnz w8,0x009e4dc0
009e4dac	b 0x009e4ef0
009e4db0	adrp x22,0xc58000
009e4db4	add x22,x22,#0x798
009e4db8	ldr w8,[x22]
009e4dbc	cbz w8,0x009e4ef0
009e4dc0	cmp w21,#0x100
009e4dc4	orr w23,wzr,#0xff00
009e4dc8	mov w24,#0x1
009e4dcc	csel w25,w23,w21,eq
009e4dd0	mov w26,#0x74
009e4dd4	cmp w8,w21
009e4dd8	b.ne 0x009e4ebc
009e4ddc	ldr x9,[x22, #0x8]
009e4de0	cbz x9,0x009e4ed4
009e4de4	cmp w8,w21
009e4de8	b.ne 0x009e4ed4
009e4dec	blr x9
009e4df0	mov x1,x0
009e4df4	mov x0,x20
009e4df8	bl 0x009e4f38
009e4dfc	cbnz w0,0x009e4ed4
009e4e00	cmp w21,#0x304
009e4e04	b.ne 0x009e4f08
009e4e08	ldr w8,[x20, #0x38]
009e4e0c	cbz w8,0x009e4f08
009e4e10	ldr x9,[x20, #0x9a8]
009e4e14	cbz x9,0x009e4ed4
009e4e18	ldr x8,[x20, #0xb88]
009e4e1c	cbz x8,0x009e4ed4
009e4e20	ldr x9,[x9, #0x218]
009e4e24	cbnz x9,0x009e4f08
009e4e28	ldr x8,[x8, #0x218]
009e4e2c	cbnz x8,0x009e4f08
009e4e30	ldr x8,[x20, #0x990]
009e4e34	cbnz x8,0x009e4f08
009e4e38	ldr x8,[x20, #0x998]
009e4e3c	cbnz x8,0x009e4f08
009e4e40	ldr x8,[x20, #0x898]
009e4e44	ldr x8,[x8, #0x1b8]
009e4e48	cbnz x8,0x009e4f08
009e4e4c	mov x27,xzr
009e4e50	mov x28,xzr
009e4e54	and w8,w28,#0x7fffffff
009e4e58	cmp w8,#0x6
009e4e5c	b.hi 0x009e4e80
009e4e60	lsl w8,w24,w8
009e4e64	tst w8,w26
009e4e68	b.eq 0x009e4e80
009e4e6c	add x28,x28,#0x1
009e4e70	cmp x28,#0x9
009e4e74	add x27,x27,#0x28
009e4e78	b.cc 0x009e4e54
009e4e7c	b 0x009e4ed4
009e4e80	ldr x8,[x20, #0x898]
009e4e84	add x9,x8,x27
009e4e88	ldr x10,[x9, #0x20]
009e4e8c	cbz x10,0x009e4e6c
009e4e90	ldr x9,[x9, #0x28]
009e4e94	cbz x9,0x009e4e6c
009e4e98	cmp x28,#0x3
009e4e9c	b.ne 0x009e4f08
009e4ea0	ldr x0,[x8, #0xa0]
009e4ea4	bl 0x00c365a0
009e4ea8	mov w1,w0
009e4eac	mov x0,x20
009e4eb0	bl 0x00c367b0
009e4eb4	cbz w0,0x009e4e6c
009e4eb8	b 0x009e4f08
009e4ebc	ldr x9,[x20, #0x8]
009e4ec0	ldr x9,[x9, #0xc0]
009e4ec4	ldrb w9,[x9, #0x60]
009e4ec8	tbnz w9,#0x3,0x009e4ee0
009e4ecc	cmp w8,w21
009e4ed0	b.le 0x009e4ef0
009e4ed4	ldr w8,[x22, #0x18]!
009e4ed8	cbnz w8,0x009e4dd4
009e4edc	b 0x009e4ef0
009e4ee0	cmp w8,#0x100
009e4ee4	csel w8,w23,w8,eq
009e4ee8	cmp w25,w8
009e4eec	b.gt 0x009e4ed4
009e4ef0	mov w0,wzr
009e4ef4	b 0x009e4f1c
009e4ef8	ldr w8,[x20]
009e4efc	cmp w8,w21
009e4f00	cset w0,eq
009e4f04	b 0x009e4f1c
009e4f08	cbz x19,0x009e4f18
009e4f0c	ldr x8,[x22, #0x8]
009e4f10	blr x8
009e4f14	str x0,[x19]
009e4f18	mov w0,#0x1
009e4f1c	ldp x29,x30,[sp, #0x50]
009e4f20	ldp x20,x19,[sp, #0x40]
009e4f24	ldp x22,x21,[sp, #0x30]
009e4f28	ldp x24,x23,[sp, #0x20]
009e4f2c	ldp x26,x25,[sp, #0x10]
009e4f30	ldp x28,x27,[sp], #0x60
009e4f34	ret
