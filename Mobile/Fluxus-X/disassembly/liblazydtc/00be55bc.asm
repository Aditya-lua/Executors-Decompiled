; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be55bc
00be55bc	paciasp
00be55c0	sub sp,sp,#0x60
00be55c4	stp x29,x30,[sp, #0x30]
00be55c8	stp x22,x21,[sp, #0x40]
00be55cc	stp x20,x19,[sp, #0x50]
00be55d0	add x29,sp,#0x30
00be55d4	ldrb w8,[x2, #0x8]
00be55d8	mov w20,w4
00be55dc	mov x19,x1
00be55e0	tbnz w8,#0x0,0x00be560c
00be55e4	ldr x8,[x0]
00be55e8	and x4,x20,#0x1
00be55ec	ldr x16,[x8, #0x30]
00be55f0	mov x1,x19
00be55f4	ldp x20,x19,[sp, #0x50]
00be55f8	ldp x22,x21,[sp, #0x40]
00be55fc	ldp x29,x30,[sp, #0x30]
00be5600	add sp,sp,#0x60
00be5604	autiasp
00be5608	br x16
00be560c	add x8,sp,#0x18
00be5610	mov x0,x2
00be5614	bl 0x00c30070
00be5618	adrp x22,0xcb5000
00be561c	ldr x22,[x22, #0xc10]
00be5620	ldr x21,[sp, #0x18]
00be5624	stur x22,[x29, #-0x10]
00be5628	ldar x8,[x22]
00be562c	cmn x8,#0x1
00be5630	b.eq 0x00be565c
00be5634	sub x8,x29,#0x10
00be5638	mov x9,sp
00be563c	str x8,[sp]
00be5640	stur x9,[x29, #-0x8]
00be5644	adrp x0,0xcb5000
00be5648	nop
00be564c	adr x2,0xc0bab0
00be5650	ldr x0,[x0, #0xc10]
00be5654	sub x1,x29,#0x8
00be5658	bl 0x00c305d0
00be565c	ldp x8,x10,[x21, #0x10]
00be5660	ldrsw x9,[x22, #0x8]
00be5664	sub x9,x9,#0x1
00be5668	sub x10,x10,x8
00be566c	cmp x9,x10, ASR #0x3
00be5670	b.cs 0x00be5764
00be5674	ldr x21,[x8, x9, LSL #0x3]
00be5678	cbz x21,0x00be5764
00be567c	add x0,sp,#0x18
00be5680	bl 0x00c30090
00be5684	ldr x8,[x21]
00be5688	tst w20,#0x1
00be568c	mov w9,#0x38
00be5690	mov w10,#0x30
00be5694	mov x0,x21
00be5698	mov x20,sp
00be569c	csel x9,x10,x9,ne
00be56a0	ldr x9,[x8, x9#0x0]
00be56a4	mov x8,sp
00be56a8	blr x9
00be56ac	ldrb w8,[sp]
00be56b0	ldp x9,x0,[sp, #0x8]
00be56b4	lsr x10,x8,#0x1
00be56b8	tst w8,#0x1
00be56bc	csel x10,x10,x9,eq
00be56c0	cbz x10,0x00be5734
00be56c4	orr x20,x20,#0x4
00be56c8	csel x21,x20,x0,eq
00be56cc	b 0x00be5708
00be56d0	str w1,[x8], #0x4
00be56d4	str x8,[x19, #0x30]
00be56d8	ldp x9,x0,[sp, #0x8]
00be56dc	cmn w1,#0x1
00be56e0	ldrb w8,[sp]
00be56e4	csel x19,xzr,x19,eq
00be56e8	lsr w10,w8,#0x1
00be56ec	tst w8,#0x1
00be56f0	add x21,x21,#0x4
00be56f4	csel x11,x20,x0,eq
00be56f8	csel x10,x10,x9,eq
00be56fc	add x10,x11,x10, LSL #0x2
00be5700	cmp x21,x10
00be5704	b.eq 0x00be5734
00be5708	cbz x19,0x00be56e8
00be570c	ldp x8,x9,[x19, #0x30]
00be5710	ldr w1,[x21]
00be5714	cmp x8,x9
00be5718	b.ne 0x00be56d0
00be571c	ldr x8,[x19]
00be5720	ldr x8,[x8, #0x68]
00be5724	mov x0,x19
00be5728	blr x8
00be572c	mov w1,w0
00be5730	b 0x00be56d8
00be5734	tbz w8,#0x0,0x00be5748
00be5738	ldr x8,[sp]
00be573c	lsl x8,x8,#0x2
00be5740	and x1,x8,#-0x8
00be5744	bl 0x00c2fe80
00be5748	mov x0,x19
00be574c	ldp x20,x19,[sp, #0x50]
00be5750	ldp x22,x21,[sp, #0x40]
00be5754	ldp x29,x30,[sp, #0x30]
00be5758	add sp,sp,#0x60
00be575c	autiasp
00be5760	ret
00be5764	bl 0x00bd8968
