; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get_date @ 00beab74
00beab74	paciasp
00beab78	stp x29,x30,[sp, #-0x40]!
00beab7c	stp x24,x23,[sp, #0x10]
00beab80	stp x22,x21,[sp, #0x20]
00beab84	stp x20,x19,[sp, #0x30]
00beab88	mov x29,sp
00beab8c	mov x22,x0
00beab90	ldr x8,[x0, #0x10]!
00beab94	mov x19,x5
00beab98	mov x20,x4
00beab9c	mov x21,x3
00beaba0	ldr x8,[x8, #0x28]
00beaba4	mov x23,x2
00beaba8	mov x24,x1
00beabac	blr x8
00beabb0	mov x8,x0
00beabb4	mov x0,x22
00beabb8	mov x1,x24
00beabbc	ldrb w9,[x8]
00beabc0	ldp x11,x10,[x8, #0x8]
00beabc4	add x8,x8,#0x4
00beabc8	mov x2,x23
00beabcc	mov x3,x21
00beabd0	lsr x12,x9,#0x1
00beabd4	tst w9,#0x1
00beabd8	mov x4,x20
00beabdc	csel x6,x8,x10,eq
00beabe0	mov x5,x19
00beabe4	csel x8,x12,x11,eq
00beabe8	add x7,x6,x8, LSL #0x2
00beabec	ldp x20,x19,[sp, #0x30]
00beabf0	ldp x22,x21,[sp, #0x20]
00beabf4	ldp x24,x23,[sp, #0x10]
00beabf8	ldp x29,x30,[sp], #0x40
00beabfc	autiasp
00beac00	b 0x00c441c0
