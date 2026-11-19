; ossl_rsa_check_crt_components @ 00ad9db4
00ad9db4	stp x24,x23,[sp, #-0x40]!
00ad9db8	stp x22,x21,[sp, #0x10]
00ad9dbc	stp x20,x19,[sp, #0x20]
00ad9dc0	stp x29,x30,[sp, #0x30]
00ad9dc4	ldp x9,x8,[x0, #0x50]
00ad9dc8	mov x23,x0
00ad9dcc	add x29,sp,#0x30
00ad9dd0	cbz x9,0x00ad9f8c
00ad9dd4	cbz x8,0x00ad9f84
00ad9dd8	ldr x8,[x23, #0x60]
00ad9ddc	cbz x8,0x00ad9f84
00ad9de0	mov x0,x1
00ad9de4	mov x19,x1
00ad9de8	bl 0x00c38a90
00ad9dec	mov x0,x19
00ad9df0	bl 0x00c38a40
00ad9df4	mov x20,x0
00ad9df8	mov x0,x19
00ad9dfc	bl 0x00c38a40
00ad9e00	mov x21,x0
00ad9e04	mov x0,x19
00ad9e08	bl 0x00c38a40
00ad9e0c	mov x22,x0
00ad9e10	cbz x0,0x00ad9fa4
00ad9e14	mov w1,#0x4
00ad9e18	mov x0,x20
00ad9e1c	bl 0x00c38dc0
00ad9e20	mov w1,#0x4
00ad9e24	mov x0,x21
00ad9e28	bl 0x00c38dc0
00ad9e2c	mov w1,#0x4
00ad9e30	mov x0,x22
00ad9e34	bl 0x00c38dc0
00ad9e38	ldr x1,[x23, #0x40]
00ad9e3c	mov x0,x21
00ad9e40	bl 0x00c36990
00ad9e44	cbz x0,0x00ad9fa4
00ad9e48	mov w1,#0x1
00ad9e4c	mov x0,x21
00ad9e50	bl 0x00c38fd0
00ad9e54	cbz w0,0x00ad9fa4
00ad9e58	ldr x1,[x23, #0x48]
00ad9e5c	mov x0,x22
00ad9e60	bl 0x00c36990
00ad9e64	cbz x0,0x00ad9fa4
00ad9e68	mov w1,#0x1
00ad9e6c	mov x0,x22
00ad9e70	bl 0x00c38fd0
00ad9e74	cbz w0,0x00ad9fa4
00ad9e78	ldr x24,[x23, #0x50]
00ad9e7c	bl 0x00c38de0
00ad9e80	mov x1,x0
00ad9e84	mov x0,x24
00ad9e88	bl 0x00c38cc0
00ad9e8c	cmp w0,#0x1
00ad9e90	b.lt 0x00ad9fa4
00ad9e94	ldr x0,[x23, #0x50]
00ad9e98	mov x1,x21
00ad9e9c	bl 0x00c38cc0
00ad9ea0	mov w24,wzr
00ad9ea4	tbz w0,#0x1f,0x00ad9fa8
00ad9ea8	ldr x24,[x23, #0x58]
00ad9eac	bl 0x00c38de0
00ad9eb0	mov x1,x0
00ad9eb4	mov x0,x24
00ad9eb8	bl 0x00c38cc0
00ad9ebc	cmp w0,#0x1
00ad9ec0	b.lt 0x00ad9fa4
00ad9ec4	ldr x0,[x23, #0x58]
00ad9ec8	mov x1,x22
00ad9ecc	bl 0x00c38cc0
00ad9ed0	mov w24,wzr
00ad9ed4	tbz w0,#0x1f,0x00ad9fa8
00ad9ed8	ldr x24,[x23, #0x60]
00ad9edc	bl 0x00c38de0
00ad9ee0	mov x1,x0
00ad9ee4	mov x0,x24
00ad9ee8	bl 0x00c38cc0
00ad9eec	cmp w0,#0x1
00ad9ef0	b.lt 0x00ad9fa4
00ad9ef4	ldr x0,[x23, #0x60]
00ad9ef8	ldr x1,[x23, #0x40]
00ad9efc	bl 0x00c38cc0
00ad9f00	mov w24,wzr
00ad9f04	tbz w0,#0x1f,0x00ad9fa8
00ad9f08	ldr x1,[x23, #0x50]
00ad9f0c	ldr x2,[x23, #0x30]
00ad9f10	mov x0,x20
00ad9f14	mov x3,x21
00ad9f18	mov x4,x19
00ad9f1c	bl 0x00c38ef0
00ad9f20	cbz w0,0x00ad9fa4
00ad9f24	mov x0,x20
00ad9f28	bl 0x00c38d20
00ad9f2c	cbz w0,0x00ad9fa4
00ad9f30	ldr x1,[x23, #0x58]
00ad9f34	ldr x2,[x23, #0x30]
00ad9f38	mov x0,x20
00ad9f3c	mov x3,x22
00ad9f40	mov x4,x19
00ad9f44	bl 0x00c38ef0
00ad9f48	cbz w0,0x00ad9fa4
00ad9f4c	mov x0,x20
00ad9f50	bl 0x00c38d20
00ad9f54	cbz w0,0x00ad9fa4
00ad9f58	ldr x1,[x23, #0x60]
00ad9f5c	ldp x3,x2,[x23, #0x40]
00ad9f60	mov x0,x20
00ad9f64	mov x4,x19
00ad9f68	bl 0x00c38ef0
00ad9f6c	cbz w0,0x00ad9fa4
00ad9f70	mov x0,x20
00ad9f74	bl 0x00c38d20
00ad9f78	cmp w0,#0x0
00ad9f7c	cset w24,ne
00ad9f80	b 0x00ad9fa8
00ad9f84	mov w24,wzr
00ad9f88	b 0x00ad9fc8
00ad9f8c	mov w24,wzr
00ad9f90	cbnz x8,0x00ad9fc8
00ad9f94	ldr x8,[x23, #0x60]
00ad9f98	cmp x8,#0x0
00ad9f9c	cset w0,eq
00ad9fa0	b 0x00ad9fcc
00ad9fa4	mov w24,wzr
00ad9fa8	mov x0,x20
00ad9fac	bl 0x00c38ca0
00ad9fb0	mov x0,x21
00ad9fb4	bl 0x00c38ca0
00ad9fb8	mov x0,x22
00ad9fbc	bl 0x00c38ca0
00ad9fc0	mov x0,x19
00ad9fc4	bl 0x00c38a20
00ad9fc8	mov w0,w24
00ad9fcc	ldp x29,x30,[sp, #0x30]
00ad9fd0	ldp x20,x19,[sp, #0x20]
00ad9fd4	ldp x22,x21,[sp, #0x10]
00ad9fd8	ldp x24,x23,[sp], #0x40
00ad9fdc	ret
