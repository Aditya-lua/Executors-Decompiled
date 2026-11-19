; FUN_008ab528 @ 008ab528
008ab528	sub sp,sp,#0x50
008ab52c	stp x29,x30,[sp, #0x20]
008ab530	str x21,[sp, #0x30]
008ab534	stp x20,x19,[sp, #0x40]
008ab538	add x29,sp,#0x20
008ab53c	mrs x20,tpidr_el0
008ab540	mov x19,x2
008ab544	ldr x8,[x20, #0x28]
008ab548	cmp w1,#0x1
008ab54c	stur x8,[x29, #-0x8]
008ab550	b.lt 0x008ab58c
008ab554	ldp x9,x8,[x0, #0x68]
008ab558	add x8,x8,w1, UXTW  #0x4
008ab55c	sub x0,x8,#0x10
008ab560	cmp x0,x9
008ab564	b.cc 0x008ab5a8
008ab568	adrp x8,0xd1f000
008ab56c	add x8,x8,#0x1e0
008ab570	ldarb w9,[x8]
008ab574	adrp x8,0xd1f000
008ab578	tbz w9,#0x0,0x008ab604
008ab57c	ldr x8,[x8, #0x1d8]
008ab580	add x8,x8,#0x7f2, LSL #12
008ab584	add x0,x8,#0xef0
008ab588	b 0x008ab5a8
008ab58c	mov w8,#0xffffd8f1
008ab590	cmp w1,w8
008ab594	b.lt 0x008ab5a4
008ab598	ldr x8,[x0, #0x68]
008ab59c	add x0,x8,w1, SXTW  #0x4
008ab5a0	b 0x008ab5a8
008ab5a4	bl 0x008aea7c
008ab5a8	ldr w8,[x0, #0xc]
008ab5ac	cmp w8,#0x3
008ab5b0	b.eq 0x008ab5c0
008ab5b4	add x1,sp,#0x8
008ab5b8	bl 0x008cacb4
008ab5bc	cbz x0,0x008ab5f4
008ab5c0	cbz x19,0x008ab5cc
008ab5c4	mov w8,#0x1
008ab5c8	str w8,[x19]
008ab5cc	ldr d0,[x0]
008ab5d0	ldr x8,[x20, #0x28]
008ab5d4	ldur x9,[x29, #-0x8]
008ab5d8	cmp x8,x9
008ab5dc	b.ne 0x008ab668
008ab5e0	ldp x20,x19,[sp, #0x40]
008ab5e4	ldr x21,[sp, #0x30]
008ab5e8	ldp x29,x30,[sp, #0x20]
008ab5ec	add sp,sp,#0x50
008ab5f0	ret
008ab5f4	movi d0,#0x0
008ab5f8	cbz x19,0x008ab5d0
008ab5fc	str wzr,[x19]
008ab600	b 0x008ab5d0
008ab604	adrp x0,0xd1f000
008ab608	add x0,x0,#0x1e0
008ab60c	bl 0x00c2fe90
008ab610	adrp x8,0xd1f000
008ab614	cbz w0,0x008ab57c
008ab618	adrp x8,0xcca000
008ab61c	ldr x0,[x8, #0x8c8]
008ab620	bl 0x007fe1ec
008ab624	adrp x21,0xd1f000
008ab628	str x0,[x21, #0x1d8]
008ab62c	adrp x0,0xd1f000
008ab630	add x0,x0,#0x1e0
008ab634	bl 0x00c2fea0
008ab638	mov x8,x21
008ab63c	b 0x008ab57c
008ab668	bl 0x00c2fec0
