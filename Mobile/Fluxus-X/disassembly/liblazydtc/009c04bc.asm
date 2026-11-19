; tls1_final_finish_mac @ 009c04bc
009c04bc	sub sp,sp,#0xb0
009c04c0	stp x22,x21,[sp, #0x80]
009c04c4	stp x20,x19,[sp, #0x90]
009c04c8	stp x29,x30,[sp, #0xa0]
009c04cc	ldr x8,[x0, #0x2e0]
009c04d0	mov x21,x1
009c04d4	mov w9,#0x20
009c04d8	mov w1,wzr
009c04dc	ldr w8,[x8, #0x1c]
009c04e0	str x23,[sp, #0x70]
009c04e4	add x29,sp,#0xa0
009c04e8	mov x23,x3
009c04ec	tst w8,#0x200
009c04f0	orr w8,wzr,#0xc
009c04f4	mov x20,x2
009c04f8	mov x22,x0
009c04fc	csel x19,x8,x9,eq
009c0500	bl 0x00c345a0
009c0504	cbz w0,0x009c0578
009c0508	add x1,sp,#0x30
009c050c	mov w2,#0x40
009c0510	sub x3,x29,#0x28
009c0514	mov x0,x22
009c0518	bl 0x00c35dc0
009c051c	cbz w0,0x009c0578
009c0520	ldr x8,[x22, #0x918]
009c0524	ldur x4,[x29, #-0x28]
009c0528	mov w10,#0x1
009c052c	add x3,sp,#0x30
009c0530	ldr x9,[x8, #0x8]
009c0534	add x8,x8,#0x50
009c0538	mov x0,x22
009c053c	mov x1,x21
009c0540	mov x2,x20
009c0544	mov x5,xzr
009c0548	mov x6,xzr
009c054c	mov x7,xzr
009c0550	stp x23,x19,[sp, #0x18]
009c0554	stp x8,x9,[sp, #0x8]
009c0558	str w10,[sp, #0x28]
009c055c	str xzr,[sp]
009c0560	bl 0x009c0598
009c0564	cbz w0,0x009c0578
009c0568	ldur x1,[x29, #-0x28]
009c056c	add x0,sp,#0x30
009c0570	bl 0x00c34750
009c0574	b 0x009c057c
009c0578	mov x19,xzr
009c057c	mov x0,x19
009c0580	ldp x29,x30,[sp, #0xa0]
009c0584	ldp x20,x19,[sp, #0x90]
009c0588	ldp x22,x21,[sp, #0x80]
009c058c	ldr x23,[sp, #0x70]
009c0590	add sp,sp,#0xb0
009c0594	ret
