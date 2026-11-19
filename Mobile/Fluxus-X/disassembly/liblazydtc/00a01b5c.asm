; BN_dup @ 00a01b5c
00a01b5c	str x21,[sp, #-0x30]!
00a01b60	stp x20,x19,[sp, #0x10]
00a01b64	mov x20,x0
00a01b68	stp x29,x30,[sp, #0x20]
00a01b6c	add x29,sp,#0x20
00a01b70	cbz x0,0x00a01c50
00a01b74	ldr w21,[x20, #0x14]
00a01b78	adrp x1,0x2b5000
00a01b7c	add x1,x1,#0xa6d
00a01b80	orr w0,wzr,#0x18
00a01b84	mov w2,#0xf7
00a01b88	bl 0x00c34250
00a01b8c	mov x19,x0
00a01b90	tbnz w21,#0x3,0x00a01ba0
00a01b94	cbz x19,0x00a01c1c
00a01b98	mov w8,#0x1
00a01b9c	b 0x00a01ba8
00a01ba0	cbz x19,0x00a01c1c
00a01ba4	mov w8,#0x9
00a01ba8	str w8,[x19, #0x14]
00a01bac	ldrb w8,[x20, #0x14]
00a01bb0	orr w9,wzr,#0xc
00a01bb4	mov w10,#0x8
00a01bb8	tst w8,#0x4
00a01bbc	csel x8,x10,x9,eq
00a01bc0	cmp x19,x20
00a01bc4	b.eq 0x00a01c50
00a01bc8	ldrsw x21,[x20, x8#0x0]
00a01bcc	ldr w8,[x19, #0xc]
00a01bd0	cmp w8,w21
00a01bd4	b.ge 0x00a01be8
00a01bd8	mov x0,x19
00a01bdc	mov w1,w21
00a01be0	bl 0x00a01a04
00a01be4	cbz x0,0x00a01c64
00a01be8	ldr w8,[x20, #0x8]
00a01bec	cmp w8,#0x1
00a01bf0	b.lt 0x00a01c08
00a01bf4	ldr x0,[x19]
00a01bf8	ldr x1,[x20]
00a01bfc	lsl x2,x21,#0x3
00a01c00	bl 0x00c2ffd0
00a01c04	ldr w8,[x20, #0x8]
00a01c08	ldr w9,[x20, #0x10]
00a01c0c	str w8,[x19, #0x8]
00a01c10	mov x20,x19
00a01c14	str w9,[x19, #0x10]
00a01c18	b 0x00a01c50
00a01c1c	bl 0x00c342a0
00a01c20	adrp x0,0x2b5000
00a01c24	adrp x2,0x2d1000
00a01c28	add x0,x0,#0xa6d
00a01c2c	add x2,x2,#0x72f
00a01c30	orr w1,wzr,#0xf8
00a01c34	bl 0x00c342b0
00a01c38	mov w1,#0x100
00a01c3c	orr w0,wzr,#0x3
00a01c40	movk w1,#0xc, LSL #16
00a01c44	mov x2,xzr
00a01c48	bl 0x00c342c0
00a01c4c	mov x20,xzr
00a01c50	mov x0,x20
00a01c54	ldp x29,x30,[sp, #0x20]
00a01c58	ldp x20,x19,[sp, #0x10]
00a01c5c	ldr x21,[sp], #0x30
00a01c60	ret
00a01c64	ldr w8,[x19, #0x14]
00a01c68	tbnz w8,#0x1,0x00a01ca0
00a01c6c	ldr x0,[x19]
00a01c70	tbnz w8,#0x3,0x00a01c88
00a01c74	adrp x1,0x2b5000
00a01c78	add x1,x1,#0xa6d
00a01c7c	mov w2,#0xd1
00a01c80	bl 0x00c32310
00a01c84	b 0x00a01ca0
00a01c88	ldrsw x8,[x19, #0xc]
00a01c8c	adrp x2,0x2b5000
00a01c90	add x2,x2,#0xa6d
00a01c94	mov w3,#0xcd
00a01c98	lsl x1,x8,#0x3
00a01c9c	bl 0x00c38e10
00a01ca0	ldrb w8,[x19, #0x14]
00a01ca4	mov x20,xzr
00a01ca8	tbz w8,#0x0,0x00a01c50
00a01cac	adrp x1,0x2b5000
00a01cb0	add x1,x1,#0xa6d
00a01cb4	mov w2,#0xe8
00a01cb8	mov x0,x19
00a01cbc	bl 0x00c32310
00a01cc0	b 0x00a01c4c
