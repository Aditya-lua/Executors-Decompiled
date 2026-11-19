; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::copy @ 00bc6238
00bc6238	paciasp
00bc623c	stp x29,x30,[sp, #-0x20]!
00bc6240	str x19,[sp, #0x10]
00bc6244	mov x29,sp
00bc6248	ldrb w8,[x0]
00bc624c	ldr x9,[x0, #0x8]
00bc6250	lsr x10,x8,#0x1
00bc6254	tst w8,#0x1
00bc6258	csel x9,x10,x9,eq
00bc625c	subs x9,x9,x3
00bc6260	b.cc 0x00bc62a8
00bc6264	cmp x9,x2
00bc6268	csel x19,x9,x2,cc
00bc626c	cbz x19,0x00bc6294
00bc6270	ldr x9,[x0, #0x10]
00bc6274	add x10,x0,#0x4
00bc6278	tst w8,#0x1
00bc627c	lsl x2,x19,#0x2
00bc6280	mov x0,x1
00bc6284	csel x8,x10,x9,eq
00bc6288	add x8,x8,x3, LSL #0x2
00bc628c	mov x1,x8
00bc6290	bl 0x00c2ff60
00bc6294	mov x0,x19
00bc6298	ldr x19,[sp, #0x10]
00bc629c	ldp x29,x30,[sp], #0x20
00bc62a0	autiasp
00bc62a4	ret
00bc62a8	bl 0x00bc531c
