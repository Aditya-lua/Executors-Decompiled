; ossl_method_store_cache_set @ 00ac4c4c
00ac4c4c	sub sp,sp,#0x90
00ac4c50	stp x26,x25,[sp, #0x40]
00ac4c54	mov w25,w2
00ac4c58	mov w26,wzr
00ac4c5c	str x27,[sp, #0x30]
00ac4c60	stp x24,x23,[sp, #0x50]
00ac4c64	stp x22,x21,[sp, #0x60]
00ac4c68	stp x20,x19,[sp, #0x70]
00ac4c6c	stp x29,x30,[sp, #0x80]
00ac4c70	add x29,sp,#0x80
00ac4c74	cbz x1,0x00ac4df0
00ac4c78	mov x19,x0
00ac4c7c	cbz x0,0x00ac4df0
00ac4c80	cmp w25,#0x1
00ac4c84	b.lt 0x00ac4df0
00ac4c88	mov x20,x3
00ac4c8c	cbz x3,0x00ac4df0
00ac4c90	ldr x0,[x19, #0x10]
00ac4c94	mov x23,x6
00ac4c98	mov x21,x5
00ac4c9c	mov x22,x4
00ac4ca0	mov x24,x1
00ac4ca4	bl 0x00c356a0
00ac4ca8	cbz w0,0x00ac4d18
00ac4cac	ldr w8,[x19, #0x28]
00ac4cb0	cbz w8,0x00ac4d20
00ac4cb4	str xzr,[sp, #0x8]
00ac4cb8	strb wzr,[sp, #0x14]
00ac4cbc	bl 0x00c3e010
00ac4cc0	str w0,[sp, #0x10]
00ac4cc4	cbnz w0,0x00ac4cdc
00ac4cc8	mov w8,#0x1
00ac4ccc	strb w8,[sp, #0x14]
00ac4cd0	adrp x8,0xcc9000
00ac4cd4	ldr w8,[x8, #0x188]
00ac4cd8	str w8,[sp, #0x10]
00ac4cdc	mov x26,x19
00ac4ce0	ldr x0,[x26, #0x8]!
00ac4ce4	adrp x1,0xac4000
00ac4ce8	add x1,x1,#0xf34
00ac4cec	mov x2,sp
00ac4cf0	str wzr,[x26, #0x20]
00ac4cf4	bl 0x00c3ec50
00ac4cf8	ldr x8,[sp, #0x8]
00ac4cfc	str x8,[x26, #0x18]
00ac4d00	ldrb w8,[sp, #0x14]
00ac4d04	cbz w8,0x00ac4d24
00ac4d08	ldr w8,[sp, #0x10]
00ac4d0c	adrp x9,0xcc9000
00ac4d10	str w8,[x9, #0x188]
00ac4d14	b 0x00ac4d24
00ac4d18	mov w26,wzr
00ac4d1c	b 0x00ac4df0
00ac4d20	add x26,x19,#0x8
00ac4d24	ldr x0,[x26]
00ac4d28	sxtw x1,w25
00ac4d2c	bl 0x00c3ec70
00ac4d30	cbz x0,0x00ac4dcc
00ac4d34	mov x26,x0
00ac4d38	cbz x22,0x00ac4e14
00ac4d3c	mov x0,x20
00ac4d40	bl 0x00c2ff50
00ac4d44	adrp x1,0x2ca000
00ac4d48	mov x27,x0
00ac4d4c	add x0,x0,#0x30
00ac4d50	add x1,x1,#0x2a4
00ac4d54	mov w2,#0x2e7
00ac4d58	bl 0x00c32320
00ac4d5c	mov x25,x0
00ac4d60	cbz x0,0x00ac4dd0
00ac4d64	add x8,x25,#0x28
00ac4d68	mov x0,x22
00ac4d6c	stp x22,x21,[x25, #0x10]
00ac4d70	stp x24,x8,[x25]
00ac4d74	str x23,[x25, #0x20]
00ac4d78	blr x21
00ac4d7c	cbz w0,0x00ac4dd0
00ac4d80	ldr x0,[x25, #0x8]
00ac4d84	add x2,x27,#0x1
00ac4d88	mov x1,x20
00ac4d8c	bl 0x00c2ffd0
00ac4d90	ldr x0,[x26, #0x10]
00ac4d94	mov x1,x25
00ac4d98	bl 0x00c34dc0
00ac4d9c	cbz x0,0x00ac4e68
00ac4da0	mov x20,x0
00ac4da4	ldr x8,[x0, #0x20]
00ac4da8	ldr x0,[x0, #0x10]
00ac4dac	blr x8
00ac4db0	adrp x1,0x2ca000
00ac4db4	add x1,x1,#0x2a4
00ac4db8	mov w2,#0xdc
00ac4dbc	mov x0,x20
00ac4dc0	bl 0x00c32310
00ac4dc4	mov w26,#0x1
00ac4dc8	b 0x00ac4de8
00ac4dcc	mov x25,xzr
00ac4dd0	adrp x1,0x2ca000
00ac4dd4	add x1,x1,#0x2a4
00ac4dd8	mov w2,#0x2fe
00ac4ddc	mov x0,x25
00ac4de0	bl 0x00c32310
00ac4de4	mov w26,wzr
00ac4de8	ldr x0,[x19, #0x10]
00ac4dec	bl 0x00c35690
00ac4df0	mov w0,w26
00ac4df4	ldp x29,x30,[sp, #0x80]
00ac4df8	ldp x20,x19,[sp, #0x70]
00ac4dfc	ldp x22,x21,[sp, #0x60]
00ac4e00	ldp x24,x23,[sp, #0x50]
00ac4e04	ldp x26,x25,[sp, #0x40]
00ac4e08	ldr x27,[sp, #0x30]
00ac4e0c	add sp,sp,#0x90
00ac4e10	ret
00ac4e14	stp x24,x20,[sp]
00ac4e18	ldr x0,[x26, #0x10]
00ac4e1c	mov x1,sp
00ac4e20	bl 0x00c36010
00ac4e24	cbz x0,0x00ac4e60
00ac4e28	mov x20,x0
00ac4e2c	ldr x8,[x0, #0x20]
00ac4e30	ldr x0,[x0, #0x10]
00ac4e34	blr x8
00ac4e38	adrp x1,0x2ca000
00ac4e3c	add x1,x1,#0x2a4
00ac4e40	mov w2,#0xdc
00ac4e44	mov x0,x20
00ac4e48	bl 0x00c32310
00ac4e4c	ldr x8,[x19, #0x20]
00ac4e50	mov w26,#0x1
00ac4e54	sub x8,x8,#0x1
00ac4e58	str x8,[x19, #0x20]
00ac4e5c	b 0x00ac4de8
00ac4e60	mov w26,#0x1
00ac4e64	b 0x00ac4de8
00ac4e68	ldr x0,[x26, #0x10]
00ac4e6c	bl 0x00c395f0
00ac4e70	cbz w0,0x00ac4e84
00ac4e74	ldr x8,[x25, #0x20]
00ac4e78	ldr x0,[x25, #0x10]
00ac4e7c	blr x8
00ac4e80	b 0x00ac4dd0
00ac4e84	ldr x8,[x19, #0x20]
00ac4e88	mov w26,#0x1
00ac4e8c	add x8,x8,#0x1
00ac4e90	cmp x8,#0x1f4
00ac4e94	str x8,[x19, #0x20]
00ac4e98	b.cc 0x00ac4de8
00ac4e9c	str w26,[x19, #0x28]
00ac4ea0	b 0x00ac4de8
