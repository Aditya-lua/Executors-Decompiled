; mbedtls_rsa_public @ 00ba6dc8
00ba6dc8	sub sp,sp,#0x70
00ba6dcc	str x25,[sp, #0x20]
00ba6dd0	stp x24,x23,[sp, #0x30]
00ba6dd4	stp x22,x21,[sp, #0x40]
00ba6dd8	stp x20,x19,[sp, #0x50]
00ba6ddc	stp x29,x30,[sp, #0x60]
00ba6de0	add x29,sp,#0x60
00ba6de4	mrs x25,tpidr_el0
00ba6de8	ldr x8,[x25, #0x28]
00ba6dec	add x20,x0,#0x10
00ba6df0	mov x21,x0
00ba6df4	mov x19,x2
00ba6df8	str x8,[sp, #0x18]
00ba6dfc	ldr x23,[x0, #0x8]
00ba6e00	mov x0,x20
00ba6e04	mov x22,x1
00ba6e08	bl 0x00c41d30
00ba6e0c	cmp x23,x0
00ba6e10	b.ne 0x00ba6e94
00ba6e14	ldr x8,[x21, #0x8]
00ba6e18	cmp x8,#0x400
00ba6e1c	b.hi 0x00ba6e94
00ba6e20	mov x0,x20
00ba6e24	mov x1,xzr
00ba6e28	bl 0x00c41b40
00ba6e2c	cmp w0,#0x1
00ba6e30	b.lt 0x00ba6e94
00ba6e34	mov x0,x20
00ba6e38	mov x1,xzr
00ba6e3c	bl 0x00c41be0
00ba6e40	cbz w0,0x00ba6e94
00ba6e44	add x23,x21,#0x20
00ba6e48	mov x0,x23
00ba6e4c	mov x1,xzr
00ba6e50	bl 0x00c41b40
00ba6e54	cmp w0,#0x1
00ba6e58	b.lt 0x00ba6e94
00ba6e5c	add x0,sp,#0x8
00ba6e60	bl 0x00c41c00
00ba6e64	ldr x2,[x21, #0x8]
00ba6e68	add x0,sp,#0x8
00ba6e6c	mov x1,x22
00ba6e70	bl 0x00c41ca0
00ba6e74	mov w22,w0
00ba6e78	cbnz w0,0x00ba6ee8
00ba6e7c	add x0,sp,#0x8
00ba6e80	mov x1,x20
00ba6e84	bl 0x00c41b50
00ba6e88	tbnz w0,#0x1f,0x00ba6ec4
00ba6e8c	orr w22,wzr,#0xfffffffc
00ba6e90	b 0x00ba6ee8
00ba6e94	mov w0,#0xffffbf80
00ba6e98	ldr x8,[x25, #0x28]
00ba6e9c	ldr x9,[sp, #0x18]
00ba6ea0	cmp x8,x9
00ba6ea4	b.ne 0x00ba6f24
00ba6ea8	ldp x29,x30,[sp, #0x60]
00ba6eac	ldp x20,x19,[sp, #0x50]
00ba6eb0	ldp x22,x21,[sp, #0x40]
00ba6eb4	ldp x24,x23,[sp, #0x30]
00ba6eb8	ldr x25,[sp, #0x20]
00ba6ebc	add sp,sp,#0x70
00ba6ec0	ret
00ba6ec4	ldr x24,[x21, #0x8]
00ba6ec8	add x4,x21,#0x90
00ba6ecc	add x0,sp,#0x8
00ba6ed0	add x1,sp,#0x8
00ba6ed4	mov x2,x23
00ba6ed8	mov x3,x20
00ba6edc	bl 0x00c41b90
00ba6ee0	mov w22,w0
00ba6ee4	cbz w0,0x00ba6efc
00ba6ee8	add x0,sp,#0x8
00ba6eec	bl 0x00c41bb0
00ba6ef0	mov w8,#0xffffbd80
00ba6ef4	add w0,w22,w8
00ba6ef8	b 0x00ba6e98
00ba6efc	add x0,sp,#0x8
00ba6f00	mov x1,x19
00ba6f04	mov x2,x24
00ba6f08	bl 0x00c41d80
00ba6f0c	mov w22,w0
00ba6f10	add x0,sp,#0x8
00ba6f14	bl 0x00c41bb0
00ba6f18	cbnz w22,0x00ba6ef0
00ba6f1c	mov w0,wzr
00ba6f20	b 0x00ba6e98
00ba6f24	bl 0x00c2fec0
