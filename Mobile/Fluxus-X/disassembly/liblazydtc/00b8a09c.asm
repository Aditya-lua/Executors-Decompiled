; psa_sign_hash_start @ 00b8a09c
00b8a09c	sub sp,sp,#0x50
00b8a0a0	stp x24,x23,[sp, #0x10]
00b8a0a4	stp x22,x21,[sp, #0x20]
00b8a0a8	stp x20,x19,[sp, #0x30]
00b8a0ac	stp x29,x30,[sp, #0x40]
00b8a0b0	add x29,sp,#0x40
00b8a0b4	mrs x24,tpidr_el0
00b8a0b8	ldr x8,[x24, #0x28]
00b8a0bc	mov x22,x4
00b8a0c0	mov x23,x3
00b8a0c4	mov w3,w2
00b8a0c8	str x8,[sp, #0x8]
00b8a0cc	ldr w8,[x0]
00b8a0d0	mov x19,x0
00b8a0d4	mov w0,w1
00b8a0d8	cbnz w8,0x00b8a110
00b8a0dc	ldrb w8,[x19, #0x8]
00b8a0e0	tbnz w8,#0x0,0x00b8a110
00b8a0e4	mov w10,#0x8ff
00b8a0e8	and w9,w3,#0xffffff00
00b8a0ec	movk w10,#0x600, LSL #16
00b8a0f0	cmp w9,w10
00b8a0f4	b.gt 0x00b8a140
00b8a0f8	mov w10,#0x200
00b8a0fc	movk w10,#0x600, LSL #16
00b8a100	cmp w9,w10
00b8a104	b.eq 0x00b8a174
00b8a108	mov w10,#0x300
00b8a10c	b 0x00b8a154
00b8a110	mov w21,#0xffffff77
00b8a114	ldr x8,[x24, #0x28]
00b8a118	ldr x9,[sp, #0x8]
00b8a11c	cmp x8,x9
00b8a120	b.ne 0x00b8a260
00b8a124	mov w0,w21
00b8a128	ldp x29,x30,[sp, #0x40]
00b8a12c	ldp x20,x19,[sp, #0x30]
00b8a130	ldp x22,x21,[sp, #0x20]
00b8a134	ldp x24,x23,[sp, #0x10]
00b8a138	add sp,sp,#0x50
00b8a13c	ret
00b8a140	mov w10,#0x900
00b8a144	movk w10,#0x600, LSL #16
00b8a148	cmp w9,w10
00b8a14c	b.eq 0x00b8a174
00b8a150	mov w10,#0x1300
00b8a154	movk w10,#0x600, LSL #16
00b8a158	cmp w9,w10
00b8a15c	b.eq 0x00b8a174
00b8a160	lsr w9,w3,#0x9
00b8a164	orr w9,w9,#0x1
00b8a168	orr w10,wzr,#0x30003
00b8a16c	cmp w9,w10
00b8a170	b.ne 0x00b8a1d8
00b8a174	mov x1,sp
00b8a178	mov w2,#0x1000
00b8a17c	bl 0x00b86e5c
00b8a180	mov w21,w0
00b8a184	cbz w0,0x00b8a190
00b8a188	mov x20,xzr
00b8a18c	b 0x00b8a21c
00b8a190	ldr x21,[sp]
00b8a194	ldrh w8,[x21]
00b8a198	mvn w8,w8
00b8a19c	tst w8,#0x7000
00b8a1a0	b.ne 0x00b8a1d0
00b8a1a4	cbz x22,0x00b8a1e8
00b8a1a8	mov w1,#0x1
00b8a1ac	mov x0,x22
00b8a1b0	bl 0x00c30a30
00b8a1b4	mov x20,x0
00b8a1b8	cbz x0,0x00b8a258
00b8a1bc	mov x0,x20
00b8a1c0	mov x1,x23
00b8a1c4	mov x2,x22
00b8a1c8	bl 0x00c2ffd0
00b8a1cc	b 0x00b8a1ec
00b8a1d0	mov x20,xzr
00b8a1d4	b 0x00b8a218
00b8a1d8	orr w8,w8,#0x1
00b8a1dc	strb w8,[x19, #0x8]
00b8a1e0	mov w21,#0xffffff79
00b8a1e4	b 0x00b8a114
00b8a1e8	mov x20,xzr
00b8a1ec	str wzr,[x19, #0xc]
00b8a1f0	ldr w8,[x21, #0x4]
00b8a1f4	cmp w8,#0xff
00b8a1f8	b.hi 0x00b8a218
00b8a1fc	ldrb w8,[x19, #0x8]
00b8a200	mov w9,#0x1
00b8a204	str w9,[x19]
00b8a208	mov w21,#0xffffff7a
00b8a20c	orr w8,w8,#0x1
00b8a210	strb w8,[x19, #0x8]
00b8a214	b 0x00b8a230
00b8a218	mov w21,#0xffffff79
00b8a21c	ldrb w8,[x19, #0x8]
00b8a220	ldr w9,[x19]
00b8a224	orr w8,w8,#0x1
00b8a228	strb w8,[x19, #0x8]
00b8a22c	cbz w9,0x00b8a234
00b8a230	str wzr,[x19]
00b8a234	ldr x0,[sp]
00b8a238	bl 0x00c431e0
00b8a23c	cbz w0,0x00b8a24c
00b8a240	ldrb w8,[x19, #0x8]
00b8a244	orr w8,w8,#0x1
00b8a248	strb w8,[x19, #0x8]
00b8a24c	mov x0,x20
00b8a250	bl 0x00c30960
00b8a254	b 0x00b8a114
00b8a258	mov w21,#0xffffff73
00b8a25c	b 0x00b8a21c
00b8a260	bl 0x00c2fec0
