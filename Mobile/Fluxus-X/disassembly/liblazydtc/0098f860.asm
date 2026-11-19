; ix::WebSocket::resetTrafficTrackerCallback @ 0098f860
0098f860	sub sp,sp,#0x60
0098f864	stp x20,x19,[sp, #0x40]
0098f868	stp x29,x30,[sp, #0x50]
0098f86c	add x29,sp,#0x50
0098f870	mrs x19,tpidr_el0
0098f874	ldr x8,[x19, #0x28]
0098f878	adrp x1,0xcb5000
0098f87c	mov x0,sp
0098f880	mov x20,sp
0098f884	stur x8,[x29, #-0x18]
0098f888	str xzr,[sp, #0x20]
0098f88c	ldr x1,[x1, #0x40]
0098f890	bl 0x00c33a10
0098f894	ldr x0,[sp, #0x20]
0098f898	cmp x20,x0
0098f89c	b.eq 0x0098f8b0
0098f8a0	cbz x0,0x0098f8bc
0098f8a4	ldr x8,[x0]
0098f8a8	ldr x8,[x8, #0x28]
0098f8ac	b 0x0098f8b8
0098f8b0	ldr x8,[x0]
0098f8b4	ldr x8,[x8, #0x20]
0098f8b8	blr x8
0098f8bc	ldr x8,[x19, #0x28]
0098f8c0	ldur x9,[x29, #-0x18]
0098f8c4	cmp x8,x9
0098f8c8	b.ne 0x0098f8dc
0098f8cc	ldp x29,x30,[sp, #0x50]
0098f8d0	ldp x20,x19,[sp, #0x40]
0098f8d4	add sp,sp,#0x60
0098f8d8	ret
0098f8dc	bl 0x00c2fec0
