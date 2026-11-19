; ix::WebSocket::send @ 0098f954
0098f954	sub sp,sp,#0x40
0098f958	stp x20,x19,[sp, #0x20]
0098f95c	stp x29,x30,[sp, #0x30]
0098f960	add x29,sp,#0x30
0098f964	mrs x20,tpidr_el0
0098f968	mov x19,x8
0098f96c	ldr x8,[x20, #0x28]
0098f970	str x8,[sp, #0x18]
0098f974	tbz w2,#0x0,0x0098f9ac
0098f978	ldrb w8,[x1]
0098f97c	ldr x9,[x1, #0x10]
0098f980	mov w2,#0x1
0098f984	tst w8,#0x1
0098f988	csinc x9,x9,x1,ne
0098f98c	str x9,[sp, #0x8]
0098f990	ldr x9,[x1, #0x8]
0098f994	lsr w8,w8,#0x1
0098f998	add x1,sp,#0x8
0098f99c	csel x8,x8,x9,eq
0098f9a0	str x8,[sp, #0x10]
0098f9a4	mov x8,x19
0098f9a8	b 0x0098fa40
0098f9ac	ldrb w8,[x1]
0098f9b0	ldp x9,x10,[x1, #0x8]
0098f9b4	lsr w11,w8,#0x1
0098f9b8	tst w8,#0x1
0098f9bc	csel x8,x11,x9,eq
0098f9c0	csinc x9,x10,x1,ne
0098f9c4	cbz x8,0x0098fa30
0098f9c8	adrp x11,0x74a000
0098f9cc	mov x10,xzr
0098f9d0	add x11,x11,#0xe4
0098f9d4	mov x12,x8
0098f9d8	mov x13,x9
0098f9dc	ldrb w14,[x13], #0x1
0098f9e0	ldrb w14,[x11, x14]
0098f9e4	orr x14,x14,#0x100
0098f9e8	add x10,x14,x10, LSL #0x4
0098f9ec	ldrb w10,[x11, x10]
0098f9f0	cmp x10,#0x1
0098f9f4	b.eq 0x0098fa04
0098f9f8	subs x12,x12,#0x1
0098f9fc	b.ne 0x0098f9dc
0098fa00	cbz w10,0x0098fa30
0098fa04	adrp x8,0xcb5000
0098fa08	ldr x8,[x8, #0x20]
0098fa0c	adrp x2,0xcb5000
0098fa10	mov x3,xzr
0098fa14	mov w4,wzr
0098fa18	ldrh w1,[x8]
0098fa1c	ldr x2,[x2, #0x28]
0098fa20	bl 0x00c33890
0098fa24	strh wzr,[x19]
0098fa28	stp xzr,xzr,[x19, #0x8]
0098fa2c	b 0x0098fa44
0098fa30	stp x9,x8,[sp, #0x8]
0098fa34	add x1,sp,#0x8
0098fa38	mov x8,x19
0098fa3c	mov w2,wzr
0098fa40	bl 0x00c33810
0098fa44	ldr x8,[x20, #0x28]
0098fa48	ldr x9,[sp, #0x18]
0098fa4c	cmp x8,x9
0098fa50	b.ne 0x0098fa64
0098fa54	ldp x29,x30,[sp, #0x30]
0098fa58	ldp x20,x19,[sp, #0x20]
0098fa5c	add sp,sp,#0x40
0098fa60	ret
0098fa64	bl 0x00c2fec0
