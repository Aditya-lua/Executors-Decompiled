; ix::SocketServer::setConnectionStateFactory @ 0098a780
0098a780	sub sp,sp,#0x70
0098a784	str x21,[sp, #0x40]
0098a788	stp x20,x19,[sp, #0x50]
0098a78c	stp x29,x30,[sp, #0x60]
0098a790	add x29,sp,#0x60
0098a794	mrs x20,tpidr_el0
0098a798	ldr x8,[x20, #0x28]
0098a79c	add x19,x0,#0x120
0098a7a0	stur x8,[x29, #-0x28]
0098a7a4	ldr x8,[x1, #0x20]
0098a7a8	cbz x8,0x0098a7cc
0098a7ac	cmp x1,x8
0098a7b0	b.eq 0x0098a7d4
0098a7b4	ldr x9,[x8]
0098a7b8	mov x0,x8
0098a7bc	ldr x9,[x9, #0x10]
0098a7c0	blr x9
0098a7c4	str x0,[sp, #0x20]
0098a7c8	b 0x0098a7f0
0098a7cc	str xzr,[sp, #0x20]
0098a7d0	b 0x0098a7f0
0098a7d4	mov x9,sp
0098a7d8	str x9,[sp, #0x20]
0098a7dc	ldr x9,[x8]
0098a7e0	mov x1,sp
0098a7e4	mov x0,x8
0098a7e8	ldr x9,[x9, #0x18]
0098a7ec	blr x9
0098a7f0	mov x0,sp
0098a7f4	mov x1,x19
0098a7f8	mov x21,sp
0098a7fc	bl 0x00c336b0
0098a800	ldr x0,[sp, #0x20]
0098a804	cmp x21,x0
0098a808	b.eq 0x0098a81c
0098a80c	cbz x0,0x0098a828
0098a810	ldr x8,[x0]
0098a814	ldr x8,[x8, #0x28]
0098a818	b 0x0098a824
0098a81c	ldr x8,[x0]
0098a820	ldr x8,[x8, #0x20]
0098a824	blr x8
0098a828	ldr x8,[x20, #0x28]
0098a82c	ldur x9,[x29, #-0x28]
0098a830	cmp x8,x9
0098a834	b.ne 0x0098a84c
0098a838	ldp x29,x30,[sp, #0x60]
0098a83c	ldp x20,x19,[sp, #0x50]
0098a840	ldr x21,[sp, #0x40]
0098a844	add sp,sp,#0x70
0098a848	ret
0098a84c	bl 0x00c2fec0
