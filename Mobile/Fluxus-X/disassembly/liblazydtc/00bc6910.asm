; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::assign @ 00bc6910
00bc6910	paciasp
00bc6914	stp x29,x30,[sp, #-0x30]!
00bc6918	str x21,[sp, #0x10]
00bc691c	stp x20,x19,[sp, #0x20]
00bc6920	mov x29,sp
00bc6924	ldr x8,[x0]
00bc6928	ldrb w9,[x0]
00bc692c	mov x19,x1
00bc6930	mov w20,w2
00bc6934	and x10,x8,#-0x2
00bc6938	tst w9,#0x1
00bc693c	mov w9,#0x4
00bc6940	sub x10,x10,#0x1
00bc6944	csel x1,x9,x10,eq
00bc6948	and w9,w8,#0xff
00bc694c	subs x2,x19,x1
00bc6950	b.ls 0x00bc6998
00bc6954	ubfx x8,x8,#0x1,#0x7
00bc6958	ldr x10,[x0, #0x8]
00bc695c	tst w9,#0x1
00bc6960	mov x4,xzr
00bc6964	mov x6,xzr
00bc6968	mov x21,x0
00bc696c	csel x3,x8,x10,eq
00bc6970	mov x5,x3
00bc6974	bl 0x00c43d70
00bc6978	ldrb w8,[x21]
00bc697c	ldr x9,[x21, #0x10]
00bc6980	add x10,x21,#0x4
00bc6984	mov x0,x21
00bc6988	str xzr,[x21, #0x8]
00bc698c	tst w8,#0x1
00bc6990	csel x8,x10,x9,eq
00bc6994	b 0x00bc69ac
00bc6998	ldr x8,[x0, #0x10]
00bc699c	add x10,x0,#0x4
00bc69a0	tst w9,#0x1
00bc69a4	csel x8,x10,x8,eq
00bc69a8	cbz x19,0x00bc69fc
00bc69ac	cmp x19,#0x8
00bc69b0	mov x9,x8
00bc69b4	mov x10,x19
00bc69b8	b.cc 0x00bc69ec
00bc69bc	and x11,x19,#-0x8
00bc69c0	dup v0.4S,w20
00bc69c4	and x10,x19,#0x7
00bc69c8	add x9,x8,x11, LSL #0x2
00bc69cc	add x12,x8,#0x10
00bc69d0	mov x13,x11
00bc69d4	subs x13,x13,#0x8
00bc69d8	stp q0,q0,[x12, #-0x10]
00bc69dc	add x12,x12,#0x20
00bc69e0	b.ne 0x00bc69d4
00bc69e4	cmp x19,x11
00bc69e8	b.eq 0x00bc69f8
00bc69ec	subs x10,x10,#0x1
00bc69f0	str w20,[x9], #0x4
00bc69f4	b.ne 0x00bc69ec
00bc69f8	ldrb w9,[x0]
00bc69fc	tbnz w9,#0x0,0x00bc6a0c
00bc6a00	lsl w9,w19,#0x1
00bc6a04	strb w9,[x0]
00bc6a08	b 0x00bc6a10
00bc6a0c	str x19,[x0, #0x8]
00bc6a10	str wzr,[x8, x19, LSL #0x2]
00bc6a14	ldp x20,x19,[sp, #0x20]
00bc6a18	ldr x21,[sp, #0x10]
00bc6a1c	ldp x29,x30,[sp], #0x30
00bc6a20	autiasp
00bc6a24	ret
