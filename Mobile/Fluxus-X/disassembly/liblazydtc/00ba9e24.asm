; mbedtls_oid_get_md_alg @ 00ba9e24
00ba9e24	str x21,[sp, #-0x30]!
00ba9e28	stp x20,x19,[sp, #0x10]
00ba9e2c	stp x29,x30,[sp, #0x20]
00ba9e30	add x29,sp,#0x20
00ba9e34	mov x19,x1
00ba9e38	cbz x0,0x00ba9ec0
00ba9e3c	ldr x8,[x0, #0x8]
00ba9e40	cmp x8,#0x5
00ba9e44	b.eq 0x00ba9e84
00ba9e48	cmp x8,#0x9
00ba9e4c	b.eq 0x00ba9ec8
00ba9e50	cmp x8,#0x8
00ba9e54	b.ne 0x00ba9ec0
00ba9e58	ldr x8,[x0, #0x10]
00ba9e5c	mov x9,#0x862a
00ba9e60	movk x9,#0x8648, LSL #16
00ba9e64	movk x9,#0xdf7, LSL #32
00ba9e68	ldr x8,[x8]
00ba9e6c	movk x9,#0x502, LSL #48
00ba9e70	cmp x8,x9
00ba9e74	b.ne 0x00ba9ec0
00ba9e78	adrp x8,0xcab000
00ba9e7c	add x8,x8,#0x988
00ba9e80	b 0x00ba9fe0
00ba9e84	ldr x20,[x0, #0x10]
00ba9e88	adrp x0,0x2b6000
00ba9e8c	add x0,x0,#0xb06
00ba9e90	mov w2,#0x5
00ba9e94	mov x1,x20
00ba9e98	bl 0x00c300b0
00ba9e9c	adrp x21,0xcab000
00ba9ea0	add x21,x21,#0x988
00ba9ea4	cbz w0,0x00ba9f9c
00ba9ea8	adrp x0,0x2be000
00ba9eac	add x0,x0,#0xc32
00ba9eb0	mov w2,#0x5
00ba9eb4	mov x1,x20
00ba9eb8	bl 0x00c300b0
00ba9ebc	cbz w0,0x00ba9fac
00ba9ec0	mov w0,#0xffffffd2
00ba9ec4	b 0x00ba9fec
00ba9ec8	ldr x20,[x0, #0x10]
00ba9ecc	adrp x0,0x2ab000
00ba9ed0	add x0,x0,#0x1c1
00ba9ed4	mov w2,#0x9
00ba9ed8	mov x1,x20
00ba9edc	bl 0x00c300b0
00ba9ee0	adrp x21,0xcab000
00ba9ee4	add x21,x21,#0x988
00ba9ee8	cbz w0,0x00ba9fa4
00ba9eec	adrp x0,0x2b4000
00ba9ef0	add x0,x0,#0xffe
00ba9ef4	mov w2,#0x9
00ba9ef8	mov x1,x20
00ba9efc	bl 0x00c300b0
00ba9f00	cbz w0,0x00ba9fb4
00ba9f04	adrp x0,0x2c8000
00ba9f08	add x0,x0,#0x8fd
00ba9f0c	mov w2,#0x9
00ba9f10	mov x1,x20
00ba9f14	bl 0x00c300b0
00ba9f18	cbz w0,0x00ba9fbc
00ba9f1c	adrp x0,0x2c6000
00ba9f20	add x0,x0,#0x945
00ba9f24	mov w2,#0x9
00ba9f28	mov x1,x20
00ba9f2c	bl 0x00c300b0
00ba9f30	cbz w0,0x00ba9fc4
00ba9f34	adrp x0,0x2c6000
00ba9f38	add x0,x0,#0x94f
00ba9f3c	mov w2,#0x9
00ba9f40	mov x1,x20
00ba9f44	bl 0x00c300b0
00ba9f48	cbz w0,0x00ba9fcc
00ba9f4c	adrp x0,0x2d6000
00ba9f50	add x0,x0,#0xda3
00ba9f54	mov w2,#0x9
00ba9f58	mov x1,x20
00ba9f5c	bl 0x00c300b0
00ba9f60	cbz w0,0x00ba9fd4
00ba9f64	adrp x0,0x2b3000
00ba9f68	add x0,x0,#0x1bc
00ba9f6c	mov w2,#0x9
00ba9f70	mov x1,x20
00ba9f74	bl 0x00c300b0
00ba9f78	cbz w0,0x00ba9fdc
00ba9f7c	adrp x0,0x2be000
00ba9f80	add x0,x0,#0xc38
00ba9f84	mov w2,#0x9
00ba9f88	mov x1,x20
00ba9f8c	bl 0x00c300b0
00ba9f90	cbnz w0,0x00ba9ec0
00ba9f94	add x8,x21,#0x190
00ba9f98	b 0x00ba9fe0
00ba9f9c	add x8,x21,#0x28
00ba9fa0	b 0x00ba9fe0
00ba9fa4	add x8,x21,#0x50
00ba9fa8	b 0x00ba9fe0
00ba9fac	add x8,x21,#0xf0
00ba9fb0	b 0x00ba9fe0
00ba9fb4	add x8,x21,#0x78
00ba9fb8	b 0x00ba9fe0
00ba9fbc	add x8,x21,#0xa0
00ba9fc0	b 0x00ba9fe0
00ba9fc4	add x8,x21,#0xc8
00ba9fc8	b 0x00ba9fe0
00ba9fcc	add x8,x21,#0x118
00ba9fd0	b 0x00ba9fe0
00ba9fd4	add x8,x21,#0x140
00ba9fd8	b 0x00ba9fe0
00ba9fdc	add x8,x21,#0x168
00ba9fe0	ldr w8,[x8, #0x20]
00ba9fe4	mov w0,wzr
00ba9fe8	str w8,[x19]
00ba9fec	ldp x29,x30,[sp, #0x20]
00ba9ff0	ldp x20,x19,[sp, #0x10]
00ba9ff4	ldr x21,[sp], #0x30
00ba9ff8	ret
