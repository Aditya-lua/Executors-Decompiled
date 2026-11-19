; ix::HttpClient::generateMultipartBoundary @ 00977b44
00977b44	sub sp,sp,#0x70
00977b48	str x23,[sp, #0x30]
00977b4c	stp x22,x21,[sp, #0x40]
00977b50	stp x20,x19,[sp, #0x50]
00977b54	stp x29,x30,[sp, #0x60]
00977b58	add x29,sp,#0x60
00977b5c	mrs x21,tpidr_el0
00977b60	mov x19,x8
00977b64	ldr x8,[x21, #0x28]
00977b68	mov w0,#0x40
00977b6c	str x8,[sp, #0x28]
00977b70	stp xzr,xzr,[x19]
00977b74	str xzr,[x19, #0x10]
00977b78	bl 0x00c2fed0
00977b7c	adrp x8,0x29c000
00977b80	ldr q0,[x8, #0x990]
00977b84	adrp x8,0x2b1000
00977b88	add x8,x8,#0x93b
00977b8c	ldur q1,[x8, #0x2e]
00977b90	ldp q4,q2,[x8, #0x10]
00977b94	ldr q3,[x8]
00977b98	adrp x8,0xd20000
00977b9c	str q0,[x19]
00977ba0	stur q1,[x0, #0x2e]
00977ba4	stp q4,q2,[x0, #0x10]
00977ba8	str x0,[x19, #0x10]
00977bac	strb wzr,[x0, #0x3e]
00977bb0	str q3,[x0]
00977bb4	add x8,x8,#0x300
00977bb8	ldarb w8,[x8]
00977bbc	tbz w8,#0x0,0x00977c74
00977bc0	adrp x8,0xd21000
00977bc4	add x8,x8,#0x690
00977bc8	ldarb w8,[x8]
00977bcc	tbz w8,#0x0,0x00977d00
00977bd0	ldrb w8,[x19]
00977bd4	ldp x10,x9,[x19, #0x8]
00977bd8	lsr w11,w8,#0x1
00977bdc	tst w8,#0x1
00977be0	csel x8,x11,x10,eq
00977be4	csinc x22,x9,x19,ne
00977be8	cmp x8,#0x2
00977bec	b.lt 0x00977c4c
00977bf0	adrp x9,0x29c000
00977bf4	ldr q0,[x9, #0xb00]
00977bf8	add x9,x22,x8
00977bfc	sub x9,x9,#0x1
00977c00	cmp x9,x22
00977c04	str q0,[sp]
00977c08	b.ls 0x00977c4c
00977c0c	adrp x20,0xd20000
00977c10	sub x23,x8,#0x1
00977c14	add x20,x20,#0x308
00977c18	stp xzr,x23,[sp, #0x18]
00977c1c	mov x0,sp
00977c20	add x2,sp,#0x18
00977c24	mov x1,x20
00977c28	bl 0x00c330d0
00977c2c	cbz x0,0x00977c40
00977c30	ldrb w8,[x22, x0]
00977c34	ldrb w9,[x22]
00977c38	strb w8,[x22]
00977c3c	strb w9,[x22, x0]
00977c40	subs x23,x23,#0x1
00977c44	add x22,x22,#0x1
00977c48	b.ne 0x00977c18
00977c4c	ldr x8,[x21, #0x28]
00977c50	ldr x9,[sp, #0x28]
00977c54	cmp x8,x9
00977c58	b.ne 0x00977d6c
00977c5c	ldp x29,x30,[sp, #0x60]
00977c60	ldp x20,x19,[sp, #0x50]
00977c64	ldp x22,x21,[sp, #0x40]
00977c68	ldr x23,[sp, #0x30]
00977c6c	add sp,sp,#0x70
00977c70	ret
00977c74	adrp x0,0xd20000
00977c78	add x0,x0,#0x300
00977c7c	bl 0x00c2fe90
00977c80	cbz w0,0x00977bc0
00977c84	adrp x9,0x2cd000
00977c88	add x9,x9,#0x391
00977c8c	ldr x9,[x9]
00977c90	mov w10,#0x646e
00977c94	orr w8,wzr,#0x18
00977c98	movk w10,#0x6d6f, LSL #16
00977c9c	stp xzr,xzr,[sp]
00977ca0	str xzr,[sp, #0x10]
00977ca4	strb w8,[sp]
00977ca8	stur w10,[sp, #0x9]
00977cac	stur x9,[sp, #0x1]
00977cb0	strb wzr,[sp, #0xd]
00977cb4	adrp x0,0xd20000
00977cb8	add x0,x0,#0x2f8
00977cbc	mov x1,sp
00977cc0	bl 0x00c331e0
00977cc4	ldrb w8,[sp]
00977cc8	tbz w8,#0x0,0x00977cd4
00977ccc	ldr x0,[sp, #0x10]
00977cd0	bl 0x00c301d0
00977cd4	adrp x0,0xcb4000
00977cd8	ldr x0,[x0, #0xf30]
00977cdc	adrp x1,0xd20000
00977ce0	adrp x2,0xc48000
00977ce4	add x1,x1,#0x2f8
00977ce8	add x2,x2,#0x880
00977cec	bl 0x00c2fe70
00977cf0	adrp x0,0xd20000
00977cf4	add x0,x0,#0x300
00977cf8	bl 0x00c2fea0
00977cfc	b 0x00977bc0
00977d00	adrp x0,0xd21000
00977d04	add x0,x0,#0x690
00977d08	bl 0x00c2fe90
00977d0c	cbz w0,0x00977bd0
00977d10	adrp x0,0xd20000
00977d14	add x0,x0,#0x2f8
00977d18	bl 0x00c33200
00977d1c	mov w8,w0
00977d20	adrp x10,0xd20000
00977d24	mov w11,#0x8965
00977d28	str x8,[x10, #0x308]
00977d2c	adrp x10,0xd20000
00977d30	mov w9,#0x1
00977d34	movk w11,#0x6c07, LSL #16
00977d38	add x10,x10,#0x308
00977d3c	lsr x12,x8,#0x1e
00977d40	eor w8,w12,w8
00977d44	madd w8,w8,w11,w9
00977d48	str x8,[x10, x9, LSL #0x3]
00977d4c	add x9,x9,#0x1
00977d50	cmp x9,#0x270
00977d54	b.ne 0x00977d3c
00977d58	adrp x0,0xd21000
00977d5c	add x0,x0,#0x690
00977d60	str xzr,[x10, #0x1380]
00977d64	bl 0x00c2fea0
00977d68	b 0x00977bd0
00977d6c	bl 0x00c2fec0
