; mbedtls_gcm_crypt_and_tag @ 00b77ee0
00b77ee0	sub sp,sp,#0x50
00b77ee4	stp x24,x23,[sp, #0x10]
00b77ee8	stp x22,x21,[sp, #0x20]
00b77eec	stp x20,x19,[sp, #0x30]
00b77ef0	stp x29,x30,[sp, #0x40]
00b77ef4	add x29,sp,#0x40
00b77ef8	mrs x24,tpidr_el0
00b77efc	ldr x8,[x24, #0x28]
00b77f00	mov x21,x2
00b77f04	mov x2,x3
00b77f08	mov x3,x4
00b77f0c	mov x20,x7
00b77f10	mov x22,x6
00b77f14	mov x23,x5
00b77f18	mov x19,x0
00b77f1c	str x8,[sp, #0x8]
00b77f20	bl 0x00c421d0
00b77f24	cbnz w0,0x00b77f6c
00b77f28	mov x0,x19
00b77f2c	mov x1,x23
00b77f30	mov x2,x22
00b77f34	bl 0x00c421f0
00b77f38	cbnz w0,0x00b77f6c
00b77f3c	ldr x3,[x29, #0x10]
00b77f40	mov x5,sp
00b77f44	mov x0,x19
00b77f48	mov x1,x20
00b77f4c	mov x2,x21
00b77f50	mov x4,x21
00b77f54	bl 0x00c421e0
00b77f58	cbnz w0,0x00b77f6c
00b77f5c	ldp x5,x4,[x29, #0x18]
00b77f60	mov x3,sp
00b77f64	mov x0,x19
00b77f68	bl 0x00c421c0
00b77f6c	ldr x8,[x24, #0x28]
00b77f70	ldr x9,[sp, #0x8]
00b77f74	cmp x8,x9
00b77f78	b.ne 0x00b77f94
00b77f7c	ldp x29,x30,[sp, #0x40]
00b77f80	ldp x20,x19,[sp, #0x30]
00b77f84	ldp x22,x21,[sp, #0x20]
00b77f88	ldp x24,x23,[sp, #0x10]
00b77f8c	add sp,sp,#0x50
00b77f90	ret
00b77f94	bl 0x00c2fec0
