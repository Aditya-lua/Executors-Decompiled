; FUN_00ba6554 @ 00ba6554
00ba6554	stp x22,x21,[sp, #-0x30]!
00ba6558	stp x20,x19,[sp, #0x10]
00ba655c	stp x29,x30,[sp, #0x20]
00ba6560	add x29,sp,#0x20
00ba6564	ldr x22,[x0, #0x8]
00ba6568	add x21,x0,#0x10
00ba656c	mov x19,x0
00ba6570	mov x0,x21
00ba6574	mov w20,w1
00ba6578	bl 0x00c41d30
00ba657c	cmp x22,x0
00ba6580	b.ne 0x00ba6664
00ba6584	ldr x8,[x19, #0x8]
00ba6588	cmp x8,#0x400
00ba658c	b.hi 0x00ba6664
00ba6590	mov x0,x21
00ba6594	mov x1,xzr
00ba6598	bl 0x00c41b40
00ba659c	cmp w0,#0x1
00ba65a0	b.lt 0x00ba6664
00ba65a4	mov x0,x21
00ba65a8	mov x1,xzr
00ba65ac	bl 0x00c41be0
00ba65b0	cbz w0,0x00ba6664
00ba65b4	cbz w20,0x00ba6608
00ba65b8	add x21,x19,#0x40
00ba65bc	mov x0,x21
00ba65c0	mov x1,xzr
00ba65c4	bl 0x00c41b40
00ba65c8	cmp w0,#0x1
00ba65cc	b.lt 0x00ba6664
00ba65d0	mov x0,x21
00ba65d4	mov x1,xzr
00ba65d8	bl 0x00c41be0
00ba65dc	cbz w0,0x00ba6664
00ba65e0	add x21,x19,#0x50
00ba65e4	mov x0,x21
00ba65e8	mov x1,xzr
00ba65ec	bl 0x00c41b40
00ba65f0	cmp w0,#0x1
00ba65f4	b.lt 0x00ba6664
00ba65f8	mov x0,x21
00ba65fc	mov x1,xzr
00ba6600	bl 0x00c41be0
00ba6604	cbz w0,0x00ba6664
00ba6608	add x0,x19,#0x20
00ba660c	mov x1,xzr
00ba6610	bl 0x00c41b40
00ba6614	cmp w0,#0x1
00ba6618	b.lt 0x00ba6664
00ba661c	cbz w20,0x00ba665c
00ba6620	add x0,x19,#0x60
00ba6624	mov x1,xzr
00ba6628	bl 0x00c41b40
00ba662c	cmp w0,#0x1
00ba6630	b.lt 0x00ba6664
00ba6634	add x0,x19,#0x70
00ba6638	mov x1,xzr
00ba663c	bl 0x00c41b40
00ba6640	cmp w0,#0x1
00ba6644	b.lt 0x00ba6664
00ba6648	add x0,x19,#0x80
00ba664c	mov x1,xzr
00ba6650	bl 0x00c41b40
00ba6654	cmp w0,#0x1
00ba6658	b.lt 0x00ba6664
00ba665c	mov w0,wzr
00ba6660	b 0x00ba6668
00ba6664	mov w0,#0xffffbf80
00ba6668	ldp x29,x30,[sp, #0x20]
00ba666c	ldp x20,x19,[sp, #0x10]
00ba6670	ldp x22,x21,[sp], #0x30
00ba6674	ret
