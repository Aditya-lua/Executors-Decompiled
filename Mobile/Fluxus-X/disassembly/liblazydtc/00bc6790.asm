; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::append @ 00bc6790
00bc6790	bti c
00bc6794	cbz x1,0x00bc68b4
00bc6798	paciasp
00bc679c	stp x29,x30,[sp, #-0x30]!
00bc67a0	stp x22,x21,[sp, #0x10]
00bc67a4	stp x20,x19,[sp, #0x20]
00bc67a8	mov x29,sp
00bc67ac	ldp x9,x10,[x0]
00bc67b0	ldrb w8,[x0]
00bc67b4	tst w8,#0x1
00bc67b8	mov w8,#0x4
00bc67bc	and x11,x9,#-0x2
00bc67c0	ubfx x12,x9,#0x1,#0x7
00bc67c4	sub x11,x11,#0x1
00bc67c8	csel x8,x8,x11,eq
00bc67cc	ands w9,w9,#0x1
00bc67d0	csel x19,x12,x10,eq
00bc67d4	sub x10,x8,x19
00bc67d8	cmp x10,x1
00bc67dc	b.cs 0x00bc6824
00bc67e0	sub x9,x1,x8
00bc67e4	mov w21,w2
00bc67e8	mov x22,x1
00bc67ec	add x2,x9,x19
00bc67f0	mov x1,x8
00bc67f4	mov x3,x19
00bc67f8	mov x4,x19
00bc67fc	mov x5,xzr
00bc6800	mov x6,xzr
00bc6804	mov x20,x0
00bc6808	bl 0x00c43d70
00bc680c	ldrb w8,[x20]
00bc6810	mov w2,w21
00bc6814	mov x1,x22
00bc6818	mov x0,x20
00bc681c	str x19,[x20, #0x8]
00bc6820	and w9,w8,#0x1
00bc6824	ldr x8,[x0, #0x10]
00bc6828	add x10,x0,#0x4
00bc682c	cmp w9,#0x0
00bc6830	csel x8,x10,x8,eq
00bc6834	cmp x1,#0x8
00bc6838	mov x10,x1
00bc683c	add x12,x8,x19, LSL #0x2
00bc6840	mov x9,x12
00bc6844	b.cc 0x00bc6878
00bc6848	and x11,x1,#-0x8
00bc684c	dup v0.4S,w2
00bc6850	and x10,x1,#0x7
00bc6854	add x9,x12,x11, LSL #0x2
00bc6858	add x12,x12,#0x10
00bc685c	mov x13,x11
00bc6860	subs x13,x13,#0x8
00bc6864	stp q0,q0,[x12, #-0x10]
00bc6868	add x12,x12,#0x20
00bc686c	b.ne 0x00bc6860
00bc6870	cmp x1,x11
00bc6874	b.eq 0x00bc6884
00bc6878	subs x10,x10,#0x1
00bc687c	str w2,[x9], #0x4
00bc6880	b.ne 0x00bc6878
00bc6884	ldrb w10,[x0]
00bc6888	add x9,x19,x1
00bc688c	tbnz w10,#0x0,0x00bc689c
00bc6890	lsl w10,w9,#0x1
00bc6894	strb w10,[x0]
00bc6898	b 0x00bc68a0
00bc689c	str x9,[x0, #0x8]
00bc68a0	str wzr,[x8, x9, LSL #0x2]
00bc68a4	ldp x20,x19,[sp, #0x20]
00bc68a8	ldp x22,x21,[sp, #0x10]
00bc68ac	ldp x29,x30,[sp], #0x30
00bc68b0	autiasp
00bc68b4	ret
