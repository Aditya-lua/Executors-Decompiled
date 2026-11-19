; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be57a4
00be57a4	bti c
00be57a8	adrp x5,0x2b5000
00be57ac	add x5,x5,#0x52
00be57b0	b 0x00be57b4
00be57b4	paciasp
00be57b8	sub sp,sp,#0x130
00be57bc	stp x29,x30,[sp, #0xf0]
00be57c0	stp x28,x23,[sp, #0x100]
00be57c4	stp x22,x21,[sp, #0x110]
00be57c8	stp x20,x19,[sp, #0x120]
00be57cc	add x29,sp,#0xf0
00be57d0	ldr w9,[x2, #0x8]
00be57d4	mov w8,#0x25
00be57d8	sub x10,x29,#0x8
00be57dc	mov x22,x4
00be57e0	mov w19,w3
00be57e4	mov x20,x2
00be57e8	mov x21,x1
00be57ec	stur x8,[x29, #-0x8]
00be57f0	orr x8,x10,#0x1
00be57f4	tbz w9,#0xb,0x00be5820
00be57f8	mov w10,#0x4a
00be57fc	and w10,w9,w10
00be5800	cmp w10,#0x8
00be5804	b.eq 0x00be5820
00be5808	cmp w10,#0x40
00be580c	b.eq 0x00be5820
00be5810	sub x8,x29,#0x8
00be5814	mov w10,#0x2b
00be5818	orr x8,x8,#0x2
00be581c	sturb w10,[x29, #-0x7]
00be5820	tbz w9,#0x9,0x00be582c
00be5824	mov w10,#0x23
00be5828	strb w10,[x8], #0x1
00be582c	ldrb w10,[x5]
00be5830	cbz w10,0x00be5844
00be5834	add x11,x5,#0x1
00be5838	strb w10,[x8], #0x1
00be583c	ldrb w10,[x11], #0x1
00be5840	cbnz w10,0x00be5838
00be5844	mov w10,#0x4a
00be5848	and w10,w9,w10
00be584c	cmp w10,#0x40
00be5850	b.eq 0x00be5870
00be5854	cmp w10,#0x8
00be5858	b.ne 0x00be5878
00be585c	tst w9,#0x4000
00be5860	mov w9,#0x58
00be5864	mov w10,#0x78
00be5868	csel w9,w10,w9,eq
00be586c	b 0x00be587c
00be5870	mov w9,#0x6f
00be5874	b 0x00be587c
00be5878	mov w9,#0x64
00be587c	strb w9,[x8]
00be5880	adrp x8,0xd27000
00be5884	add x8,x8,#0xf8
00be5888	ldarb w8,[x8]
00be588c	adrp x23,0xd27000
00be5890	tbz w8,#0x0,0x00be598c
00be5894	ldr x2,[x23, #0xf0]
00be5898	sub x0,x29,#0x20
00be589c	sub x3,x29,#0x8
00be58a0	mov w1,#0x18
00be58a4	mov x4,x22
00be58a8	sub x22,x29,#0x20
00be58ac	bl 0x00c0cd14
00be58b0	ldr w8,[x20, #0x8]
00be58b4	mov w9,#0xb0
00be58b8	add x22,x22,w0, SXTW 
00be58bc	and w8,w8,w9
00be58c0	mov x23,x22
00be58c4	cmp w8,#0x20
00be58c8	b.eq 0x00be5924
00be58cc	cmp w8,#0x10
00be58d0	b.ne 0x00be5920
00be58d4	ldurb w8,[x29, #-0x20]
00be58d8	cmp w8,#0x2d
00be58dc	b.eq 0x00be58e8
00be58e0	cmp w8,#0x2b
00be58e4	b.ne 0x00be58f4
00be58e8	sub x8,x29,#0x20
00be58ec	orr x23,x8,#0x1
00be58f0	b 0x00be5924
00be58f4	cmp w0,#0x2
00be58f8	b.lt 0x00be5920
00be58fc	cmp w8,#0x30
00be5900	b.ne 0x00be5920
00be5904	ldurb w8,[x29, #-0x1f]
00be5908	orr w8,w8,#0x20
00be590c	cmp w8,#0x78
00be5910	b.ne 0x00be5920
00be5914	sub x8,x29,#0x20
00be5918	orr x23,x8,#0x2
00be591c	b 0x00be5924
00be5920	sub x23,x29,#0x20
00be5924	mov x8,sp
00be5928	mov x0,x20
00be592c	bl 0x00c30070
00be5930	sub x0,x29,#0x20
00be5934	add x3,sp,#0x1c
00be5938	add x4,sp,#0x10
00be593c	add x5,sp,#0x8
00be5940	mov x6,sp
00be5944	mov x1,x23
00be5948	mov x2,x22
00be594c	bl 0x00c44170
00be5950	mov x0,sp
00be5954	bl 0x00c30090
00be5958	ldp x3,x2,[sp, #0x8]
00be595c	add x1,sp,#0x1c
00be5960	mov x0,x21
00be5964	mov x4,x20
00be5968	mov w5,w19
00be596c	bl 0x00be6bec
00be5970	ldp x20,x19,[sp, #0x120]
00be5974	ldp x22,x21,[sp, #0x110]
00be5978	ldp x28,x23,[sp, #0x100]
00be597c	ldp x29,x30,[sp, #0xf0]
00be5980	add sp,sp,#0x130
00be5984	autiasp
00be5988	ret
00be598c	adrp x0,0xd27000
00be5990	add x0,x0,#0xf8
00be5994	bl 0x00c2fe90
00be5998	cbz w0,0x00be5894
00be599c	adrp x1,0x2c6000
00be59a0	add x1,x1,#0xbfc
00be59a4	mov w0,#0x1fbf
00be59a8	mov x2,xzr
00be59ac	bl 0x00c43890
00be59b0	str x0,[x23, #0xf0]
00be59b4	adrp x0,0xd27000
00be59b8	add x0,x0,#0xf8
00be59bc	bl 0x00c2fea0
00be59c0	b 0x00be5894
