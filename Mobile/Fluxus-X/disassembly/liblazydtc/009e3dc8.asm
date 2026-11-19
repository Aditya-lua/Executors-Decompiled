; tls_process_change_cipher_spec @ 009e3dc8
009e3dc8	str x19,[sp, #-0x20]!
009e3dcc	stp x29,x30,[sp, #0x10]
009e3dd0	ldr x8,[x0, #0x8]
009e3dd4	mov x19,x0
009e3dd8	add x29,sp,#0x10
009e3ddc	ldr x8,[x8, #0xc0]
009e3de0	ldrb w9,[x8, #0x60]
009e3de4	ldr x8,[x1, #0x8]
009e3de8	tbnz w9,#0x3,0x009e3e0c
009e3dec	cbz x8,0x009e3e6c
009e3df0	bl 0x00c342a0
009e3df4	adrp x0,0x2bb000
009e3df8	adrp x2,0x2b5000
009e3dfc	add x0,x0,#0x912
009e3e00	add x2,x2,#0x9f8
009e3e04	mov w1,#0x2eb
009e3e08	b 0x009e3e44
009e3e0c	ldr w9,[x19]
009e3e10	cmp x8,#0x2
009e3e14	b.eq 0x009e3e20
009e3e18	cmp w9,#0x100
009e3e1c	b.eq 0x009e3e2c
009e3e20	cbz x8,0x009e3e6c
009e3e24	cmp w9,#0x100
009e3e28	b.eq 0x009e3e6c
009e3e2c	bl 0x00c342a0
009e3e30	adrp x0,0x2bb000
009e3e34	adrp x2,0x2b5000
009e3e38	add x0,x0,#0x912
009e3e3c	add x2,x2,#0x9f8
009e3e40	mov w1,#0x2e6
009e3e44	bl 0x00c342b0
009e3e48	mov w1,#0x32
009e3e4c	mov w2,#0x67
009e3e50	mov x0,x19
009e3e54	mov x3,xzr
009e3e58	bl 0x00c34410
009e3e5c	mov w0,wzr
009e3e60	ldp x29,x30,[sp, #0x10]
009e3e64	ldr x19,[sp], #0x20
009e3e68	ret
009e3e6c	ldr x8,[x19, #0x2e0]
009e3e70	cbz x8,0x009e3ec8
009e3e74	mov w8,#0x1
009e3e78	mov x0,x19
009e3e7c	str w8,[x19, #0x198]
009e3e80	bl 0x00c34cf0
009e3e84	cbz w0,0x009e3ef0
009e3e88	ldr x8,[x19, #0x8]
009e3e8c	ldr x8,[x8, #0xc0]
009e3e90	ldrb w8,[x8, #0x60]
009e3e94	tbz w8,#0x3,0x009e3ec0
009e3e98	mov w1,#0x1
009e3e9c	mov x0,x19
009e3ea0	bl 0x00c36b80
009e3ea4	ldr w8,[x19]
009e3ea8	cmp w8,#0x100
009e3eac	b.ne 0x009e3ec0
009e3eb0	ldr x8,[x19, #0x4b8]
009e3eb4	ldrh w9,[x8, #0x110]
009e3eb8	add w9,w9,#0x1
009e3ebc	strh w9,[x8, #0x110]
009e3ec0	orr w0,wzr,#0x3
009e3ec4	b 0x009e3e60
009e3ec8	bl 0x00c342a0
009e3ecc	adrp x0,0x2bb000
009e3ed0	adrp x2,0x2b5000
009e3ed4	add x0,x0,#0x912
009e3ed8	add x2,x2,#0x9f8
009e3edc	mov w1,#0x2f2
009e3ee0	bl 0x00c342b0
009e3ee4	mov w1,#0xa
009e3ee8	mov w2,#0x85
009e3eec	b 0x009e3e50
009e3ef0	bl 0x00c342a0
009e3ef4	adrp x0,0x2bb000
009e3ef8	adrp x2,0x2b5000
009e3efc	add x0,x0,#0x912
009e3f00	add x2,x2,#0x9f8
009e3f04	mov w1,#0x2f8
009e3f08	bl 0x00c342b0
009e3f0c	mov w2,#0x103
009e3f10	mov w1,#0x50
009e3f14	movk w2,#0xc, LSL #16
009e3f18	b 0x009e3e50
