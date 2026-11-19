; OSSL_STORE_load @ 00ae9eb8
00ae9eb8	sub sp,sp,#0x50
00ae9ebc	str x23,[sp, #0x10]
00ae9ec0	stp x22,x21,[sp, #0x20]
00ae9ec4	stp x20,x19,[sp, #0x30]
00ae9ec8	stp x29,x30,[sp, #0x40]
00ae9ecc	mov w8,#0x1
00ae9ed0	adrp x21,0xcb5000
00ae9ed4	ldr x21,[x21, #0x7f8]
00ae9ed8	str w8,[x0, #0x38]
00ae9edc	adrp x22,0xcb5000
00ae9ee0	ldr x22,[x22, #0x5a0]
00ae9ee4	mov x19,x0
00ae9ee8	add x20,x0,#0x48
00ae9eec	add x29,sp,#0x40
00ae9ef0	b 0x00ae9efc
00ae9ef4	mov x0,x23
00ae9ef8	bl 0x00aea0ac
00ae9efc	ldr x8,[x19, #0x8]
00ae9f00	cbz x8,0x00ae9f1c
00ae9f04	ldr x8,[x19]
00ae9f08	ldr x0,[x19, #0x10]
00ae9f0c	ldr x8,[x8, #0xb8]
00ae9f10	blr x8
00ae9f14	ldr x8,[x19, #0x8]
00ae9f18	cbnz x8,0x00ae9f2c
00ae9f1c	ldr x8,[x19]
00ae9f20	ldr x0,[x19, #0x10]
00ae9f24	ldr x8,[x8, #0x40]
00ae9f28	blr x8
00ae9f2c	cbnz w0,0x00aea020
00ae9f30	ldr x0,[x19, #0x40]
00ae9f34	cbz x0,0x00ae9f94
00ae9f38	bl 0x00c325e0
00ae9f3c	ldr x8,[x19, #0x40]
00ae9f40	cbz w0,0x00ae9f88
00ae9f44	cbz x8,0x00ae9f94
00ae9f48	mov x0,x8
00ae9f4c	bl 0x00c34e00
00ae9f50	mov x23,x0
00ae9f54	cbz x23,0x00ae9ff4
00ae9f58	ldr x8,[x19, #0x18]
00ae9f5c	cbz x8,0x00ae9ff4
00ae9f60	ldr x1,[x19, #0x20]
00ae9f64	mov x0,x23
00ae9f68	blr x8
00ae9f6c	cbz x0,0x00ae9efc
00ae9f70	mov x23,x0
00ae9f74	mov x0,x20
00ae9f78	bl 0x00c3b4a0
00ae9f7c	ldr w8,[x19, #0x28]
00ae9f80	cbnz w8,0x00aea008
00ae9f84	b 0x00aea034
00ae9f88	mov x0,x8
00ae9f8c	bl 0x00c34770
00ae9f90	str xzr,[x19, #0x40]
00ae9f94	ldr x8,[x19, #0x8]
00ae9f98	cbz x8,0x00ae9fd8
00ae9f9c	stp xzr,x19,[sp]
00ae9fa0	str wzr,[x19, #0x3c]
00ae9fa4	ldr x8,[x8, #0xb0]
00ae9fa8	ldr x0,[x19, #0x10]
00ae9fac	mov x2,sp
00ae9fb0	mov x1,x21
00ae9fb4	mov x3,x22
00ae9fb8	mov x4,x20
00ae9fbc	blr x8
00ae9fc0	cbz w0,0x00aea028
00ae9fc4	ldr x8,[x19, #0x8]
00ae9fc8	cbz x8,0x00ae9fd8
00ae9fcc	ldr x23,[sp]
00ae9fd0	cbnz x23,0x00ae9f58
00ae9fd4	b 0x00ae9ff4
00ae9fd8	ldr x8,[x19]
00ae9fdc	ldr x0,[x19, #0x10]
00ae9fe0	ldp x1,x2,[x19, #0x50]
00ae9fe4	ldr x8,[x8, #0x38]
00ae9fe8	blr x8
00ae9fec	mov x23,x0
00ae9ff0	cbnz x23,0x00ae9f58
00ae9ff4	mov x0,x20
00ae9ff8	bl 0x00c3b4a0
00ae9ffc	cbz x23,0x00aea034
00aea000	ldr w8,[x19, #0x28]
00aea004	cbz w8,0x00aea034
00aea008	ldr w9,[x23]
00aea00c	cmp w9,#0x2
00aea010	b.cc 0x00aea034
00aea014	cmp w8,w9
00aea018	b.ne 0x00ae9ef4
00aea01c	b 0x00aea034
00aea020	mov x23,xzr
00aea024	b 0x00aea034
00aea028	mov x23,xzr
00aea02c	mov w8,#0x1
00aea030	str w8,[x19, #0x3c]
00aea034	mov x0,x23
00aea038	ldp x29,x30,[sp, #0x40]
00aea03c	ldp x20,x19,[sp, #0x30]
00aea040	ldp x22,x21,[sp, #0x20]
00aea044	ldr x23,[sp, #0x10]
00aea048	add sp,sp,#0x50
00aea04c	ret
