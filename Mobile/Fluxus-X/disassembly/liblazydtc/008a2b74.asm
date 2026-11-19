; FUN_008a2b74 @ 008a2b74
008a2b74	sub sp,sp,#0xe0
008a2b78	stp x29,x30,[sp, #0xc0]
008a2b7c	stp x20,x19,[sp, #0xd0]
008a2b80	add x29,sp,#0xc0
008a2b84	mrs x19,tpidr_el0
008a2b88	movi v0.2D,#0x0
008a2b8c	mov x8,x1
008a2b90	ldr x9,[x19, #0x28]
008a2b94	stur x9,[x29, #-0x8]
008a2b98	adrp x9,0xc4c000
008a2b9c	add x9,x9,#0x280
008a2ba0	stp x9,x0,[sp]
008a2ba4	mov w9,#0x40
008a2ba8	ldr x10,[x1]
008a2bac	stp q0,q0,[sp, #0x10]
008a2bb0	str q0,[sp, #0x30]
008a2bb4	strb w9,[sp, #0x40]
008a2bb8	stur q0,[sp, #0x48]
008a2bbc	stur q0,[sp, #0x58]
008a2bc0	stur q0,[sp, #0x68]
008a2bc4	strb w9,[sp, #0x78]
008a2bc8	stp q0,q0,[sp, #0x80]
008a2bcc	str q0,[sp, #0xa0]
008a2bd0	strb w9,[sp, #0xb0]
008a2bd4	ldr x9,[x10]
008a2bd8	mov x1,sp
008a2bdc	mov x0,x8
008a2be0	blr x9
008a2be4	mov x0,sp
008a2be8	bl 0x008a2c38
008a2bec	ldr x8,[x19, #0x28]
008a2bf0	ldur x9,[x29, #-0x8]
008a2bf4	cmp x8,x9
008a2bf8	b.ne 0x008a2c34
008a2bfc	ldp x20,x19,[sp, #0xd0]
008a2c00	ldp x29,x30,[sp, #0xc0]
008a2c04	add sp,sp,#0xe0
008a2c08	ret
008a2c34	bl 0x00c2fec0
