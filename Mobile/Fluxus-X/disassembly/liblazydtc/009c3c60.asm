; FUN_009c3c60 @ 009c3c60
009c3c60	sub sp,sp,#0x60
009c3c64	stp x26,x25,[sp, #0x10]
009c3c68	stp x24,x23,[sp, #0x20]
009c3c6c	stp x22,x21,[sp, #0x30]
009c3c70	stp x20,x19,[sp, #0x40]
009c3c74	stp x29,x30,[sp, #0x50]
009c3c78	add x29,sp,#0x50
009c3c7c	cbz x2,0x009c3d7c
009c3c80	ldr w8,[x2, #0x24]
009c3c84	mov x21,x2
009c3c88	cbz w8,0x009c3d7c
009c3c8c	ldr x9,[x0, #0x8]
009c3c90	mov w19,w1
009c3c94	mov x20,x0
009c3c98	ldr x8,[x9, #0xc0]
009c3c9c	ldr w8,[x8, #0x60]
009c3ca0	tbnz w8,#0x3,0x009c3d18
009c3ca4	ldr w9,[x9]
009c3ca8	cmp w9,#0x304
009c3cac	b.lt 0x009c3cc8
009c3cb0	cmp w9,#0x10, LSL #12
009c3cb4	b.eq 0x009c3cc8
009c3cb8	ldr w9,[x21, #0x14]
009c3cbc	mov w0,wzr
009c3cc0	cmp w9,#0x74
009c3cc4	b.eq 0x009c3d80
009c3cc8	ldr w9,[x20, #0x38]
009c3ccc	and w8,w8,#0x8
009c3cd0	orr w8,w9,w8
009c3cd4	cbnz w8,0x009c3d18
009c3cd8	ldr w8,[x20, #0x3e4]
009c3cdc	cmp w8,#0x304
009c3ce0	b.lt 0x009c3d18
009c3ce4	ldr w8,[x21, #0x14]
009c3ce8	mov w0,wzr
009c3cec	cmp w8,#0x74
009c3cf0	b.eq 0x009c3d80
009c3cf4	ldr w8,[x21, #0x10]
009c3cf8	cmp w8,#0xa
009c3cfc	b.hi 0x009c3d18
009c3d00	mov w9,#0x1
009c3d04	lsl w8,w9,w8
009c3d08	mov w9,#0x403
009c3d0c	tst w8,w9
009c3d10	mov w0,wzr
009c3d14	b.ne 0x009c3d80
009c3d18	ldr x0,[x20, #0x9a8]
009c3d1c	ldrsw x1,[x21, #0x18]
009c3d20	bl 0x00c353b0
009c3d24	mov w8,w0
009c3d28	mov w0,wzr
009c3d2c	cbnz w8,0x009c3d80
009c3d30	ldr w8,[x21, #0x14]
009c3d34	sub w9,w8,#0x3d3
009c3d38	cmp w9,#0x2
009c3d3c	b.cc 0x009c3d48
009c3d40	cmp w8,#0x32b
009c3d44	b.ne 0x009c3e40
009c3d48	ldr w9,[x20, #0x38]
009c3d4c	ldr x8,[x20, #0x8]
009c3d50	cbz w9,0x009c3d9c
009c3d54	ldr x9,[x8, #0xc0]
009c3d58	ldrb w9,[x9, #0x60]
009c3d5c	tbnz w9,#0x3,0x009c3e40
009c3d60	ldr w8,[x8]
009c3d64	cmp w8,#0x304
009c3d68	b.lt 0x009c3e40
009c3d6c	cmp w8,#0x10, LSL #12
009c3d70	mov w0,wzr
009c3d74	b.ne 0x009c3d80
009c3d78	b 0x009c3e40
009c3d7c	mov w0,wzr
009c3d80	ldp x29,x30,[sp, #0x50]
009c3d84	ldp x20,x19,[sp, #0x40]
009c3d88	ldp x22,x21,[sp, #0x30]
009c3d8c	ldp x24,x23,[sp, #0x20]
009c3d90	ldp x26,x25,[sp, #0x10]
009c3d94	add sp,sp,#0x60
009c3d98	ret
009c3d9c	ldr w8,[x8]
009c3da0	cmp w8,#0x10, LSL #12
009c3da4	b.ne 0x009c3e40
009c3da8	ldr w8,[x20, #0x3e8]
009c3dac	cmp w8,#0x304
009c3db0	b.lt 0x009c3e40
009c3db4	ldr w8,[x20, #0x3e4]
009c3db8	mov w0,wzr
009c3dbc	cmp w8,#0x303
009c3dc0	b.gt 0x009c3d80
009c3dc4	mov x0,x20
009c3dc8	bl 0x00c35380
009c3dcc	cbz x0,0x009c3d80
009c3dd0	mov x23,x0
009c3dd4	bl 0x00c325e0
009c3dd8	mov w22,w0
009c3ddc	cmp w0,#0x1
009c3de0	b.lt 0x009c3e30
009c3de4	mov w24,wzr
009c3de8	mov w26,#0x210
009c3dec	mov x0,x23
009c3df0	mov w1,w24
009c3df4	bl 0x00c32610
009c3df8	mov x25,x0
009c3dfc	orr w2,wzr,#0x10001
009c3e00	mov x0,x20
009c3e04	mov x1,x25
009c3e08	mov w3,wzr
009c3e0c	bl 0x009c2d08
009c3e10	cbnz w0,0x009c3e20
009c3e14	ldrh w8,[x25, #0x1c]
009c3e18	tst w8,w26
009c3e1c	b.ne 0x009c3e34
009c3e20	add w24,w24,#0x1
009c3e24	cmp w24,w22
009c3e28	b.lt 0x009c3dec
009c3e2c	b 0x009c3e34
009c3e30	mov w24,wzr
009c3e34	cmp w24,w22
009c3e38	mov w0,wzr
009c3e3c	b.eq 0x009c3d80
009c3e40	ldr w8,[x21, #0xc]
009c3e44	cbz w8,0x009c3e8c
009c3e48	ldr x0,[x20, #0x9a8]
009c3e4c	ldr w1,[x21, #0x10]
009c3e50	bl 0x00c34a20
009c3e54	cbz x0,0x009c3eac
009c3e58	mov x23,x0
009c3e5c	bl 0x00c34c30
009c3e60	mov w22,w0
009c3e64	mov x0,x23
009c3e68	bl 0x00c34c20
009c3e6c	cmp w22,#0x4
009c3e70	b.eq 0x009c3eb4
009c3e74	cmp w22,#0x40
009c3e78	b.eq 0x009c3ec0
009c3e7c	cmp w22,#0x72
009c3e80	b.ne 0x009c3ebc
009c3e84	mov w22,#0x43
009c3e88	b 0x009c3ec0
009c3e8c	ldrh w8,[x21, #0x8]
009c3e90	orr w9,wzr,#0xe0
009c3e94	cmp w8,#0x808
009c3e98	csel w9,w9,wzr,eq
009c3e9c	cmp w8,#0x807
009c3ea0	mov w8,#0x80
009c3ea4	csel w22,w8,w9,eq
009c3ea8	b 0x009c3ec0
009c3eac	mov w22,wzr
009c3eb0	b 0x009c3ec0
009c3eb4	mov w22,#0x27
009c3eb8	b 0x009c3ec0
009c3ebc	lsl w22,w0,#0x2
009c3ec0	ldrh w8,[x21, #0x8]
009c3ec4	add x4,sp,#0xc
009c3ec8	mov x0,x20
009c3ecc	mov w1,w19
009c3ed0	lsr w9,w8,#0x8
009c3ed4	strb w9,[sp, #0xc]
009c3ed8	strb w8,[sp, #0xd]
009c3edc	ldr w3,[x21, #0xc]
009c3ee0	mov w2,w22
009c3ee4	bl 0x00c34a30
009c3ee8	b 0x009c3d80
