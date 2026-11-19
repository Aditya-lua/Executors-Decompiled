; tls_construct_ctos_padding @ 009d3e08
009d3e08	sub sp,sp,#0x40
009d3e0c	stp x20,x19,[sp, #0x20]
009d3e10	stp x29,x30,[sp, #0x30]
009d3e14	ldrb w8,[x0, #0x9e8]
009d3e18	str x21,[sp, #0x10]
009d3e1c	add x29,sp,#0x30
009d3e20	tbnz w8,#0x4,0x009d3e2c
009d3e24	mov w0,#0x2
009d3e28	b 0x009d3f58
009d3e2c	mov x20,x1
009d3e30	mov x19,x0
009d3e34	add x1,sp,#0x8
009d3e38	mov x0,x20
009d3e3c	bl 0x00c34370
009d3e40	cbz w0,0x009d3f04
009d3e44	ldr x8,[x19, #0x918]
009d3e48	ldr w9,[x8]
009d3e4c	cmp w9,#0x304
009d3e50	b.ne 0x009d3e94
009d3e54	ldr x9,[x8, #0x340]
009d3e58	cbz x9,0x009d3e94
009d3e5c	ldr x8,[x8, #0x2f8]
009d3e60	cbz x8,0x009d3e94
009d3e64	ldr x0,[x19, #0x9a8]
009d3e68	ldr w1,[x8, #0x40]
009d3e6c	bl 0x00c34a20
009d3e70	cbz x0,0x009d3e94
009d3e74	ldr x8,[x19, #0x918]
009d3e78	ldr x21,[x8, #0x340]
009d3e7c	bl 0x00c34c20
009d3e80	ldr x8,[sp, #0x8]
009d3e84	add x9,x21,w0, SXTW 
009d3e88	add x8,x9,x8
009d3e8c	add x8,x8,#0xf
009d3e90	str x8,[sp, #0x8]
009d3e94	ldr x8,[sp, #0x8]
009d3e98	and x9,x8,#-0x100
009d3e9c	cmp x9,#0x100
009d3ea0	b.ne 0x009d3efc
009d3ea4	mov w9,#0x200
009d3ea8	orr w10,wzr,#0x1fc
009d3eac	sub x9,x9,x8
009d3eb0	sub x8,x10,x8
009d3eb4	cmp x9,#0x4
009d3eb8	csinc x8,x8,xzr,hi
009d3ebc	mov w1,#0x15
009d3ec0	mov w2,#0x2
009d3ec4	mov x0,x20
009d3ec8	str x8,[sp, #0x8]
009d3ecc	bl 0x00c343a0
009d3ed0	cbz w0,0x009d3f20
009d3ed4	ldr x1,[sp, #0x8]
009d3ed8	add x2,sp,#0x18
009d3edc	mov w3,#0x2
009d3ee0	mov x0,x20
009d3ee4	bl 0x00c36f60
009d3ee8	cbz w0,0x009d3f20
009d3eec	ldr x0,[sp, #0x18]
009d3ef0	ldr x2,[sp, #0x8]
009d3ef4	mov w1,wzr
009d3ef8	bl 0x00c301c0
009d3efc	mov w0,#0x1
009d3f00	b 0x009d3f58
009d3f04	bl 0x00c342a0
009d3f08	adrp x0,0x2bf000
009d3f0c	adrp x2,0x29f000
009d3f10	add x0,x0,#0x967
009d3f14	add x2,x2,#0xeac
009d3f18	mov w1,#0x39d
009d3f1c	b 0x009d3f38
009d3f20	bl 0x00c342a0
009d3f24	adrp x0,0x2bf000
009d3f28	adrp x2,0x29f000
009d3f2c	add x0,x0,#0x967
009d3f30	add x2,x2,#0xeac
009d3f34	mov w1,#0x3c5
009d3f38	bl 0x00c342b0
009d3f3c	mov w2,#0x103
009d3f40	mov w1,#0x50
009d3f44	movk w2,#0xc, LSL #16
009d3f48	mov x0,x19
009d3f4c	mov x3,xzr
009d3f50	bl 0x00c34410
009d3f54	mov w0,wzr
009d3f58	ldp x29,x30,[sp, #0x30]
009d3f5c	ldp x20,x19,[sp, #0x20]
009d3f60	ldr x21,[sp, #0x10]
009d3f64	add sp,sp,#0x40
009d3f68	ret
