; SRP_Calc_client_key_ex @ 00ae6d98
00ae6d98	sub sp,sp,#0x80
00ae6d9c	stp x28,x27,[sp, #0x20]
00ae6da0	mov x27,xzr
00ae6da4	stp x26,x25,[sp, #0x30]
00ae6da8	stp x24,x23,[sp, #0x40]
00ae6dac	stp x22,x21,[sp, #0x50]
00ae6db0	stp x20,x19,[sp, #0x60]
00ae6db4	stp x29,x30,[sp, #0x70]
00ae6db8	add x29,sp,#0x70
00ae6dbc	cbz x4,0x00ae6f90
00ae6dc0	mov x19,x3
00ae6dc4	cbz x3,0x00ae6f90
00ae6dc8	mov x23,x2
00ae6dcc	cbz x2,0x00ae6f90
00ae6dd0	mov x25,x0
00ae6dd4	cbz x0,0x00ae6f90
00ae6dd8	mov x22,x1
00ae6ddc	cbz x1,0x00ae6f90
00ae6de0	mov x28,x5
00ae6de4	cbz x5,0x00ae6f90
00ae6de8	mov x0,x6
00ae6dec	mov x24,x7
00ae6df0	mov x21,x6
00ae6df4	mov x26,x4
00ae6df8	bl 0x00c38a60
00ae6dfc	cbz x0,0x00ae6f8c
00ae6e00	str x0,[sp, #0x18]
00ae6e04	bl 0x00c37710
00ae6e08	mov x20,x0
00ae6e0c	cbz x0,0x00ae6f3c
00ae6e10	bl 0x00c37710
00ae6e14	str x0,[sp, #0x10]
00ae6e18	cbz x0,0x00ae6f3c
00ae6e1c	bl 0x00c37710
00ae6e20	str x0,[sp, #0x8]
00ae6e24	cbz x0,0x00ae6fb4
00ae6e28	bl 0x00c37710
00ae6e2c	mov x27,x0
00ae6e30	cbz x0,0x00ae6fc0
00ae6e34	mov w2,#0x4
00ae6e38	mov x0,x27
00ae6e3c	mov x1,x19
00ae6e40	bl 0x00c38df0
00ae6e44	mov w1,#0x4
00ae6e48	mov x0,x20
00ae6e4c	mov x19,x20
00ae6e50	bl 0x00c38dc0
00ae6e54	mov x0,x20
00ae6e58	ldr x20,[sp, #0x18]
00ae6e5c	mov x1,x23
00ae6e60	mov x2,x27
00ae6e64	mov x3,x25
00ae6e68	mov x4,x20
00ae6e6c	str x27,[sp]
00ae6e70	bl 0x00c38ad0
00ae6e74	cbz w0,0x00ae6fd4
00ae6e78	mov x0,x25
00ae6e7c	mov x1,x23
00ae6e80	mov x2,x25
00ae6e84	mov x3,x21
00ae6e88	mov x4,x24
00ae6e8c	bl 0x00ae6724
00ae6e90	mov x24,x0
00ae6e94	cbz x0,0x00ae6fd8
00ae6e98	ldr x21,[sp, #0x10]
00ae6e9c	mov x1,x19
00ae6ea0	mov x2,x24
00ae6ea4	mov x3,x25
00ae6ea8	mov x0,x21
00ae6eac	mov x4,x20
00ae6eb0	bl 0x00c38ef0
00ae6eb4	cbz w0,0x00ae6fdc
00ae6eb8	mov x0,x19
00ae6ebc	mov x1,x22
00ae6ec0	mov x2,x21
00ae6ec4	mov x3,x25
00ae6ec8	mov x4,x20
00ae6ecc	bl 0x00c38f10
00ae6ed0	cbz w0,0x00ae6fdc
00ae6ed4	ldp x23,x22,[sp]
00ae6ed8	mov x1,x28
00ae6edc	mov x3,x20
00ae6ee0	mov x0,x22
00ae6ee4	mov x2,x23
00ae6ee8	bl 0x00c39060
00ae6eec	cbz w0,0x00ae6f34
00ae6ef0	mov x0,x21
00ae6ef4	mov x1,x26
00ae6ef8	mov x2,x22
00ae6efc	bl 0x00c38870
00ae6f00	cbz w0,0x00ae6f34
00ae6f04	bl 0x00c37710
00ae6f08	mov x27,x0
00ae6f0c	cbz x0,0x00ae6f58
00ae6f10	mov x0,x27
00ae6f14	mov x1,x19
00ae6f18	mov x2,x21
00ae6f1c	mov x3,x25
00ae6f20	mov x4,x20
00ae6f24	bl 0x00c38ad0
00ae6f28	cbnz w0,0x00ae6f58
00ae6f2c	mov x0,x27
00ae6f30	bl 0x00c36290
00ae6f34	mov x27,xzr
00ae6f38	b 0x00ae6f58
00ae6f3c	mov x19,x20
00ae6f40	ldr x20,[sp, #0x18]
00ae6f44	mov x21,xzr
00ae6f48	mov x22,xzr
00ae6f4c	mov x24,xzr
00ae6f50	mov x27,xzr
00ae6f54	mov x23,xzr
00ae6f58	mov x0,x20
00ae6f5c	bl 0x00c38a30
00ae6f60	mov x0,x23
00ae6f64	bl 0x00c36290
00ae6f68	mov x0,x19
00ae6f6c	bl 0x00c322e0
00ae6f70	mov x0,x21
00ae6f74	bl 0x00c322e0
00ae6f78	mov x0,x22
00ae6f7c	bl 0x00c322e0
00ae6f80	mov x0,x24
00ae6f84	bl 0x00c36290
00ae6f88	b 0x00ae6f90
00ae6f8c	mov x27,xzr
00ae6f90	mov x0,x27
00ae6f94	ldp x29,x30,[sp, #0x70]
00ae6f98	ldp x20,x19,[sp, #0x60]
00ae6f9c	ldp x22,x21,[sp, #0x50]
00ae6fa0	ldp x24,x23,[sp, #0x40]
00ae6fa4	ldp x26,x25,[sp, #0x30]
00ae6fa8	ldp x28,x27,[sp, #0x20]
00ae6fac	add sp,sp,#0x80
00ae6fb0	ret
00ae6fb4	mov x19,x20
00ae6fb8	ldp x21,x20,[sp, #0x10]
00ae6fbc	b 0x00ae6f48
00ae6fc0	mov x19,x20
00ae6fc4	ldp x21,x20,[sp, #0x10]
00ae6fc8	ldr x22,[sp, #0x8]
00ae6fcc	mov x24,xzr
00ae6fd0	b 0x00ae6f54
00ae6fd4	mov x24,xzr
00ae6fd8	ldr x21,[sp, #0x10]
00ae6fdc	mov x27,xzr
00ae6fe0	ldp x23,x22,[sp]
00ae6fe4	b 0x00ae6f58
