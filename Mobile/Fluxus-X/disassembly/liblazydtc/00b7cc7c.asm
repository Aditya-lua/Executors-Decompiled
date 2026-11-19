; mbedtls_asn1_get_sequence_of @ 00b7cc7c
00b7cc7c	sub sp,sp,#0x40
00b7cc80	str x19,[sp, #0x20]
00b7cc84	stp x29,x30,[sp, #0x30]
00b7cc88	add x29,sp,#0x30
00b7cc8c	mrs x19,tpidr_el0
00b7cc90	ldr x8,[x19, #0x28]
00b7cc94	movi v0.2D,#0x0
00b7cc98	nop
00b7cc9c	adr x6,0xb7cce8
00b7cca0	str x8,[sp, #0x18]
00b7cca4	str w3,[sp, #0x8]
00b7cca8	str x2,[sp, #0x10]
00b7ccac	stp q0,q0,[x2]
00b7ccb0	orr w2,wzr,#0xff
00b7ccb4	add x7,sp,#0x8
00b7ccb8	mov w4,wzr
00b7ccbc	mov w5,wzr
00b7ccc0	bl 0x00c41a80
00b7ccc4	ldr x8,[x19, #0x28]
00b7ccc8	ldr x9,[sp, #0x18]
00b7cccc	cmp x8,x9
00b7ccd0	b.ne 0x00b7cce4
00b7ccd4	ldp x29,x30,[sp, #0x30]
00b7ccd8	ldr x19,[sp, #0x20]
00b7ccdc	add sp,sp,#0x40
00b7cce0	ret
00b7cce4	bl 0x00c2fec0
