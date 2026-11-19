; FUN_00bb04a4 @ 00bb04a4
00bb04a4	sub sp,sp,#0x90
00bb04a8	stp x29,x30,[sp, #0x50]
00bb04ac	stp x24,x23,[sp, #0x60]
00bb04b0	stp x22,x21,[sp, #0x70]
00bb04b4	stp x20,x19,[sp, #0x80]
00bb04b8	add x29,sp,#0x50
00bb04bc	mrs x23,tpidr_el0
00bb04c0	mov x19,x8
00bb04c4	mov w3,w2
00bb04c8	ldr x8,[x23, #0x28]
00bb04cc	mov x22,x1
00bb04d0	mov x20,x0
00bb04d4	cmp x1,#0x8
00bb04d8	stur x8,[x29, #-0x8]
00bb04dc	b.cc 0x00bb0524
00bb04e0	cbnz w3,0x00bb0524
00bb04e4	ldr w8,[x20]
00bb04e8	mov w9,#0xd2a5
00bb04ec	movk w9,#0x184, LSL #16
00bb04f0	cmp w9,w8, LSR #0x4
00bb04f4	b.ne 0x00bb0524
00bb04f8	ldr w8,[x20, #0x4]
00bb04fc	mov x10,#-0x48
00bb0500	mov x11,#-0xe
00bb0504	str xzr,[x19, #0x10]
00bb0508	add x9,x8,#0x8
00bb050c	cmp x9,x22
00bb0510	csel x9,x10,x9,hi
00bb0514	cmn w8,#0x9
00bb0518	csel x8,x11,x9,hi
00bb051c	stp xzr,x8,[x19]
00bb0520	b 0x00bb05c0
00bb0524	add x0,sp,#0x18
00bb0528	mov x1,x20
00bb052c	mov x2,x22
00bb0530	bl 0x00c435f0
00bb0534	cmn x0,#0x77
00bb0538	b.cs 0x00bb05b4
00bb053c	cbz x0,0x00bb0550
00bb0540	adrp x8,0x29c000
00bb0544	ldr q0,[x8, #0xff0]
00bb0548	stur q0,[x19, #0x8]
00bb054c	b 0x00bb05c0
00bb0550	ldr w8,[sp, #0x30]
00bb0554	add x2,sp,#0xc
00bb0558	add x21,x20,x8
00bb055c	sub x22,x22,x8
00bb0560	mov x0,x21
00bb0564	mov x1,x22
00bb0568	bl 0x00c43620
00bb056c	cmn x0,#0x78
00bb0570	b.hi 0x00bb05b4
00bb0574	mov w24,#0x1
00bb0578	add x8,x0,#0x3
00bb057c	subs x22,x22,x8
00bb0580	b.cc 0x00bb05b0
00bb0584	ldr w9,[sp, #0x10]
00bb0588	add x21,x21,x8
00bb058c	cbnz w9,0x00bb05e8
00bb0590	add x2,sp,#0xc
00bb0594	mov x0,x21
00bb0598	mov x1,x22
00bb059c	bl 0x00c43620
00bb05a0	cmn x0,#0x77
00bb05a4	add x24,x24,#0x1
00bb05a8	b.cc 0x00bb0578
00bb05ac	b 0x00bb05b4
00bb05b0	mov x0,#-0x48
00bb05b4	mov x8,#-0x2
00bb05b8	str x0,[x19, #0x8]
00bb05bc	str x8,[x19, #0x10]
00bb05c0	ldr x8,[x23, #0x28]
00bb05c4	ldur x9,[x29, #-0x8]
00bb05c8	cmp x8,x9
00bb05cc	b.ne 0x00bb061c
00bb05d0	ldp x20,x19,[sp, #0x80]
00bb05d4	ldp x22,x21,[sp, #0x70]
00bb05d8	ldp x24,x23,[sp, #0x60]
00bb05dc	ldp x29,x30,[sp, #0x50]
00bb05e0	add sp,sp,#0x90
00bb05e4	ret
00bb05e8	ldr w8,[sp, #0x38]
00bb05ec	cbz w8,0x00bb05fc
00bb05f0	cmp x22,#0x3
00bb05f4	b.ls 0x00bb0540
00bb05f8	add x21,x21,#0x4
00bb05fc	ldr w8,[sp, #0x28]
00bb0600	ldr x9,[sp, #0x18]
00bb0604	sub x10,x21,x20
00bb0608	stp x24,x10,[x19]
00bb060c	mul x8,x24,x8
00bb0610	cmn x9,#0x1
00bb0614	csel x8,x8,x9,eq
00bb0618	b 0x00bb05bc
00bb061c	bl 0x00c2fec0
