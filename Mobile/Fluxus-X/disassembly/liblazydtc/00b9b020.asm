; mbedtls_ecdh_make_params @ 00b9b020
00b9b020	sub sp,sp,#0x80
00b9b024	stp x28,x27,[sp, #0x20]
00b9b028	stp x26,x25,[sp, #0x30]
00b9b02c	stp x24,x23,[sp, #0x40]
00b9b030	stp x22,x21,[sp, #0x50]
00b9b034	stp x20,x19,[sp, #0x60]
00b9b038	stp x29,x30,[sp, #0x70]
00b9b03c	add x29,sp,#0x70
00b9b040	mrs x24,tpidr_el0
00b9b044	ldr x8,[x24, #0x28]
00b9b048	mov x25,x5
00b9b04c	mov x26,x4
00b9b050	mov x20,x3
00b9b054	str x8,[sp, #0x18]
00b9b058	ldr w8,[x0, #0x8]
00b9b05c	mov x21,x2
00b9b060	mov x27,x0
00b9b064	mov x19,x1
00b9b068	cmp w8,#0x1
00b9b06c	b.ne 0x00b9b114
00b9b070	ldr x8,[x27, #0x88]
00b9b074	cbz x8,0x00b9b114
00b9b078	ldrb w22,[x27]
00b9b07c	add x23,x27,#0x10
00b9b080	add x28,x27,#0xd0
00b9b084	mov x0,x23
00b9b088	mov x1,x28
00b9b08c	mov x2,x26
00b9b090	mov x3,x25
00b9b094	bl 0x00c42680
00b9b098	cbnz w0,0x00b9b118
00b9b09c	add x8,x27,#0xe0
00b9b0a0	add x3,x27,#0x48
00b9b0a4	mov x0,x23
00b9b0a8	mov x1,x8
00b9b0ac	mov x2,x28
00b9b0b0	mov x4,x26
00b9b0b4	mov x5,x25
00b9b0b8	mov x6,xzr
00b9b0bc	mov x27,x8
00b9b0c0	bl 0x00c42710
00b9b0c4	cbnz w0,0x00b9b118
00b9b0c8	add x1,sp,#0x10
00b9b0cc	mov x0,x23
00b9b0d0	mov x2,x21
00b9b0d4	mov x3,x20
00b9b0d8	bl 0x00c427d0
00b9b0dc	cbnz w0,0x00b9b118
00b9b0e0	ldr x8,[sp, #0x10]
00b9b0e4	add x3,sp,#0x8
00b9b0e8	mov x0,x23
00b9b0ec	mov x1,x27
00b9b0f0	add x4,x21,x8
00b9b0f4	sub x5,x20,x8
00b9b0f8	mov w2,w22
00b9b0fc	bl 0x00c427e0
00b9b100	cbnz w0,0x00b9b118
00b9b104	ldp x9,x8,[sp, #0x8]
00b9b108	add x8,x9,x8
00b9b10c	str x8,[x19]
00b9b110	b 0x00b9b118
00b9b114	mov w0,#0xffffb080
00b9b118	ldr x8,[x24, #0x28]
00b9b11c	ldr x9,[sp, #0x18]
00b9b120	cmp x8,x9
00b9b124	b.ne 0x00b9b148
00b9b128	ldp x29,x30,[sp, #0x70]
00b9b12c	ldp x20,x19,[sp, #0x60]
00b9b130	ldp x22,x21,[sp, #0x50]
00b9b134	ldp x24,x23,[sp, #0x40]
00b9b138	ldp x26,x25,[sp, #0x30]
00b9b13c	ldp x28,x27,[sp, #0x20]
00b9b140	add sp,sp,#0x80
00b9b144	ret
00b9b148	bl 0x00c2fec0
