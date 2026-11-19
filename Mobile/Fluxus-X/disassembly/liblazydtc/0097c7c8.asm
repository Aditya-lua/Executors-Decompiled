; ix::HttpServer::makeDebugServer @ 0097c7c8
0097c7c8	sub sp,sp,#0x90
0097c7cc	stp x20,x19,[sp, #0x70]
0097c7d0	stp x29,x30,[sp, #0x80]
0097c7d4	add x29,sp,#0x80
0097c7d8	mrs x19,tpidr_el0
0097c7dc	ldr x9,[x19, #0x28]
0097c7e0	adrp x8,0xc51000
0097c7e4	add x8,x8,#0xb48
0097c7e8	add x8,x8,#0x10
0097c7ec	mov x10,sp
0097c7f0	add x20,sp,#0x30
0097c7f4	stur x9,[x29, #-0x18]
0097c7f8	stp x8,x0,[sp]
0097c7fc	stp x8,x0,[sp, #0x30]
0097c800	add x1,x0,#0x2f0
0097c804	add x0,sp,#0x30
0097c808	str x10,[sp, #0x20]
0097c80c	str x20,[sp, #0x50]
0097c810	bl 0x00c33340
0097c814	ldr x0,[sp, #0x50]
0097c818	cmp x20,x0
0097c81c	b.eq 0x0097c830
0097c820	cbz x0,0x0097c83c
0097c824	ldr x8,[x0]
0097c828	ldr x8,[x8, #0x28]
0097c82c	b 0x0097c838
0097c830	ldr x8,[x0]
0097c834	ldr x8,[x8, #0x20]
0097c838	blr x8
0097c83c	ldr x0,[sp, #0x20]
0097c840	mov x8,sp
0097c844	cmp x8,x0
0097c848	b.eq 0x0097c85c
0097c84c	cbz x0,0x0097c868
0097c850	ldr x8,[x0]
0097c854	ldr x8,[x8, #0x28]
0097c858	b 0x0097c864
0097c85c	ldr x8,[x0]
0097c860	ldr x8,[x8, #0x20]
0097c864	blr x8
0097c868	ldr x8,[x19, #0x28]
0097c86c	ldur x9,[x29, #-0x18]
0097c870	cmp x8,x9
0097c874	b.ne 0x0097c888
0097c878	ldp x29,x30,[sp, #0x80]
0097c87c	ldp x20,x19,[sp, #0x70]
0097c880	add sp,sp,#0x90
0097c884	ret
0097c888	bl 0x00c2fec0
