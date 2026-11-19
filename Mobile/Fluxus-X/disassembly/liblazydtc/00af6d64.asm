; X509v3_addr_canonize @ 00af6d64
00af6d64	sub sp,sp,#0xb0
00af6d68	stp x28,x27,[sp, #0x50]
00af6d6c	stp x26,x25,[sp, #0x60]
00af6d70	stp x24,x23,[sp, #0x70]
00af6d74	stp x22,x21,[sp, #0x80]
00af6d78	stp x20,x19,[sp, #0x90]
00af6d7c	stp x29,x30,[sp, #0xa0]
00af6d80	add x29,sp,#0xa0
00af6d84	mov x19,x0
00af6d88	bl 0x00c325e0
00af6d8c	cmp w0,#0x1
00af6d90	b.lt 0x00af6fd8
00af6d94	adrp x21,0xc7e000
00af6d98	mov w20,wzr
00af6d9c	add x28,sp,#0x20
00af6da0	add x21,x21,#0x788
00af6da4	mov x0,x19
00af6da8	mov w1,w20
00af6dac	bl 0x00c32610
00af6db0	ldr x8,[x0]
00af6db4	ldr w9,[x8]
00af6db8	and w10,w9,#0xfffffffe
00af6dbc	cmp w10,#0x2
00af6dc0	b.ne 0x00af7004
00af6dc4	ldr x10,[x0, #0x8]
00af6dc8	ldr w11,[x10]
00af6dcc	cmp w11,#0x1
00af6dd0	b.ne 0x00af6fc4
00af6dd4	ldr x23,[x10, #0x8]
00af6dd8	cbz x8,0x00af6e18
00af6ddc	cmp w9,#0x2
00af6de0	b.lt 0x00af6e18
00af6de4	ldr x8,[x8, #0x8]
00af6de8	mov w22,wzr
00af6dec	cbz x8,0x00af6e1c
00af6df0	ldrb w9,[x8]
00af6df4	ldrb w8,[x8, #0x1]
00af6df8	bfm w8,w9,#0x18,#0x7
00af6dfc	cmp w8,#0x1
00af6e00	cset w9,eq
00af6e04	lsl w9,w9,#0x2
00af6e08	cmp w8,#0x2
00af6e0c	mov w8,#0x10
00af6e10	csel w22,w8,w9,eq
00af6e14	b 0x00af6e1c
00af6e18	mov w22,wzr
00af6e1c	mov x0,x23
00af6e20	bl 0x00c35350
00af6e24	mov x0,x23
00af6e28	bl 0x00c325e0
00af6e2c	cmp w0,#0x2
00af6e30	b.lt 0x00af6f74
00af6e34	mov w24,wzr
00af6e38	mov x0,x23
00af6e3c	mov w1,w24
00af6e40	bl 0x00c32610
00af6e44	add w25,w24,#0x1
00af6e48	mov x26,x0
00af6e4c	mov x0,x23
00af6e50	mov w1,w25
00af6e54	bl 0x00c32610
00af6e58	mov x27,x0
00af6e5c	add x1,sp,#0x40
00af6e60	add x2,sp,#0x30
00af6e64	mov x0,x26
00af6e68	mov w3,w22
00af6e6c	bl 0x00af66d8
00af6e70	cbz w0,0x00af7004
00af6e74	add x1,sp,#0x20
00af6e78	add x2,sp,#0x10
00af6e7c	mov x0,x27
00af6e80	mov w3,w22
00af6e84	bl 0x00af66d8
00af6e88	cbz w0,0x00af7004
00af6e8c	add x0,sp,#0x40
00af6e90	add x1,sp,#0x30
00af6e94	mov x2,x22
00af6e98	bl 0x00c300b0
00af6e9c	cmp w0,#0x0
00af6ea0	b.gt 0x00af7004
00af6ea4	add x0,sp,#0x20
00af6ea8	add x1,sp,#0x10
00af6eac	mov x2,x22
00af6eb0	bl 0x00c300b0
00af6eb4	cmp w0,#0x0
00af6eb8	b.gt 0x00af7004
00af6ebc	add x0,sp,#0x30
00af6ec0	add x1,sp,#0x20
00af6ec4	mov x2,x22
00af6ec8	bl 0x00c300b0
00af6ecc	tbz w0,#0x1f,0x00af7004
00af6ed0	mov x8,x22
00af6ed4	subs x9,x8,#0x1
00af6ed8	b.lt 0x00af6ef4
00af6edc	add x8,x28,x8
00af6ee0	ldurb w10,[x8, #-0x1]
00af6ee4	sub w11,w10,#0x1
00af6ee8	sturb w11,[x8, #-0x1]
00af6eec	mov x8,x9
00af6ef0	cbz w10,0x00af6ed4
00af6ef4	add x0,sp,#0x30
00af6ef8	add x1,sp,#0x20
00af6efc	mov x2,x22
00af6f00	bl 0x00c300b0
00af6f04	cbz w0,0x00af6f10
00af6f08	mov w24,w25
00af6f0c	b 0x00af6f60
00af6f10	add x0,sp,#0x8
00af6f14	add x1,sp,#0x40
00af6f18	add x2,sp,#0x10
00af6f1c	mov w3,w22
00af6f20	bl 0x00af63d8
00af6f24	cbz w0,0x00af7008
00af6f28	ldr x2,[sp, #0x8]
00af6f2c	mov x0,x23
00af6f30	mov w1,w24
00af6f34	bl 0x00c38080
00af6f38	mov x0,x23
00af6f3c	mov w1,w25
00af6f40	bl 0x00c35320
00af6f44	mov x0,x26
00af6f48	mov x1,x21
00af6f4c	bl 0x00c36160
00af6f50	mov x0,x27
00af6f54	mov x1,x21
00af6f58	bl 0x00c36160
00af6f5c	mov w25,w24
00af6f60	mov x0,x23
00af6f64	bl 0x00c325e0
00af6f68	sub w8,w0,#0x1
00af6f6c	cmp w25,w8
00af6f70	b.lt 0x00af6e38
00af6f74	mov x0,x23
00af6f78	bl 0x00c325e0
00af6f7c	sub w1,w0,#0x1
00af6f80	mov x0,x23
00af6f84	bl 0x00c32610
00af6f88	cbz x0,0x00af6fc4
00af6f8c	ldr w8,[x0]
00af6f90	cmp w8,#0x1
00af6f94	b.ne 0x00af6fc4
00af6f98	add x1,sp,#0x40
00af6f9c	add x2,sp,#0x30
00af6fa0	mov w3,w22
00af6fa4	bl 0x00af66d8
00af6fa8	cbz w0,0x00af7004
00af6fac	add x0,sp,#0x40
00af6fb0	add x1,sp,#0x30
00af6fb4	mov x2,x22
00af6fb8	bl 0x00c300b0
00af6fbc	cmp w0,#0x0
00af6fc0	b.gt 0x00af7004
00af6fc4	mov x0,x19
00af6fc8	add w20,w20,#0x1
00af6fcc	bl 0x00c325e0
00af6fd0	cmp w20,w0
00af6fd4	b.lt 0x00af6da4
00af6fd8	adrp x1,0xaf6000
00af6fdc	add x1,x1,#0xbf8
00af6fe0	mov x0,x19
00af6fe4	bl 0x00c34df0
00af6fe8	mov x0,x19
00af6fec	bl 0x00c35350
00af6ff0	mov x0,x19
00af6ff4	bl 0x00af68c0
00af6ff8	cmp w0,#0x0
00af6ffc	cset w0,ne
00af7000	b 0x00af7008
00af7004	mov w0,wzr
00af7008	ldp x29,x30,[sp, #0xa0]
00af700c	ldp x20,x19,[sp, #0x90]
00af7010	ldp x22,x21,[sp, #0x80]
00af7014	ldp x24,x23,[sp, #0x70]
00af7018	ldp x26,x25,[sp, #0x60]
00af701c	ldp x28,x27,[sp, #0x50]
00af7020	add sp,sp,#0xb0
00af7024	ret
