; mbedtls_psa_asymmetric_encrypt @ 00b99f18
00b99f18	sub sp,sp,#0x70
00b99f1c	str x27,[sp, #0x10]
00b99f20	stp x26,x25,[sp, #0x20]
00b99f24	stp x24,x23,[sp, #0x30]
00b99f28	stp x22,x21,[sp, #0x40]
00b99f2c	stp x20,x19,[sp, #0x50]
00b99f30	stp x29,x30,[sp, #0x60]
00b99f34	add x29,sp,#0x60
00b99f38	mrs x27,tpidr_el0
00b99f3c	ldr x8,[x27, #0x28]
00b99f40	mov w9,#0x4001
00b99f44	mov x22,x7
00b99f48	mov x23,x6
00b99f4c	str x8,[sp, #0x8]
00b99f50	ldrh w0,[x0]
00b99f54	mov x21,x5
00b99f58	mov x20,x4
00b99f5c	mov w25,w3
00b99f60	and w8,w0,#0xffffcfff
00b99f64	cmp w8,w9
00b99f68	b.ne 0x00b99fa0
00b99f6c	mov x3,sp
00b99f70	str xzr,[sp]
00b99f74	bl 0x00c43150
00b99f78	ldr x19,[sp]
00b99f7c	mov w26,w0
00b99f80	cbnz w0,0x00b9a048
00b99f84	ldr x24,[x29, #0x18]
00b99f88	mov x0,x19
00b99f8c	bl 0x00c432f0
00b99f90	cmp x0,x24
00b99f94	b.ls 0x00b99fa8
00b99f98	mov w26,#0xffffff76
00b99f9c	b 0x00b9a048
00b99fa0	mov w26,#0xffffff7a
00b99fa4	b 0x00b9a058
00b99fa8	ldr x24,[x29, #0x10]
00b99fac	mov w8,#0x200
00b99fb0	movk w8,#0x700, LSL #16
00b99fb4	cmp w25,w8
00b99fb8	b.ne 0x00b99ffc
00b99fbc	adrp x1,0xcb5000
00b99fc0	ldr x1,[x1, #0xac0]
00b99fc4	mov x0,x19
00b99fc8	mov x2,xzr
00b99fcc	mov x3,x21
00b99fd0	mov x4,x20
00b99fd4	mov x5,x24
00b99fd8	bl 0x00c43340
00b99fdc	bl 0x00c42bf0
00b99fe0	mov w26,w0
00b99fe4	cbnz w0,0x00b9a048
00b99fe8	ldr x20,[x29, #0x20]
00b99fec	mov x0,x19
00b99ff0	bl 0x00c432f0
00b99ff4	str x0,[x20]
00b99ff8	b 0x00b9a048
00b99ffc	and w9,w25,#0xffffff00
00b9a000	add w8,w8,#0x100
00b9a004	cmp w9,w8
00b9a008	b.ne 0x00b9a030
00b9a00c	and w25,w25,#0xff
00b9a010	mov w0,w25
00b9a014	bl 0x00c30210
00b9a018	cbz x0,0x00b9a038
00b9a01c	mov w1,#0x1
00b9a020	mov x0,x19
00b9a024	mov w2,w25
00b9a028	bl 0x00c433b0
00b9a02c	b 0x00b9a03c
00b9a030	mov w26,#0xffffff79
00b9a034	b 0x00b9a048
00b9a038	mov w0,#0xffffff7a
00b9a03c	bl 0x00c42bf0
00b9a040	mov w26,w0
00b9a044	cbz w0,0x00b9a08c
00b9a048	mov x0,x19
00b9a04c	bl 0x00c432d0
00b9a050	mov x0,x19
00b9a054	bl 0x00c30960
00b9a058	ldr x8,[x27, #0x28]
00b9a05c	ldr x9,[sp, #0x8]
00b9a060	cmp x8,x9
00b9a064	b.ne 0x00b9a0b8
00b9a068	mov w0,w26
00b9a06c	ldp x29,x30,[sp, #0x60]
00b9a070	ldp x20,x19,[sp, #0x50]
00b9a074	ldp x22,x21,[sp, #0x40]
00b9a078	ldp x24,x23,[sp, #0x30]
00b9a07c	ldp x26,x25,[sp, #0x20]
00b9a080	ldr x27,[sp, #0x10]
00b9a084	add sp,sp,#0x70
00b9a088	ret
00b9a08c	adrp x1,0xcb5000
00b9a090	ldr x1,[x1, #0xac0]
00b9a094	mov x0,x19
00b9a098	mov x2,xzr
00b9a09c	mov x3,x23
00b9a0a0	mov x4,x22
00b9a0a4	mov x5,x21
00b9a0a8	mov x6,x20
00b9a0ac	mov x7,x24
00b9a0b0	bl 0x00c43380
00b9a0b4	b 0x00b99fdc
00b9a0b8	bl 0x00c2fec0
