; std::__ndk1::__independent_bits_engine<std::__ndk1::mersenne_twister_engine<unsigned_long,32ul,624ul,397ul,31ul,2567483615ul,11ul,4294967295ul,7ul,2636928640ul,15ul,4022730752ul,18ul,1812433253ul>,unsigned_long>::__eval @ 0097b488
0097b488	ldr x8,[x0, #0x20]
0097b48c	mov w10,#0x5680
0097b490	mov w11,#0xb0df
0097b494	mov w9,#0xefc60000
0097b498	movk w10,#0x9d2c, LSL #16
0097b49c	movk w11,#0x9908, LSL #16
0097b4a0	cbz x8,0x0097b588
0097b4a4	ldr x14,[x0]
0097b4a8	mov x15,#0xd21
0097b4ac	movk x15,#0x20d2, LSL #16
0097b4b0	movk x15,#0xd20d, LSL #32
0097b4b4	ldr x17,[x14, #0x1380]
0097b4b8	mov x8,xzr
0097b4bc	mov x13,xzr
0097b4c0	movk x15,#0xd20, LSL #48
0097b4c4	mov w16,#0x270
0097b4c8	add x12,x17,#0x1
0097b4cc	lsl x18,x17,#0x3
0097b4d0	add x1,x17,#0x18d
0097b4d4	lsr x17,x12,#0x4
0097b4d8	umulh x17,x17,x15
0097b4dc	lsr x3,x1,#0x4
0097b4e0	lsr x17,x17,#0x1
0097b4e4	umulh x3,x3,x15
0097b4e8	msub x17,x17,x16,x12
0097b4ec	lsr x3,x3,#0x1
0097b4f0	ldr x12,[x14, x17, LSL #0x3]
0097b4f4	ldr x2,[x14, x18#0x0]
0097b4f8	nop
0097b4fc	msub x1,x3,x16,x1
0097b500	ldr x1,[x14, x1, LSL #0x3]
0097b504	and x3,x12,#0x7ffffffe
0097b508	and x12,x12,#0x1
0097b50c	and x2,x2,#-0x80000000
0097b510	mul x12,x12,x11
0097b514	orr x2,x3,x2
0097b518	eor x12,x12,x1
0097b51c	eor x12,x12,x2, LSR #0x1
0097b520	str x12,[x14, x18#0x0]
0097b524	ldr x12,[x14, #0x1380]
0097b528	ldr x12,[x14, x12, LSL #0x3]
0097b52c	str x17,[x14, #0x1380]
0097b530	ldr x1,[x0, #0x28]
0097b534	ubfx x18,x12,#0xb,#0x20
0097b538	eor x12,x18,x12
0097b53c	and x18,x10,x12, LSL #0x7
0097b540	eor x12,x18,x12
0097b544	and x18,x9,x12, LSL #0xf
0097b548	eor x12,x18,x12
0097b54c	eor x18,x12,x12, LSR #0x12
0097b550	cmp x18,x1
0097b554	b.cs 0x0097b4c8
0097b558	ldr x1,[x0, #0x10]
0097b55c	ldr x2,[x0, #0x38]
0097b560	ldr x12,[x0, #0x20]
0097b564	add x13,x13,#0x1
0097b568	lsl x8,x8,x1
0097b56c	cmp x1,#0x40
0097b570	and x18,x2,x18
0097b574	csel x8,x8,xzr,cc
0097b578	cmp x13,x12
0097b57c	add x8,x8,x18
0097b580	b.cc 0x0097b4c8
0097b584	b 0x0097b58c
0097b588	mov x12,xzr
0097b58c	ldr x13,[x0, #0x18]
0097b590	cmp x12,x13
0097b594	b.cs 0x0097b670
0097b598	ldr x13,[x0]
0097b59c	mov x14,#0xd21
0097b5a0	movk x14,#0x20d2, LSL #16
0097b5a4	movk x14,#0xd20d, LSL #32
0097b5a8	ldr x16,[x13, #0x1380]
0097b5ac	movk x14,#0xd20, LSL #48
0097b5b0	mov w15,#0x270
0097b5b4	add x17,x16,#0x1
0097b5b8	lsl x18,x16,#0x3
0097b5bc	add x1,x16,#0x18d
0097b5c0	lsr x16,x17,#0x4
0097b5c4	umulh x16,x16,x14
0097b5c8	lsr x3,x1,#0x4
0097b5cc	lsr x16,x16,#0x1
0097b5d0	umulh x3,x3,x14
0097b5d4	msub x16,x16,x15,x17
0097b5d8	lsr x3,x3,#0x1
0097b5dc	ldr x17,[x13, x16, LSL #0x3]
0097b5e0	ldr x2,[x13, x18#0x0]
0097b5e4	nop
0097b5e8	msub x1,x3,x15,x1
0097b5ec	ldr x1,[x13, x1, LSL #0x3]
0097b5f0	and x3,x17,#0x7ffffffe
0097b5f4	and x17,x17,#0x1
0097b5f8	and x2,x2,#-0x80000000
0097b5fc	mul x17,x17,x11
0097b600	orr x2,x3,x2
0097b604	eor x17,x17,x1
0097b608	eor x17,x17,x2, LSR #0x1
0097b60c	str x17,[x13, x18#0x0]
0097b610	ldr x17,[x13, #0x1380]
0097b614	ldr x17,[x13, x17, LSL #0x3]
0097b618	str x16,[x13, #0x1380]
0097b61c	ubfx x18,x17,#0xb,#0x20
0097b620	eor x17,x18,x17
0097b624	and x18,x10,x17, LSL #0x7
0097b628	eor x17,x18,x17
0097b62c	ldr x18,[x0, #0x30]
0097b630	and x1,x9,x17, LSL #0xf
0097b634	eor x17,x1,x17
0097b638	eor x17,x17,x17, LSR #0x12
0097b63c	cmp x17,x18
0097b640	b.cs 0x0097b5b4
0097b644	ldp x18,x2,[x0, #0x10]
0097b648	ldr x1,[x0, #0x40]
0097b64c	add x12,x12,#0x1
0097b650	add x3,x18,#0x1
0097b654	cmp x18,#0x3f
0097b658	lsl x8,x8,x3
0097b65c	and x17,x1,x17
0097b660	csel x8,x8,xzr,cc
0097b664	cmp x12,x2
0097b668	add x8,x8,x17
0097b66c	b.cc 0x0097b5b4
0097b670	mov x0,x8
0097b674	ret
