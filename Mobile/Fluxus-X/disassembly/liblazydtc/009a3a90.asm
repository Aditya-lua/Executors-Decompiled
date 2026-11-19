; ix::SocketOpenSSL::getSSLError @ 009a3a90
009a3a90	stp x20,x19,[sp, #-0x20]!
009a3a94	stp x29,x30,[sp, #0x10]
009a3a98	add x29,sp,#0x10
009a3a9c	ldr x0,[x0, #0x40]
009a3aa0	mov w20,w1
009a3aa4	mov x19,x8
009a3aa8	bl 0x00c32910
009a3aac	sub w8,w0,#0x7
009a3ab0	cmp w8,#0x1
009a3ab4	b.hi 0x009a3b08
009a3ab8	orr w0,wzr,#0x30
009a3abc	stp xzr,xzr,[x19]
009a3ac0	str xzr,[x19, #0x10]
009a3ac4	bl 0x00c2fed0
009a3ac8	adrp x11,0x2ab000
009a3acc	str x0,[x19, #0x10]
009a3ad0	adrp x8,0x29c000
009a3ad4	mov w9,#0x65
009a3ad8	mov w10,#0x7275
009a3adc	add x11,x11,#0xa67
009a3ae0	ldr q0,[x8, #0x910]
009a3ae4	ldp q1,q2,[x11]
009a3ae8	strb w9,[x0, #0x22]
009a3aec	strh w10,[x0, #0x20]
009a3af0	str q0,[x19]
009a3af4	stp q1,q2,[x0]
009a3af8	strb wzr,[x0, #0x23]
009a3afc	ldp x29,x30,[sp, #0x10]
009a3b00	ldp x20,x19,[sp], #0x20
009a3b04	ret
009a3b08	cmp w0,#0x6
009a3b0c	b.hi 0x009a3bbc
009a3b10	adrp x9,0x74a000
009a3b14	mov w8,w0
009a3b18	add x9,x9,#0xbac
009a3b1c	ldrsw x8,[x9, x8, LSL #0x2]
009a3b20	add x8,x8,x9
009a3b24	br x8
009a3b28	mov w0,#0x20
009a3b2c	stp xzr,xzr,[x19]
009a3b30	str xzr,[x19, #0x10]
009a3b34	bl 0x00c2fed0
009a3b38	adrp x9,0x2a1000
009a3b3c	adrp x8,0x29c000
009a3b40	add x9,x9,#0xc17
009a3b44	ldr q0,[x8, #0x7c0]
009a3b48	ldur q1,[x9, #0x9]
009a3b4c	ldr q2,[x9]
009a3b50	str x0,[x19, #0x10]
009a3b54	str q0,[x19]
009a3b58	stur q1,[x0, #0x9]
009a3b5c	str q2,[x0]
009a3b60	strb wzr,[x0, #0x19]
009a3b64	b 0x009a3afc
009a3b68	bl 0x00c32400
009a3b6c	adrp x9,0x2bd000
009a3b70	add x9,x9,#0x388
009a3b74	ldr q0,[x9]
009a3b78	mov w8,#0x22
009a3b7c	mov w9,#0x20
009a3b80	stp xzr,xzr,[x19, #0x8]
009a3b84	str xzr,[x19]
009a3b88	strb w8,[x19]
009a3b8c	strb w9,[x19, #0x11]
009a3b90	stur q0,[x19, #0x1]
009a3b94	strb wzr,[x19, #0x12]
009a3b98	mov x1,xzr
009a3b9c	bl 0x00c34000
009a3ba0	mov x20,x0
009a3ba4	bl 0x00c2ff50
009a3ba8	mov x2,x0
009a3bac	mov x0,x19
009a3bb0	mov x1,x20
009a3bb4	bl 0x00c308c0
009a3bb8	b 0x009a3afc
009a3bbc	mov w0,#0x20
009a3bc0	stp xzr,xzr,[x19]
009a3bc4	str xzr,[x19, #0x10]
009a3bc8	bl 0x00c2fed0
009a3bcc	adrp x9,0x2c1000
009a3bd0	adrp x8,0x29c000
009a3bd4	add x9,x9,#0x425
009a3bd8	ldr q0,[x8, #0x410]
009a3bdc	ldur q1,[x9, #0xe]
009a3be0	ldr q2,[x9]
009a3be4	str x0,[x19, #0x10]
009a3be8	str q0,[x19]
009a3bec	stur q1,[x0, #0xe]
009a3bf0	str q2,[x0]
009a3bf4	strb wzr,[x0, #0x1e]
009a3bf8	b 0x009a3afc
009a3bfc	mov w0,#0x20
009a3c00	stp xzr,xzr,[x19]
009a3c04	str xzr,[x19, #0x10]
009a3c08	bl 0x00c2fed0
009a3c0c	adrp x9,0x2d9000
009a3c10	adrp x8,0x29c000
009a3c14	add x9,x9,#0x3b0
009a3c18	ldr q0,[x8, #0x650]
009a3c1c	ldur q1,[x9, #0xb]
009a3c20	ldr q2,[x9]
009a3c24	str x0,[x19, #0x10]
009a3c28	str q0,[x19]
009a3c2c	stur q1,[x0, #0xb]
009a3c30	str q2,[x0]
009a3c34	strb wzr,[x0, #0x1b]
009a3c38	b 0x009a3afc
009a3c3c	bl 0x00c32400
009a3c40	cbz x0,0x009a3ccc
009a3c44	adrp x9,0x2bd000
009a3c48	add x9,x9,#0x388
009a3c4c	ldr q0,[x9]
009a3c50	mov w8,#0x22
009a3c54	mov w9,#0x20
009a3c58	stp xzr,xzr,[x19, #0x8]
009a3c5c	str xzr,[x19]
009a3c60	strb w8,[x19]
009a3c64	strb w9,[x19, #0x11]
009a3c68	stur q0,[x19, #0x1]
009a3c6c	strb wzr,[x19, #0x12]
009a3c70	mov x1,xzr
009a3c74	bl 0x00c34000
009a3c78	mov x20,x0
009a3c7c	bl 0x00c2ff50
009a3c80	mov x2,x0
009a3c84	mov x0,x19
009a3c88	mov x1,x20
009a3c8c	bl 0x00c308c0
009a3c90	b 0x009a3afc
009a3c94	orr w0,wzr,#0x30
009a3c98	stp xzr,xzr,[x19]
009a3c9c	str xzr,[x19, #0x10]
009a3ca0	bl 0x00c2fed0
009a3ca4	adrp x9,0x2a7000
009a3ca8	adrp x8,0x29c000
009a3cac	add x9,x9,#0x801
009a3cb0	ldr q0,[x8, #0x5c0]
009a3cb4	ldp q2,q1,[x9]
009a3cb8	str x0,[x19, #0x10]
009a3cbc	strb wzr,[x0, #0x20]
009a3cc0	str q0,[x19]
009a3cc4	stp q2,q1,[x0]
009a3cc8	b 0x009a3afc
009a3ccc	stp xzr,xzr,[x19]
009a3cd0	str xzr,[x19, #0x10]
009a3cd4	cbz w20,0x009a3d18
009a3cd8	mov w0,#0x40
009a3cdc	bl 0x00c2fed0
009a3ce0	adrp x9,0x2c9000
009a3ce4	adrp x8,0x29c000
009a3ce8	add x9,x9,#0x262
009a3cec	ldr q0,[x8, #0xc70]
009a3cf0	ldur x8,[x9, #0x2d]
009a3cf4	ldp q3,q1,[x9, #0x10]
009a3cf8	ldr q2,[x9]
009a3cfc	str x0,[x19, #0x10]
009a3d00	str q0,[x19]
009a3d04	stur x8,[x0, #0x2d]
009a3d08	stp q3,q1,[x0, #0x10]
009a3d0c	str q2,[x0]
009a3d10	strb wzr,[x0, #0x35]
009a3d14	b 0x009a3afc
009a3d18	orr w0,wzr,#0x30
009a3d1c	bl 0x00c2fed0
009a3d20	adrp x11,0x2a7000
009a3d24	adrp x8,0x29c000
009a3d28	mov w9,#0x46
009a3d2c	mov w10,#0x4f45
009a3d30	add x11,x11,#0x7dd
009a3d34	str x0,[x19, #0x10]
009a3d38	b 0x009a3ae0
