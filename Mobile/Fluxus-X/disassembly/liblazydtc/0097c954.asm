; std::__ndk1::function<std::__ndk1::shared_ptr<ix::HttpResponse>(std::__ndk1::shared_ptr<ix::HttpRequest>,std::__ndk1::shared_ptr<ix::ConnectionState>)>::swap @ 0097c954
0097c954	sub sp,sp,#0x60
0097c958	str x21,[sp, #0x30]
0097c95c	stp x20,x19,[sp, #0x40]
0097c960	stp x29,x30,[sp, #0x50]
0097c964	add x29,sp,#0x50
0097c968	mrs x21,tpidr_el0
0097c96c	ldr x8,[x21, #0x28]
0097c970	mov x19,x1
0097c974	mov x20,x0
0097c978	cmp x1,x0
0097c97c	str x8,[sp, #0x28]
0097c980	b.eq 0x0097ca8c
0097c984	ldr x0,[x20, #0x20]
0097c988	cmp x0,x20
0097c98c	b.eq 0x0097c9a8
0097c990	ldr x8,[x19, #0x20]
0097c994	cmp x19,x8
0097c998	b.eq 0x0097c9e0
0097c99c	str x8,[x20, #0x20]
0097c9a0	str x0,[x19, #0x20]
0097c9a4	b 0x0097ca8c
0097c9a8	ldr x8,[x19, #0x20]
0097c9ac	cmp x8,x19
0097c9b0	b.eq 0x0097ca14
0097c9b4	ldr x8,[x0]
0097c9b8	ldr x8,[x8, #0x18]
0097c9bc	mov x1,x19
0097c9c0	blr x8
0097c9c4	ldr x0,[x20, #0x20]
0097c9c8	ldr x8,[x0]
0097c9cc	ldr x8,[x8, #0x20]
0097c9d0	blr x8
0097c9d4	ldr x8,[x19, #0x20]
0097c9d8	str x8,[x20, #0x20]
0097c9dc	b 0x0097ca88
0097c9e0	ldr x9,[x8]
0097c9e4	ldr x9,[x9, #0x18]
0097c9e8	mov x0,x8
0097c9ec	mov x1,x20
0097c9f0	blr x9
0097c9f4	ldr x0,[x19, #0x20]
0097c9f8	ldr x8,[x0]
0097c9fc	ldr x8,[x8, #0x20]
0097ca00	blr x8
0097ca04	ldr x8,[x20, #0x20]
0097ca08	str x8,[x19, #0x20]
0097ca0c	str x20,[x20, #0x20]
0097ca10	b 0x0097ca8c
0097ca14	ldr x8,[x0]
0097ca18	ldr x8,[x8, #0x18]
0097ca1c	mov x1,sp
0097ca20	blr x8
0097ca24	ldr x0,[x20, #0x20]
0097ca28	ldr x8,[x0]
0097ca2c	ldr x8,[x8, #0x20]
0097ca30	blr x8
0097ca34	str xzr,[x20, #0x20]
0097ca38	ldr x0,[x19, #0x20]
0097ca3c	ldr x8,[x0]
0097ca40	ldr x8,[x8, #0x18]
0097ca44	mov x1,x20
0097ca48	blr x8
0097ca4c	ldr x0,[x19, #0x20]
0097ca50	ldr x8,[x0]
0097ca54	ldr x8,[x8, #0x20]
0097ca58	blr x8
0097ca5c	str xzr,[x19, #0x20]
0097ca60	str x20,[x20, #0x20]
0097ca64	ldr x8,[sp]
0097ca68	ldr x8,[x8, #0x18]
0097ca6c	mov x0,sp
0097ca70	mov x1,x19
0097ca74	blr x8
0097ca78	ldr x8,[sp]
0097ca7c	mov x0,sp
0097ca80	ldr x8,[x8, #0x20]
0097ca84	blr x8
0097ca88	str x19,[x19, #0x20]
0097ca8c	ldr x8,[x21, #0x28]
0097ca90	ldr x9,[sp, #0x28]
0097ca94	cmp x8,x9
0097ca98	b.ne 0x0097cab0
0097ca9c	ldp x29,x30,[sp, #0x50]
0097caa0	ldp x20,x19,[sp, #0x40]
0097caa4	ldr x21,[sp, #0x30]
0097caa8	add sp,sp,#0x60
0097caac	ret
0097cab0	bl 0x00c2fec0
