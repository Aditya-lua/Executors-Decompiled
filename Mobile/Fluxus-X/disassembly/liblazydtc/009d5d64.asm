; custom_ext_parse @ 009d5d64
009d5d64	sub sp,sp,#0x60
009d5d68	stp x26,x25,[sp, #0x10]
009d5d6c	stp x24,x23,[sp, #0x20]
009d5d70	stp x22,x21,[sp, #0x30]
009d5d74	stp x20,x19,[sp, #0x40]
009d5d78	stp x29,x30,[sp, #0x50]
009d5d7c	ldr x11,[x0, #0x898]
009d5d80	mov x20,x6
009d5d84	mov x21,x5
009d5d88	mov x22,x4
009d5d8c	mov x23,x3
009d5d90	mov x19,x0
009d5d94	mov w24,w1
009d5d98	tst w1,#0x180
009d5d9c	mov w25,w2
009d5da0	add x29,sp,#0x50
009d5da4	b.eq 0x009d5dc0
009d5da8	ldr w8,[x19, #0x38]
009d5dac	cmp w8,#0x0
009d5db0	cset w8,ne
009d5db4	ldr x9,[x11, #0x1e0]
009d5db8	cbnz x9,0x009d5dcc
009d5dbc	b 0x009d5eb8
009d5dc0	mov w8,#0x2
009d5dc4	ldr x9,[x11, #0x1e0]
009d5dc8	cbz x9,0x009d5eb8
009d5dcc	ldr x11,[x11, #0x1d8]
009d5dd0	mov x10,xzr
009d5dd4	add x26,x11,#0x28
009d5dd8	ldurh w11,[x26, #-0x28]
009d5ddc	cmp w11,w25
009d5de0	b.ne 0x009d5e00
009d5de4	cmp w8,#0x2
009d5de8	b.eq 0x009d5e14
009d5dec	ldur w11,[x26, #-0x24]
009d5df0	cmp w11,w8
009d5df4	b.eq 0x009d5e1c
009d5df8	cmp w11,#0x2
009d5dfc	b.eq 0x009d5e1c
009d5e00	add x10,x10,#0x1
009d5e04	cmp x10,x9
009d5e08	add x26,x26,#0x38
009d5e0c	b.cc 0x009d5dd8
009d5e10	b 0x009d5eb8
009d5e14	cmp x26,#0x28
009d5e18	b.eq 0x009d5eb8
009d5e1c	ldur w1,[x26, #-0x20]
009d5e20	mov x0,x19
009d5e24	mov w2,w24
009d5e28	bl 0x00c36e30
009d5e2c	cbz w0,0x009d5eb8
009d5e30	tst w24,#0x700
009d5e34	b.eq 0x009d5e64
009d5e38	ldurb w8,[x26, #-0x1c]
009d5e3c	tbnz w8,#0x1,0x009d5e64
009d5e40	bl 0x00c342a0
009d5e44	adrp x0,0x2b9000
009d5e48	adrp x2,0x2c9000
009d5e4c	add x0,x0,#0xa64
009d5e50	add x2,x2,#0x4fa
009d5e54	mov w1,#0x8e
009d5e58	bl 0x00c342b0
009d5e5c	mov w1,#0x6e
009d5e60	b 0x009d5ef8
009d5e64	mov w8,#0x4080
009d5e68	tst w24,w8
009d5e6c	b.eq 0x009d5e7c
009d5e70	ldur w8,[x26, #-0x1c]
009d5e74	orr w8,w8,#0x1
009d5e78	stur w8,[x26, #-0x1c]
009d5e7c	ldr x8,[x26]
009d5e80	cbz x8,0x009d5eb8
009d5e84	ldr x9,[x26, #0x8]
009d5e88	add x7,sp,#0xc
009d5e8c	mov x0,x19
009d5e90	mov w1,w25
009d5e94	mov w2,w24
009d5e98	mov x3,x23
009d5e9c	mov x4,x22
009d5ea0	mov x5,x21
009d5ea4	mov x6,x20
009d5ea8	str x9,[sp]
009d5eac	blr x8
009d5eb0	cmp w0,#0x0
009d5eb4	b.le 0x009d5ed8
009d5eb8	mov w0,#0x1
009d5ebc	ldp x29,x30,[sp, #0x50]
009d5ec0	ldp x20,x19,[sp, #0x40]
009d5ec4	ldp x22,x21,[sp, #0x30]
009d5ec8	ldp x24,x23,[sp, #0x20]
009d5ecc	ldp x26,x25,[sp, #0x10]
009d5ed0	add sp,sp,#0x60
009d5ed4	ret
009d5ed8	bl 0x00c342a0
009d5edc	adrp x0,0x2b9000
009d5ee0	adrp x2,0x2c9000
009d5ee4	add x0,x0,#0xa64
009d5ee8	add x2,x2,#0x4fa
009d5eec	mov w1,#0xa2
009d5ef0	bl 0x00c342b0
009d5ef4	ldr w1,[sp, #0xc]
009d5ef8	mov w2,#0x6e
009d5efc	mov x0,x19
009d5f00	mov x3,xzr
009d5f04	bl 0x00c34410
009d5f08	mov w0,wzr
009d5f0c	b 0x009d5ebc
