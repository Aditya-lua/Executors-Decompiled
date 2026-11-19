; ix::WebSocket::ping @ 0098fdcc
0098fdcc	sub sp,sp,#0x70
0098fdd0	stp x20,x19,[sp, #0x50]
0098fdd4	stp x29,x30,[sp, #0x60]
0098fdd8	add x29,sp,#0x60
0098fddc	mrs x19,tpidr_el0
0098fde0	ldr x9,[x19, #0x28]
0098fde4	stur x9,[x29, #-0x18]
0098fde8	ldrb w9,[x1]
0098fdec	ldr x10,[x1, #0x8]
0098fdf0	lsr w11,w9,#0x1
0098fdf4	tst w9,#0x1
0098fdf8	csel x10,x11,x10,eq
0098fdfc	cmp x10,#0x7e
0098fe00	b.cc 0x0098fe10
0098fe04	strh wzr,[x8]
0098fe08	stp xzr,xzr,[x8, #0x8]
0098fe0c	b 0x0098fe5c
0098fe10	ldr x11,[x1, #0x10]
0098fe14	tst w9,#0x1
0098fe18	str xzr,[sp, #0x30]
0098fe1c	csinc x9,x11,x1,ne
0098fe20	stp x9,x10,[sp]
0098fe24	mov x1,sp
0098fe28	add x3,sp,#0x10
0098fe2c	add x20,sp,#0x10
0098fe30	bl 0x00c33810
0098fe34	ldr x0,[sp, #0x30]
0098fe38	cmp x20,x0
0098fe3c	b.eq 0x0098fe50
0098fe40	cbz x0,0x0098fe5c
0098fe44	ldr x8,[x0]
0098fe48	ldr x8,[x8, #0x28]
0098fe4c	b 0x0098fe58
0098fe50	ldr x8,[x0]
0098fe54	ldr x8,[x8, #0x20]
0098fe58	blr x8
0098fe5c	ldr x8,[x19, #0x28]
0098fe60	ldur x9,[x29, #-0x18]
0098fe64	cmp x8,x9
0098fe68	b.ne 0x0098fe7c
0098fe6c	ldp x29,x30,[sp, #0x60]
0098fe70	ldp x20,x19,[sp, #0x50]
0098fe74	add sp,sp,#0x70
0098fe78	ret
0098fe7c	bl 0x00c2fec0
