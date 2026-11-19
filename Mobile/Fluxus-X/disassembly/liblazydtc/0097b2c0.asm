; std::__ndk1::uniform_int_distribution<long>::operator() @ 0097b2c0
0097b2c0	sub sp,sp,#0xd0
0097b2c4	str x21,[sp, #0xa0]
0097b2c8	stp x20,x19,[sp, #0xb0]
0097b2cc	stp x29,x30,[sp, #0xc0]
0097b2d0	add x29,sp,#0xc0
0097b2d4	mrs x20,tpidr_el0
0097b2d8	ldr x8,[x20, #0x28]
0097b2dc	mov x19,x2
0097b2e0	stur x8,[x29, #-0x28]
0097b2e4	ldp x0,x8,[x2]
0097b2e8	subs x8,x8,x0
0097b2ec	b.eq 0x0097b460
0097b2f0	add x21,x8,#0x1
0097b2f4	cbz x21,0x0097b3b4
0097b2f8	clz x8,x21
0097b2fc	mov w9,#0x40
0097b300	mov w10,#0x41
0097b304	sub x8,x9,x8
0097b308	mov x11,#-0x1
0097b30c	sub x9,x10,x8
0097b310	lsr x9,x11,x9
0097b314	tst x9,x21
0097b318	cset w9,eq
0097b31c	sub x10,x8,x9
0097b320	lsr x8,x10,#0x5
0097b324	tst x10,#0x1f
0097b328	cinc x9,x8,ne
0097b32c	orr x12,xzr,#0x100000000
0097b330	udiv x8,x10,x9
0097b334	lsr x11,x12,x8
0097b338	cmp x8,#0x40
0097b33c	lsl x11,x11,x8
0097b340	csel x11,x11,xzr,cc
0097b344	sub x12,x12,x11
0097b348	udiv x13,x11,x9
0097b34c	cmp x12,x13
0097b350	stp x1,x10,[sp, #0x8]
0097b354	stp x8,x9,[sp, #0x18]
0097b358	str x11,[sp, #0x30]
0097b35c	b.ls 0x0097b384
0097b360	add x9,x9,#0x1
0097b364	udiv x8,x10,x9
0097b368	cmp x8,#0x3f
0097b36c	stp x8,x9,[sp, #0x18]
0097b370	b.hi 0x0097b400
0097b374	orr x11,xzr,#0x100000000
0097b378	lsr x11,x11,x8
0097b37c	lsl x11,x11,x8
0097b380	str x11,[sp, #0x30]
0097b384	udiv x11,x10,x9
0097b388	msub x10,x11,x9,x10
0097b38c	sub x9,x9,x10
0097b390	cmp x8,#0x3e
0097b394	str x9,[sp, #0x28]
0097b398	b.hi 0x0097b3f4
0097b39c	add x9,x8,#0x1
0097b3a0	orr x10,xzr,#0x100000000
0097b3a4	lsr x10,x10,x9
0097b3a8	lsl x12,x10,x9
0097b3ac	mov w11,#0x1
0097b3b0	b 0x0097b414
0097b3b4	adrp x8,0x29c000
0097b3b8	adrp x10,0x29c000
0097b3bc	adrp x11,0x29c000
0097b3c0	ldr q0,[x8, #0xbe0]
0097b3c4	ldr q2,[x10, #0x710]
0097b3c8	ldr q3,[x11, #0xbf0]
0097b3cc	mov w9,#0x2
0097b3d0	dup v1.2D,x9
0097b3d4	add x0,sp,#0x50
0097b3d8	str x1,[sp, #0x50]
0097b3dc	stur q0,[sp, #0x58]
0097b3e0	stur q1,[sp, #0x68]
0097b3e4	stur q2,[sp, #0x78]
0097b3e8	stur q3,[sp, #0x88]
0097b3ec	bl 0x00c330e0
0097b3f0	b 0x0097b460
0097b3f4	mov x12,xzr
0097b3f8	mov w11,wzr
0097b3fc	b 0x0097b414
0097b400	msub x10,x8,x9,x10
0097b404	sub x9,x9,x10
0097b408	mov x12,xzr
0097b40c	mov w11,wzr
0097b410	stp x9,xzr,[sp, #0x28]
0097b414	mov w9,#0x40
0097b418	str x12,[sp, #0x38]
0097b41c	mov x10,#-0x1
0097b420	orr w12,wzr,#0x3f
0097b424	sub x9,x9,x8
0097b428	cmp x8,#0x0
0097b42c	sub x8,x12,x8
0097b430	lsr x9,x10,x9
0097b434	lsr x8,x10,x8
0097b438	csel x9,xzr,x9,eq
0097b43c	cmp w11,#0x0
0097b440	csinv x8,x8,xzr,ne
0097b444	stp x9,x8,[sp, #0x40]
0097b448	add x0,sp,#0x8
0097b44c	bl 0x00c330e0
0097b450	cmp x0,x21
0097b454	b.cs 0x0097b448
0097b458	ldr x8,[x19]
0097b45c	add x0,x8,x0
0097b460	ldr x8,[x20, #0x28]
0097b464	ldur x9,[x29, #-0x28]
0097b468	cmp x8,x9
0097b46c	b.ne 0x0097b484
0097b470	ldp x29,x30,[sp, #0xc0]
0097b474	ldp x20,x19,[sp, #0xb0]
0097b478	ldr x21,[sp, #0xa0]
0097b47c	add sp,sp,#0xd0
0097b480	ret
0097b484	bl 0x00c2fec0
