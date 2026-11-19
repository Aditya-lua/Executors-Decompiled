; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append @ 00bc490c
00bc490c	paciasp
00bc4910	stp x29,x30,[sp, #-0x30]!
00bc4914	stp x22,x21,[sp, #0x10]
00bc4918	stp x20,x19,[sp, #0x20]
00bc491c	mov x29,sp
00bc4920	ldrb w9,[x1]
00bc4924	ldr x10,[x1, #0x8]
00bc4928	lsr x11,x9,#0x1
00bc492c	tst w9,#0x1
00bc4930	csel x10,x11,x10,eq
00bc4934	subs x11,x10,x2
00bc4938	b.cc 0x00bc4a0c
00bc493c	ldp x10,x14,[x0]
00bc4940	tst w9,#0x1
00bc4944	ldr x12,[x1, #0x10]
00bc4948	ldrb w13,[x0]
00bc494c	mov x8,x2
00bc4950	mov x19,x0
00bc4954	csinc x9,x12,x1,ne
00bc4958	cmp x11,x3
00bc495c	and x12,x10,#-0x2
00bc4960	csel x6,x11,x3,cc
00bc4964	sub x11,x12,#0x1
00bc4968	tst w13,#0x1
00bc496c	mov w12,#0x16
00bc4970	ubfx x13,x10,#0x1,#0x7
00bc4974	csel x1,x12,x11,eq
00bc4978	tst x10,#0x1
00bc497c	csel x20,x13,x14,eq
00bc4980	sub x11,x1,x20
00bc4984	cmp x11,x6
00bc4988	b.cs 0x00bc49b0
00bc498c	sub x10,x6,x1
00bc4990	add x7,x9,x8
00bc4994	mov x0,x19
00bc4998	add x2,x10,x20
00bc499c	mov x3,x20
00bc49a0	mov x4,x20
00bc49a4	mov x5,xzr
00bc49a8	bl 0x00c30200
00bc49ac	b 0x00bc49f4
00bc49b0	cbz x6,0x00bc49f4
00bc49b4	ldr x11,[x19, #0x10]
00bc49b8	tst x10,#0x1
00bc49bc	add x1,x9,x8
00bc49c0	mov x2,x6
00bc49c4	mov x22,x6
00bc49c8	csinc x21,x11,x19,ne
00bc49cc	add x0,x21,x20
00bc49d0	bl 0x00c2ff60
00bc49d4	ldrb w9,[x19]
00bc49d8	add x8,x20,x22
00bc49dc	tbnz w9,#0x0,0x00bc49ec
00bc49e0	lsl w9,w8,#0x1
00bc49e4	strb w9,[x19]
00bc49e8	b 0x00bc49f0
00bc49ec	str x8,[x19, #0x8]
00bc49f0	strb wzr,[x21, x8]
00bc49f4	mov x0,x19
00bc49f8	ldp x20,x19,[sp, #0x20]
00bc49fc	ldp x22,x21,[sp, #0x10]
00bc4a00	ldp x29,x30,[sp], #0x30
00bc4a04	autiasp
00bc4a08	ret
00bc4a0c	bl 0x00814f80
