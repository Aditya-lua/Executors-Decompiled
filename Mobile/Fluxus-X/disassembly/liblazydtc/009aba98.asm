; ssl3_send_alert @ 009aba98
009aba98	str x21,[sp, #-0x30]!
009aba9c	stp x20,x19,[sp, #0x10]
009abaa0	stp x29,x30,[sp, #0x20]
009abaa4	ldr x9,[x0, #0x8]
009abaa8	mov x19,x0
009abaac	mov w20,w1
009abab0	add x29,sp,#0x20
009abab4	ldr x8,[x9, #0xc0]
009abab8	ldrb w10,[x8, #0x60]
009ababc	tbnz w10,#0x3,0x009abad4
009abac0	ldr w9,[x9]
009abac4	cmp w9,#0x304
009abac8	b.lt 0x009abad4
009abacc	cmp w9,#0x10, LSL #12
009abad0	b.ne 0x009abaf0
009abad4	ldr w9,[x19, #0x84]
009abad8	sub w9,w9,#0x1
009abadc	cmp w9,#0x4
009abae0	b.cc 0x009abaf0
009abae4	ldr w9,[x19, #0x8e8]
009abae8	cmp w9,#0x1
009abaec	b.ne 0x009abb68
009abaf0	mov w0,w2
009abaf4	bl 0x00c34d00
009abaf8	ldr w8,[x19]
009abafc	mov w9,#0x46
009abb00	cmp w8,#0x300
009abb04	ccmp w0,w9,#0x0,eq
009abb08	mov w8,#0x28
009abb0c	csel w21,w8,w0,eq
009abb10	tbnz w21,#0x1f,0x009abb54
009abb14	cbz w21,0x009abb20
009abb18	ldr w8,[x19, #0x44]
009abb1c	tbnz w8,#0x0,0x009abb54
009abb20	cmp w20,#0x2
009abb24	b.ne 0x009abb38
009abb28	ldr x1,[x19, #0x918]
009abb2c	cbz x1,0x009abb38
009abb30	ldr x0,[x19, #0xb88]
009abb34	bl 0x00c34cd0
009abb38	mov w8,#0x1
009abb3c	add x0,x19,#0xc58
009abb40	strb w20,[x19, #0x1a8]
009abb44	strb w21,[x19, #0x1a9]
009abb48	str w8,[x19, #0x1a4]
009abb4c	bl 0x00c347d0
009abb50	cbz w0,0x009abb78
009abb54	ldp x29,x30,[sp, #0x20]
009abb58	ldp x20,x19,[sp, #0x10]
009abb5c	mov w0,#0xffffffff
009abb60	ldr x21,[sp], #0x30
009abb64	ret
009abb68	ldr x8,[x8, #0x50]
009abb6c	mov w0,w2
009abb70	blr x8
009abb74	b 0x009abaf8
009abb78	ldr x8,[x19, #0x8]
009abb7c	mov x0,x19
009abb80	ldp x29,x30,[sp, #0x20]
009abb84	ldp x20,x19,[sp, #0x10]
009abb88	ldr x1,[x8, #0x78]
009abb8c	ldr x21,[sp], #0x30
009abb90	br x1
