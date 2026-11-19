; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::getline @ 00bd0428
00bd0428	paciasp
00bd042c	sub sp,sp,#0x60
00bd0430	stp x29,x30,[sp, #0x10]
00bd0434	stp x26,x25,[sp, #0x20]
00bd0438	stp x24,x23,[sp, #0x30]
00bd043c	stp x22,x21,[sp, #0x40]
00bd0440	stp x20,x19,[sp, #0x50]
00bd0444	add x29,sp,#0x10
00bd0448	mov x19,x0
00bd044c	mov x20,x2
00bd0450	mov x21,x1
00bd0454	str xzr,[x0, #0x8]
00bd0458	sub x0,x29,#0x4
00bd045c	mov x1,x19
00bd0460	mov w2,#0x1
00bd0464	mov w22,w3
00bd0468	bl 0x00c30140
00bd046c	ldurb w8,[x29, #-0x4]
00bd0470	cmp w8,#0x1
00bd0474	b.ne 0x00bd0590
00bd0478	and w22,w22,#0xff
00bd047c	add x23,x19,#0x28
00bd0480	sub x24,x20,#0x1
00bd0484	mov x25,#0x7fffffffffffffff
00bd0488	ldr x8,[x19]
00bd048c	ldur x8,[x8, #-0x18]
00bd0490	ldr x0,[x23, x8#0x0]
00bd0494	ldp x8,x9,[x0, #0x18]
00bd0498	cmp x8,x9
00bd049c	b.eq 0x00bd04a8
00bd04a0	ldrb w0,[x8]
00bd04a4	b 0x00bd04bc
00bd04a8	ldr x8,[x0]
00bd04ac	ldr x8,[x8, #0x48]
00bd04b0	blr x8
00bd04b4	cmn w0,#0x1
00bd04b8	b.eq 0x00bd0564
00bd04bc	and w8,w0,#0xff
00bd04c0	cmp w22,w8
00bd04c4	b.eq 0x00bd052c
00bd04c8	ldr x9,[x19, #0x8]
00bd04cc	cmp x9,x24
00bd04d0	b.ge 0x00bd0554
00bd04d4	mov x26,x21
00bd04d8	ldr x9,[x19]
00bd04dc	strb w8,[x26], #0x1
00bd04e0	ldur x8,[x9, #-0x18]
00bd04e4	ldr x0,[x23, x8#0x0]
00bd04e8	ldp x8,x9,[x0, #0x18]
00bd04ec	cmp x8,x9
00bd04f0	b.eq 0x00bd0500
00bd04f4	add x8,x8,#0x1
00bd04f8	str x8,[x0, #0x18]
00bd04fc	b 0x00bd050c
00bd0500	ldr x8,[x0]
00bd0504	ldr x8,[x8, #0x50]
00bd0508	blr x8
00bd050c	ldr x8,[x19, #0x8]
00bd0510	mov x21,x26
00bd0514	cmp x8,x25
00bd0518	b.eq 0x00bd0488
00bd051c	add x8,x8,#0x1
00bd0520	mov x21,x26
00bd0524	str x8,[x19, #0x8]
00bd0528	b 0x00bd0488
00bd052c	ldr x8,[x19]
00bd0530	ldur x8,[x8, #-0x18]
00bd0534	add x8,x19,x8
00bd0538	ldr x0,[x8, #0x28]
00bd053c	ldp x8,x9,[x0, #0x18]
00bd0540	cmp x8,x9
00bd0544	b.eq 0x00bd0574
00bd0548	add x8,x8,#0x1
00bd054c	str x8,[x0, #0x18]
00bd0550	b 0x00bd0580
00bd0554	mov w8,#0x4
00bd0558	cmp x20,#0x1
00bd055c	b.ge 0x00bd059c
00bd0560	b 0x00bd05a0
00bd0564	mov w8,#0x2
00bd0568	cmp x20,#0x1
00bd056c	b.ge 0x00bd059c
00bd0570	b 0x00bd05a0
00bd0574	ldr x8,[x0]
00bd0578	ldr x8,[x8, #0x50]
00bd057c	blr x8
00bd0580	ldr x9,[x19, #0x8]
00bd0584	mov x8,#0x7fffffffffffffff
00bd0588	cmp x9,x8
00bd058c	b.ne 0x00bd05e8
00bd0590	mov w8,wzr
00bd0594	cmp x20,#0x1
00bd0598	b.lt 0x00bd05a0
00bd059c	strb wzr,[x21]
00bd05a0	ldp x9,x10,[x19]
00bd05a4	ldur x9,[x9, #-0x18]
00bd05a8	cmp x10,#0x0
00bd05ac	add x0,x19,x9
00bd05b0	orr w9,w8,#0x4
00bd05b4	ldr w10,[x0, #0x20]
00bd05b8	csel w8,w9,w8,eq
00bd05bc	orr w1,w10,w8
00bd05c0	bl 0x00c30130
00bd05c4	mov x0,x19
00bd05c8	ldp x20,x19,[sp, #0x50]
00bd05cc	ldp x22,x21,[sp, #0x40]
00bd05d0	ldp x24,x23,[sp, #0x30]
00bd05d4	ldp x26,x25,[sp, #0x20]
00bd05d8	ldp x29,x30,[sp, #0x10]
00bd05dc	add sp,sp,#0x60
00bd05e0	autiasp
00bd05e4	ret
00bd05e8	mov w8,wzr
00bd05ec	add x9,x9,#0x1
00bd05f0	str x9,[x19, #0x8]
00bd05f4	cmp x20,#0x1
00bd05f8	b.ge 0x00bd059c
00bd05fc	b 0x00bd05a0
