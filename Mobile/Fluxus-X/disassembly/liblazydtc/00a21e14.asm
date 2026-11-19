; d2i_DSA_SIG @ 00a21e14
00a21e14	stp x22,x21,[sp, #-0x30]!
00a21e18	stp x20,x19,[sp, #0x10]
00a21e1c	stp x29,x30,[sp, #0x20]
00a21e20	add x29,sp,#0x20
00a21e24	tbnz x2,#0x3f,0x00a21f30
00a21e28	mov x21,x2
00a21e2c	mov x22,x1
00a21e30	mov x20,x0
00a21e34	cbz x0,0x00a21e40
00a21e38	ldr x19,[x20]
00a21e3c	cbnz x19,0x00a21e5c
00a21e40	adrp x1,0x2a3000
00a21e44	add x1,x1,#0xecc
00a21e48	mov w0,#0x10
00a21e4c	mov w2,#0x24
00a21e50	bl 0x00c34250
00a21e54	mov x19,x0
00a21e58	cbz x0,0x00a21f00
00a21e5c	ldr x8,[x19]
00a21e60	cbz x8,0x00a21ea0
00a21e64	ldr x1,[x19, #0x8]
00a21e68	cbz x1,0x00a21eb4
00a21e6c	cbz x8,0x00a21ec8
00a21e70	cbz x1,0x00a21ec8
00a21e74	mov x0,x8
00a21e78	mov x2,x22
00a21e7c	mov x3,x21
00a21e80	bl 0x00c3a3c0
00a21e84	cbz x0,0x00a21ec8
00a21e88	cbz x20,0x00a21e98
00a21e8c	ldr x8,[x20]
00a21e90	cbnz x8,0x00a21e98
00a21e94	str x19,[x20]
00a21e98	mov x0,x19
00a21e9c	b 0x00a21f34
00a21ea0	bl 0x00c37710
00a21ea4	mov x8,x0
00a21ea8	str x0,[x19]
00a21eac	ldr x1,[x19, #0x8]
00a21eb0	cbnz x1,0x00a21e6c
00a21eb4	bl 0x00c37710
00a21eb8	ldr x8,[x19]
00a21ebc	mov x1,x0
00a21ec0	str x0,[x19, #0x8]
00a21ec4	cbnz x8,0x00a21e70
00a21ec8	cbz x20,0x00a21ed8
00a21ecc	ldr x8,[x20]
00a21ed0	mov x0,xzr
00a21ed4	cbnz x8,0x00a21f34
00a21ed8	ldr x0,[x19]
00a21edc	bl 0x00c322e0
00a21ee0	ldr x0,[x19, #0x8]
00a21ee4	bl 0x00c322e0
00a21ee8	adrp x1,0x2a3000
00a21eec	add x1,x1,#0xecc
00a21ef0	orr w2,wzr,#0x30
00a21ef4	mov x0,x19
00a21ef8	bl 0x00c32310
00a21efc	b 0x00a21f30
00a21f00	bl 0x00c342a0
00a21f04	adrp x0,0x2a3000
00a21f08	adrp x2,0x2b7000
00a21f0c	add x0,x0,#0xecc
00a21f10	add x2,x2,#0x9c0
00a21f14	mov w1,#0x26
00a21f18	bl 0x00c342b0
00a21f1c	mov w1,#0x100
00a21f20	mov w0,#0xa
00a21f24	movk w1,#0xc, LSL #16
00a21f28	mov x2,xzr
00a21f2c	bl 0x00c342c0
00a21f30	mov x0,xzr
00a21f34	ldp x29,x30,[sp, #0x20]
00a21f38	ldp x20,x19,[sp, #0x10]
00a21f3c	ldp x22,x21,[sp], #0x30
00a21f40	ret
