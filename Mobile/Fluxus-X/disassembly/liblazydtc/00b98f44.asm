; mbedtls_psa_cipher_finish @ 00b98f44
00b98f44	sub sp,sp,#0x60
00b98f48	str x23,[sp, #0x20]
00b98f4c	stp x22,x21,[sp, #0x30]
00b98f50	stp x20,x19,[sp, #0x40]
00b98f54	stp x29,x30,[sp, #0x50]
00b98f58	add x29,sp,#0x50
00b98f5c	mrs x23,tpidr_el0
00b98f60	ldr x8,[x23, #0x28]
00b98f64	mov x21,x3
00b98f68	mov x20,x2
00b98f6c	mov x19,x1
00b98f70	str x8,[sp, #0x18]
00b98f74	ldr x8,[x0, #0x38]
00b98f78	cbz x8,0x00b98f9c
00b98f7c	ldr w8,[x0]
00b98f80	mov w9,#0x4400
00b98f84	movk w9,#0x440, LSL #16
00b98f88	orr w8,w8,#0x400
00b98f8c	cmp w8,w9
00b98f90	b.ne 0x00b98f9c
00b98f94	mov w22,#0xffffff79
00b98f98	b 0x00b98fe0
00b98f9c	add x0,x0,#0x8
00b98fa0	add x1,sp,#0x8
00b98fa4	mov x2,x21
00b98fa8	bl 0x00c42150
00b98fac	bl 0x00c42bf0
00b98fb0	mov w22,w0
00b98fb4	cbnz w0,0x00b98fe0
00b98fb8	ldr x2,[x21]
00b98fbc	cbz x2,0x00b98fdc
00b98fc0	cmp x2,x20
00b98fc4	b.ls 0x00b98fd0
00b98fc8	mov w22,#0xffffff76
00b98fcc	b 0x00b98fe0
00b98fd0	add x1,sp,#0x8
00b98fd4	mov x0,x19
00b98fd8	bl 0x00c2ffd0
00b98fdc	mov w22,wzr
00b98fe0	add x0,sp,#0x8
00b98fe4	mov w1,#0x10
00b98fe8	bl 0x00c42220
00b98fec	ldr x8,[x23, #0x28]
00b98ff0	ldr x9,[sp, #0x18]
00b98ff4	cmp x8,x9
00b98ff8	b.ne 0x00b99018
00b98ffc	mov w0,w22
00b99000	ldp x29,x30,[sp, #0x50]
00b99004	ldp x20,x19,[sp, #0x40]
00b99008	ldp x22,x21,[sp, #0x30]
00b9900c	ldr x23,[sp, #0x20]
00b99010	add sp,sp,#0x60
00b99014	ret
00b99018	bl 0x00c2fec0
