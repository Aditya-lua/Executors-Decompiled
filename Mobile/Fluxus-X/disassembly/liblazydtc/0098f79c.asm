; ix::WebSocket::setTrafficTrackerCallback @ 0098f79c
0098f79c	sub sp,sp,#0x60
0098f7a0	stp x20,x19,[sp, #0x40]
0098f7a4	stp x29,x30,[sp, #0x50]
0098f7a8	add x29,sp,#0x50
0098f7ac	mrs x19,tpidr_el0
0098f7b0	ldr x9,[x19, #0x28]
0098f7b4	mov x8,x0
0098f7b8	stur x9,[x29, #-0x18]
0098f7bc	ldr x0,[x0, #0x20]
0098f7c0	cbz x0,0x0098f7e0
0098f7c4	cmp x8,x0
0098f7c8	b.eq 0x0098f7e8
0098f7cc	ldr x8,[x0]
0098f7d0	ldr x8,[x8, #0x10]
0098f7d4	blr x8
0098f7d8	str x0,[sp, #0x20]
0098f7dc	b 0x0098f800
0098f7e0	str xzr,[sp, #0x20]
0098f7e4	b 0x0098f800
0098f7e8	mov x8,sp
0098f7ec	str x8,[sp, #0x20]
0098f7f0	ldr x8,[x0]
0098f7f4	mov x1,sp
0098f7f8	ldr x8,[x8, #0x18]
0098f7fc	blr x8
0098f800	adrp x1,0xcb5000
0098f804	ldr x1,[x1, #0x40]
0098f808	mov x0,sp
0098f80c	mov x20,sp
0098f810	bl 0x00c33a10
0098f814	ldr x0,[sp, #0x20]
0098f818	cmp x20,x0
0098f81c	b.eq 0x0098f830
0098f820	cbz x0,0x0098f83c
0098f824	ldr x8,[x0]
0098f828	ldr x8,[x8, #0x28]
0098f82c	b 0x0098f838
0098f830	ldr x8,[x0]
0098f834	ldr x8,[x8, #0x20]
0098f838	blr x8
0098f83c	ldr x8,[x19, #0x28]
0098f840	ldur x9,[x29, #-0x18]
0098f844	cmp x8,x9
0098f848	b.ne 0x0098f85c
0098f84c	ldp x29,x30,[sp, #0x50]
0098f850	ldp x20,x19,[sp, #0x40]
0098f854	add sp,sp,#0x60
0098f858	ret
0098f85c	bl 0x00c2fec0
