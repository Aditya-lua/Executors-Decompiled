; EVP_BytesToKey @ 00ab7c44
00ab7c44	sub sp,sp,#0xc0
00ab7c48	stp x28,x27,[sp, #0x60]
00ab7c4c	stp x26,x25,[sp, #0x70]
00ab7c50	stp x24,x23,[sp, #0x80]
00ab7c54	stp x22,x21,[sp, #0x90]
00ab7c58	stp x20,x19,[sp, #0xa0]
00ab7c5c	stp x29,x30,[sp, #0xb0]
00ab7c60	add x29,sp,#0xb0
00ab7c64	mov x22,x7
00ab7c68	mov x23,x6
00ab7c6c	mov w21,w5
00ab7c70	mov w26,w4
00ab7c74	mov x24,x3
00ab7c78	mov x20,x2
00ab7c7c	mov x27,x1
00ab7c80	mov x25,x0
00ab7c84	str wzr,[sp, #0x1c]
00ab7c88	bl 0x00c34bd0
00ab7c8c	mov w19,w0
00ab7c90	mov x0,x25
00ab7c94	bl 0x00c34bc0
00ab7c98	cmp w19,#0x41
00ab7c9c	b.ge 0x00ab7e70
00ab7ca0	mov w28,w0
00ab7ca4	cmp w0,#0x11
00ab7ca8	b.ge 0x00ab7e88
00ab7cac	cbz x24,0x00ab7e4c
00ab7cb0	str x20,[sp, #0x10]
00ab7cb4	bl 0x00c31fa0
00ab7cb8	mov x20,x0
00ab7cbc	cbz x0,0x00ab7e34
00ab7cc0	sxtw x8,w26
00ab7cc4	add x26,sp,#0x20
00ab7cc8	str wzr,[sp, #0x18]
00ab7ccc	stp x24,x8,[sp]
00ab7cd0	mov x0,x20
00ab7cd4	mov x1,x27
00ab7cd8	mov x2,xzr
00ab7cdc	bl 0x00c31f70
00ab7ce0	cbz w0,0x00ab7e34
00ab7ce4	ldr w8,[sp, #0x18]
00ab7ce8	cbz w8,0x00ab7d00
00ab7cec	ldr w2,[sp, #0x1c]
00ab7cf0	add x1,sp,#0x20
00ab7cf4	mov x0,x20
00ab7cf8	bl 0x00c31f80
00ab7cfc	cbz w0,0x00ab7e34
00ab7d00	ldr x2,[sp, #0x8]
00ab7d04	mov x0,x20
00ab7d08	mov x1,x24
00ab7d0c	bl 0x00c31f80
00ab7d10	cbz w0,0x00ab7e34
00ab7d14	ldr x1,[sp, #0x10]
00ab7d18	cbz x1,0x00ab7d2c
00ab7d1c	mov w2,#0x8
00ab7d20	mov x0,x20
00ab7d24	bl 0x00c31f80
00ab7d28	cbz w0,0x00ab7e34
00ab7d2c	add x1,sp,#0x20
00ab7d30	add x2,sp,#0x1c
00ab7d34	mov x0,x20
00ab7d38	bl 0x00c31f60
00ab7d3c	cbz w0,0x00ab7e34
00ab7d40	cmp w21,#0x2
00ab7d44	b.cc 0x00ab7d94
00ab7d48	mov w24,#0x1
00ab7d4c	mov x0,x20
00ab7d50	mov x1,x27
00ab7d54	mov x2,xzr
00ab7d58	bl 0x00c31f70
00ab7d5c	cbz w0,0x00ab7e34
00ab7d60	ldr w2,[sp, #0x1c]
00ab7d64	add x1,sp,#0x20
00ab7d68	mov x0,x20
00ab7d6c	bl 0x00c31f80
00ab7d70	cbz w0,0x00ab7e34
00ab7d74	add x1,sp,#0x20
00ab7d78	add x2,sp,#0x1c
00ab7d7c	mov x0,x20
00ab7d80	bl 0x00c31f60
00ab7d84	cbz w0,0x00ab7e34
00ab7d88	add w24,w24,#0x1
00ab7d8c	cmp w24,w21
00ab7d90	b.cc 0x00ab7d4c
00ab7d94	cbz w19,0x00ab7dcc
00ab7d98	mov x8,xzr
00ab7d9c	mov w9,w19
00ab7da0	ldr w10,[sp, #0x1c]
00ab7da4	cmp x8,x10
00ab7da8	b.eq 0x00ab7dd4
00ab7dac	cbz x23,0x00ab7db8
00ab7db0	ldrb w10,[x26, x8]
00ab7db4	strb w10,[x23], #0x1
00ab7db8	add x8,x8,#0x1
00ab7dbc	cmp w9,w8
00ab7dc0	b.ne 0x00ab7da0
00ab7dc4	mov w19,wzr
00ab7dc8	b 0x00ab7dd8
00ab7dcc	mov w8,wzr
00ab7dd0	b 0x00ab7dd8
00ab7dd4	sub w19,w19,w8
00ab7dd8	ldr w9,[sp, #0x18]
00ab7ddc	ldr x24,[sp]
00ab7de0	add w9,w9,#0x1
00ab7de4	str w9,[sp, #0x18]
00ab7de8	cbz w28,0x00ab7e1c
00ab7dec	ldr w9,[sp, #0x1c]
00ab7df0	cmp w8,w9
00ab7df4	b.eq 0x00ab7e1c
00ab7df8	cbz x22,0x00ab7e04
00ab7dfc	ldrb w9,[x26, w8, UXTW ]
00ab7e00	strb w9,[x22], #0x1
00ab7e04	subs w28,w28,#0x1
00ab7e08	b.eq 0x00ab7e1c
00ab7e0c	ldr w9,[sp, #0x1c]
00ab7e10	add w8,w8,#0x1
00ab7e14	cmp w8,w9
00ab7e18	b.ne 0x00ab7df8
00ab7e1c	orr w8,w28,w19
00ab7e20	cbnz w8,0x00ab7cd0
00ab7e24	mov x0,x25
00ab7e28	bl 0x00c34bd0
00ab7e2c	mov w19,w0
00ab7e30	b 0x00ab7e38
00ab7e34	mov w19,wzr
00ab7e38	mov x0,x20
00ab7e3c	bl 0x00c31f90
00ab7e40	add x0,sp,#0x20
00ab7e44	mov w1,#0x40
00ab7e48	bl 0x00c34750
00ab7e4c	mov w0,w19
00ab7e50	ldp x29,x30,[sp, #0xb0]
00ab7e54	ldp x20,x19,[sp, #0xa0]
00ab7e58	ldp x22,x21,[sp, #0x90]
00ab7e5c	ldp x24,x23,[sp, #0x80]
00ab7e60	ldp x26,x25,[sp, #0x70]
00ab7e64	ldp x28,x27,[sp, #0x60]
00ab7e68	add sp,sp,#0xc0
00ab7e6c	ret
00ab7e70	adrp x0,0x2d4000
00ab7e74	adrp x1,0x2dc000
00ab7e78	add x0,x0,#0x2d2
00ab7e7c	add x1,x1,#0x80e
00ab7e80	mov w2,#0x5a
00ab7e84	bl 0x00c3c240
00ab7e88	adrp x0,0x2d2000
00ab7e8c	adrp x1,0x2dc000
00ab7e90	add x0,x0,#0x201
00ab7e94	add x1,x1,#0x80e
00ab7e98	mov w2,#0x5b
00ab7e9c	bl 0x00c3c240
