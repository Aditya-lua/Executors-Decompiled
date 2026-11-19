; ix::WebSocket::sendText @ 0098fadc
0098fadc	sub sp,sp,#0x40
0098fae0	stp x20,x19,[sp, #0x20]
0098fae4	stp x29,x30,[sp, #0x30]
0098fae8	add x29,sp,#0x30
0098faec	mrs x20,tpidr_el0
0098faf0	mov x19,x8
0098faf4	ldr x8,[x20, #0x28]
0098faf8	mov x3,x2
0098fafc	str x8,[sp, #0x18]
0098fb00	ldrb w8,[x1]
0098fb04	ldp x9,x10,[x1, #0x8]
0098fb08	lsr w11,w8,#0x1
0098fb0c	tst w8,#0x1
0098fb10	csel x8,x11,x9,eq
0098fb14	csinc x9,x10,x1,ne
0098fb18	cbz x8,0x0098fb84
0098fb1c	adrp x11,0x74a000
0098fb20	mov x10,xzr
0098fb24	add x11,x11,#0xe4
0098fb28	mov x12,x8
0098fb2c	mov x13,x9
0098fb30	ldrb w14,[x13], #0x1
0098fb34	ldrb w14,[x11, x14]
0098fb38	orr x14,x14,#0x100
0098fb3c	add x10,x14,x10, LSL #0x4
0098fb40	ldrb w10,[x11, x10]
0098fb44	cmp x10,#0x1
0098fb48	b.eq 0x0098fb58
0098fb4c	subs x12,x12,#0x1
0098fb50	b.ne 0x0098fb30
0098fb54	cbz w10,0x0098fb84
0098fb58	adrp x8,0xcb5000
0098fb5c	ldr x8,[x8, #0x20]
0098fb60	adrp x2,0xcb5000
0098fb64	mov x3,xzr
0098fb68	mov w4,wzr
0098fb6c	ldrh w1,[x8]
0098fb70	ldr x2,[x2, #0x28]
0098fb74	bl 0x00c33890
0098fb78	strh wzr,[x19]
0098fb7c	stp xzr,xzr,[x19, #0x8]
0098fb80	b 0x0098fb98
0098fb84	stp x9,x8,[sp, #0x8]
0098fb88	add x1,sp,#0x8
0098fb8c	mov x8,x19
0098fb90	mov w2,wzr
0098fb94	bl 0x00c33810
0098fb98	ldr x8,[x20, #0x28]
0098fb9c	ldr x9,[sp, #0x18]
0098fba0	cmp x8,x9
0098fba4	b.ne 0x0098fbb8
0098fba8	ldp x29,x30,[sp, #0x30]
0098fbac	ldp x20,x19,[sp, #0x20]
0098fbb0	add sp,sp,#0x40
0098fbb4	ret
0098fbb8	bl 0x00c2fec0
