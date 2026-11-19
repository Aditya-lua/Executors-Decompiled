; ssl_cert_set0_chain @ 009ac504
009ac504	stp x24,x23,[sp, #-0x40]!
009ac508	add x8,x0,#0x898
009ac50c	add x9,x1,#0x158
009ac510	cmp x0,#0x0
009ac514	stp x22,x21,[sp, #0x10]
009ac518	stp x20,x19,[sp, #0x20]
009ac51c	stp x29,x30,[sp, #0x30]
009ac520	csel x8,x9,x8,eq
009ac524	ldr x8,[x8]
009ac528	add x29,sp,#0x30
009ac52c	ldr x24,[x8]
009ac530	cbz x24,0x009ac5e0
009ac534	mov x21,x0
009ac538	mov x0,x2
009ac53c	mov x20,x1
009ac540	mov x19,x2
009ac544	bl 0x00c325e0
009ac548	cmp w0,#0x1
009ac54c	b.lt 0x009ac594
009ac550	mov w22,wzr
009ac554	mov x0,x19
009ac558	mov w1,w22
009ac55c	bl 0x00c32610
009ac560	mov x2,x0
009ac564	mov x0,x21
009ac568	mov x1,x20
009ac56c	mov w3,wzr
009ac570	mov w4,wzr
009ac574	bl 0x00c351a0
009ac578	cmp w0,#0x1
009ac57c	b.ne 0x009ac5b0
009ac580	mov x0,x19
009ac584	add w22,w22,#0x1
009ac588	bl 0x00c325e0
009ac58c	cmp w22,w0
009ac590	b.lt 0x009ac554
009ac594	adrp x1,0xcb4000
009ac598	ldr x0,[x24, #0x10]
009ac59c	ldr x1,[x1, #0xd88]
009ac5a0	bl 0x00c32600
009ac5a4	mov w0,#0x1
009ac5a8	str x19,[x24, #0x10]
009ac5ac	b 0x009ac5e4
009ac5b0	mov w23,w0
009ac5b4	bl 0x00c342a0
009ac5b8	adrp x0,0x2d5000
009ac5bc	adrp x2,0x29d000
009ac5c0	add x0,x0,#0x6b3
009ac5c4	add x2,x2,#0xc0f
009ac5c8	mov w1,#0x111
009ac5cc	bl 0x00c342b0
009ac5d0	mov w0,#0x14
009ac5d4	mov w1,w23
009ac5d8	mov x2,xzr
009ac5dc	bl 0x00c342c0
009ac5e0	mov w0,wzr
009ac5e4	ldp x29,x30,[sp, #0x30]
009ac5e8	ldp x20,x19,[sp, #0x20]
009ac5ec	ldp x22,x21,[sp, #0x10]
009ac5f0	ldp x24,x23,[sp], #0x40
009ac5f4	ret
