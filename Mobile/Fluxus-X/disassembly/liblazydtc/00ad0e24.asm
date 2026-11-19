; BN_BLINDING_create_param @ 00ad0e24
00ad0e24	sub sp,sp,#0x50
00ad0e28	stp x24,x23,[sp, #0x10]
00ad0e2c	stp x22,x21,[sp, #0x20]
00ad0e30	stp x20,x19,[sp, #0x30]
00ad0e34	mov x22,x5
00ad0e38	mov x23,x4
00ad0e3c	mov x21,x3
00ad0e40	mov x24,x1
00ad0e44	mov x20,x0
00ad0e48	mov x19,x0
00ad0e4c	stp x29,x30,[sp, #0x40]
00ad0e50	add x29,sp,#0x40
00ad0e54	cbnz x0,0x00ad0e68
00ad0e58	mov x1,xzr
00ad0e5c	bl 0x00ad0ad4
00ad0e60	mov x19,x0
00ad0e64	cbz x0,0x00ad0fbc
00ad0e68	ldr x8,[x19]
00ad0e6c	cbnz x8,0x00ad0e7c
00ad0e70	bl 0x00c37710
00ad0e74	str x0,[x19]
00ad0e78	cbz x0,0x00ad0f78
00ad0e7c	ldr x8,[x19, #0x8]
00ad0e80	cbnz x8,0x00ad0e90
00ad0e84	bl 0x00c37710
00ad0e88	str x0,[x19, #0x8]
00ad0e8c	cbz x0,0x00ad0f78
00ad0e90	ldr x0,[x19, #0x10]
00ad0e94	cbz x24,0x00ad0ea8
00ad0e98	bl 0x00c36290
00ad0e9c	mov x0,x24
00ad0ea0	bl 0x00c369a0
00ad0ea4	str x0,[x19, #0x10]
00ad0ea8	cbz x0,0x00ad0f78
00ad0eac	cbz x23,0x00ad0eb4
00ad0eb0	str x23,[x19, #0x40]
00ad0eb4	cbz x22,0x00ad0ebc
00ad0eb8	str x22,[x19, #0x38]
00ad0ebc	ldr x0,[x19]
00ad0ec0	ldr x1,[x19, #0x18]
00ad0ec4	mov w2,wzr
00ad0ec8	mov x3,x21
00ad0ecc	bl 0x00c39160
00ad0ed0	cbz w0,0x00ad0f78
00ad0ed4	orr w22,wzr,#0xffffffdf
00ad0ed8	ldp x1,x0,[x19]
00ad0edc	ldr x2,[x19, #0x18]
00ad0ee0	add x4,sp,#0xc
00ad0ee4	mov x3,x21
00ad0ee8	bl 0x00c38b30
00ad0eec	cbnz x0,0x00ad0f1c
00ad0ef0	ldr w8,[sp, #0xc]
00ad0ef4	cbz w8,0x00ad0f78
00ad0ef8	adds w22,w22,#0x1
00ad0efc	b.eq 0x00ad0f4c
00ad0f00	ldr x0,[x19]
00ad0f04	ldr x1,[x19, #0x18]
00ad0f08	mov w2,wzr
00ad0f0c	mov x3,x21
00ad0f10	bl 0x00c39160
00ad0f14	cbnz w0,0x00ad0ed8
00ad0f18	b 0x00ad0f78
00ad0f1c	ldr x8,[x19, #0x40]
00ad0f20	cbz x8,0x00ad0fd8
00ad0f24	mov x22,x19
00ad0f28	ldr x5,[x22, #0x38]!
00ad0f2c	cbz x5,0x00ad0fd8
00ad0f30	ldr x0,[x19]
00ad0f34	ldp x2,x3,[x19, #0x10]
00ad0f38	mov x4,x21
00ad0f3c	mov x1,x0
00ad0f40	blr x8
00ad0f44	cbnz w0,0x00ad0ff4
00ad0f48	b 0x00ad0f78
00ad0f4c	bl 0x00c342a0
00ad0f50	adrp x0,0x2be000
00ad0f54	adrp x2,0x2a0000
00ad0f58	add x0,x0,#0x30a
00ad0f5c	add x2,x2,#0xba9
00ad0f60	mov w1,#0x11e
00ad0f64	bl 0x00c342b0
00ad0f68	orr w0,wzr,#0x3
00ad0f6c	mov w1,#0x71
00ad0f70	mov x2,xzr
00ad0f74	bl 0x00c342c0
00ad0f78	cbnz x20,0x00ad0fbc
00ad0f7c	ldr x0,[x19]
00ad0f80	bl 0x00c36290
00ad0f84	ldr x0,[x19, #0x8]
00ad0f88	bl 0x00c36290
00ad0f8c	ldr x0,[x19, #0x10]
00ad0f90	bl 0x00c36290
00ad0f94	ldr x0,[x19, #0x18]
00ad0f98	bl 0x00c36290
00ad0f9c	ldr x0,[x19, #0x48]
00ad0fa0	bl 0x00c34d40
00ad0fa4	adrp x1,0x2be000
00ad0fa8	add x1,x1,#0x30a
00ad0fac	mov w2,#0x5a
00ad0fb0	mov x0,x19
00ad0fb4	bl 0x00c32310
00ad0fb8	mov x19,xzr
00ad0fbc	mov x0,x19
00ad0fc0	ldp x29,x30,[sp, #0x40]
00ad0fc4	ldp x20,x19,[sp, #0x30]
00ad0fc8	ldp x22,x21,[sp, #0x20]
00ad0fcc	ldp x24,x23,[sp, #0x10]
00ad0fd0	add sp,sp,#0x50
00ad0fd4	ret
00ad0fd8	ldr x0,[x19]
00ad0fdc	ldp x2,x3,[x19, #0x10]
00ad0fe0	mov x4,x21
00ad0fe4	mov x1,x0
00ad0fe8	bl 0x00c38ad0
00ad0fec	cbz w0,0x00ad0f78
00ad0ff0	add x22,x19,#0x38
00ad0ff4	ldr x2,[x22]
00ad0ff8	cbz x2,0x00ad0fbc
00ad0ffc	ldr x0,[x19, #0x8]
00ad1000	mov x3,x21
00ad1004	mov x1,x0
00ad1008	bl 0x00c39020
00ad100c	cbz w0,0x00ad0f78
00ad1010	ldr x0,[x19]
00ad1014	ldr x2,[x19, #0x38]
00ad1018	mov x3,x21
00ad101c	mov x1,x0
00ad1020	bl 0x00c39020
00ad1024	cbz w0,0x00ad0f78
00ad1028	b 0x00ad0fbc
