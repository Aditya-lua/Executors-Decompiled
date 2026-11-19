; ossl_md5_sha1_ctrl @ 00aa6db8
00aa6db8	sub sp,sp,#0x90
00aa6dbc	cmp w1,#0x1d
00aa6dc0	str x21,[sp, #0x60]
00aa6dc4	stp x20,x19,[sp, #0x70]
00aa6dc8	stp x29,x30,[sp, #0x80]
00aa6dcc	add x29,sp,#0x80
00aa6dd0	b.ne 0x00aa6f50
00aa6dd4	mov x20,x0
00aa6dd8	cbz x0,0x00aa6f58
00aa6ddc	cmp w2,#0x30
00aa6de0	mov w0,wzr
00aa6de4	b.ne 0x00aa6f5c
00aa6de8	orr w2,wzr,#0x30
00aa6dec	mov x0,x20
00aa6df0	mov x1,x3
00aa6df4	mov x21,x3
00aa6df8	bl 0x00c32020
00aa6dfc	cbz w0,0x00aa6f5c
00aa6e00	add x19,x20,#0x5c
00aa6e04	orr w2,wzr,#0x30
00aa6e08	mov x0,x19
00aa6e0c	mov x1,x21
00aa6e10	bl 0x00c3d590
00aa6e14	cmp w0,#0x1
00aa6e18	b.lt 0x00aa6f58
00aa6e1c	mov x8,#0x3636
00aa6e20	movk x8,#0x3636, LSL #16
00aa6e24	movk x8,#0x3636, LSL #32
00aa6e28	movk x8,#0x3636, LSL #48
00aa6e2c	add x1,sp,#0x30
00aa6e30	orr w2,wzr,#0x30
00aa6e34	mov x0,x20
00aa6e38	stp x8,x8,[sp, #0x50]
00aa6e3c	stp x8,x8,[sp, #0x40]
00aa6e40	stp x8,x8,[sp, #0x30]
00aa6e44	bl 0x00c32020
00aa6e48	cbz w0,0x00aa6f5c
00aa6e4c	add x0,sp,#0x20
00aa6e50	mov x1,x20
00aa6e54	bl 0x00c32000
00aa6e58	cbz w0,0x00aa6f5c
00aa6e5c	add x1,sp,#0x30
00aa6e60	mov w2,#0x28
00aa6e64	mov x0,x19
00aa6e68	bl 0x00c3d590
00aa6e6c	cbz w0,0x00aa6f5c
00aa6e70	add x0,sp,#0xc
00aa6e74	mov x1,x19
00aa6e78	bl 0x00c3d570
00aa6e7c	cbz w0,0x00aa6f5c
00aa6e80	mov x0,x20
00aa6e84	bl 0x00c32010
00aa6e88	cbz w0,0x00aa6f5c
00aa6e8c	mov x0,x19
00aa6e90	bl 0x00c3d580
00aa6e94	cbz w0,0x00aa6f5c
00aa6e98	orr w2,wzr,#0x30
00aa6e9c	mov x0,x20
00aa6ea0	mov x1,x21
00aa6ea4	bl 0x00c32020
00aa6ea8	cbz w0,0x00aa6f5c
00aa6eac	orr w2,wzr,#0x30
00aa6eb0	mov x0,x19
00aa6eb4	mov x1,x21
00aa6eb8	bl 0x00c3d590
00aa6ebc	cmp w0,#0x1
00aa6ec0	b.lt 0x00aa6f58
00aa6ec4	mov x8,#0x5c5c
00aa6ec8	movk x8,#0x5c5c, LSL #16
00aa6ecc	movk x8,#0x5c5c, LSL #32
00aa6ed0	movk x8,#0x5c5c, LSL #48
00aa6ed4	add x1,sp,#0x30
00aa6ed8	orr w2,wzr,#0x30
00aa6edc	mov x0,x20
00aa6ee0	stp x8,x8,[sp, #0x50]
00aa6ee4	stp x8,x8,[sp, #0x40]
00aa6ee8	stp x8,x8,[sp, #0x30]
00aa6eec	bl 0x00c32020
00aa6ef0	cbz w0,0x00aa6f5c
00aa6ef4	add x1,sp,#0x20
00aa6ef8	mov w2,#0x10
00aa6efc	mov x0,x20
00aa6f00	bl 0x00c32020
00aa6f04	cbz w0,0x00aa6f5c
00aa6f08	add x1,sp,#0x30
00aa6f0c	mov w2,#0x28
00aa6f10	mov x0,x19
00aa6f14	bl 0x00c3d590
00aa6f18	cbz w0,0x00aa6f5c
00aa6f1c	add x1,sp,#0xc
00aa6f20	mov w2,#0x14
00aa6f24	mov x0,x19
00aa6f28	bl 0x00c3d590
00aa6f2c	cbz w0,0x00aa6f5c
00aa6f30	add x0,sp,#0x20
00aa6f34	mov w1,#0x10
00aa6f38	bl 0x00c34750
00aa6f3c	add x0,sp,#0xc
00aa6f40	mov w1,#0x14
00aa6f44	bl 0x00c34750
00aa6f48	mov w0,#0x1
00aa6f4c	b 0x00aa6f5c
00aa6f50	orr w0,wzr,#0xfffffffe
00aa6f54	b 0x00aa6f5c
00aa6f58	mov w0,wzr
00aa6f5c	ldp x29,x30,[sp, #0x80]
00aa6f60	ldp x20,x19,[sp, #0x70]
00aa6f64	ldr x21,[sp, #0x60]
00aa6f68	add sp,sp,#0x90
00aa6f6c	ret
