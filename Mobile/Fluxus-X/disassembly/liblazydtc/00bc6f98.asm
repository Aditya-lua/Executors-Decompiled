; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::compare @ 00bc6f98
00bc6f98	paciasp
00bc6f9c	stp x29,x30,[sp, #-0x20]!
00bc6fa0	stp x20,x19,[sp, #0x10]
00bc6fa4	mov x29,sp
00bc6fa8	ldrb w8,[x3]
00bc6fac	ldrb w9,[x0]
00bc6fb0	add x10,x3,#0x4
00bc6fb4	ldp x12,x11,[x3, #0x8]
00bc6fb8	ldr x14,[x0, #0x8]
00bc6fbc	lsr x13,x8,#0x1
00bc6fc0	tst w8,#0x1
00bc6fc4	lsr x15,x9,#0x1
00bc6fc8	csel x8,x10,x11,eq
00bc6fcc	csel x10,x13,x12,eq
00bc6fd0	tst w9,#0x1
00bc6fd4	csel x11,x15,x14,eq
00bc6fd8	subs x11,x11,x1
00bc6fdc	b.cc 0x00bc7044
00bc6fe0	ldr x12,[x0, #0x10]
00bc6fe4	add x13,x0,#0x4
00bc6fe8	tst w9,#0x1
00bc6fec	csel x9,x13,x12,eq
00bc6ff0	cmp x11,x2
00bc6ff4	csel x19,x11,x2,cc
00bc6ff8	subs x10,x10,x4
00bc6ffc	b.cc 0x00bc7044
00bc7000	cmp x10,x5
00bc7004	csel x20,x10,x5,cc
00bc7008	cmp x20,x19
00bc700c	csel x2,x20,x19,cc
00bc7010	cbz x2,0x00bc7024
00bc7014	add x0,x9,x1, LSL #0x2
00bc7018	add x1,x8,x4, LSL #0x2
00bc701c	bl 0x00c438b0
00bc7020	cbnz w0,0x00bc7034
00bc7024	cmp x19,x20
00bc7028	mov w8,#0xffffffff
00bc702c	cneg w8,w8,cs
00bc7030	csel w0,wzr,w8,eq
00bc7034	ldp x20,x19,[sp, #0x10]
00bc7038	ldp x29,x30,[sp], #0x20
00bc703c	autiasp
00bc7040	ret
00bc7044	adrp x0,0x2ba000
00bc7048	add x0,x0,#0xc54
00bc704c	bl 0x0080c8d0
